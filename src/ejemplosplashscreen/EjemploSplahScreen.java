package ejemplosplashscreen;

/**
 * Ejemplo de Splash Screen o pantalla mostrada mientras se carga el programa.
 *
 * @author Carlos Perez
 */
public class EjemploSplahScreen {

    /**
     * Metodo principal.
     * 
     * @param args argumentos de la linea de comandos
     */
    public static void main(String[] args) {

        VentanaSplashScreen splashScreen = new VentanaSplashScreen();

        Thread hiloSplash = new Thread(splashScreen);

        hiloSplash.start();

        new VentanaPrincipal().setVisible(true);

        splashScreen.setVisible(false);
        splashScreen.dispose();

    }
}
