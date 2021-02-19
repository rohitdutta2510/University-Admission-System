package UAS.utils;

import java.util.Arrays;


public class AdmissionICManager {    
    AdmissionIC admissionIC;
    public AdmissionICManager(){
        admissionIC = new AdmissionIC();        
    }
    public boolean login(String userId, char[] password){        
        char[] p1 = admissionIC.getPassword().toCharArray();
        String uId = admissionIC.getUserId();
        return (Arrays.equals(p1, password) && uId.equals(userId));
    }
}
