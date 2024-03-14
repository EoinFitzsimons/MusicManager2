/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package musicmanager;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author eoin0
 */
public class MusicManagerGUI extends javax.swing.JFrame {

    /**
     * Creates new form MusicManagerGUI
     */
    public MusicManagerGUI() {
        initComponents();
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
        backgroundPanel = new javax.swing.JPanel();
        playlistPanel = new javax.swing.JPanel();
        likedLBL = new javax.swing.JLabel();
        genresongsLBL = new javax.swing.JLabel();
        repeatLBL = new javax.swing.JLabel();
        likedPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        likedTA = new javax.swing.JTextArea();
        genrePanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        playlistTA = new javax.swing.JTextArea();
        selectorPanel = new javax.swing.JPanel();
        genreselectLBL = new javax.swing.JLabel();
        goodRB = new javax.swing.JRadioButton();
        badRB = new javax.swing.JRadioButton();
        createBTN = new javax.swing.JButton();
        titleLBL = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        playBTN = new javax.swing.JButton();
        nextBTN = new javax.swing.JButton();
        prevBTN = new javax.swing.JButton();
        menusMB = new javax.swing.JMenuBar();
        controlsM = new javax.swing.JMenu();
        repeatMI = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(50, 25, 100));
        setLocation(new java.awt.Point(0, 0));
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setResizable(false);

        backgroundPanel.setBackground(new java.awt.Color(25, 17, 50));
        backgroundPanel.setPreferredSize(new java.awt.Dimension(800, 580));

        playlistPanel.setBackground(new java.awt.Color(50, 25, 100));
        playlistPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
        playlistPanel.setPreferredSize(new java.awt.Dimension(500, 500));

        likedLBL.setForeground(new java.awt.Color(255, 255, 255));
        likedLBL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        likedLBL.setText("Liked Songs");

        genresongsLBL.setForeground(new java.awt.Color(255, 255, 255));
        genresongsLBL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        genresongsLBL.setText("Songs in Genre");

        repeatLBL.setForeground(new java.awt.Color(255, 255, 255));
        repeatLBL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        repeatLBL.setText("Repeat - Yes");

        likedPanel.setBackground(new java.awt.Color(80, 45, 150));
        likedPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        likedPanel.setPreferredSize(new java.awt.Dimension(150, 400));

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setToolTipText("");
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        likedTA.setEditable(false);
        likedTA.setBackground(new java.awt.Color(255, 255, 255));
        likedTA.setColumns(20);
        likedTA.setFont(new java.awt.Font("Lucida Sans", 0, 24)); // NOI18N
        likedTA.setForeground(new java.awt.Color(50, 25, 100));
        likedTA.setLineWrap(true);
        likedTA.setRows(5);
        likedTA.setFocusable(false);
        likedTA.setPreferredSize(new java.awt.Dimension(140, 300));
        jScrollPane2.setViewportView(likedTA);

