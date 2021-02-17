package UAS.utils;
import java.util.ArrayList;

public class StudentChoiceDetails {
    public String appNo;
    public ArrayList<CollegeCourse> choices;

    public StudentChoiceDetails(String appNo, ArrayList<CollegeCourse> choices) {
        this.appNo = appNo;
        this.choices = choices;
    }   
}
