package UAS.utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CollegeManager {
    private ArrayList<CollegeCourseInfo> collegeCourseInfos;
    private String filepath;

    public CollegeManager(String filepath) {
        this.filepath = filepath;        
        this.collegeCourseInfos = new ArrayList<CollegeCourseInfo>();
        this.readfile();
    }
    
    private void readfile(){
        try {
            FileReader fr = new FileReader(this.filepath);
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            while(line!=null){
                //System.out.println(line);
                String[] row = line.split(",");
                CollegeCourseInfo data = new CollegeCourseInfo(Integer.parseInt(row[0]), Integer.parseInt(row[1]), row[2], row[3], Integer.parseInt(row[4]), Integer.parseInt(row[5]), Integer.parseInt(row[6]));
                this.collegeCourseInfos.add(data);
                line = br.readLine();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CollegeManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(CollegeManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }   
    
    public ArrayList<CollegeCourseInfo> getCollegeCourseInfos() {
        return collegeCourseInfos;
    }       
    
    public ArrayList<CollegeCourseInfo> recommendCollegeCourse(int rank){
        ArrayList<CollegeCourseInfo> recommendations = new ArrayList<CollegeCourseInfo>();
        for (CollegeCourseInfo collegeCourseInfo : collegeCourseInfos) {
            if (rank<=collegeCourseInfo.openingRank) {
                recommendations.add(collegeCourseInfo);
            }            
        }
        return recommendations;
    }
    
    public void applyForCollege(StudentChoiceDetails choiceDetails){
        String filepath = "E:\\Works\\Software Engg\\CODE\\University-Admission-System\\studentChoiceDetails.txt";
        try {
            FileWriter fw = new FileWriter(filepath, true);
            BufferedWriter bw = new BufferedWriter(fw);
            String data = choiceDetails.appNo + ", ";
            for (CollegeCourse choice : choiceDetails.choices) {
                data = data + choice.cllgName + ", " + choice.courseName + ", ";
            }                      
            data = data.substring(0, data.length()-2);
            data = data + "\n";
            bw.write(data);
            bw.close();
            fw.close();            
        } catch (IOException ex) {
            Logger.getLogger(CollegeManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
}
