package ejemplosplashscreen;

import javax.swing.JFrame;

/**
 * Ventana Splash mostrada mientras carga el programa.
 * 
 * @author Carlos Perez
 */
public class VentanaSplashScreen extends JFrame implements Runnable {

    /**
     * Constructor en donde se inicializan componentes de la pantalla splash.
     */
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
