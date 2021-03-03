/**
 *
 * @author Samiruddin Thunder
 */
package UAS.utils;


public class CollegeCourseInfo {
    public int cllgID;
    public int courseID;
    public String collegeName;
    public String courseName;
    public int seatCount;
    public int openingRank;
    public int closingRank;

    public CollegeCourseInfo(int cllgID, int courseID, String collegeName, String courseName, int seatCount, int openingRank, int closingRank) {
        this.cllgID = cllgID;
        this.courseID = courseID;
        this.collegeName = collegeName;
        this.courseName = courseName;
        this.seatCount = seatCount;
        this.openingRank = openingRank;
        this.closingRank = closingRank;
    }
    
}
