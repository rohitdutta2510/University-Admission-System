/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author THUNDER
 */

import UAS.utils.CollegeCourse;
import UAS.utils.CollegeManager;
import UAS.utils.StudentChoiceDetails;
import java.util.ArrayList;

public class StudentMain {
    public static void main(String[] args) {
       CollegeManager mgr = new CollegeManager("E:\\Works\\Software Engg\\CODE\\University-Admission-System\\data.txt");
       
       
       CollegeCourse choice1 = new CollegeCourse("IEM","B.Tech(CSE)",240);
       CollegeCourse choice2 = new CollegeCourse("IEM","B.Tech(ECE)",240);
       CollegeCourse choice3 = new CollegeCourse("IEM","B.Tech(EE)",240);
       ArrayList<CollegeCourse> choices = new ArrayList<CollegeCourse>();
       choices.add(choice1);
       choices.add(choice2);
       choices.add(choice3);      
       StudentChoiceDetails choiceDetails = new StudentChoiceDetails(12023024, choices);
       mgr.applyForCollege(choiceDetails);   
    }
}
