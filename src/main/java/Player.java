/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
/**
 *
 * @author ming
 */
public class Player implements Serializable{
    private String name;
    private int win;
    private int lose;
    private int draw;
    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
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

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", win=" + win + ", lose=" + lose + ", draw=" + draw + '}';
    }

}
