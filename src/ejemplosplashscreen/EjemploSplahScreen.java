package ejemplosplashscreen;

public class EjemploSplahScreen {

    public static void main(String[] args) {
        
        VentanaSplashScreen splashScreen = new VentanaSplashScreen();

        Thread hiloSplash = new Thread(splashScreen);

        hiloSplash.start();

        new VentanaPrincipal().setVisible(true);

        splashScreen.setVisible(false);
        splashScreen.dispose();
        
    }
}
