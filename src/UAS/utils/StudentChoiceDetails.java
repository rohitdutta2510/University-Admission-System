package UAS.utils;
import java.util.ArrayList;

public class StudentChoiceDetails {
    public String appNo;
    public int rank;
    public ArrayList<CollegeCourse> choices;

    public StudentChoiceDetails(String appNo, int rank, ArrayList<CollegeCourse> choices) {
        this.appNo = appNo;
        this.rank = rank;
        this.choices = choices;
    }   
}
