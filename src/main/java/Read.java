
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
public class Read {

    public static void main(String[] args) {
        File file = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        Player x = null;
        Player o = null;
        try {
            file = new File("Result.bin");
            fis = new FileInputStream(file);
            ois = new ObjectInputStream(fis);
            x=(Player) ois.readObject();
            o=(Player) ois.readObject();
            ois.close();
            fis.close();
            System.out.println(x);
            System.out.println(o);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Read.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Read.class.getName()).log(Level.SEVERE, null, ex);
        }catch(ClassNotFoundException ex){
            Logger.getLogger(Read.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
