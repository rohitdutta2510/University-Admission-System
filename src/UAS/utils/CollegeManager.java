/**
 *
 * @author Sachin Agarwal and Samiruddin Thunder
 */
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
    private ArrayList<StudentChoiceDetails> studChoice;
    private ArrayList<CollegeCourse> collegeCourses;
    //private String filepath;

    public CollegeManager() {       
        this.collegeCourseInfos = new ArrayList<CollegeCourseInfo>();
        this.studChoice = new ArrayList<StudentChoiceDetails>();
        this.collegeCourses = new ArrayList<CollegeCourse>();        
    }
    
    private void readCollegeInfo(){
        try {
            FileReader fr = new FileReader("CollegeData.txt");
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
    
    
    private void readStudChoice(){
        try {
            FileReader fr = new FileReader("StudentChoiceDetails.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            while(line!=null){
                //System.out.println(line);
                String[] row = line.split(",");
                
                for (int i=2; i<18; i+=2){
                    CollegeCourse collegeCourse = new CollegeCourse(row[i], row[i+1]);
                    this.collegeCourses.add(collegeCourse);
                }
                
                StudentChoiceDetails data = new StudentChoiceDetails(row[0], Integer.parseInt(row[1]), collegeCourses);
                this.studChoice.add(data);
                line = br.readLine();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CollegeManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(CollegeManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<StudentChoiceDetails> getStudentChoiceDetails(){
        this.readStudChoice();
        return studChoice;
    }
    
    public ArrayList<CollegeCourseInfo> getCollegeCourseInfos() {
        this.readCollegeInfo();
        return this.collegeCourseInfos;
    }       
    
    public ArrayList<CollegeCourseInfo> recommendCollegeCourse(int rank){
        ArrayList<CollegeCourseInfo> xC = this.getCollegeCourseInfos();
        ArrayList<CollegeCourseInfo> recommendations = new ArrayList<CollegeCourseInfo>();
        for (CollegeCourseInfo collegeCourseInfo : xC) {
            if (rank<=collegeCourseInfo.openingRank) {
                recommendations.add(collegeCourseInfo);
            }            
        }
        return recommendations;
    }
    
    public void applyForCollege(StudentChoiceDetails choiceDetails){
        String filepath = "StudentChoiceDetails.txt";
        try {
            FileWriter fw = new FileWriter(filepath, true);
            BufferedWriter bw = new BufferedWriter(fw);
            String data = choiceDetails.appNo + ", " + choiceDetails.rank + ", ";
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
