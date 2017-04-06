/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PackageJava;

/**
 * Puissance 4
 * @author Aurelien
 */
public class JeuPuissance4 extends API{
    
    private int[][] plateau;
    
    public JeuPuissance4(){
        initialisation();
    }

    @Override
    public void initialisation() {
        this.setStatut("joueur1");
        this.setDernActionValide(0);
        plateau = new int[6][7];
    }

    @Override
    public boolean action(int numJoueur, int colonne) {
        if(colonne <= 6 && colonne >= 0){
            for (int i = 5; i >=0; i--) {
                if(plateau[i][colonne] == 0){
                    plateau[i][colonne] = numJoueur;
                    if(grillePleine())
                        setStatut("finie");
                    else if(numJoueur == 1)
                        setStatut("joueur2");
                    else
                        setStatut("joueur1");
                    this.setDernActionValide(colonne);
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public int vainqueur() {
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 6; j++) {
                if(plateau[i][j] != 0){
                    if(i<=2 && j>3){
                        if(diagGaucheBas(i, j, plateau[i][j], 1)){
                            this.setStatut("finie");
                            return plateau[i][j];
                        }
                        if(bas(i, j, plateau[i][j], 1)){
                            this.setStatut("finie");
                            return plateau[i][j];
                        }
                    }
                    else if(i<=2 && j<=3){
                        if(droite(i, j, plateau[i][j],1)){
                            this.setStatut("finie");
                            return plateau[i][j];
                        }
                        if(diagDroitBas(i, j, plateau[i][j], 1)){
                            this.setStatut("finie");
                            return plateau[i][j];
                        }
                        if(bas(i, j, plateau[i][j], 1)){
                            this.setStatut("finie");
                            return plateau[i][j];
                        }
                    }
                    else if(i>2 && j<=3){
                        if(droite(i, j, plateau[i][j], 1)){
                            this.setStatut("finie");
                            return plateau[i][j];
                        }
                    }
                }
            }
        }
        return 0;
    }
    
    private boolean diagDroitBas(int ligne, int col, int joueur, int numbAlligne){
        if(numbAlligne == 4)
            return true;
        else if(ligne==5 || col==6)
            return false;
        else if(plateau[ligne+1][col+1] == joueur)
            return diagDroitBas(ligne+1,col+1,joueur,numbAlligne+1);
        else
            return false;
    }
    
    private boolean diagGaucheBas(int ligne, int col, int joueur, int numbAlligne){
        if(numbAlligne == 4)
            return true;
        else if(ligne==5 || col==0)
            return false;
        else if(plateau[ligne+1][col-1] == joueur)
            return diagGaucheBas(ligne+1,col-1,joueur,numbAlligne+1);
        else
            return false;
    }
    
    private boolean bas(int ligne, int col, int joueur, int numbAlligne){
        if(numbAlligne == 4)
            return true;
        else if(ligne==5)
            return false;
        else if(plateau[ligne+1][col] == joueur)
            return bas(ligne+1,col,joueur,numbAlligne+1);
        else
            return false;
    }
    
    private boolean droite(int ligne, int col, int joueur, int numbAlligne){
        if(numbAlligne == 4)
            return true;
        else if(col==6)
            return false;
        else if(plateau[ligne][col+1] == joueur)
            return droite(ligne,col+1,joueur,numbAlligne+1);
        else
            return false;
    }
    
    private boolean grillePleine(){
        for (int i = 0; i <= 6; i++) {
            if(plateau[0][i] == 0)
                return false;
        }
        return true;
    }

    @Override
    public int derniereAction() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void afficheTableu(){
        for (int[] is : plateau) {
            for (int i : is) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    @Override
    public String affichage() {
        for (int i = 0; i < 6; i++) {
            if(plateau[i][this.getDernActionValide()] != 0)
                return "Le jeton a été place dans la colonne :"+this.getDernActionValide()+" et a la ligne :"+(i+1);
        } 
        return "";
    }
    
    public String affichage(int joueur) {
        for (int i = 0; i < 6; i++) {
            if(plateau[i][this.getDernActionValide()] != 0)
                return "Joueur : "+joueur+" Le jeton a été place dans la colonne :"+(this.getDernActionValide()+1)+" et a la ligne :"+(i+1);
        } 
        return "";
    }
    
    public static void main (String[] args){
        JeuPuissance4 j = new JeuPuissance4();
        int joueur = 0;
        int nombreAleatoire;
        int vainq = 0;
        while(!j.statut().equals("finie")){
            
            nombreAleatoire = 0 + (int)(Math.random() * 7);
            if(nombreAleatoire == 7)
                nombreAleatoire = 6;
            if(j.statut().equals("joueur1"))
                joueur = 1;
            else
                joueur = 2;
            while(!j.action(joueur, nombreAleatoire)){
                nombreAleatoire = 0 + (int)(Math.random() * 7);
                if(nombreAleatoire == 7)
                    nombreAleatoire = 6;
            }
            System.out.println(j.affichage(joueur));
            vainq = j.vainqueur();
        }
        if(vainq != 0)
            System.out.println("Le joueur "+vainq+" a gagné !");
        else
            System.out.println("Egalité !!");
        j.afficheTableu();
    }
}