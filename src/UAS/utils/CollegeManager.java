package UAS.utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
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
            if (rank>=collegeCourseInfo.openingRank && rank<=collegeCourseInfo.closingRank) {
                recommendations.add(collegeCourseInfo);
            }            
        }
        return recommendations;
    }
    
}
