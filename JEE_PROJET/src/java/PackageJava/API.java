package PackageJava;

/**
 * Classe API
 * Classe qui permet d'utiliser les fonctions de l'application
 * @author Paul, Aurélien, Jonathan, Delphine, Claire
 */
public class API {
    
    private String statut;
    private int vainqueur;
    private int dernActionValide;
    private String action;

    /**
     * Constructeur vide de la classe API
     */
    public API() {}

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public void setVainqueur(int vainqueur) {
        this.vainqueur = vainqueur;
    }

    public int getDernActionValide() {
        return dernActionValide;
    }

    public void setDernActionValide(int dernActionValide) {
        this.dernActionValide = dernActionValide;
    }
    
    /**
     * Function Initialisation
     * Permet d'initialiser les valeurs statuts, vainqueur et la dernière action
     */
    public void initialisation(){
        statut = "joueur1";
        vainqueur = 0;
        dernActionValide = 0;
    }
    
    /**
     * Function action
     * Permet de dire si une action est valide ou pas : renvoie true si elle l'est ou false sinon
     * @param numJoueur : numéro du joueur qui fait l'action
     * @param coup : coup efectué par le joueur
     * @return valide
     */
    public boolean action(int numJoueur, int coup){
        boolean valide = false;
        return valide;
    }
    
    /**
     * Function statut
     * Permet de renvoyer le joueur qui est en train de jouer ou si la partie est terminée
     * @return statut : "joueur1", "joueur2" ou "finie"
     */
    public String statut(){
        return statut;
    }
    
    /**
     * Function vainqueur
     * Permet de retourner le numéro du joueur qui à gagné ou 0 si il y a match nul
     * @return vainqueur : 0 si match nul, 1 si le vainqueur et le joueur 1 et 2 si le joueur 2
     */
    public int vainqueur(){
        return vainqueur;
    }
    
    /**
     * Function derniereAction
     * Permet de renvoyer la dernière action qui a été effectué par le joueur
     * @return dernActionValide : numéro du coup
     */
    public int derniereAction(){
        return dernActionValide;
    }
    
    /**
     * Function affichage
     * Permet d'afficher ce qui c'est passé pendant l'action du joueur
     * @return action : action effectué par le joueur (coup effectué)
     */
    public String affichage(){
        return action;
    }
    
}
