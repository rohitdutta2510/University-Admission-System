package UAS.utils;

import UAS.utils.Subject;

public class StudentAcademicDetails {
    public int genRank;
    public int catRank;
    public String school10;
    public String board10;
    public int marksPercent10;
    public String school12;
    public String board12;
    public int marksPercent12;
    Subject subList[] = new Subject[4];
    
    public StudentAcademicDetails(int genRank, int catRank, String school10, 
            String board10, int marksPercent10, String school12, String board12, 
            int marksPercent12, Subject subList[]){
        
        this.genRank = genRank;
        this.catRank = catRank;
        this.school10 = school10;
        this.board10 = board10;
        this.marksPercent10 = marksPercent10;
        this.school12 = school12;
        this.board12 = board12;
        this.marksPercent12 = marksPercent12;
        
        for (int i = 0; i < 4; i++) {
            this.subList[i].subName = subList[i].subName;
            this.subList[i].obtMarks = subList[i].obtMarks;
            this.subList[i].totMarks = subList[i].totMarks;
        }
    }
}
