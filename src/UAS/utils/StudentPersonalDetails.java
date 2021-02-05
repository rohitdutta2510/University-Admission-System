package UAS.utils;


public class StudentPersonalDetails {
    private String DOB;
    private String fatherName;
    private String motherName;
    private String presentAddr;
    private String permanentAddr;
    private String aadhaarNo;
    private String phone;
    private String guardianPhone;
    private String email;
    private boolean phyDisabled;
    
    public StudentPersonalDetails(String DOB, String fatherName, String motherName, 
            String presentAddr, String permanentAddr, String aadhaarNo, String phone, 
            String guardianPhone, String email, boolean phyDisabled){
        
        this.DOB = DOB;
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.aadhaarNo = aadhaarNo;
        this.presentAddr = presentAddr;
        this.permanentAddr = permanentAddr;
        this.phone = phone;
        this.email = email;
        this.guardianPhone = guardianPhone;
        this.phyDisabled = phyDisabled;
    }
}

