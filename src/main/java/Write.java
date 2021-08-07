
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ming
 */
public class Write {

    public static void main(String[] args) throws IOException {
        File file = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        Player x = new Player("X");
        Player o = new Player("O");
        x.addWin();
        o.addLose();
        try {
            file = new File("Result.bin");
            fos = new FileOutputStream(file);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(x);
            oos.writeObject(o);
            fos.close();
            oos.close();
            System.out.println(x);
            System.out.println(o);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Write.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fos.close();
                oos.close();
            } catch (IOException ex) {
                Logger.getLogger(Write.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
