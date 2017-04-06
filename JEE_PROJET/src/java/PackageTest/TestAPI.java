/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PackageTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Aurelien
 */
public class TestAPI {
    
    private Jeu api;
    
    @Before
    public void setUp()
    {
        api = new Jeu();
        api.Initialisation();
    }
    
    /**
     * S'execute apres les test (pas utile ici)
     */
    @After
    public void tearDown()
    {
    }
    
    @Test
    public void testInitialisation(){
        assertEquals("joueur1",api.statut());
        assertEquals(0,api.derniereAction());
    }
    
    @Test
    public void testMauvaisJoueur(){
        t   ; //t[1] à 3
        assertEquals(t[0],api.action(t[1],t[2]));
    }
    
    @Test
    public void testChangementJoueur(){
        t ; //pas de problème
        api.action(t[1],t[2]);
        assertEquals(t[2],api.dernierAction());
        assertEquals("joueur 2", api.statut());    
    }
    
    @Test
    public void testMauvaisCoup(){
        t ; //t[2] mauvais
        assertEquals(t[0], api.action(t[1],t[2]));
    }
    
    @Test
    public void testFini() {
        String s = "";
        t ; //Faire un gros tableau
        for(int j=0; j<t.length(); j++){
            api.action(t[1],t[2]);  
        }
        assertEquals("finie", api.statut(););
    }
    
}