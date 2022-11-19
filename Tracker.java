/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
        
import javax.swing.*;
import java.awt.*;
import java.util.Calendar;
import swidgets.*;
import nz.sodium.*;
/**
 *
 * @author hirus
 */
public class Tracker {

            
    public static void main(String[] args) {
        JFrame view = new JFrame("GPS Tracker");
        view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GridBagLayout gridbag = new GridBagLayout();
        view.setLayout(gridbag);
        GridBagConstraints c = new GridBagConstraints();

        view.add(new JLabel("Tracker GPS"), c);
        
        view.setSize(380, 140);
        view.setVisible(true);
        
        
             // Initialise the GPS Service
        GpsService serv = new GpsService();
        // Retrieve Event Streams
        Stream<GpsEvent>[] streams = serv.getEventStreams();

        // Attach a handler method to each stream
        for(Stream<GpsEvent> s : streams){
            
            GpsEvent es = null;
            s.listen(new Handler<GpsEvent>() {
                @Override
                public void run(GpsEvent ev) {
                    
                    view.add(new JLabel(ev.toString()));
                }
            });
            
        }
    }
}

