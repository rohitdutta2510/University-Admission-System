/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UAS;
import UAS.*;
import UAS.utils.CollegeCourseInfo;
import UAS.utils.CollegeCourse;
import UAS.utils.CollegeManager;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author rohit_dutta
 */
public class ViewRecommendedCollegesUI extends javax.swing.JFrame {

    private int rank;
    private String appNo;    

    /** Creates new form ViewRecommendedCollegesUI */
    public ViewRecommendedCollegesUI(int rank,String appNo) {
        CollegeManager mgr = new CollegeManager();
        //CollegeManager
        this.rank = rank;
        this.appNo = appNo;
        ArrayList<CollegeCourseInfo> rec = mgr.recommendCollegeCourse(this.rank);
        ArrayList<String> college = new ArrayList<String>();
        ArrayList<String> stream = new ArrayList<String>();
        
        //mgr.recommendCollege(rank) -> ArrayList
        for (CollegeCourseInfo collegeCourseInfo : rec) {
            college.add(collegeCourseInfo.collegeName);
            stream.add(collegeCourseInfo.courseName);
        }
        String[] coll = college.toArray(new String[college.size()]);
        String[] str = stream.toArray(new String[stream.size()]);
        //take the array list and show them in CheckBox  
        initComponents();
        rec1.setText(coll[0] + "-" + str[0]);
        rec2.setText(coll[1] + "-" + str[1]);
        rec3.setText(coll[2] + "-" + str[2]);
        rec4.setText(coll[3] + "-" + str[3]);
               
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        submitBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        rec1 = new javax.swing.JCheckBox();
        rec2 = new javax.swing.JCheckBox();
        rec4 = new javax.swing.JCheckBox();
        rec3 = new javax.swing.JCheckBox();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("College:");
        jLabel1.setPreferredSize(new java.awt.Dimension(40, 15));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("View Recommended Colleges");

        submitBtn.setBackground(new java.awt.Color(236, 45, 25));
        submitBtn.setText("Submit");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Stream:");
        jLabel3.setPreferredSize(new java.awt.Dimension(40, 15));

        rec1.setText("CollegeName - StreamName");

        rec2.setText("CollegeName - StreamName");

        rec4.setText("CollegeName - StreamName");

        rec3.setText("CollegeName - StreamName");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(127, 127, 127)
                .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(131, 131, 131))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(115, 161, Short.MAX_VALUE)
                .add(jLabel2)
                .add(177, 177, 177))
            .add(layout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(rec3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 196, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(rec4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 196, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(rec2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 196, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(rec1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 196, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .add(layout.createSequentialGroup()
                .add(247, 247, 247)
                .add(submitBtn, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 91, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel2)
                .add(34, 34, 34)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(40, 40, 40)
                .add(rec1)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(rec2)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(rec3)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(rec4)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 101, Short.MAX_VALUE)
                .add(submitBtn, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 37, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(54, 54, 54))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        // TODO add your handling code here:
        this.submit();
    }//GEN-LAST:event_submitBtnActionPerformed
  
    private void submit(){
        ArrayList<String> sel_coll = new ArrayList<String>();
        ArrayList<CollegeCourse> cc = new ArrayList<CollegeCourse>();
        String[] coll_str = new String[4];
        String[] coll = new String[4];
        String[] stream = new String[4];
        //String[] sel_coll = new String[4];
        if(rec1.isSelected())
        {
            sel_coll.add(rec1.getText());
        }
        if(rec2.isSelected())
        {
            sel_coll.add(rec2.getText());
        }
        if(rec3.isSelected())
        {
            sel_coll.add(rec3.getText());
        }
        if(rec4.isSelected())
        {
            sel_coll.add(rec4.getText());
        }
       
        for(int i = 0; i < sel_coll.size(); i++)
        {
            coll_str[i] = sel_coll.get(i);
        }
        for(int i = 0; i < coll_str.length; i++)
        {
            if(coll_str[i]==null)
                break;
            coll[i] = coll_str[i].substring(0,coll_str[i].indexOf("-"));
            stream[i] = coll_str[i].substring(coll_str[i].indexOf("-")+1,coll_str[i].length());
            cc.add(new CollegeCourse(coll[i],stream[i]));
            //System.out.println(coll[i]+"--"+stream[i]);
        }
        
        new ApplyforCollegeUI(this.appNo, this.rank, cc).setVisible(true);
        dispose();
       
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JCheckBox rec1;
    private javax.swing.JCheckBox rec2;
    private javax.swing.JCheckBox rec3;
    private javax.swing.JCheckBox rec4;
    private javax.swing.JButton submitBtn;
    // End of variables declaration//GEN-END:variables

}
