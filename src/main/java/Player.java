/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ming
 */
public class Player {
    private char name;
    private int win;
    private int lose;
    private int draw;
    public Player(char name) {
        this.name = name;
    }

    public char getName() {
        return name;
    }

    public void setName(char name) {
        this.name = name;
    }

    public int getWin() {
        return win;
    }
    
    public void addWin() {
        win++;
    }
    
    public void addLose() {
        lose++;
    }
    
    public void addDraw() {
        draw++;
    }
    
    
    public int getLose() {
        return lose;
    }


    public int getDraw() {
        return draw;
    }

}
