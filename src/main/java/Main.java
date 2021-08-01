/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ming
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        buttonTable1 = new javax.swing.JButton();
        buttonTable3 = new javax.swing.JButton();
        buttonTable2 = new javax.swing.JButton();
        buttonTable6 = new javax.swing.JButton();
        buttonTable5 = new javax.swing.JButton();
        buttonTable4 = new javax.swing.JButton();
        buttonTable9 = new javax.swing.JButton();
        buttonTable8 = new javax.swing.JButton();
        buttonTable7 = new javax.swing.JButton();
        textRow = new javax.swing.JLabel();
        displayRow = new javax.swing.JLabel();
        textCol = new javax.swing.JLabel();
        displayCol = new javax.swing.JLabel();
        displayCurrentPlayer = new javax.swing.JLabel();
        displayScoreboard = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        scoreboardPlayerX = new javax.swing.JLabel();
        scoreboardPlayerO = new javax.swing.JLabel();
        displayWinner = new javax.swing.JLabel();
        displayRound = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        displayErrorMessage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic Tac Toe");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tic Tac Toe");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Table");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Scoreboard");

        buttonTable1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonTable1.setText("-");
        buttonTable1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTable1ActionPerformed(evt);
            }
        });

        buttonTable3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonTable3.setText("-");
        buttonTable3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTable3ActionPerformed(evt);
            }
        });

        buttonTable2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonTable2.setText("-");
        buttonTable2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTable2ActionPerformed(evt);
            }
        });

        buttonTable6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonTable6.setText("-");
        buttonTable6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTable6ActionPerformed(evt);
            }
        });

        buttonTable5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonTable5.setText("-");
        buttonTable5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTable5ActionPerformed(evt);
            }
        });

        buttonTable4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonTable4.setText("-");
        buttonTable4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTable4ActionPerformed(evt);
            }
        });

        buttonTable9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonTable9.setText("-");
        buttonTable9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTable9ActionPerformed(evt);
            }
        });

        buttonTable8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonTable8.setText("-");
        buttonTable8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTable8ActionPerformed(evt);
            }
        });

        buttonTable7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonTable7.setText("-");
        buttonTable7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTable7ActionPerformed(evt);
            }
        });

        textRow.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        textRow.setText("Row :");

        displayRow.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        displayRow.setText("-");

        textCol.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        textCol.setText("Col :");

        displayCol.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        displayCol.setText("-");

        displayCurrentPlayer.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        displayCurrentPlayer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        displayCurrentPlayer.setText("Current Player : Player X");

        displayScoreboard.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        displayScoreboard.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        displayScoreboard.setText("Player    Win    Lose    Draw");
        displayScoreboard.setToolTipText("");
        displayScoreboard.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("X");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Y");

        scoreboardPlayerX.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        scoreboardPlayerX.setText("    0          0          0");

        scoreboardPlayerO.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        scoreboardPlayerO.setText("    0          0          0");

        displayWinner.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        displayWinner.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        displayWinner.setText("Winner : None");

        displayRound.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        displayRound.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        displayRound.setText("Round : 1");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Error  message :");

        displayErrorMessage.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        displayErrorMessage.setText("None");
        displayErrorMessage.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(textRow)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(displayRow, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textCol)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(displayCol, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                        .addGap(625, 625, 625)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(displayWinner, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(displayScoreboard, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(buttonTable3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(buttonTable4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(buttonTable5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(buttonTable6, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(buttonTable7, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(buttonTable8, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(buttonTable9, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(scoreboardPlayerO, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(scoreboardPlayerX, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(57, 57, 57))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttonTable1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buttonTable2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(displayRound, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(105, 105, 105)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(displayErrorMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(displayCurrentPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addGap(94, 94, 94))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(displayCurrentPlayer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(displayScoreboard)
                    .addComponent(displayWinner)
                    .addComponent(displayRound))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonTable1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonTable3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonTable2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(scoreboardPlayerX))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(scoreboardPlayerO)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonTable4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonTable6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonTable5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonTable7, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonTable9, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonTable8, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textCol)
                        .addComponent(displayCol))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textRow)
                        .addComponent(displayRow))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(displayErrorMessage)))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    int row, col;
    Table table = new Table();
    private void buttonTable1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTable1ActionPerformed
        row = 0;
        col = 0;
        if(!table.getWinner().equals("None")){
            return;
        }
        displayErrorMessage.setText("None");
        if(addIntoTable(row, col)){
            setDisplay(row, col);
            buttonTable1.setText(getCurrentPlayer(true).getName());
            if(table.checkWinner()){
                displayWinner.setText("Winner : Player "+table.getWinner());
                updateScore();
                updateScoreboard();
            }
        }else{
            displayErrorMessage.setText("Sorry this position is already exist. Please try again!!");
        }
    }//GEN-LAST:event_buttonTable1ActionPerformed

    private void buttonTable2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTable2ActionPerformed
        row = 0;
        col = 1;
        displayErrorMessage.setText("None");
        if(!table.getWinner().equals("None")){
            return;
        }
        if(addIntoTable(row, col)){
            setDisplay(row, col);
            buttonTable2.setText(getCurrentPlayer(true).getName());
            if(table.checkWinner()){
                displayWinner.setText("Winner : Player "+table.getWinner());
                updateScore();
                updateScoreboard();
            }
        }else{
            displayErrorMessage.setText("Sorry this position is already exist. Please try again!!");
        }

    }//GEN-LAST:event_buttonTable2ActionPerformed

    private void buttonTable3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTable3ActionPerformed
        row = 0;
        col = 2;
        displayErrorMessage.setText("None");
        if(!table.getWinner().equals("None")){
            return;
        }
        if(addIntoTable(row, col)){
            setDisplay(row, col);
            buttonTable3.setText(getCurrentPlayer(true).getName());
            if(table.checkWinner()){
                displayWinner.setText("Winner : Player "+table.getWinner());
                updateScore();
                updateScoreboard();
            }
        }else{
            displayErrorMessage.setText("Sorry this position is already exist. Please try again!!");
        }
    }//GEN-LAST:event_buttonTable3ActionPerformed

    private void buttonTable4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTable4ActionPerformed
        row = 1;
        col = 0;
        displayErrorMessage.setText("None");
        if(!table.getWinner().equals("None")){
            return;
        }
        if(addIntoTable(row, col)){
            setDisplay(row, col);
            buttonTable4.setText(getCurrentPlayer(true).getName());
            if(table.checkWinner()){
                displayWinner.setText("Winner : Player "+table.getWinner());
                updateScore();
                updateScoreboard();
            }
        }else{
            displayErrorMessage.setText("Sorry this position is already exist. Please try again!!");
        }
    }//GEN-LAST:event_buttonTable4ActionPerformed

    private void buttonTable5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTable5ActionPerformed
        row = 1;
        col = 1;
        displayErrorMessage.setText("None");
        if(!table.getWinner().equals("None")){
            return;
        }
        if(addIntoTable(row, col)){
            setDisplay(row, col);
            buttonTable5.setText(getCurrentPlayer(true).getName());
            if(table.checkWinner()){
                displayWinner.setText("Winner : Player "+table.getWinner());
                updateScore();
                updateScoreboard();
            }
        }else{
            displayErrorMessage.setText("Sorry this position is already exist. Please try again!!");
        }
    }//GEN-LAST:event_buttonTable5ActionPerformed

    private void buttonTable6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTable6ActionPerformed
        row = 1;
        col = 2;
        displayErrorMessage.setText("None");
        if(!table.getWinner().equals("None")){
            return;
        }
        if(addIntoTable(row, col)){
            setDisplay(row, col);
            buttonTable6.setText(getCurrentPlayer(true).getName());
            if(table.checkWinner()){
                displayWinner.setText("Winner : Player "+table.getWinner());
                updateScore();
                updateScoreboard();
            }
        }else{
            displayErrorMessage.setText("Sorry this position is already exist. Please try again!!");
        }
    }//GEN-LAST:event_buttonTable6ActionPerformed

    private void buttonTable7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTable7ActionPerformed
        row = 2;
        col = 0;
        displayErrorMessage.setText("None");
        if(!table.getWinner().equals("None")){
            return;
        }
        if(addIntoTable(row, col)){
            setDisplay(row, col);
            buttonTable7.setText(getCurrentPlayer(true).getName());
            if(table.checkWinner()){
                displayWinner.setText("Winner : Player "+table.getWinner());
                updateScore();
                updateScoreboard();
            }
        }else{
            displayErrorMessage.setText("Sorry this position is already exist. Please try again!!");
        }
    }//GEN-LAST:event_buttonTable7ActionPerformed

    private void buttonTable8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTable8ActionPerformed
        row = 2;
        col = 1;
        displayErrorMessage.setText("None");
        if(!table.getWinner().equals("None")){
            return;
        }
        if(addIntoTable(row, col)){
            setDisplay(row, col);
            buttonTable8.setText(getCurrentPlayer(true).getName());
            if(table.checkWinner()){
                displayWinner.setText("Winner : Player "+table.getWinner());
                updateScore();
                updateScoreboard();
            }
        }else{
            displayErrorMessage.setText("Sorry this position is already exist. Please try again!!");
        }
    }//GEN-LAST:event_buttonTable8ActionPerformed

    private void buttonTable9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTable9ActionPerformed
        row = 2;
        col = 2;
        displayErrorMessage.setText("None");
        if(!table.getWinner().equals("None")){
            return;
        }
        if(addIntoTable(row, col)){
            setDisplay(row, col);
            buttonTable9.setText(getCurrentPlayer(true).getName());
            if(table.checkWinner()){
                displayWinner.setText("Winner : Player "+table.getWinner());
                updateScore();
                updateScoreboard();
            }
        }else{
            displayErrorMessage.setText("Sorry this position is already exist. Please try again!!");
        }
    }//GEN-LAST:event_buttonTable9ActionPerformed

    /**
     * @param args the command line arguments
     */
    Player playerX = new Player("X");
    Player playerO = new Player("O");
    int round = 0;
    public void updateScore(){
        if (table.getWinner().equals("X")) {
            playerX.addWin();
            playerO.addLose();
        } else if (table.getWinner().equals("O")) {
            playerO.addWin();
            playerX.addLose();
        } else if (table.round == 9) {
            playerX.addDraw();
            playerO.addDraw();
        }
    }public void updateScoreboard(){
        scoreboardPlayerX.setText("    "+playerX.getWin()+"          "
                +playerX.getLose()+"          "+playerX.getDraw());
        scoreboardPlayerO.setText("    "+playerO.getWin()+"          "
                +playerO.getLose()+"          "+playerO.getDraw());
    }public void updateRound(){
        displayRound.setText("Round : "+(round+1));
    }
    public Boolean addIntoTable(int row, int col) {
        int position[] = {row, col};
        if (round % 2 == 0) {
            if(table.addIntoTable(playerX.getName(), position)){
                round++;
                displayCurrentPlayer.setText("Current Player : Player " 
                        + getCurrentPlayer(false).getName());
                updateScoreboard();
                updateRound();
                return true;
            }
        } else {
           if(table.addIntoTable(playerO.getName(), position)){
               round++;
               displayCurrentPlayer.setText("Current Player : Player " 
                       + getCurrentPlayer(false).getName());
               updateRound();
               return true;
           }
        }
        return false;
    }

    public void setDisplay(int row, int col) {
        displayRow.setText(Integer.toString(row));
        displayCol.setText(Integer.toString(col));
    }

    public Player getCurrentPlayer(Boolean type) {
        if (!type) {
            if (round % 2 == 0) {
                return playerX;
            }
            return playerO;
        } else {
            if (round % 2 == 0) {
                return playerO;
            }
            return playerX;
        }

    }

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonTable1;
    private javax.swing.JButton buttonTable2;
    private javax.swing.JButton buttonTable3;
    private javax.swing.JButton buttonTable4;
    private javax.swing.JButton buttonTable5;
    private javax.swing.JButton buttonTable6;
    private javax.swing.JButton buttonTable7;
    private javax.swing.JButton buttonTable8;
    private javax.swing.JButton buttonTable9;
    private javax.swing.JLabel displayCol;
    private javax.swing.JLabel displayCurrentPlayer;
    private javax.swing.JLabel displayErrorMessage;
    private javax.swing.JLabel displayRound;
    private javax.swing.JLabel displayRow;
    private javax.swing.JLabel displayScoreboard;
    private javax.swing.JLabel displayWinner;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel scoreboardPlayerO;
    private javax.swing.JLabel scoreboardPlayerX;
    private javax.swing.JLabel textCol;
    private javax.swing.JLabel textRow;
    // End of variables declaration//GEN-END:variables
}
