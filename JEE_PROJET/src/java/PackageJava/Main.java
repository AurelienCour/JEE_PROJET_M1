package PackageJava;

/**
 * Classe Main
 * Excecute l'application
 * @author Paul, Aurélien, Jonathan, Delphine, Claire
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        API application = new API();
        application.initialisation();
        while (!application.statut().equals("finie")){      // manque le passage de statut à "finie" pour empêcher la boucle infinie
            if (application.action(1, application.derniereAction())){
                application.affichage();
                application.setStatut("joueur2");
            }
            if (application.action(2, application.derniereAction())){
                application.affichage();
                application.setStatut("joueur1");
            }
        }
        application.vainqueur();
    }
}
