package UAS.utils;
import java.util.ArrayList;

public class StudentChoiceDetails {
    public int appNo;
    public ArrayList<CollegeCourseInfo> choices;

    public StudentChoiceDetails(int appNo, ArrayList<CollegeCourseInfo> choices) {
        this.appNo = appNo;
        this.choices = choices;
    }   
}
