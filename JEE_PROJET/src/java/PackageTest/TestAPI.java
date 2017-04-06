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
        Jeu.Initialisation();
        assertEquals("joueur1",Jeu.statut());
         assertEquals(0,Jeu.derniereAction());
    }
    
    @Test
    public void testTableau(){
        for (int i = 0; i < Jeu.getTab().length(); i++) {
            assertEquals(Jeu.getTab()[i][0],api.action(Jeu.getTab()[i][1],Jeu.getTab()[i][2]));
        }
    }
    
    @Test
    public void testDerniereAction(){
        if(api.action(x,y)){
            assertEquals(action.getY(),api.derniereAction());
        }
    }
    
}