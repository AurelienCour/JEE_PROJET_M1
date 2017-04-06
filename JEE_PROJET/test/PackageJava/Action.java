/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PackageJava;

/**
 *
 * @author Jonathan
 */
public class Action {
    private int joueur, coup;
    private Boolean b;
    
    public Action (Boolean b, int j, int c){
        this.b = b;
        joueur = j;
        coup = c;
    }

    public int getJoueur() {
        return joueur;
    }

    public int getCoup() {
        return coup;
    }

    public Boolean getB() {
        return b;
    }
    
}
