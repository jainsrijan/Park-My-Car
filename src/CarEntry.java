
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ButtonModel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Intel
 */
public class CarEntry extends javax.swing.JFrame {

    /**
     * Creates new form CarEntry
     */
     
    static String st;
    static CarEntry ce=new CarEntry();
    String buttonAr[]={"L1S1","L1S2","L1S3","L1S4","L1S5","L1S6","L1S7","L1S8","L1S9","L1S10","L1S11","L1S12","L1S13","L1S14","L1S15","L1S16","L1S17","L1S18"};
    public CarEntry() {
        initComponents();
        //buttonEn();
            jRadioButton1.setActionCommand("L1S1");
            jRadioButton5.setActionCommand("L1S2");
            jRadioButton6.setActionCommand("L1S3");
            jRadioButton7.setActionCommand("L1S4");
            jRadioButton8.setActionCommand("L1S5");
            jRadioButton9.setActionCommand("L1S6");
            jRadioButton10.setActionCommand("L1S7");
            jRadioButton11.setActionCommand("L1S8");
            jRadioButton12.setActionCommand("L1S9");
            jRadioButton13.setActionCommand("L1S10");
            jRadioButton14.setActionCommand("L1S11");
            jRadioButton15.setActionCommand("L1S12");
            jRadioButton16.setActionCommand("L1S13");
            jRadioButton17.setActionCommand("L1S14");
            jRadioButton18.setActionCommand("L1S15");
            jRadioButton19.setActionCommand("L1S16");
            jRadioButton20.setActionCommand("L1S17");
            jRadioButton21.setActionCommand("L1S18");
    }
    public void buttonDis()
    {
        buttonGroup1.getSelection().setEnabled(false);
    }
    
