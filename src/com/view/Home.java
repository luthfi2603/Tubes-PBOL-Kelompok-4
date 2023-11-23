/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.view;

import com.config.Config;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class Home extends javax.swing.JFrame {
    // custom code
    public static String ruangan = "";
    private static ResultSet result;

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();

        // mendapatkan data dari database
        // ruangan 101
        try {
            result = Config.getJadwalSaatIni(Config.formattedTime, Config.ubahHari(Config.formattedDate), "C-101");
            if(result.next()){
                String semester = result.getString("semester");
                String kom = result.getString("kom");
                String kode_matkul = result.getString("kode_matkul");
                String kode_dosen = result.getString("kode_dosen");
                Object tblData[] = { semester, kom, kode_matkul, kode_dosen };
                DefaultTableModel tblModel = (DefaultTableModel) tblRuangan101.getModel();
                tblModel.addRow(tblData);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }

        // ruangan 102
        try {
            result = Config.getJadwalSaatIni(Config.formattedTime, Config.ubahHari(Config.formattedDate), "C-102");
            if(result.next()){
                String semester = result.getString("semester");
                String kom = result.getString("kom");
                String kode_matkul = result.getString("kode_matkul");
                String kode_dosen = result.getString("kode_dosen");
                Object tblData[] = { semester, kom, kode_matkul, kode_dosen };
                DefaultTableModel tblModel = (DefaultTableModel) tblRuangan102.getModel();
                tblModel.addRow(tblData);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        // ruangan 103
        try {
            result = Config.getJadwalSaatIni(Config.formattedTime, Config.ubahHari(Config.formattedDate), "C-103");
            if(result.next()){
                String semester = result.getString("semester");
                String kom = result.getString("kom");
                String kode_matkul = result.getString("kode_matkul");
                String kode_dosen = result.getString("kode_dosen");
                Object tblData[] = { semester, kom, kode_matkul, kode_dosen };
                DefaultTableModel tblModel = (DefaultTableModel) tblRuangan103.getModel();
                tblModel.addRow(tblData);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        // ruangan 104
        try {
            result = Config.getJadwalSaatIni(Config.formattedTime, Config.ubahHari(Config.formattedDate), "C-104");
            if(result.next()){
                String semester = result.getString("semester");
                String kom = result.getString("kom");
                String kode_matkul = result.getString("kode_matkul");
                String kode_dosen = result.getString("kode_dosen");
                Object tblData[] = { semester, kom, kode_matkul, kode_dosen };
                DefaultTableModel tblModel = (DefaultTableModel) tblRuangan104.getModel();
                tblModel.addRow(tblData);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        // ruangan 105
        try {
            result = Config.getJadwalSaatIni(Config.formattedTime, Config.ubahHari(Config.formattedDate), "C-105");
            if(result.next()){
                String semester = result.getString("semester");
                String kom = result.getString("kom");
                String kode_matkul = result.getString("kode_matkul");
                String kode_dosen = result.getString("kode_dosen");
                Object tblData[] = { semester, kom, kode_matkul, kode_dosen };
                DefaultTableModel tblModel = (DefaultTableModel) tblRuangan105.getModel();
                tblModel.addRow(tblData);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        // ruangan 106
        try {
            result = Config.getJadwalSaatIni(Config.formattedTime, Config.ubahHari(Config.formattedDate), "C-106");
            if(result.next()){
                String semester = result.getString("semester");
                String kom = result.getString("kom");
                String kode_matkul = result.getString("kode_matkul");
                String kode_dosen = result.getString("kode_dosen");
                Object tblData[] = { semester, kom, kode_matkul, kode_dosen };
                DefaultTableModel tblModel = (DefaultTableModel) tblRuangan106.getModel();
                tblModel.addRow(tblData);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {
        panel1 = new javax.swing.JPanel();
        mainPanel = new javax.swing.JPanel();
        judul1 = new javax.swing.JLabel();
        judul2 = new javax.swing.JLabel();
        panel101 = new javax.swing.JPanel();
        lbRuangan101 = new javax.swing.JLabel();
        btnCek1 = new javax.swing.JButton();
        scrollTblRuangan101 = new javax.swing.JScrollPane();
        scrollTblRuangan102 = new javax.swing.JScrollPane();
        scrollTblRuangan103 = new javax.swing.JScrollPane();
        scrollTblRuangan104 = new javax.swing.JScrollPane();
        tblRuangan101 = new javax.swing.JTable();
        tblRuangan102 = new javax.swing.JTable();
        tblRuangan103 = new javax.swing.JTable();
        tblRuangan104 = new javax.swing.JTable();
        panel102 = new javax.swing.JPanel();
        lbRuangan102 = new javax.swing.JLabel();
        btnCek2 = new javax.swing.JButton();
        panel103 = new javax.swing.JPanel();
        lbRuangan103 = new javax.swing.JLabel();
        btnCek3 = new javax.swing.JButton();
        panel104 = new javax.swing.JPanel();
        lbRuangan104 = new javax.swing.JLabel();
        btnCek4 = new javax.swing.JButton();
        panel105 = new javax.swing.JPanel();
        lbRuangan105 = new javax.swing.JLabel();
        btnCek5 = new javax.swing.JButton();
        scrollTblRuangan105 = new javax.swing.JScrollPane();
        tblRuangan105 = new javax.swing.JTable();
        panel106 = new javax.swing.JPanel();
        lbRuangan106 = new javax.swing.JLabel();
        btnCek6 = new javax.swing.JButton();
        scrollTblRuangan106 = new javax.swing.JScrollPane();
        tblRuangan106 = new javax.swing.JTable();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setAutoRequestFocus(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });

        mainPanel.setBackground(new java.awt.Color(143, 192, 169)); // ijo

        judul1.setBackground(new java.awt.Color(0, 0, 0));
        judul1.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        judul1.setForeground(new java.awt.Color(50, 50, 52));
        judul1.setText("Jadwal Kelas Prodi ");

        judul2.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        judul2.setForeground(new java.awt.Color(50, 50, 52));
        judul2.setText("Teknologi Informasi");

        panel101.setBackground(new java.awt.Color(250, 243, 221)); // cream

        lbRuangan101.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        lbRuangan101.setForeground(new java.awt.Color(50, 50, 52));
        lbRuangan101.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbRuangan101.setText("C-101");

        btnCek1.setBackground(new java.awt.Color(205, 194, 178));
        btnCek1.setFont(new java.awt.Font("Tw Cen MT", 1, 15)); // NOI18N
        btnCek1.setText("Cek Kelas");
        btnCek1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCek1ActionPerformed(evt);
            }
        });

        tblRuangan101.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {},
                new String[] {
                        "Semester", "Kom", "Kode Matkul", "Dosen"
                }));
        scrollTblRuangan101.setViewportView(tblRuangan101);

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel101);
        panel101.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
                panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel2Layout.createSequentialGroup()
                                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(panel2Layout.createSequentialGroup()
                                                .addGap(0, 6, Short.MAX_VALUE)
                                                .addComponent(scrollTblRuangan101,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 313,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(panel2Layout.createSequentialGroup()
                                                .addGroup(panel2Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(panel2Layout.createSequentialGroup()
                                                                .addGap(147, 147, 147)
                                                                .addComponent(lbRuangan101))
                                                        .addGroup(panel2Layout.createSequentialGroup()
                                                                .addGap(114, 114, 114)
                                                                .addComponent(btnCek1)))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap()));
        panel2Layout.setVerticalGroup(
                panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel2Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(lbRuangan101)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(scrollTblRuangan101, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCek1, javax.swing.GroupLayout.PREFERRED_SIZE, 38,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(12, Short.MAX_VALUE)));

        panel102.setBackground(new java.awt.Color(250, 243, 221)); // cream

        lbRuangan102.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        lbRuangan102.setForeground(new java.awt.Color(50, 50, 52));
        lbRuangan102.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbRuangan102.setText("C-102");

        btnCek2.setBackground(new java.awt.Color(205, 194, 178));
        btnCek2.setFont(new java.awt.Font("Tw Cen MT", 1, 15)); // NOI18N
        btnCek2.setText("Cek Kelas");
        btnCek2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCek2ActionPerformed(evt);
            }
        });

        tblRuangan102.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {},
                new String[] {
                        "Semester", "Kom", "Kode Matkul", "Dosen"
                }));
        scrollTblRuangan102.setViewportView(tblRuangan102);

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel102);
        panel102.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
                panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel3Layout.createSequentialGroup()
                                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(panel3Layout.createSequentialGroup()
                                                .addGap(0, 6, Short.MAX_VALUE)
                                                .addComponent(scrollTblRuangan102,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 313,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(panel3Layout.createSequentialGroup()
                                                .addGroup(panel3Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(panel3Layout.createSequentialGroup()
                                                                .addGap(147, 147, 147)
                                                                .addComponent(lbRuangan102))
                                                        .addGroup(panel3Layout.createSequentialGroup()
                                                                .addGap(114, 114, 114)
                                                                .addComponent(btnCek2)))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap()));
        panel3Layout.setVerticalGroup(
                panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel3Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(lbRuangan102)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(scrollTblRuangan102, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCek2, javax.swing.GroupLayout.PREFERRED_SIZE, 38,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(12, Short.MAX_VALUE)));

        panel103.setBackground(new java.awt.Color(250, 243, 221)); // cream

        lbRuangan103.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        lbRuangan103.setForeground(new java.awt.Color(50, 50, 52));
        lbRuangan103.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbRuangan103.setText("C-103");

        btnCek3.setBackground(new java.awt.Color(205, 194, 178));
        btnCek3.setFont(new java.awt.Font("Tw Cen MT", 1, 15)); // NOI18N
        btnCek3.setText("Cek Kelas");
        btnCek3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCek3ActionPerformed(evt);
            }
        });

        tblRuangan103.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {},
                new String[] {
                        "Semester", "Kom", "Kode Matkul", "Dosen"
                }));
        scrollTblRuangan103.setViewportView(tblRuangan103);

        javax.swing.GroupLayout panel4Layout = new javax.swing.GroupLayout(panel103);
        panel103.setLayout(panel4Layout);
        panel4Layout.setHorizontalGroup(
                panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel4Layout.createSequentialGroup()
                                .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(panel4Layout.createSequentialGroup()
                                                .addGap(0, 6, Short.MAX_VALUE)
                                                .addComponent(scrollTblRuangan103,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 313,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(panel4Layout.createSequentialGroup()
                                                .addGroup(panel4Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(panel4Layout.createSequentialGroup()
                                                                .addGap(147, 147, 147)
                                                                .addComponent(lbRuangan103))
                                                        .addGroup(panel4Layout.createSequentialGroup()
                                                                .addGap(114, 114, 114)
                                                                .addComponent(btnCek3)))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap()));
        panel4Layout.setVerticalGroup(
                panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel4Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(lbRuangan103)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(scrollTblRuangan103, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCek3, javax.swing.GroupLayout.PREFERRED_SIZE, 38,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(12, Short.MAX_VALUE)));

        panel104.setBackground(new java.awt.Color(250, 243, 221)); // cream

        lbRuangan104.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        lbRuangan104.setForeground(new java.awt.Color(50, 50, 52));
        lbRuangan104.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbRuangan104.setText("C-104");

        btnCek4.setBackground(new java.awt.Color(205, 194, 178));
        btnCek4.setFont(new java.awt.Font("Tw Cen MT", 1, 15)); // NOI18N
        btnCek4.setText("Cek Kelas");
        btnCek4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCek4ActionPerformed(evt);
            }
        });

        tblRuangan104.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {},
                new String[] {
                        "Semester", "Kom", "Kode Matkul", "Dosen"
                }));
        scrollTblRuangan104.setViewportView(tblRuangan104);

        javax.swing.GroupLayout panel5Layout = new javax.swing.GroupLayout(panel104);
        panel104.setLayout(panel5Layout);
        panel5Layout.setHorizontalGroup(
                panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel5Layout.createSequentialGroup()
                                .addGroup(panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(panel5Layout.createSequentialGroup()
                                                .addGap(0, 6, Short.MAX_VALUE)
                                                .addComponent(scrollTblRuangan104,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 313,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(panel5Layout.createSequentialGroup()
                                                .addGroup(panel5Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(panel5Layout.createSequentialGroup()
                                                                .addGap(147, 147, 147)
                                                                .addComponent(lbRuangan104))
                                                        .addGroup(panel5Layout.createSequentialGroup()
                                                                .addGap(114, 114, 114)
                                                                .addComponent(btnCek4)))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap()));
        panel5Layout.setVerticalGroup(
                panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel5Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(lbRuangan104)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(scrollTblRuangan104, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCek4, javax.swing.GroupLayout.PREFERRED_SIZE, 38,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(12, Short.MAX_VALUE)));

        panel105.setBackground(new java.awt.Color(250, 243, 221)); // cream

        lbRuangan105.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        lbRuangan105.setForeground(new java.awt.Color(50, 50, 52));
        lbRuangan105.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbRuangan105.setText("C-105");

        btnCek5.setBackground(new java.awt.Color(205, 194, 178));
        btnCek5.setFont(new java.awt.Font("Tw Cen MT", 1, 15)); // NOI18N
        btnCek5.setText("Cek Kelas");
        btnCek5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCek5ActionPerformed(evt);
            }
        });

        tblRuangan105.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {},
                new String[] {
                        "Semester", "Kom", "Kode Matkul", "Dosen"
                }));
        scrollTblRuangan105.setViewportView(tblRuangan105);

        javax.swing.GroupLayout panel6Layout = new javax.swing.GroupLayout(panel105);
        panel105.setLayout(panel6Layout);
        panel6Layout.setHorizontalGroup(
                panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel6Layout.createSequentialGroup()
                                .addGroup(panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(panel6Layout.createSequentialGroup()
                                                .addGap(0, 6, Short.MAX_VALUE)
                                                .addComponent(scrollTblRuangan105,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 313,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(panel6Layout.createSequentialGroup()
                                                .addGroup(panel6Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(panel6Layout.createSequentialGroup()
                                                                .addGap(147, 147, 147)
                                                                .addComponent(lbRuangan105))
                                                        .addGroup(panel6Layout.createSequentialGroup()
                                                                .addGap(114, 114, 114)
                                                                .addComponent(btnCek5)))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap()));
        panel6Layout.setVerticalGroup(
                panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel6Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(lbRuangan105)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(scrollTblRuangan105, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCek5, javax.swing.GroupLayout.PREFERRED_SIZE, 38,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(12, Short.MAX_VALUE)));

        panel106.setBackground(new java.awt.Color(250, 243, 221)); // cream

        lbRuangan106.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        lbRuangan106.setForeground(new java.awt.Color(50, 50, 52));
        lbRuangan106.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbRuangan106.setText("C-106");

        btnCek6.setBackground(new java.awt.Color(205, 194, 178));
        btnCek6.setFont(new java.awt.Font("Tw Cen MT", 1, 15)); // NOI18N
        btnCek6.setText("Cek Kelas");
        btnCek6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCek6ActionPerformed(evt);
            }
        });

        tblRuangan106.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {},
                new String[] {
                        "Semester", "Kom", "Kode Matkul", "Dosen"
                }));
        scrollTblRuangan106.setViewportView(tblRuangan106);

        javax.swing.GroupLayout panel7Layout = new javax.swing.GroupLayout(panel106);
        panel106.setLayout(panel7Layout);
        panel7Layout.setHorizontalGroup(
                panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel7Layout.createSequentialGroup()
                                .addGroup(panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(panel7Layout.createSequentialGroup()
                                                .addGap(0, 6, Short.MAX_VALUE)
                                                .addComponent(scrollTblRuangan106,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 313,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(panel7Layout.createSequentialGroup()
                                                .addGroup(panel7Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(panel7Layout.createSequentialGroup()
                                                                .addGap(147, 147, 147)
                                                                .addComponent(lbRuangan106))
                                                        .addGroup(panel7Layout.createSequentialGroup()
                                                                .addGap(114, 114, 114)
                                                                .addComponent(btnCek6)))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap()));
        panel7Layout.setVerticalGroup(
                panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel7Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(lbRuangan106)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(scrollTblRuangan106, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCek6, javax.swing.GroupLayout.PREFERRED_SIZE, 38,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(12, Short.MAX_VALUE)));

        javax.swing.GroupLayout panel8Layout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(panel8Layout);
        panel8Layout.setHorizontalGroup(
                panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel8Layout.createSequentialGroup()
                                .addGroup(panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(panel8Layout.createSequentialGroup()
                                                .addGroup(panel8Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(panel8Layout.createSequentialGroup()
                                                                .addGap(234, 234, 234)
                                                                .addComponent(judul1))
                                                        .addGroup(panel8Layout.createSequentialGroup()
                                                                .addGap(232, 232, 232)
                                                                .addComponent(judul2)))
                                                .addGap(211, 211, 211))
                                        .addGroup(panel8Layout.createSequentialGroup()
                                                .addGap(24, 24, 24)
                                                .addGroup(panel8Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(panel8Layout.createSequentialGroup()
                                                                .addComponent(panel101,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(panel102,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(panel8Layout
                                                                .createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(panel8Layout.createSequentialGroup()
                                                                        .addComponent(panel103,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(18, 18, 18)
                                                                        .addComponent(panel104,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(panel8Layout.createSequentialGroup()
                                                                        .addComponent(panel105,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(18, 18, 18)
                                                                        .addComponent(panel106,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addContainerGap(24, Short.MAX_VALUE)));
        panel8Layout.setVerticalGroup(
                panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel8Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(judul1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(judul2)
                                .addGap(31, 31, 31)
                                .addGroup(panel8Layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(panel101, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(panel102, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(panel103, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(panel104, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(panel106, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(panel105, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(41, Short.MAX_VALUE)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(mainPanel, javax.swing.GroupLayout.Alignment.TRAILING,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                                Short.MAX_VALUE));

        pack();
    }// </editor-fold>

    private void formComponentResized(java.awt.event.ComponentEvent evt) {
        // handling here
    }

    // event handling
    private void btnCek1ActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            this.setVisible(false);
            ruangan = "C-101";
            DetailClass detailClass = new DetailClass();
            detailClass.setLocationRelativeTo(null);
            detailClass.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    private void btnCek2ActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            this.setVisible(false);
            ruangan = "C-102";
            DetailClass detailClass = new DetailClass();
            detailClass.setLocationRelativeTo(null);
            detailClass.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    private void btnCek3ActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            this.setVisible(false);
            ruangan = "C-103";
            DetailClass detailClass = new DetailClass();
            detailClass.setLocationRelativeTo(null);
            detailClass.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    private void btnCek4ActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            this.setVisible(false);
            ruangan = "C-104";
            DetailClass detailClass = new DetailClass();
            detailClass.setLocationRelativeTo(null);
            detailClass.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    private void btnCek5ActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            this.setVisible(false);
            ruangan = "C-105";
            DetailClass detailClass = new DetailClass();
            detailClass.setLocationRelativeTo(null);
            detailClass.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    private void btnCek6ActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            this.setVisible(false);
            ruangan = "C-106";
            DetailClass detailClass = new DetailClass();
            detailClass.setLocationRelativeTo(null);
            detailClass.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    // Variables declaration - do not modify
    private javax.swing.JButton btnCek2;
    private javax.swing.JButton btnCek3;
    private javax.swing.JButton btnCek4;
    private javax.swing.JButton btnCek5;
    private javax.swing.JButton btnCek6;
    private javax.swing.JButton btnCek1;
    private javax.swing.JLabel judul1;
    private javax.swing.JLabel judul2;
    private javax.swing.JLabel lbRuangan102;
    private javax.swing.JLabel lbRuangan103;
    private javax.swing.JLabel lbRuangan104;
    private javax.swing.JLabel lbRuangan105;
    private javax.swing.JLabel lbRuangan106;
    private javax.swing.JLabel lbRuangan101;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel101;
    private javax.swing.JPanel panel102;
    private javax.swing.JPanel panel103;
    private javax.swing.JPanel panel104;
    private javax.swing.JPanel panel105;
    private javax.swing.JPanel panel106;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JScrollPane scrollTblRuangan101;
    private javax.swing.JScrollPane scrollTblRuangan102;
    private javax.swing.JScrollPane scrollTblRuangan103;
    private javax.swing.JScrollPane scrollTblRuangan104;
    private javax.swing.JScrollPane scrollTblRuangan105;
    private javax.swing.JScrollPane scrollTblRuangan106;
    private javax.swing.JTable tblRuangan101;
    private javax.swing.JTable tblRuangan102;
    private javax.swing.JTable tblRuangan103;
    private javax.swing.JTable tblRuangan104;
    private javax.swing.JTable tblRuangan105;
    private javax.swing.JTable tblRuangan106;
    // End of variables declaration
}