
package ejemplosplashscreen;

import javax.swing.JFrame;


public class VentanaPrincipal extends JFrame {

    public VentanaPrincipal() {
        
        setTitle("Ventana Principal");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }

}