    public void buttonEn()
    {
        for(String label:buttonAr)
        {
             try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
            PreparedStatement pst=connection.prepareStatement("select * from booking where SlotNo=?");
            pst.setString(1,label);
            ResultSet rs=pst.executeQuery();
            if(rs.next())
            {
                if(label.equals("L1S1"))
                {
                    buttonGroup1.remove(jRadioButton1);
                    jRadioButton1.setEnabled(false);
                    jRadioButton1.setSelected(true);
                   
                }
                if(label.equals("L1S2"))
                {
                    buttonGroup1.remove(jRadioButton5);
                    jRadioButton5.setEnabled(false);
                    jRadioButton5.setSelected(true);
                   
                }
                if(label.equals("L1S3"))
                {
                    buttonGroup1.remove(jRadioButton6);
                    jRadioButton6.setEnabled(false);
                    jRadioButton6.setSelected(true);
                   
                }
                if(label.equals("L1S4"))
                {
                    buttonGroup1.remove(jRadioButton7);
                    jRadioButton7.setEnabled(false);
                    jRadioButton7.setSelected(true);                   
                   
                }
                if(label.equals("L1S5"))
                {
                    buttonGroup1.remove(jRadioButton8);
                    jRadioButton8.setEnabled(false);
                    jRadioButton8.setSelected(true);
                   
                }
                if(label.equals("L1S6"))
                {
                    buttonGroup1.remove(jRadioButton9);
                    jRadioButton9.setEnabled(false);
                    jRadioButton9.setSelected(true);
                   
                }
                if(label.equals("L1S7"))
                {
                    buttonGroup1.remove(jRadioButton10);
                    jRadioButton10.setEnabled(false);
                    jRadioButton10.setSelected(true);
                   
                }
                if(label.equals("L1S8"))
                {
                    buttonGroup1.remove(jRadioButton11);
                    jRadioButton11.setEnabled(false);
                    jRadioButton11.setSelected(true);
                   
                }
                if(label.equals("L1S9"))
                {
                    buttonGroup1.remove(jRadioButton12);
                    jRadioButton12.setEnabled(false);
                    jRadioButton12.setSelected(true);
                   
                }
                if(label.equals("L1S10"))
                {
                    buttonGroup1.remove(jRadioButton13);
                    jRadioButton13.setEnabled(false);
                    jRadioButton13.setSelected(true);
                   
                }
                if(label.equals("L1S11"))
                {
                    buttonGroup1.remove(jRadioButton14);
                    jRadioButton14.setEnabled(false);
                    jRadioButton14.setSelected(true);
                   
                }
                if(label.equals("L1S12"))
                {
                    buttonGroup1.remove(jRadioButton15);
                    jRadioButton15.setEnabled(false);
                    jRadioButton15.setSelected(true);
                   
                }
                if(label.equals("L1S13"))
                {
                    buttonGroup1.remove(jRadioButton16);
                    jRadioButton16.setEnabled(false);
                    jRadioButton16.setSelected(true);
                   
                }
                if(label.equals("L1S14"))
                {
                    buttonGroup1.remove(jRadioButton17);
                    jRadioButton17.setEnabled(false);
                    jRadioButton17.setSelected(true);
                   
                }
                if(label.equals("L1S15"))
                {
                    buttonGroup1.remove(jRadioButton18);
                    jRadioButton18.setEnabled(false);
                    jRadioButton18.setSelected(true);
                   
                }
                if(label.equals("L1S16"))
                {
                    buttonGroup1.remove(jRadioButton19);
                    jRadioButton19.setEnabled(false);
                    jRadioButton19.setSelected(true);
                   
                }
                if(label.equals("L1S17"))
                {
                    buttonGroup1.remove(jRadioButton20);
                    jRadioButton20.setEnabled(false);
                    jRadioButton20.setSelected(true);
                   
                }
                if(label.equals("L1S18"))
                {
                    buttonGroup1.remove(jRadioButton21);
                    jRadioButton21.setEnabled(false);
                    jRadioButton21.setSelected(true);
                   
                }
                
            }
            else
            {
                if(label.equals("L1S1"))
                {
                    buttonGroup1.add(jRadioButton1);
                    jRadioButton1.setEnabled(true);
                    jRadioButton1.setSelected(false);
                   
                }
                if(label.equals("L1S2"))
                {
                    buttonGroup1.add(jRadioButton5);
                    jRadioButton5.setEnabled(true);
                    jRadioButton5.setSelected(false);
                   
                }
                if(label.equals("L1S3"))
                {
                    buttonGroup1.add(jRadioButton6);
                    jRadioButton6.setEnabled(true);
                    jRadioButton6.setSelected(false);
                   
                }
                if(label.equals("L1S4"))
                {
                    buttonGroup1.add(jRadioButton7);
                    jRadioButton7.setEnabled(true);
                    jRadioButton7.setSelected(false);
                   
                }
                if(label.equals("L1S5"))
                {
                    buttonGroup1.add(jRadioButton8);
                    jRadioButton8.setEnabled(true);
                    jRadioButton8.setSelected(false);
                   
                }
                if(label.equals("L1S6"))
                {
                    buttonGroup1.add(jRadioButton9);
                    jRadioButton9.setEnabled(true);
                    jRadioButton9.setSelected(false);
                   
                }
                if(label.equals("L1S7"))
                {
                    buttonGroup1.add(jRadioButton10);
                    jRadioButton10.setEnabled(true);
                    jRadioButton10.setSelected(false);
                   
                }
                if(label.equals("L1S8"))
                {
                    buttonGroup1.add(jRadioButton11);
                    jRadioButton11.setEnabled(true);
                    jRadioButton11.setSelected(false);
                   
                }
                if(label.equals("L1S9"))
                {
                    buttonGroup1.add(jRadioButton12);
                    jRadioButton12.setEnabled(true);
                    jRadioButton12.setSelected(false);
                   
                }
                if(label.equals("L1S10"))
                {
                    buttonGroup1.add(jRadioButton13);
                    jRadioButton13.setEnabled(true);
                    jRadioButton13.setSelected(false);
                   
                }
                if(label.equals("L1S11"))
                {
                    buttonGroup1.add(jRadioButton14);
                    jRadioButton14.setEnabled(true);
                    jRadioButton14.setSelected(false);
                   
                }
                if(label.equals("L1S12"))
                {
                    buttonGroup1.add(jRadioButton15);
                    jRadioButton15.setEnabled(true);
                    jRadioButton15.setSelected(false);
                   
                }
                if(label.equals("L1S13"))
                {
                    buttonGroup1.add(jRadioButton16);
                    jRadioButton16.setEnabled(true);
                    jRadioButton16.setSelected(false);
                   
                }
                if(label.equals("L1S14"))
                {
                    buttonGroup1.add(jRadioButton17);
                    jRadioButton17.setEnabled(true);
                    jRadioButton17.setSelected(false);
                   
                }
                if(label.equals("L1S15"))
                {
                    buttonGroup1.add(jRadioButton18);
                    jRadioButton18.setEnabled(true);
                    jRadioButton18.setSelected(false);
                   
                }
                if(label.equals("L1S16"))
                {
                    buttonGroup1.add(jRadioButton19);
                    jRadioButton19.setEnabled(true);
                    jRadioButton19.setSelected(false);
                   
                }
                if(label.equals("L1S17"))
                {
                    buttonGroup1.add(jRadioButton20);
                    jRadioButton20.setEnabled(true);
                    jRadioButton20.setSelected(false);
                   
                }
                if(label.equals("L1S18"))
                {
                    buttonGroup1.add(jRadioButton21);
                    jRadioButton21.setEnabled(true);
                    jRadioButton21.setSelected(false);
                   
                }
            }
        }catch(ClassNotFoundException | SQLException ex)
        {
        }
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jPanel10 = new javax.swing.JPanel();
        jRadioButton5 = new javax.swing.JRadioButton();
        jPanel11 = new javax.swing.JPanel();
        jRadioButton6 = new javax.swing.JRadioButton();
        jPanel12 = new javax.swing.JPanel();
        jRadioButton7 = new javax.swing.JRadioButton();
        jPanel13 = new javax.swing.JPanel();
        jRadioButton8 = new javax.swing.JRadioButton();
        jPanel14 = new javax.swing.JPanel();
        jRadioButton9 = new javax.swing.JRadioButton();
        jPanel15 = new javax.swing.JPanel();
        jRadioButton10 = new javax.swing.JRadioButton();
        jPanel16 = new javax.swing.JPanel();
        jRadioButton11 = new javax.swing.JRadioButton();
        jPanel17 = new javax.swing.JPanel();
        jRadioButton12 = new javax.swing.JRadioButton();
        jPanel18 = new javax.swing.JPanel();
        jRadioButton13 = new javax.swing.JRadioButton();
        jPanel19 = new javax.swing.JPanel();
        jRadioButton14 = new javax.swing.JRadioButton();
        jPanel20 = new javax.swing.JPanel();
        jRadioButton15 = new javax.swing.JRadioButton();
        jPanel21 = new javax.swing.JPanel();
        jRadioButton16 = new javax.swing.JRadioButton();
        jPanel22 = new javax.swing.JPanel();
        jRadioButton17 = new javax.swing.JRadioButton();
        jPanel23 = new javax.swing.JPanel();
        jRadioButton18 = new javax.swing.JRadioButton();
        jPanel24 = new javax.swing.JPanel();
        jRadioButton19 = new javax.swing.JRadioButton();
        jPanel25 = new javax.swing.JPanel();
        jRadioButton20 = new javax.swing.JRadioButton();
        jPanel26 = new javax.swing.JPanel();
        jRadioButton21 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jButton52 = new javax.swing.JButton();
        jButton53 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));

        jPanel6.setBackground(new java.awt.Color(102, 0, 0));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton1.setContentAreaFilled(false);
        jRadioButton1.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_Car_Top_View_50px_3.png"))); // NOI18N
        jRadioButton1.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_Car_Top_View_50px_3.png"))); // NOI18N
        jRadioButton1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jRadioButton1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jRadioButton1.setLabel("L1S1");
        jRadioButton1.setRolloverEnabled(false);
        jRadioButton1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_Car_Top_View_50px_3.png"))); // NOI18N
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jRadioButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        jPanel10.setBackground(new java.awt.Color(102, 0, 0));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        buttonGroup1.add(jRadioButton5);
        jRadioButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton5.setText("L1S2");
        jRadioButton5.setContentAreaFilled(false);
        jRadioButton5.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_Car_Top_View_50px_3.png"))); // NOI18N
        jRadioButton5.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_Car_Top_View_50px_3.png"))); // NOI18N
        jRadioButton5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jRadioButton5.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jRadioButton5.setRolloverEnabled(false);
        jRadioButton5.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_Car_Top_View_50px_3.png"))); // NOI18N

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jRadioButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jRadioButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        jPanel11.setBackground(new java.awt.Color(102, 0, 0));
        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        buttonGroup1.add(jRadioButton6);
        jRadioButton6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton6.setText("L1S3");
        jRadioButton6.setContentAreaFilled(false);
        jRadioButton6.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_Car_Top_View_50px_3.png"))); // NOI18N
        jRadioButton6.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_Car_Top_View_50px_3.png"))); // NOI18N
        jRadioButton6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jRadioButton6.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jRadioButton6.setRolloverEnabled(false);
        jRadioButton6.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_Car_Top_View_50px_3.png"))); // NOI18N

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jRadioButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jRadioButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        jPanel12.setBackground(new java.awt.Color(102, 0, 0));
        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        buttonGroup1.add(jRadioButton7);
        jRadioButton7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton7.setText("L1S4");
        jRadioButton7.setContentAreaFilled(false);
        jRadioButton7.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_Car_Top_View_50px_3.png"))); // NOI18N
        jRadioButton7.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_Car_Top_View_50px_3.png"))); // NOI18N
        jRadioButton7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jRadioButton7.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jRadioButton7.setRolloverEnabled(false);
        jRadioButton7.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_Car_Top_View_50px_3.png"))); // NOI18N

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jRadioButton7, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jRadioButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        jPanel13.setBackground(new java.awt.Color(102, 0, 0));
        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        buttonGroup1.add(jRadioButton8);
        jRadioButton8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton8.setText("L1S5");
        jRadioButton8.setContentAreaFilled(false);
        jRadioButton8.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_Car_Top_View_50px_3.png"))); // NOI18N
        jRadioButton8.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_Car_Top_View_50px_3.png"))); // NOI18N
        jRadioButton8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jRadioButton8.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jRadioButton8.setRolloverEnabled(false);
        jRadioButton8.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_Car_Top_View_50px_3.png"))); // NOI18N

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jRadioButton8, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jRadioButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        jPanel14.setBackground(new java.awt.Color(102, 0, 0));
        jPanel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        buttonGroup1.add(jRadioButton9);
        jRadioButton9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton9.setText("L1S6");
        jRadioButton9.setContentAreaFilled(false);
        jRadioButton9.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_Car_Top_View_50px_3.png"))); // NOI18N
        jRadioButton9.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_Car_Top_View_50px_3.png"))); // NOI18N
        jRadioButton9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jRadioButton9.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jRadioButton9.setRolloverEnabled(false);
        jRadioButton9.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_Car_Top_View_50px_3.png"))); // NOI18N

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jRadioButton9, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jRadioButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        jPanel15.setBackground(new java.awt.Color(102, 0, 0));
        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        buttonGroup1.add(jRadioButton10);
        jRadioButton10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton10.setText("L1S7");
        jRadioButton10.setContentAreaFilled(false);
        jRadioButton10.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_Car_Top_View_50px_3.png"))); // NOI18N
        jRadioButton10.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_Car_Top_View_50px_3.png"))); // NOI18N
        jRadioButton10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jRadioButton10.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jRadioButton10.setRolloverEnabled(false);
        jRadioButton10.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_Car_Top_View_50px_3.png"))); // NOI18N

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jRadioButton10, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jRadioButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        jPanel16.setBackground(new java.awt.Color(102, 0, 0));
        jPanel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        buttonGroup1.add(jRadioButton11);
        jRadioButton11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton11.setText("L1S8");
        jRadioButton11.setContentAreaFilled(false);
        jRadioButton11.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_Car_Top_View_50px_3.png"))); // NOI18N
        jRadioButton11.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_Car_Top_View_50px_3.png"))); // NOI18N
        jRadioButton11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jRadioButton11.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jRadioButton11.setRolloverEnabled(false);
        jRadioButton11.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_Car_Top_View_50px_3.png"))); // NOI18N

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jRadioButton11, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jRadioButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        jPanel17.setBackground(new java.awt.Color(102, 0, 0));
        jPanel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        buttonGroup1.add(jRadioButton12);
        jRadioButton12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton12.setText("L1S9");
        jRadioButton12.setContentAreaFilled(false);
        jRadioButton12.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_Car_Top_View_50px_3.png"))); // NOI18N
        jRadioButton12.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_Car_Top_View_50px_3.png"))); // NOI18N
        jRadioButton12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jRadioButton12.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jRadioButton12.setRolloverEnabled(false);
        jRadioButton12.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_Car_Top_View_50px_3.png"))); // NOI18N
        jRadioButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jRadioButton12, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jRadioButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        jPanel18.setBackground(new java.awt.Color(102, 0, 0));
        jPanel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        buttonGroup1.add(jRadioButton13);
        jRadioButton13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton13.setText("L1S10");
        jRadioButton13.setContentAreaFilled(false);
        jRadioButton13.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_Car_Top_View_50px_3.png"))); // NOI18N
        jRadioButton13.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_Car_Top_View_50px_3.png"))); // NOI18N
        jRadioButton13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jRadioButton13.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jRadioButton13.setRolloverEnabled(false);
        jRadioButton13.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_Car_Top_View_50px_3.png"))); // NOI18N

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jRadioButton13, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jRadioButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        jPanel19.setBackground(new java.awt.Color(102, 0, 0));
        jPanel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        buttonGroup1.add(jRadioButton14);
        jRadioButton14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton14.setText("L1S11");
        jRadioButton14.setContentAreaFilled(false);
        jRadioButton14.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_Car_Top_View_50px_3.png"))); // NOI18N
        jRadioButton14.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_Car_Top_View_50px_3.png"))); // NOI18N
        jRadioButton14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jRadioButton14.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jRadioButton14.setRolloverEnabled(false);
        jRadioButton14.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_Car_Top_View_50px_3.png"))); // NOI18N
        jRadioButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton14ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jRadioButton14, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jRadioButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        jPanel20.setBackground(new java.awt.Color(102, 0, 0));
        jPanel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        buttonGroup1.add(jRadioButton15);
        jRadioButton15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton15.setText("L1S12");
        jRadioButton15.setContentAreaFilled(false);
        jRadioButton15.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_Car_Top_View_50px_3.png"))); // NOI18N
        jRadioButton15.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_Car_Top_View_50px_3.png"))); // NOI18N
        jRadioButton15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jRadioButton15.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jRadioButton15.setRolloverEnabled(false);
        jRadioButton15.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_Car_Top_View_50px_3.png"))); // NOI18N

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jRadioButton15, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jRadioButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        jPanel21.setBackground(new java.awt.Color(102, 0, 0));
        jPanel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        buttonGroup1.add(jRadioButton16);
        jRadioButton16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton16.setText("L1S13");
        jRadioButton16.setContentAreaFilled(false);
        jRadioButton16.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_Car_Top_View_50px_3.png"))); // NOI18N
        jRadioButton16.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_Car_Top_View_50px_3.png"))); // NOI18N
        jRadioButton16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jRadioButton16.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jRadioButton16.setRolloverEnabled(false);
        jRadioButton16.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_Car_Top_View_50px_3.png"))); // NOI18N

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jRadioButton16, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jRadioButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        jPanel22.setBackground(new java.awt.Color(102, 0, 0));
        jPanel22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        buttonGroup1.add(jRadioButton17);
        jRadioButton17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton17.setText("L1S14");
        jRadioButton17.setContentAreaFilled(false);
        jRadioButton17.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_Car_Top_View_50px_3.png"))); // NOI18N
        jRadioButton17.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_Car_Top_View_50px_3.png"))); // NOI18N
        jRadioButton17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jRadioButton17.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jRadioButton17.setRolloverEnabled(false);
        jRadioButton17.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_Car_Top_View_50px_3.png"))); // NOI18N

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jRadioButton17, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jRadioButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        jPanel23.setBackground(new java.awt.Color(102, 0, 0));
        jPanel23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        buttonGroup1.add(jRadioButton18);
        jRadioButton18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton18.setText("L1S15");
        jRadioButton18.setContentAreaFilled(false);
        jRadioButton18.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_Car_Top_View_50px_3.png"))); // NOI18N
        jRadioButton18.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_Car_Top_View_50px_3.png"))); // NOI18N
        jRadioButton18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jRadioButton18.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jRadioButton18.setRolloverEnabled(false);
        jRadioButton18.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_Car_Top_View_50px_3.png"))); // NOI18N

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jRadioButton18, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jRadioButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        jPanel24.setBackground(new java.awt.Color(102, 0, 0));
        jPanel24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        buttonGroup1.add(jRadioButton19);
        jRadioButton19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton19.setText("L1S16");
        jRadioButton19.setContentAreaFilled(false);
        jRadioButton19.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_Car_Top_View_50px_3.png"))); // NOI18N
        jRadioButton19.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_Car_Top_View_50px_3.png"))); // NOI18N
        jRadioButton19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jRadioButton19.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jRadioButton19.setRolloverEnabled(false);
        jRadioButton19.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_Car_Top_View_50px_3.png"))); // NOI18N

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jRadioButton19, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jRadioButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        jPanel25.setBackground(new java.awt.Color(102, 0, 0));
        jPanel25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        buttonGroup1.add(jRadioButton20);
        jRadioButton20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton20.setText("L1S17");
        jRadioButton20.setContentAreaFilled(false);
        jRadioButton20.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_Car_Top_View_50px_3.png"))); // NOI18N
        jRadioButton20.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_Car_Top_View_50px_3.png"))); // NOI18N
        jRadioButton20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jRadioButton20.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jRadioButton20.setRolloverEnabled(false);
        jRadioButton20.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_Car_Top_View_50px_3.png"))); // NOI18N

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jRadioButton20, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jRadioButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        jPanel26.setBackground(new java.awt.Color(102, 0, 0));
        jPanel26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        buttonGroup1.add(jRadioButton21);
        jRadioButton21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton21.setText("L1S18");
        jRadioButton21.setContentAreaFilled(false);
        jRadioButton21.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_Car_Top_View_50px_3.png"))); // NOI18N
        jRadioButton21.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_Car_Top_View_50px_3.png"))); // NOI18N
        jRadioButton21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jRadioButton21.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jRadioButton21.setRolloverEnabled(false);
        jRadioButton21.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_Car_Top_View_50px_3.png"))); // NOI18N

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jRadioButton21, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jRadioButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("LEVEL 1", jPanel4);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 710, 350));

        jLabel3.setBackground(new java.awt.Color(102, 0, 0));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Select Slot");
        jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(255, 255, 255)));
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 210, 40));

        jButton52.setBackground(new java.awt.Color(102, 0, 0));
        jButton52.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton52.setForeground(new java.awt.Color(255, 255, 255));
        jButton52.setText("Back");
        jButton52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton52ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton52, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 120, 40));

        jButton53.setBackground(new java.awt.Color(102, 0, 0));
        jButton53.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton53.setForeground(new java.awt.Color(255, 255, 255));
        jButton53.setText("Proceed");
        jButton53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton53ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton53, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 420, 120, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blue-lines-wallpaper-45357-46569-hd-wallpapers.jpg"))); // NOI18N
        jLabel1.setText("L3S1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton52ActionPerformed
        // TODO add your handling code here:
            new GuardsEntry().setVisible(true);
            CarEntry.ce.setVisible(false);
    }//GEN-LAST:event_jButton52ActionPerformed

    private void jRadioButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton12ActionPerformed

    private void jRadioButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton14ActionPerformed

    private void jButton53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton53ActionPerformed
        // TODO add your handling code here:
        if(buttonGroup1.isSelected(null))
            JOptionPane.showMessageDialog(this,"Select Slot");
        else     
        {             
            st= buttonGroup1.getSelection().getActionCommand();
            new BookingForm().setVisible(true);
            CarEntry.ce.setVisible(false);
        }
       
    }//GEN-LAST:event_jButton53ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CarEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CarEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CarEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CarEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CarEntry().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton52;
    private javax.swing.JButton jButton53;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton12;
    private javax.swing.JRadioButton jRadioButton13;
    private javax.swing.JRadioButton jRadioButton14;
    private javax.swing.JRadioButton jRadioButton15;
    private javax.swing.JRadioButton jRadioButton16;
    private javax.swing.JRadioButton jRadioButton17;
    private javax.swing.JRadioButton jRadioButton18;
    private javax.swing.JRadioButton jRadioButton19;
    private javax.swing.JRadioButton jRadioButton20;
    private javax.swing.JRadioButton jRadioButton21;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
