package PackageJava;

/**
 *
 * @author Paul
 */
public class API {
    
    private String statut;
    private int vainqueur;
    private int dernActionValide;
    private String action;
    
    public API(){
        
    }
    
    public void Initialisation(){
        statut = "joueur1";
        vainqueur = 0;
        dernActionValide = 0;
    }
    
    public boolean action(int numJoueur, int coup){
        boolean valide = false;
        return valide;
    }
    
    public String statut(){
        return statut;
    }
    
    public int vainqueur(){
        return vainqueur;
    }
    
    public int derniereAction(){
        return dernActionValide;
    }
    
    public String affichage(){
        return action;
    }
    
}