        javax.swing.GroupLayout likedPanelLayout = new javax.swing.GroupLayout(likedPanel);
        likedPanel.setLayout(likedPanelLayout);
        likedPanelLayout.setHorizontalGroup(
            likedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(likedPanelLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );
        likedPanelLayout.setVerticalGroup(
            likedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(likedPanelLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        genrePanel.setBackground(new java.awt.Color(80, 45, 150));
        genrePanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        genrePanel.setPreferredSize(new java.awt.Dimension(150, 400));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setToolTipText("");
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        playlistTA.setEditable(false);
        playlistTA.setBackground(new java.awt.Color(255, 255, 255));
        playlistTA.setColumns(20);
        playlistTA.setFont(new java.awt.Font("Lucida Sans", 0, 24)); // NOI18N
        playlistTA.setForeground(new java.awt.Color(50, 25, 100));
        playlistTA.setLineWrap(true);
        playlistTA.setRows(5);
        playlistTA.setFocusable(false);
        playlistTA.setPreferredSize(new java.awt.Dimension(140, 300));
        jScrollPane1.setViewportView(playlistTA);

        javax.swing.GroupLayout genrePanelLayout = new javax.swing.GroupLayout(genrePanel);
        genrePanel.setLayout(genrePanelLayout);
        genrePanelLayout.setHorizontalGroup(
            genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(genrePanelLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );
        genrePanelLayout.setVerticalGroup(
            genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, genrePanelLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        selectorPanel.setBackground(new java.awt.Color(80, 45, 150));
        selectorPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));

        genreselectLBL.setForeground(new java.awt.Color(255, 255, 255));
        genreselectLBL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        genreselectLBL.setLabelFor(genrePanel);
        genreselectLBL.setText("Type");
        genreselectLBL.setAlignmentY(0.0F);

        goodRB.setBackground(new java.awt.Color(80, 45, 150));
        buttonGroup1.add(goodRB);
        goodRB.setForeground(new java.awt.Color(255, 255, 255));
        goodRB.setText("Good");

        badRB.setBackground(new java.awt.Color(80, 45, 150));
        buttonGroup1.add(badRB);
        badRB.setForeground(new java.awt.Color(255, 255, 255));
        badRB.setText("Bad");
        badRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                badRBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout selectorPanelLayout = new javax.swing.GroupLayout(selectorPanel);
        selectorPanel.setLayout(selectorPanelLayout);
        selectorPanelLayout.setHorizontalGroup(
            selectorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selectorPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(selectorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(badRB)
                    .addComponent(goodRB))
                .addGap(15, 15, 15))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, selectorPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(genreselectLBL)
                .addGap(27, 27, 27))
        );
        selectorPanelLayout.setVerticalGroup(
            selectorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selectorPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(genreselectLBL)
                .addGap(12, 12, 12)
                .addComponent(goodRB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(badRB)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        createBTN.setText("Create");
        createBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout playlistPanelLayout = new javax.swing.GroupLayout(playlistPanel);
        playlistPanel.setLayout(playlistPanelLayout);
        playlistPanelLayout.setHorizontalGroup(
            playlistPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, playlistPanelLayout.createSequentialGroup()
                .addGroup(playlistPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(playlistPanelLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(likedPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(selectorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addComponent(genrePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(playlistPanelLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(likedLBL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(genresongsLBL)
                        .addGap(28, 28, 28))
                    .addGroup(playlistPanelLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(createBTN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(repeatLBL)))
                .addGap(20, 20, 20))
        );
        playlistPanelLayout.setVerticalGroup(
            playlistPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playlistPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(playlistPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genresongsLBL)
                    .addComponent(likedLBL))
                .addGroup(playlistPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(playlistPanelLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(selectorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(playlistPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(playlistPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(likedPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                            .addComponent(genrePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE))))
                .addGroup(playlistPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(playlistPanelLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(repeatLBL))
                    .addGroup(playlistPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(createBTN)))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        titleLBL.setFont(new java.awt.Font("Magneto", 0, 36)); // NOI18N
        titleLBL.setForeground(new java.awt.Color(153, 153, 255));
        titleLBL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLBL.setText("Music Manager");

        jProgressBar1.setBackground(new java.awt.Color(50, 25, 100));
        jProgressBar1.setForeground(new java.awt.Color(153, 153, 255));
        jProgressBar1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        playBTN.setForeground(new java.awt.Color(50, 25, 100));
        playBTN.setText("Play");

        nextBTN.setForeground(new java.awt.Color(50, 25, 100));
        nextBTN.setText("Next");

        prevBTN.setForeground(new java.awt.Color(50, 25, 100));
        prevBTN.setText("Prev");

        javax.swing.GroupLayout backgroundPanelLayout = new javax.swing.GroupLayout(backgroundPanel);
        backgroundPanel.setLayout(backgroundPanelLayout);
        backgroundPanelLayout.setHorizontalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(playlistPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addGap(236, 236, 236)
                .addComponent(titleLBL)
                .addContainerGap(253, Short.MAX_VALUE))
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addGap(266, 266, 266)
                .addComponent(prevBTN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(playBTN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nextBTN)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        backgroundPanelLayout.setVerticalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundPanelLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(titleLBL)
                .addGap(5, 5, 5)
                .addComponent(playlistPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playBTN)
                    .addComponent(nextBTN)
                    .addComponent(prevBTN))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        controlsM.setText("Controls");

        repeatMI.setText("Repeat");
        repeatMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                repeatMIActionPerformed(evt);
            }
        });
        controlsM.add(repeatMI);

        menusMB.add(controlsM);

        setJMenuBar(menusMB);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 577, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public class MyStack implements StackInterface {

    private ArrayList<String> aStack;

    public MyStack() {
        aStack = new ArrayList<>();
    }

    @Override
    public void push(Object newItem) {
        aStack.add(0, (String) newItem);
    }

    @Override
    public boolean isEmpty() {
        return aStack.isEmpty();
    }

    @Override
    public Object pop() {
        if (aStack.isEmpty()) {
//      if(isEmpty()){
            return null;
        } else {
            return aStack.remove(0);
        }
    }

    @Override
    public Object peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        } else {
            return aStack.get(0);
        }
    }

    @Override
    public int size() {
        return aStack.size();
    }

    @Override
    public String display() {
//      display stack from top zero index to the bottom
        String str = "";
        if (isEmpty()) {
            str = str.concat("Empty stack, nothing to display");
        } else {
//            for(int i = 0; i < aStack.size(); i++){
//                str = str.concat(aStack.get(i));
//                str = str.concat(" ; ");
//            }
            Iterator it;
            it = aStack.iterator();
            while (it.hasNext()) {
                str = str.concat((String)it.next());
                str = str.concat("\n");
            }
        }
//      return the str
        return str;
    }
}
    private void repeatMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_repeatMIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_repeatMIActionPerformed

    private void badRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_badRBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_badRBActionPerformed

    private void createBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBTNActionPerformed
        // TODO add your handling code here:
        StackInterface si = new MyStack();
        si.push(JOptionPane.showInputDialog("Please enter a song"));
        si.push(JOptionPane.showInputDialog("Please enter a song"));
        likedTA.setText(si.display());
    }//GEN-LAST:event_createBTNActionPerformed

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
            java.util.logging.Logger.getLogger(MusicManagerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MusicManagerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MusicManagerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MusicManagerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MusicManagerGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JRadioButton badRB;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JMenu controlsM;
    private javax.swing.JButton createBTN;
    private javax.swing.JPanel genrePanel;
    private javax.swing.JLabel genreselectLBL;
    private javax.swing.JLabel genresongsLBL;
    private javax.swing.JRadioButton goodRB;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel likedLBL;
    private javax.swing.JPanel likedPanel;
    private javax.swing.JTextArea likedTA;
    private javax.swing.JMenuBar menusMB;
    private javax.swing.JButton nextBTN;
    private javax.swing.JButton playBTN;
    private javax.swing.JPanel playlistPanel;
    private javax.swing.JTextArea playlistTA;
    private javax.swing.JButton prevBTN;
    private javax.swing.JLabel repeatLBL;
    private javax.swing.JMenuItem repeatMI;
    private javax.swing.JPanel selectorPanel;
    private javax.swing.JLabel titleLBL;
    // End of variables declaration//GEN-END:variables
}
