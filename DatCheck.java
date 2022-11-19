
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.LinkedList;
import org.junit.Test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hirus
 */
public class DatCheck {
    
    @Test
    public void fileCheck() throws FileNotFoundException{
         FileInputStream fileIn = new FileInputStream("C:\\Users\\hirus\\OneDrive\\Documents\\NetBeansProjects\\EventDriven\\src\\main\\java\\gps.dat");
           
    // Read the data file
//        try {   
//            FileInputStream fileIn = new FileInputStream("");
//            ObjectInputStream in = new ObjectInputStream(fileIn);
//            in.close();
//            fileIn.close();
//        } catch (IOException i) {
//            i.printStackTrace();
//            return;
//        } 
    }
}
