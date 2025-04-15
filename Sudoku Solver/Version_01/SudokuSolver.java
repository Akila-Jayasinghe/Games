
package Version_01;


import java.awt.Color;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.Timer;


public class SudokuSolver extends javax.swing.JFrame {

    public SudokuSolver() {
        initComponents();
        setTitle("Sudoku Solver - by Akila Jayasinghe");
        setIconImage(new ImageIcon("icon.ico").getImage());
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        SudokuPanel = new javax.swing.JPanel();
        cell_1_1 = new javax.swing.JTextField();
        cell_1_2 = new javax.swing.JTextField();
        cell_1_3 = new javax.swing.JTextField();
        cell_1_4 = new javax.swing.JTextField();
        cell_1_5 = new javax.swing.JTextField();
        cell_1_6 = new javax.swing.JTextField();
        cell_1_7 = new javax.swing.JTextField();
        cell_1_8 = new javax.swing.JTextField();
        cell_1_9 = new javax.swing.JTextField();
        cell_2_1 = new javax.swing.JTextField();
        cell_2_2 = new javax.swing.JTextField();
        cell_2_3 = new javax.swing.JTextField();
        cell_2_4 = new javax.swing.JTextField();
        cell_2_5 = new javax.swing.JTextField();
        cell_2_6 = new javax.swing.JTextField();
        cell_2_7 = new javax.swing.JTextField();
        cell_2_8 = new javax.swing.JTextField();
        cell_2_9 = new javax.swing.JTextField();
        cell_3_1 = new javax.swing.JTextField();
        cell_3_2 = new javax.swing.JTextField();
        cell_3_3 = new javax.swing.JTextField();
        cell_3_4 = new javax.swing.JTextField();
        cell_3_5 = new javax.swing.JTextField();
        cell_3_6 = new javax.swing.JTextField();
        cell_3_7 = new javax.swing.JTextField();
        cell_3_8 = new javax.swing.JTextField();
        cell_3_9 = new javax.swing.JTextField();
        cell_4_1 = new javax.swing.JTextField();
        cell_4_2 = new javax.swing.JTextField();
        cell_4_3 = new javax.swing.JTextField();
        cell_4_4 = new javax.swing.JTextField();
        cell_4_5 = new javax.swing.JTextField();
        cell_4_6 = new javax.swing.JTextField();
        cell_4_7 = new javax.swing.JTextField();
        cell_4_8 = new javax.swing.JTextField();
        cell_4_9 = new javax.swing.JTextField();
        cell_5_1 = new javax.swing.JTextField();
        cell_5_2 = new javax.swing.JTextField();
        cell_5_3 = new javax.swing.JTextField();
        cell_5_4 = new javax.swing.JTextField();
        cell_5_5 = new javax.swing.JTextField();
        cell_5_6 = new javax.swing.JTextField();
        cell_5_7 = new javax.swing.JTextField();
        cell_5_8 = new javax.swing.JTextField();
        cell_5_9 = new javax.swing.JTextField();
        cell_6_1 = new javax.swing.JTextField();
        cell_6_2 = new javax.swing.JTextField();
        cell_6_3 = new javax.swing.JTextField();
        cell_6_4 = new javax.swing.JTextField();
        cell_6_5 = new javax.swing.JTextField();
        cell_6_6 = new javax.swing.JTextField();
        cell_6_7 = new javax.swing.JTextField();
        cell_6_8 = new javax.swing.JTextField();
        cell_6_9 = new javax.swing.JTextField();
        cell_7_1 = new javax.swing.JTextField();
        cell_7_2 = new javax.swing.JTextField();
        cell_7_3 = new javax.swing.JTextField();
        cell_7_4 = new javax.swing.JTextField();
        cell_7_5 = new javax.swing.JTextField();
        cell_7_6 = new javax.swing.JTextField();
        cell_7_7 = new javax.swing.JTextField();
        cell_7_8 = new javax.swing.JTextField();
        cell_7_9 = new javax.swing.JTextField();
        cell_8_1 = new javax.swing.JTextField();
        cell_8_2 = new javax.swing.JTextField();
        cell_8_3 = new javax.swing.JTextField();
        cell_8_4 = new javax.swing.JTextField();
        cell_8_5 = new javax.swing.JTextField();
        cell_8_6 = new javax.swing.JTextField();
        cell_8_7 = new javax.swing.JTextField();
        cell_8_8 = new javax.swing.JTextField();
        cell_8_9 = new javax.swing.JTextField();
        cell_9_1 = new javax.swing.JTextField();
        cell_9_2 = new javax.swing.JTextField();
        cell_9_3 = new javax.swing.JTextField();
        cell_9_4 = new javax.swing.JTextField();
        cell_9_5 = new javax.swing.JTextField();
        cell_9_6 = new javax.swing.JTextField();
        cell_9_7 = new javax.swing.JTextField();
        cell_9_8 = new javax.swing.JTextField();
        cell_9_9 = new javax.swing.JTextField();
        btn_reset = new javax.swing.JButton();
        btn_solve = new javax.swing.JButton();
        btn_exit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 255));
        setBounds(new java.awt.Rectangle(0, 0, 500, 500));

        SudokuPanel.setLayout(new java.awt.GridLayout(9, 9));

        cell_1_1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cell_1_1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cell_1_2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cell_1_2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cell_1_3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cell_1_3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cell_1_4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cell_1_4.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cell_1_5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cell_1_5.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cell_1_6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cell_1_6.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cell_1_7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cell_1_7.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cell_1_8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cell_1_8.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cell_1_9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cell_1_9.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cell_2_1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cell_2_1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cell_2_2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cell_2_2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cell_2_3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cell_2_3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cell_2_4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cell_2_4.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cell_2_5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cell_2_5.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cell_2_6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cell_2_6.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cell_2_7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cell_2_7.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cell_2_8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cell_2_8.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cell_2_9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cell_2_9.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cell_3_1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cell_3_1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cell_3_2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cell_3_2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cell_3_3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cell_3_3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cell_3_4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cell_3_4.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cell_3_5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cell_3_5.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cell_3_6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cell_3_6.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cell_3_7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cell_3_7.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cell_3_8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cell_3_8.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cell_3_9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cell_3_9.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cell_4_1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cell_4_1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cell_4_2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cell_4_2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cell_4_3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cell_4_3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cell_4_4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cell_4_4.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cell_4_5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cell_4_5.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cell_4_6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cell_4_6.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cell_4_7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cell_4_7.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cell_4_8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cell_4_8.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cell_4_9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cell_4_9.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cell_5_1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cell_5_1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cell_5_2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cell_5_2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cell_5_3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cell_5_3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cell_5_4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cell_5_4.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cell_5_5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cell_5_5.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cell_5_6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cell_5_6.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cell_5_7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cell_5_7.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cell_5_8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cell_5_8.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cell_5_9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cell_5_9.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cell_6_1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cell_6_1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cell_6_2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cell_6_2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cell_6_3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cell_6_3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cell_6_4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cell_6_4.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cell_6_5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cell_6_5.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cell_6_6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cell_6_6.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cell_6_7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cell_6_7.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cell_6_8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cell_6_8.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cell_6_9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cell_6_9.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cell_7_1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cell_7_1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cell_7_2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cell_7_2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cell_7_3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cell_7_3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cell_7_4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cell_7_4.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cell_7_5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cell_7_5.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cell_7_6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cell_7_6.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cell_7_7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cell_7_7.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cell_7_8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cell_7_8.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cell_7_9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cell_7_9.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cell_8_1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cell_8_1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cell_8_2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cell_8_2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cell_8_3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cell_8_3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cell_8_4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cell_8_4.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cell_8_5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cell_8_5.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cell_8_6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cell_8_6.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cell_8_7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cell_8_7.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cell_8_8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cell_8_8.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cell_8_9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cell_8_9.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cell_9_1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cell_9_1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cell_9_2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cell_9_2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cell_9_3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cell_9_3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cell_9_4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cell_9_4.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cell_9_5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cell_9_5.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cell_9_6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cell_9_6.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cell_9_7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cell_9_7.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cell_9_8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cell_9_8.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cell_9_9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cell_9_9.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btn_reset.setText("Reset");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });

        btn_solve.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btn_solve.setText("Solve");
        btn_solve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_solveActionPerformed(evt);
            }
        });

        btn_exit.setText("Exit");
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sudoku Solver");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(SudokuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(126, 126, 126))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cell_1_1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(3, 3, 3)
                                        .addComponent(cell_1_2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(3, 3, 3)
                                        .addComponent(cell_1_3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cell_2_1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(3, 3, 3)
                                        .addComponent(cell_2_2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(3, 3, 3)
                                        .addComponent(cell_2_3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cell_3_1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(3, 3, 3)
                                        .addComponent(cell_3_2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(3, 3, 3)
                                        .addComponent(cell_3_3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cell_2_4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(3, 3, 3)
                                        .addComponent(cell_2_5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(3, 3, 3)
                                        .addComponent(cell_2_6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cell_3_4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(3, 3, 3)
                                        .addComponent(cell_3_5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(3, 3, 3)
                                        .addComponent(cell_3_6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cell_1_4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(3, 3, 3)
                                        .addComponent(cell_1_5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(3, 3, 3)
                                        .addComponent(cell_1_6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cell_1_7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(3, 3, 3)
                                        .addComponent(cell_1_8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(3, 3, 3)
                                        .addComponent(cell_1_9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cell_2_7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(3, 3, 3)
                                        .addComponent(cell_2_8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(3, 3, 3)
                                        .addComponent(cell_2_9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cell_3_7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(3, 3, 3)
                                        .addComponent(cell_3_8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(3, 3, 3)
                                        .addComponent(cell_3_9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cell_4_1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(3, 3, 3)
                                        .addComponent(cell_4_2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(3, 3, 3)
                                        .addComponent(cell_4_3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cell_5_1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(3, 3, 3)
                                        .addComponent(cell_5_2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(3, 3, 3)
                                        .addComponent(cell_5_3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cell_6_1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(3, 3, 3)
                                        .addComponent(cell_6_2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(3, 3, 3)
                                        .addComponent(cell_6_3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cell_4_4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(3, 3, 3)
                                        .addComponent(cell_4_5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(3, 3, 3)
                                        .addComponent(cell_4_6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cell_5_4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(3, 3, 3)
                                        .addComponent(cell_5_5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(3, 3, 3)
                                        .addComponent(cell_5_6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cell_6_4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(3, 3, 3)
                                        .addComponent(cell_6_5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(3, 3, 3)
                                        .addComponent(cell_6_6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cell_4_7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(3, 3, 3)
                                        .addComponent(cell_4_8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(3, 3, 3)
                                        .addComponent(cell_4_9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cell_5_7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(3, 3, 3)
                                        .addComponent(cell_5_8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(3, 3, 3)
                                        .addComponent(cell_5_9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cell_6_7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(3, 3, 3)
                                        .addComponent(cell_6_8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(3, 3, 3)
                                        .addComponent(cell_6_9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(cell_7_1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(3, 3, 3)
                                                .addComponent(cell_7_2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(3, 3, 3)
                                                .addComponent(cell_7_3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(cell_8_1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(3, 3, 3)
                                                .addComponent(cell_8_2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(3, 3, 3)
                                                .addComponent(cell_8_3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(cell_9_1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(3, 3, 3)
                                                .addComponent(cell_9_2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(3, 3, 3)
                                                .addComponent(cell_9_3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(10, 10, 10))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btn_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(cell_7_4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(3, 3, 3)
                                            .addComponent(cell_7_5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(3, 3, 3)
                                            .addComponent(cell_7_6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(cell_8_4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(3, 3, 3)
                                            .addComponent(cell_8_5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(3, 3, 3)
                                            .addComponent(cell_8_6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(cell_9_4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(3, 3, 3)
                                            .addComponent(cell_9_5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(3, 3, 3)
                                            .addComponent(cell_9_6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(btn_solve, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cell_7_7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(3, 3, 3)
                                        .addComponent(cell_7_8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(3, 3, 3)
                                        .addComponent(cell_7_9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cell_8_7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(3, 3, 3)
                                        .addComponent(cell_8_8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(3, 3, 3)
                                        .addComponent(cell_8_9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cell_9_7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(3, 3, 3)
                                        .addComponent(cell_9_8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(3, 3, 3)
                                        .addComponent(cell_9_9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(20, 20, 20))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(SudokuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cell_1_1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cell_1_2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cell_1_3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cell_2_1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cell_2_2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cell_2_3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cell_3_1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cell_3_2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cell_3_3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cell_1_4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cell_1_5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cell_1_6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cell_2_4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cell_2_5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cell_2_6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cell_3_4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cell_3_5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cell_3_6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cell_1_7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cell_1_8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cell_1_9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cell_2_7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cell_2_8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cell_2_9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cell_3_7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cell_3_8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cell_3_9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cell_4_1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cell_4_2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cell_4_3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cell_5_1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cell_5_2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cell_5_3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cell_6_1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cell_6_2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cell_6_3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cell_4_4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cell_4_5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cell_4_6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cell_5_4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cell_5_5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cell_5_6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cell_6_4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cell_6_5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cell_6_6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cell_4_7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cell_4_8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cell_4_9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cell_5_7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cell_5_8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cell_5_9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cell_6_7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cell_6_8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cell_6_9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cell_7_1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cell_7_2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cell_7_3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(3, 3, 3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cell_8_1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cell_8_2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cell_8_3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(3, 3, 3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cell_9_1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cell_9_2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cell_9_3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cell_7_4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cell_7_5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cell_7_6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(3, 3, 3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cell_8_4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cell_8_5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cell_8_6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(3, 3, 3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cell_9_4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cell_9_5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cell_9_6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cell_7_7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cell_7_8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cell_7_9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cell_8_7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cell_8_8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cell_8_9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cell_9_7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cell_9_8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cell_9_9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(btn_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(btn_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_solve, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }                                                         

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {  
        btn_solve.setEnabled(true);                                        
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                JTextField cell = getCellComponent(row, col);
                cell.setEditable(true);
                cell.setForeground(Color.BLACK);
                cell.setText("");
                grid[row][col] = 0;
            }
        }
    }                                         
    
    private void btn_solveActionPerformed(java.awt.event.ActionEvent evt) {  
        
        btn_solve.setEnabled(false);
        btn_reset.setEnabled(false);

        ArrayList<String> invalidCells = new ArrayList<>();
    
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                JTextField cell = getCellComponent(row, col); 
                String text = cell.getText().trim();
            
                if (text.isEmpty()) {
                    cell.setEditable(false);
                    grid[row][col] = 0;
                    continue;
                }
            
                try {
                    int value = Integer.parseInt(text);
                    if (value < 1 || value > 9) {
                        cell.setEditable(false);
                        invalidCells.add(String.format("Row %d, Column %d", row+1, col+1));
                    } else {
                        cell.setEditable(false);
                        grid[row][col] = value;
                        cell.setForeground(Color.RED);
                    }
                } catch (NumberFormatException e) {
                    invalidCells.add(String.format("Row %d, Column %d", row+1, col+1));
                }
            }
        }
    
        if (!invalidCells.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                "Invalid input in these cells (only 1-9 allowed):\n" +
                String.join("\n", invalidCells),
                "Invalid Input",
                JOptionPane.WARNING_MESSAGE);
            btn_solve.setEnabled(true);
            btn_reset.setEnabled(true);
            return;
        }

        // Copy the input array for usage of class
        int[][] grid_result = new int[grid.length][grid.length];
        for (int i=0; i<grid.length; i++) {
            for (int j=0; j<grid[i].length; j++) {
                grid_result[i][j] = grid[i][j];
            }
        }

        Solver ss = new Solver(grid_result, 1, 9);
        
        // Solved
        if (ss.solveSudoku()) {
            for (int i=0; i<grid.length; i++) {
                for (int j=0; j<grid[i].length; j++) {

                    JTextField cell = getCellComponent(i, j);

                    if (grid[i][j] == 0) {
                        animateOutput(true, cell, grid_result[i][j]);
                    }

                }
            }
        } else {
            JOptionPane.showMessageDialog(this,
                "Given hint values are not enough to solve this Sudoku\n" +
                String.join("\n", invalidCells),
                "Incomplete hints",
                JOptionPane.WARNING_MESSAGE);
        }
        btn_reset.setEnabled(true);
    }


    // Output animation
    private void animateOutput(boolean animation, JTextField cell, int value) {
        if (!animation) {
            cell.setText(String.valueOf(value));
            cell.setForeground(Color.BLUE);
            return;
        }

        int[] count = {1};
        Timer timer = new Timer(1000, e -> {
            if (count[0] < value) {
                cell.setText(String.valueOf(count[0]++));
            } else {
                cell.setText(String.valueOf(value));
                cell.setForeground(Color.BLUE);
                ((Timer)e.getSource()).stop();

                // new Timer(1000, ev -> {}).start();
            }
        });
        timer.start();
    }
    

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {                                         
        System.exit(0);
    }                                        

    // Helper method to get cell components by row/col
    private JTextField getCellComponent(int row, int col) {
        try {
            return (JTextField) this.getClass().getDeclaredField("cell_" + (row+1) + "_" + (col+1)).get(this);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public int[][] getGrid() {
        return grid;
    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SudokuSolver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SudokuSolver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SudokuSolver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SudokuSolver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SudokuSolver().setVisible(true);
            }
        });
    }
    
    private int[][] grid = new int[9][9];

    // Variables declaration                   
    private javax.swing.JPanel SudokuPanel;
    private javax.swing.JButton btn_exit;
    private javax.swing.JButton btn_reset;
    private javax.swing.JButton btn_solve;
    private javax.swing.JTextField cell_1_1;
    private javax.swing.JTextField cell_1_2;
    private javax.swing.JTextField cell_1_3;
    private javax.swing.JTextField cell_1_4;
    private javax.swing.JTextField cell_1_5;
    private javax.swing.JTextField cell_1_6;
    private javax.swing.JTextField cell_1_7;
    private javax.swing.JTextField cell_1_8;
    private javax.swing.JTextField cell_1_9;
    private javax.swing.JTextField cell_2_1;
    private javax.swing.JTextField cell_2_2;
    private javax.swing.JTextField cell_2_3;
    private javax.swing.JTextField cell_2_4;
    private javax.swing.JTextField cell_2_5;
    private javax.swing.JTextField cell_2_6;
    private javax.swing.JTextField cell_2_7;
    private javax.swing.JTextField cell_2_8;
    private javax.swing.JTextField cell_2_9;
    private javax.swing.JTextField cell_3_1;
    private javax.swing.JTextField cell_3_2;
    private javax.swing.JTextField cell_3_3;
    private javax.swing.JTextField cell_3_4;
    private javax.swing.JTextField cell_3_5;
    private javax.swing.JTextField cell_3_6;
    private javax.swing.JTextField cell_3_7;
    private javax.swing.JTextField cell_3_8;
    private javax.swing.JTextField cell_3_9;
    private javax.swing.JTextField cell_4_1;
    private javax.swing.JTextField cell_4_2;
    private javax.swing.JTextField cell_4_3;
    private javax.swing.JTextField cell_4_4;
    private javax.swing.JTextField cell_4_5;
    private javax.swing.JTextField cell_4_6;
    private javax.swing.JTextField cell_4_7;
    private javax.swing.JTextField cell_4_8;
    private javax.swing.JTextField cell_4_9;
    private javax.swing.JTextField cell_5_1;
    private javax.swing.JTextField cell_5_2;
    private javax.swing.JTextField cell_5_3;
    private javax.swing.JTextField cell_5_4;
    private javax.swing.JTextField cell_5_5;
    private javax.swing.JTextField cell_5_6;
    private javax.swing.JTextField cell_5_7;
    private javax.swing.JTextField cell_5_8;
    private javax.swing.JTextField cell_5_9;
    private javax.swing.JTextField cell_6_1;
    private javax.swing.JTextField cell_6_2;
    private javax.swing.JTextField cell_6_3;
    private javax.swing.JTextField cell_6_4;
    private javax.swing.JTextField cell_6_5;
    private javax.swing.JTextField cell_6_6;
    private javax.swing.JTextField cell_6_7;
    private javax.swing.JTextField cell_6_8;
    private javax.swing.JTextField cell_6_9;
    private javax.swing.JTextField cell_7_1;
    private javax.swing.JTextField cell_7_2;
    private javax.swing.JTextField cell_7_3;
    private javax.swing.JTextField cell_7_4;
    private javax.swing.JTextField cell_7_5;
    private javax.swing.JTextField cell_7_6;
    private javax.swing.JTextField cell_7_7;
    private javax.swing.JTextField cell_7_8;
    private javax.swing.JTextField cell_7_9;
    private javax.swing.JTextField cell_8_1;
    private javax.swing.JTextField cell_8_2;
    private javax.swing.JTextField cell_8_3;
    private javax.swing.JTextField cell_8_4;
    private javax.swing.JTextField cell_8_5;
    private javax.swing.JTextField cell_8_6;
    private javax.swing.JTextField cell_8_7;
    private javax.swing.JTextField cell_8_8;
    private javax.swing.JTextField cell_8_9;
    private javax.swing.JTextField cell_9_1;
    private javax.swing.JTextField cell_9_2;
    private javax.swing.JTextField cell_9_3;
    private javax.swing.JTextField cell_9_4;
    private javax.swing.JTextField cell_9_5;
    private javax.swing.JTextField cell_9_6;
    private javax.swing.JTextField cell_9_7;
    private javax.swing.JTextField cell_9_8;
    private javax.swing.JTextField cell_9_9;
    private javax.swing.JLabel jLabel1;
}
