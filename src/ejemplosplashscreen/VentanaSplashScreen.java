package ejemplosplashscreen;

import javax.swing.JFrame;

public class VentanaSplashScreen extends JFrame implements Runnable {

    public VentanaSplashScreen() {
        
        setTitle("Abriendo...");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setUndecorated(true);
        
    }

    @Override
    public void run() {
        
        setVisible(true);
        
    }

}
