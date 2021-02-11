package UAS.utils;

import UAS.utils.Subject;
import java.util.ArrayList;

public class StudentAcademicDetails {
    public String genRank;
    public String school10;
    public String board10;
    public String marksPercent10;
    public String school12;
    public String board12;
    public String marksPercent12;
    public ArrayList<Subject> subjects;

    public StudentAcademicDetails(String genRank, String school10, 
            String board10, String marksPercent10, String school12, String board12, 
            String marksPercent12, Subject subList[]) {
        
        this.genRank = genRank;
        this.school10 = school10;
        this.board10 = board10;
        this.marksPercent10 = marksPercent10;
        this.school12 = school12;
        this.board12 = board12;
        this.marksPercent12 = marksPercent12;
        
        this.subjects = new ArrayList<Subject>();
        for (int i = 0; i < 4; i++) {
            Subject sb = new Subject(subList[i].subName, subList[i].obtMarks, subList[i].totMarks);
            this.subjects.add(sb);
        }
    }

}
