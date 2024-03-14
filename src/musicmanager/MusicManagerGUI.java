/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package musicmanager;

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
        likedSP = new javax.swing.JScrollPane();
        likedTA = new javax.swing.JTextArea();
        genrePanel = new javax.swing.JPanel();
        playlistSP = new javax.swing.JScrollPane();
        playlistTA = new javax.swing.JTextArea();
        selectorPanel = new javax.swing.JPanel();
        genreselectLBL = new javax.swing.JLabel();
        goodRB = new javax.swing.JRadioButton();
        badRB = new javax.swing.JRadioButton();
        createBTN = new javax.swing.JButton();
        addBTN = new javax.swing.JButton();
        SearchBTN = new javax.swing.JButton();
        deleteBTN = new javax.swing.JButton();
        viewBTN = new javax.swing.JButton();
        sizeLBL = new javax.swing.JLabel();
        titleLBL = new javax.swing.JLabel();
        songPB = new javax.swing.JProgressBar();
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

        likedLBL.setFont(new java.awt.Font("Magneto", 0, 18)); // NOI18N
        likedLBL.setForeground(new java.awt.Color(255, 255, 255));
        likedLBL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        likedLBL.setText("Liked Songs");

        genresongsLBL.setFont(new java.awt.Font("Magneto", 0, 18)); // NOI18N
        genresongsLBL.setForeground(new java.awt.Color(255, 255, 255));
        genresongsLBL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        genresongsLBL.setText("Playlist Songs");
        genresongsLBL.setMaximumSize(new java.awt.Dimension(145, 23));

        repeatLBL.setForeground(new java.awt.Color(255, 255, 255));
        repeatLBL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        repeatLBL.setToolTipText("");

        likedPanel.setBackground(new java.awt.Color(80, 45, 150));
        likedPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        likedPanel.setPreferredSize(new java.awt.Dimension(150, 400));

        likedSP.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        likedSP.setToolTipText("");
        likedSP.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        likedTA.setEditable(false);
        likedTA.setBackground(new java.awt.Color(255, 255, 255));
        likedTA.setColumns(20);
        likedTA.setFont(new java.awt.Font("Lucida Sans", 0, 24)); // NOI18N
        likedTA.setForeground(new java.awt.Color(50, 25, 100));
        likedTA.setLineWrap(true);
        likedTA.setRows(5);
        likedTA.setFocusable(false);
        likedTA.setPreferredSize(new java.awt.Dimension(140, 300));
        likedSP.setViewportView(likedTA);

        javax.swing.GroupLayout likedPanelLayout = new javax.swing.GroupLayout(likedPanel);
        likedPanel.setLayout(likedPanelLayout);
        likedPanelLayout.setHorizontalGroup(
            likedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(likedPanelLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(likedSP, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );
        likedPanelLayout.setVerticalGroup(
            likedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(likedPanelLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(likedSP, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        genrePanel.setBackground(new java.awt.Color(80, 45, 150));
        genrePanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        genrePanel.setPreferredSize(new java.awt.Dimension(150, 400));

        playlistSP.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        playlistSP.setToolTipText("");
        playlistSP.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        playlistTA.setEditable(false);
        playlistTA.setBackground(new java.awt.Color(255, 255, 255));
        playlistTA.setColumns(20);
        playlistTA.setFont(new java.awt.Font("Lucida Sans", 0, 24)); // NOI18N
        playlistTA.setForeground(new java.awt.Color(50, 25, 100));
        playlistTA.setLineWrap(true);
        playlistTA.setRows(5);
        playlistTA.setFocusable(false);
        playlistTA.setPreferredSize(new java.awt.Dimension(140, 300));
        playlistSP.setViewportView(playlistTA);

        javax.swing.GroupLayout genrePanelLayout = new javax.swing.GroupLayout(genrePanel);
        genrePanel.setLayout(genrePanelLayout);
        genrePanelLayout.setHorizontalGroup(
            genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(genrePanelLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(playlistSP, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );
        genrePanelLayout.setVerticalGroup(
            genrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, genrePanelLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(playlistSP, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        goodRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goodRBActionPerformed(evt);
            }
        });

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
                .addGroup(selectorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(selectorPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(selectorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(badRB)
                            .addComponent(goodRB)))
                    .addGroup(selectorPanelLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(genreselectLBL)))
                .addContainerGap())
        );
        selectorPanelLayout.setVerticalGroup(
            selectorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selectorPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(genreselectLBL)
                .addGap(12, 12, 12)
                .addComponent(goodRB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(badRB)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        createBTN.setText("Create");
        createBTN.setMaximumSize(new java.awt.Dimension(80, 25));
        createBTN.setMinimumSize(new java.awt.Dimension(80, 25));
        createBTN.setPreferredSize(new java.awt.Dimension(80, 25));
        createBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBTNActionPerformed(evt);
            }
        });

        addBTN.setText("Add");
        addBTN.setMaximumSize(new java.awt.Dimension(80, 25));
        addBTN.setMinimumSize(new java.awt.Dimension(80, 25));
        addBTN.setPreferredSize(new java.awt.Dimension(80, 25));
        addBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBTNActionPerformed(evt);
            }
        });

        SearchBTN.setText("Search");
        SearchBTN.setMaximumSize(new java.awt.Dimension(80, 25));
        SearchBTN.setMinimumSize(new java.awt.Dimension(80, 25));
        SearchBTN.setPreferredSize(new java.awt.Dimension(80, 25));
        SearchBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBTNActionPerformed(evt);
            }
        });

        deleteBTN.setText("Delete");
        deleteBTN.setMaximumSize(new java.awt.Dimension(80, 25));
        deleteBTN.setMinimumSize(new java.awt.Dimension(80, 25));
        deleteBTN.setPreferredSize(new java.awt.Dimension(80, 25));
        deleteBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBTNActionPerformed(evt);
            }
        });

        viewBTN.setText("View");
        viewBTN.setMaximumSize(new java.awt.Dimension(80, 25));
        viewBTN.setMinimumSize(new java.awt.Dimension(80, 25));
        viewBTN.setPreferredSize(new java.awt.Dimension(80, 25));
        viewBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBTNActionPerformed(evt);
            }
        });

        sizeLBL.setFont(new java.awt.Font("Magneto", 0, 12)); // NOI18N
        sizeLBL.setForeground(new java.awt.Color(255, 255, 255));
        sizeLBL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout playlistPanelLayout = new javax.swing.GroupLayout(playlistPanel);
        playlistPanel.setLayout(playlistPanelLayout);
        playlistPanelLayout.setHorizontalGroup(
            playlistPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.CENTER, playlistPanelLayout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(sizeLBL)
                .addGap(244, 244, 244))
            .addGroup(playlistPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(playlistPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(likedPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(likedLBL)
                    .addComponent(viewBTN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(playlistPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(addBTN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchBTN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteBTN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(createBTN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(playlistPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(genrePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genresongsLBL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(repeatLBL))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        playlistPanelLayout.setVerticalGroup(
            playlistPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playlistPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(playlistPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sizeLBL, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, playlistPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(likedLBL)
                        .addComponent(genresongsLBL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(playlistPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(playlistPanelLayout.createSequentialGroup()
                        .addComponent(createBTN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(selectorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(addBTN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SearchBTN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteBTN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(likedPanel, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
                    .addComponent(genrePanel, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(playlistPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(repeatLBL)
                    .addComponent(viewBTN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        titleLBL.setFont(new java.awt.Font("Magneto", 0, 36)); // NOI18N
        titleLBL.setForeground(new java.awt.Color(153, 153, 255));
        titleLBL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLBL.setText("Music Manager");

        songPB.setBackground(new java.awt.Color(50, 25, 100));
        songPB.setForeground(new java.awt.Color(153, 153, 255));
        songPB.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        playBTN.setForeground(new java.awt.Color(50, 25, 100));
        playBTN.setText("Play");
        playBTN.setMaximumSize(new java.awt.Dimension(80, 25));
        playBTN.setMinimumSize(new java.awt.Dimension(80, 25));
        playBTN.setPreferredSize(new java.awt.Dimension(80, 25));

        nextBTN.setForeground(new java.awt.Color(50, 25, 100));
        nextBTN.setText("Next");
        nextBTN.setMaximumSize(new java.awt.Dimension(80, 25));
        nextBTN.setMinimumSize(new java.awt.Dimension(80, 25));
        nextBTN.setPreferredSize(new java.awt.Dimension(80, 25));

        prevBTN.setForeground(new java.awt.Color(50, 25, 100));
        prevBTN.setText("Prev");
        prevBTN.setMaximumSize(new java.awt.Dimension(80, 25));
        prevBTN.setMinimumSize(new java.awt.Dimension(80, 25));
        prevBTN.setPreferredSize(new java.awt.Dimension(80, 25));

        javax.swing.GroupLayout backgroundPanelLayout = new javax.swing.GroupLayout(backgroundPanel);
        backgroundPanel.setLayout(backgroundPanelLayout);
        backgroundPanelLayout.setHorizontalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(songPB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(backgroundPanelLayout.createSequentialGroup()
                                .addGap(236, 236, 236)
                                .addComponent(titleLBL))
                            .addGroup(backgroundPanelLayout.createSequentialGroup()
                                .addGap(267, 267, 267)
                                .addComponent(prevBTN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(playBTN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nextBTN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(backgroundPanelLayout.createSequentialGroup()
                                .addGap(153, 153, 153)
                                .addComponent(playlistPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 147, Short.MAX_VALUE)))
                .addContainerGap())
        );
        backgroundPanelLayout.setVerticalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundPanelLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(titleLBL)
                .addGap(5, 5, 5)
                .addComponent(playlistPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(songPB, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playBTN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nextBTN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prevBTN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
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
    StackInterface likedSongs = new MyStack();
    DLList goodPlaylist = new DLList();
    DLList badPlaylist = new DLList();
    static boolean repeat = false; // declare repeat status
    private void repeatMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_repeatMIActionPerformed
        // TODO add your handling code here:

        repeat = !repeat; // Toggle the status
        repeatLBL.setText(repeat ? "Repeat" : ""); //shows repeat if it's on
        if (repeat && (!goodPlaylist.isEmpty() || !badPlaylist.isEmpty())) {
            if (goodRB.isSelected()) {
                // Start looping through the list
                new Thread(() -> goodPlaylist.loopList()).start();
            } else if (badRB.isSelected()) {
                // Start looping through the list
                new Thread(() -> badPlaylist.loopList()).start();
            }
        }
    }//GEN-LAST:event_repeatMIActionPerformed

    private void viewBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBTNActionPerformed
        // TODO add your handling code here:
        likedTA.setText(likedSongs.display());
        likedLBL.setText("Liked "+likedSongs.size());
        if (goodRB.isSelected()) {
                // Count good songs
                genresongsLBL.setText("Playlist "+goodPlaylist.size());
            } else if (badRB.isSelected()) {
                // Count bad songs
                genresongsLBL.setText("Playlist "+badPlaylist.size());
            }
        
    }//GEN-LAST:event_viewBTNActionPerformed

    private void deleteBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBTNActionPerformed
        // TODO add your handling code here:
        String song = JOptionPane.showInputDialog("Enter a song to delete:");
        if (goodPlaylist.contains(song)) {
            goodPlaylist.remove(song);
            JOptionPane.showMessageDialog(null, "The song has been removed from the Good Playlist.");
            playlistTA.setText(goodPlaylist.printList());
            genresongsLBL.setText("Playlist "+goodPlaylist.size());
        } else if (badPlaylist.contains(song)) {
            badPlaylist.remove(song);
            JOptionPane.showMessageDialog(null, "The song has been removed from the Bad Playlist.");
            playlistTA.setText(badPlaylist.printList());
            genresongsLBL.setText("Playlist "+badPlaylist.size());
        } else {
            JOptionPane.showMessageDialog(null, "The song is not in any playlist.");
        }
    }//GEN-LAST:event_deleteBTNActionPerformed

    private void SearchBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBTNActionPerformed
        // TODO add your handling code here:
        String song = JOptionPane.showInputDialog("Enter a song to search:");
        if (goodPlaylist.contains(song)) {
            JOptionPane.showMessageDialog(null, "The song is in the Good Playlist.");
            playlistTA.setText(goodPlaylist.printList());
            genresongsLBL.setText("Playlist "+goodPlaylist.size());
        } else if (badPlaylist.contains(song)) {
            JOptionPane.showMessageDialog(null, "The song is in the Bad Playlist.");
            playlistTA.setText(badPlaylist.printList());
            genresongsLBL.setText("Playlist "+badPlaylist.size());
        } else {
            JOptionPane.showMessageDialog(null, "The song is not in any playlist.");
        }
    }//GEN-LAST:event_SearchBTNActionPerformed

    private void addBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBTNActionPerformed
        // TODO add your handling code here:
        if (!likedSongs.isEmpty() && (goodRB.isSelected() || badRB.isSelected())) { // if there are any liked songs
            String song = (String) likedSongs.pop();
            if (goodRB.isSelected()) {
                goodPlaylist.add(song);
                playlistTA.setText(goodPlaylist.printList());
                genresongsLBL.setText("Playlist "+goodPlaylist.size());
                likedLBL.setText("Liked "+likedSongs.size());
            } else if (badRB.isSelected()) {
                badPlaylist.add(song);
                playlistTA.setText(badPlaylist.printList());
                genresongsLBL.setText("Playlist "+badPlaylist.size());
                likedLBL.setText("Liked "+likedSongs.size());
            }
            likedTA.setText(likedSongs.display());
        }
    }//GEN-LAST:event_addBTNActionPerformed

    private void createBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBTNActionPerformed
        // TODO add your handling code here:
        likedSongs.push(JOptionPane.showInputDialog("Please enter a song"));
        likedTA.setText(likedSongs.display());
    }//GEN-LAST:event_createBTNActionPerformed

    private void badRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_badRBActionPerformed
        // TODO add your handling code here:
        playlistTA.setText(badPlaylist.printList());
        genresongsLBL.setText("Playlist "+badPlaylist.size());
        if (repeat) {
            // Stop looping the badPlaylist
            repeat = false;
            // Start looping the goodPlaylist
            new Thread(() -> {
                repeat = true;
                goodPlaylist.loopList();
            }).start();
        }
    }//GEN-LAST:event_badRBActionPerformed

    private void goodRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goodRBActionPerformed
        // TODO add your handling code here:
        playlistTA.setText(goodPlaylist.printList());
        genresongsLBL.setText("Playlist "+goodPlaylist.size());
        if (repeat) {
            // Stop looping the goodPlaylist
            repeat = false;
            // Start looping the badPlaylist
            new Thread(() -> {
                repeat = true;
                badPlaylist.loopList();
            }).start();
        }
    }//GEN-LAST:event_goodRBActionPerformed

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
    private javax.swing.JButton SearchBTN;
    private javax.swing.JButton addBTN;
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JRadioButton badRB;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JMenu controlsM;
    private javax.swing.JButton createBTN;
    private javax.swing.JButton deleteBTN;
    private javax.swing.JPanel genrePanel;
    private javax.swing.JLabel genreselectLBL;
    private javax.swing.JLabel genresongsLBL;
    private javax.swing.JRadioButton goodRB;
    private javax.swing.JLabel likedLBL;
    private javax.swing.JPanel likedPanel;
    private javax.swing.JScrollPane likedSP;
    private javax.swing.JTextArea likedTA;
    private javax.swing.JMenuBar menusMB;
    private javax.swing.JButton nextBTN;
    private javax.swing.JButton playBTN;
    private javax.swing.JPanel playlistPanel;
    private javax.swing.JScrollPane playlistSP;
    private javax.swing.JTextArea playlistTA;
    private javax.swing.JButton prevBTN;
    private javax.swing.JLabel repeatLBL;
    private javax.swing.JMenuItem repeatMI;
    private javax.swing.JPanel selectorPanel;
    private javax.swing.JLabel sizeLBL;
    private javax.swing.JProgressBar songPB;
    private javax.swing.JLabel titleLBL;
    private javax.swing.JButton viewBTN;
    // End of variables declaration//GEN-END:variables
}
