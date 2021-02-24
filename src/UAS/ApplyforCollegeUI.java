/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAS;
import UAS.utils.CollegeCourse;
import UAS.utils.CollegeCourseInfo;
import UAS.utils.CollegeManager;
import UAS.utils.StudentChoiceDetails;
import java.util.ArrayList;
import javax.swing.JOptionPane;


/**
 *
 * @author seals
 */
public class ApplyforCollegeUI extends javax.swing.JFrame {

    /**
     * Creates new form ApplyforCollegeUI
     */
    private CollegeManager mgr;
    private String appNo;
    private int rank;
    private ArrayList<CollegeCourse> selectedFromRecc;
    
    
    public ApplyforCollegeUI(String appNo, int rank, ArrayList<CollegeCourse> selectedFromRecc) {
        this.appNo = appNo;
        this.rank = rank;
        this.selectedFromRecc = selectedFromRecc;
        
        mgr = new CollegeManager("D:\\University Admission System\\University-Admission-System\\");
        ArrayList<CollegeCourseInfo> collegeCourseInfos = mgr.getCollegeCourseInfos();

        String[] colleges = new String[collegeCourseInfos.size()];
        String[] courses = new String[collegeCourseInfos.size()];
        
        for (int i = 0; i < collegeCourseInfos.size(); i++) {
            colleges[i] = collegeCourseInfos.get(i).collegeName;
            courses[i] = collegeCourseInfos.get(i).courseName;
            //System.out.println("College Name: " + colleges[i] + ", " + "Course Name: " + courses[i]);
        }        
        
        initComponents();
        
        
        college1ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(colleges));
        college2ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(colleges));
        college3ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(colleges));
        college4ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(colleges));
        college5ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(colleges));
        college6ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(colleges));
        college7ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(colleges));
        college8ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(colleges));
        
        
        
        stream1ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(courses));
        stream2ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(courses));
        stream3ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(courses));
        stream4ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(courses));
        stream5ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(courses));
        stream6ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(courses));
        stream7ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(courses));
        stream8ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(courses));      
        
        int size = selectedFromRecc.size();
        System.out.println(selectedFromRecc.get(0).courseName);
        switch(size){
            case 1:
                college1ComboBox.setSelectedItem(selectedFromRecc.get(0).cllgName);
                stream1ComboBox.setSelectedItem(selectedFromRecc.get(0).courseName);
                break;
            case 2:
                college1ComboBox.setSelectedItem(selectedFromRecc.get(0).cllgName);
                stream1ComboBox.setSelectedItem(selectedFromRecc.get(0).courseName);
                college2ComboBox.setSelectedItem(selectedFromRecc.get(1).cllgName);
                stream2ComboBox.setSelectedItem(selectedFromRecc.get(1).courseName);
                break;
            case 3:
                college1ComboBox.setSelectedItem(selectedFromRecc.get(0).cllgName);
                stream1ComboBox.setSelectedItem(selectedFromRecc.get(0).courseName);
                college2ComboBox.setSelectedItem(selectedFromRecc.get(1).cllgName);
                stream2ComboBox.setSelectedItem(selectedFromRecc.get(1).courseName);
                college3ComboBox.setSelectedItem(selectedFromRecc.get(2).cllgName);
                stream3ComboBox.setSelectedItem(selectedFromRecc.get(2).courseName);
                break;
            case 4:
                college1ComboBox.setSelectedItem(selectedFromRecc.get(0).cllgName);
                stream1ComboBox.setSelectedItem(selectedFromRecc.get(0).courseName);
                college2ComboBox.setSelectedItem(selectedFromRecc.get(1).cllgName);
                stream2ComboBox.setSelectedItem(selectedFromRecc.get(1).courseName);
                college3ComboBox.setSelectedItem(selectedFromRecc.get(2).cllgName);
                stream3ComboBox.setSelectedItem(selectedFromRecc.get(2).courseName);   
                college4ComboBox.setSelectedItem(selectedFromRecc.get(3).cllgName);
                stream4ComboBox.setSelectedItem(selectedFromRecc.get(3).courseName);                
            default:
                break;        
        }
        
    }   
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        college1ComboBox = new javax.swing.JComboBox<>();
        stream1ComboBox = new javax.swing.JComboBox<>();
        college2ComboBox = new javax.swing.JComboBox<>();
        stream2ComboBox = new javax.swing.JComboBox<>();
        college3ComboBox = new javax.swing.JComboBox<>();
        stream3ComboBox = new javax.swing.JComboBox<>();
        college4ComboBox = new javax.swing.JComboBox<>();
        stream4ComboBox = new javax.swing.JComboBox<>();
        college5ComboBox = new javax.swing.JComboBox<>();
        stream5ComboBox = new javax.swing.JComboBox<>();
        college6ComboBox = new javax.swing.JComboBox<>();
        stream6ComboBox = new javax.swing.JComboBox<>();
        college7ComboBox = new javax.swing.JComboBox<>();
        stream7ComboBox = new javax.swing.JComboBox<>();
        college8ComboBox = new javax.swing.JComboBox<>();
        stream8ComboBox = new javax.swing.JComboBox<>();
        applyBtn = new javax.swing.JButton();
        checkBox = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Apply For College-Rohit Dutta-50");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Apply for Colleges");

        jLabel2.setText("College Name");

        jLabel3.setText("Stream");

        college1ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Selected Item----" }));

        stream1ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Selected Item----" }));

        college2ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Selected Item----" }));

        stream2ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Selected Item----" }));

        college3ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Selected Item----" }));

        stream3ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Selected Item----" }));

        college4ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Selected Item----" }));

        stream4ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Selected Item----" }));

        college5ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Selected Item----" }));

        stream5ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Selected Item----" }));

        college6ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Selected Item----" }));

        stream6ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Selected Item----" }));

        college7ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Selected Item----" }));

        stream7ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Selected Item----" }));

        college8ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Selected Item----" }));

        stream8ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Selected Item----" }));

        applyBtn.setBackground(new java.awt.Color(255, 51, 51));
        applyBtn.setText("Apply");
        applyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applyBtnActionPerformed(evt);
            }
        });

        checkBox.setText("I confirm my choices & will be responsible for any discrepancy in choice filling");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(checkBox)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(college4ComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(college5ComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(college6ComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(college7ComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(college8ComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(college1ComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(college2ComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(college3ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 299, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(stream1ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stream2ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stream3ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stream4ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stream5ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stream6ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stream7ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stream8ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(70, 70, 70))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(266, 266, 266))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(applyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(291, 291, 291))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(college1ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stream1ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(college2ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stream2ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(college3ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stream3ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(college4ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stream4ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(college5ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stream5ComboBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(college6ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stream6ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(college7ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stream7ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(college8ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stream8ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(checkBox)
                .addGap(18, 18, 18)
                .addComponent(applyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void applyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applyBtnActionPerformed
        // TODO add your handling code here:       
        this.apply();
    }//GEN-LAST:event_applyBtnActionPerformed

    private void apply() {
        ArrayList<CollegeCourse> choices = new ArrayList<CollegeCourse>();     
        CollegeCourse choice1 = new CollegeCourse(this.college1ComboBox.getSelectedItem().toString(), this.stream1ComboBox.getSelectedItem().toString());        
        CollegeCourse choice2 = new CollegeCourse(this.college2ComboBox.getSelectedItem().toString(), this.stream2ComboBox.getSelectedItem().toString());        
        CollegeCourse choice3 = new CollegeCourse(this.college3ComboBox.getSelectedItem().toString(), this.stream3ComboBox.getSelectedItem().toString());        
        CollegeCourse choice4 = new CollegeCourse(this.college4ComboBox.getSelectedItem().toString(), this.stream4ComboBox.getSelectedItem().toString());        
        CollegeCourse choice5 = new CollegeCourse(this.college5ComboBox.getSelectedItem().toString(), this.stream5ComboBox.getSelectedItem().toString());        
        CollegeCourse choice6 = new CollegeCourse(this.college6ComboBox.getSelectedItem().toString(), this.stream6ComboBox.getSelectedItem().toString());        
        CollegeCourse choice7 = new CollegeCourse(this.college7ComboBox.getSelectedItem().toString(), this.stream7ComboBox.getSelectedItem().toString());        
        CollegeCourse choice8 = new CollegeCourse(this.college8ComboBox.getSelectedItem().toString(), this.stream8ComboBox.getSelectedItem().toString());    
        choices.add(choice1);
        choices.add(choice2);
        choices.add(choice3);
        choices.add(choice4);
        choices.add(choice5);
        choices.add(choice6);        
        choices.add(choice7);  
        choices.add(choice8);        
        
        StudentChoiceDetails studentChoiceDetails = new StudentChoiceDetails(this.appNo, this.rank, choices);
        if (checkBox.isSelected()) {
            mgr.applyForCollege(studentChoiceDetails);
            JOptionPane.showMessageDialog(null, "Choices are selected", "Successful!", JOptionPane.INFORMATION_MESSAGE);
        }else{
            //JOptionPane.showMessageDialog(null, infoMessage, "InfoBox: " + titleBar, JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null, "Check the box", "Error!", JOptionPane.ERROR_MESSAGE);
        }        
    }   
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton applyBtn;
    private javax.swing.JCheckBox checkBox;
    private javax.swing.JComboBox<String> college1ComboBox;
    private javax.swing.JComboBox<String> college2ComboBox;
    private javax.swing.JComboBox<String> college3ComboBox;
    private javax.swing.JComboBox<String> college4ComboBox;
    private javax.swing.JComboBox<String> college5ComboBox;
    private javax.swing.JComboBox<String> college6ComboBox;
    private javax.swing.JComboBox<String> college7ComboBox;
    private javax.swing.JComboBox<String> college8ComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JComboBox<String> stream1ComboBox;
    private javax.swing.JComboBox<String> stream2ComboBox;
    private javax.swing.JComboBox<String> stream3ComboBox;
    private javax.swing.JComboBox<String> stream4ComboBox;
    private javax.swing.JComboBox<String> stream5ComboBox;
    private javax.swing.JComboBox<String> stream6ComboBox;
    private javax.swing.JComboBox<String> stream7ComboBox;
    private javax.swing.JComboBox<String> stream8ComboBox;
    // End of variables declaration//GEN-END:variables
}
