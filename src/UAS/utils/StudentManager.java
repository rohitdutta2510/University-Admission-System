package UAS.utils;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class StudentManager {
    
    private String filepath;
    
    public StudentManager(String filepath){
        this.filepath = filepath;
    }
    
    public boolean register(StudentAccountInfo accountInfo){
        String file = this.filepath + "StudentAccountDetails.txt";
        try {
            File f = new File(file);
            if(f.length()==0){
                FileWriter fw = new FileWriter(file, true);
                BufferedWriter bw = new BufferedWriter(fw);
                String lw = String.join(",", accountInfo.name, accountInfo.emailID, accountInfo.password, accountInfo.appNo);
                lw = lw + "\n";                
                bw.write(lw);
                bw.close();
                fw.close();                    
            }else{
                int flag = 0;
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                String line = br.readLine();         
                while(line!=null){
                    String[] row = line.split(",");
                    //System.out.println("FILE LINE: " + line);
                    if(row[1].equals(accountInfo.emailID)){
                        flag = 1;
                    }                    
                    line = br.readLine();
                }                      
                br.close();
                fr.close();
                if(flag==0){
                    FileWriter fw = new FileWriter(file, true);
                    BufferedWriter bw = new BufferedWriter(fw);
                    String lw = String.join(",", accountInfo.name, accountInfo.emailID, accountInfo.password, accountInfo.appNo);
                    lw = lw + "\n";                
                    bw.write(lw);
                    bw.close();
                    fw.close();  
                    return true;
                }else{
                    return false;
                }
            }
        } catch (FileNotFoundException ex) {
            System.err.print("File Not Found");
        } catch (IOException ex) {
            System.err.println("I/O Exception");
        }
        return true;
    }
    
    public boolean login(String appNo, String password){
        String file = this.filepath + "StudentAccountDetails.txt";
        try {        
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            while (line!=null) {        
                String[] row = line.split(",");
                if (row[2].equals(password) && row[3].equals(appNo)) {
                    return true;                    
                }
                line = br.readLine();
            }
            br.close();
            fr.close();            
        } catch (FileNotFoundException ex) {
            System.err.print("File Not Found");
        } catch (IOException ex) {
            System.err.println("I/O Exception");
        }
        return false;
    }
    
    public void updatePersonalDetails(String appno, String name, StudentPersonalDetails stud){
        try {
         FileWriter fw = new FileWriter(this.filepath + "StudentPersonalDetails.txt", true);
         BufferedWriter bw = new BufferedWriter(fw);
         bw.write(writeLinePers(appno, name, stud) + "\n");
         bw.close();
         fw.close();
         System.out.println("Successfully updated personal details.");
       } catch (IOException e) {
         Logger.getLogger(StudentManager.class.getName()).log(Level.SEVERE, null, e);
       }           
    }
    public void updateAcademicDetails(String appno, StudentAcademicDetails studac){
        try {
         FileWriter fw = new FileWriter(this.filepath + "StudentAcademicDetails.txt");
         BufferedWriter bw = new BufferedWriter(fw);
         bw.write(writeLineAcad(appno, studac) + "\n");
         bw.close();
         fw.close();
         System.out.println("Successfully updated personal details.");
       } catch (IOException e) {
         Logger.getLogger(StudentManager.class.getName()).log(Level.SEVERE, null, e);
       }     
    }
    
    public String writeLinePers(String appno, String name, StudentPersonalDetails student){
        String det = String.join(",", appno, name, student.DOB, student.aadhaarNo,
        student.email, student.fatherName, student.motherName, student.permanentAddr,
        student.presentAddr, student.phone);
        return det;
    }
    
    public String writeLineAcad(String appno, StudentAcademicDetails student){
    String det = String.join(",", student.genRank, student.school10,
            student.board10, student.marksPercent10, student.school12,
            student.board12, student.marksPercent12, getSub(student.subjects));
    return det;
    }
    
    public String getSub(ArrayList<Subject> sb){
        String sublist = String.join(",", sb.get(0).subName, sb.get(0).obtMarks, sb.get(0).totMarks,
                                        sb.get(1).subName, sb.get(1).obtMarks, sb.get(1).totMarks,
                                        sb.get(2).subName, sb.get(2).obtMarks, sb.get(2).totMarks);
        return sublist;
    }
}
