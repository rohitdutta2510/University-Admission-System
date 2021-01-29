/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author THUNDER
 */
import UAS.*;
import UAS.utils.CollegeCourseInfo;
import UAS.utils.CollegeManager;
import java.util.ArrayList;
public class StudentMain {
    public static void main(String[] args) {
       CollegeManager mgr = new CollegeManager("E:\\Works\\Software Engg\\CODE\\University-Admission-System\\data.txt");
       ArrayList<CollegeCourseInfo> rec = mgr.recommendCollegeCourse(2300);
        for (CollegeCourseInfo collegeCourseInfo : rec) {
            System.out.println("College Name: " + collegeCourseInfo.collegeName + ", Course Name: " + collegeCourseInfo.courseName);
        }
    }
}
