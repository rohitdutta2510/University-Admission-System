package UAS.utils;
import java.util.ArrayList;

public class StudentChoiceDetails {
    public int appNo;
    public ArrayList<CollegeCourse> choices;

    public StudentChoiceDetails(int appNo, ArrayList<CollegeCourse> choices) {
        this.appNo = appNo;
        this.choices = choices;
    }   
}
