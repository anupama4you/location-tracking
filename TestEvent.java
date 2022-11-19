
import nz.sodium.Stream;
import org.junit.Test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hirus
 */
public class TestEvent {
    
    
    @Test
    public void testName(){
        // Initialise the GPS Service
        GpsService serv = new GpsService();
        // Retrieve Event Streams
        Stream<GpsEvent>[] streams = serv.getEventStreams();
        for(Stream<GpsEvent> s : streams){
            s.listen((GpsEvent ev) -> System.out.println(ev));           
        } 
    }
}
