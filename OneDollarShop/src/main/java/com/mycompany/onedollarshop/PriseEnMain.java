package com.mycompany.onedollarshop;

import com.mycompany.Event.Source;
import com.mycompany.Event.GEvent;
import java.io.IOException;

/**
 *
 * @author Maya
 */
public class PriseEnMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, InterruptedException {
        
    Source<String> source = new Source<>();
    source.addGEventListener(new MenuListener());
   

    Thread t = new Thread(new MenuPrincipal(source));
    t.start();
    t.join();
    }
    
}
