
package ejemplosplashscreen;

import javax.swing.JFrame;

/**
 * Ventana principal del programa.
 * 
 * @author Carlos Perez
 */
public class VentanaPrincipal extends JFrame {

    /**
     * Constructor en donde se inicializan componentes de la pantalla principal
     * y se hace una pasa de n segundos para simular lo que tardaria cargar
     * los modulos de un programa.
     */
    public VentanaPrincipal() {
        
        setTitle("Ventana Principal");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        //reemplazar este codigo por la carga de modulos del programa
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }

}
