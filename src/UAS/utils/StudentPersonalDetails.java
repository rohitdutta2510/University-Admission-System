package UAS.utils;


public class StudentPersonalDetails {
    public String DOB;
    public String fatherName;
    public String motherName;
    public String presentAddr;
    public String permanentAddr;
    public String aadhaarNo;
    public String phone;
    public String guardianPhone;
    public String email;
    public String phyDisabled;

    public StudentPersonalDetails(String DOB, String fatherName, String motherName, 
            String presentAddr, String permanentAddr, String aadhaarNo, String phone, 
            String guardianPhone, String email, String phyDisabled) {
        
        this.DOB = DOB;
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.presentAddr = presentAddr;
        this.permanentAddr = permanentAddr;
        this.aadhaarNo = aadhaarNo;
        this.phone = phone;
        this.guardianPhone = guardianPhone;
        this.email = email;
        this.phyDisabled = phyDisabled;
    }
}

