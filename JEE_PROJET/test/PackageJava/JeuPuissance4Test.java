/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PackageJava;

import org.junit.After;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Jonathan
 */
public class JeuPuissance4Test {
    private JeuPuissance4 api;
    private Action a1;
    public JeuPuissance4Test() {
    }
    
    @Before
    public void setUp() {
        api = new JeuPuissance4();
        
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of initialisation method, of class JeuPuissance4.
     */
    @Test
    public void testInitialisation() {
        assertEquals("joueur1",api.statut());
        assertEquals(0,api.derniereAction());
    }
    
    @Test
    public void testMauvaisJoueur(){
        a1 = new Action(true,3,12); //t[1] à 3
        assertEquals(a1.getB(),api.action(a1.getJoueur(),a1.getCoup()));
    }

    /**
     * Test of action method, of class JeuPuissance4.
     */
    @Test
    public void testAction() {
    }

    /**
     * Test of vainqueur method, of class JeuPuissance4.
     */
    @Test
    public void testVainqueur() {
    }

    /**
     * Test of derniereAction method, of class JeuPuissance4.
     */
    @Test
    public void testDerniereAction() {
    }    
}
