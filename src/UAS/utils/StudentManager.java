package UAS.utils;

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class StudentManager {
    
    private String filepath;
    
    public StudentManager(String filepath){
        this.filepath = filepath;
    }
    /*
    public void register(){
        
    }
    public void login(){
        
    }*/
    public void updatePersonalDetails(String appno, String name, StudentPersonalDetails stud){
        try {
         FileWriter fw = new FileWriter(this.filepath + "StudentPersonalDetails.txt");
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
    String det = String.join(",", student.genRank, student.catRank, student.school10,
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
