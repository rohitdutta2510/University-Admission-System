package UAS.utils;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;


public class AdmissionICManager {
    private CollegeManager cMgr;
    private ArrayList<CollegeCourseInfo> collegeCourseInfos;
    private ArrayList<StudentChoiceDetails> studentChoices;
    private ArrayList<SeatAllotmentInfo> seatAllotmentInfos;
    private String sCollege = null;
    private String sCourse =null;
    private String college = null;
    private String course =null;
    private int seatCount = 0;
    private int k=0;
    private int flag=0;
    private String data = null;
    AdmissionIC admissionIC;
    
    public AdmissionICManager(){
        admissionIC = new AdmissionIC();  
        cMgr = new CollegeManager("E:\\Works\\Software Engg\\CODE\\University-Admission-System");
        this.collegeCourseInfos = new ArrayList<CollegeCourseInfo>();
        this.studentChoices = new ArrayList<StudentChoiceDetails>();
        this.seatAllotmentInfos = new ArrayList<SeatAllotmentInfo>();
    }
    
    public boolean login(String userId, char[] password){        
        char[] p1 = admissionIC.getPassword().toCharArray();
        String uId = admissionIC.getUserId();
        return (Arrays.equals(p1, password) && uId.equals(userId));
    }
    
    public void allocate(){
    this.collegeCourseInfos = cMgr.getCollegeCourseInfos();
    this.studentChoices = cMgr.getStudentChoiceDetails();

    for(int i=0; i<this.studentChoices.size(); i++){
        flag = 0;
        while(k<this.studentChoices.get(i).choices.size() && flag==0){

            sCollege = studentChoices.get(i).choices.get(k).cllgName;
            sCourse = studentChoices.get(i).choices.get(k).courseName;

            for(int j=0; j<this.collegeCourseInfos.size(); j++){
                college = collegeCourseInfos.get(j).collegeName;
                course = collegeCourseInfos.get(j).courseName;

                if((sCollege.equals(college) && sCourse.equals(course)) && collegeCourseInfos.get(j).seatCount>0){
                    SeatAllotmentInfo seat = new SeatAllotmentInfo(Integer.parseInt(studentChoices.get(i).appNo), college, course);
                    seatAllotmentInfos.add(seat);
                    collegeCourseInfos.get(j).seatCount = collegeCourseInfos.get(j).seatCount-1;
                    flag=1;
                    break;
                    }
                }
            k++;
            }
        }
    this.saveAllotment(seatAllotmentInfos);
    }
    
    private void saveAllotment(ArrayList<SeatAllotmentInfo> seatAllotmentInfos){
        try {
            FileWriter fw = new FileWriter("E:\\Works\\Software Engg\\CODE\\University-Admission-System");
            BufferedWriter bw = new BufferedWriter(fw);
            for(int i=0; i<seatAllotmentInfos.size(); i++){
                data = String.join(",", Integer.toString(seatAllotmentInfos.get(i).appNo), seatAllotmentInfos.get(i).collegeName, seatAllotmentInfos.get(i).courseName);
                bw.write(data + "\n");
            }
            bw.close();
            fw.close();
            System.out.println("Seat Allotment successful");
        } catch (IOException e) {
         Logger.getLogger(StudentManager.class.getName()).log(Level.SEVERE, null, e);
        } 
    }
}
