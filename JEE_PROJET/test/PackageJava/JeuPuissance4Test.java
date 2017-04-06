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
    private Action a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12,a13,a14,a15,a16,a17,a18,a19,a20,a21,a22,a23,a24,a25,a26,a27,a28,a29,a30,a31,a32,a33,a34,a35,a36,a37,a38,a39,a40,a41,a42;
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
        a1 = new Action(true,3,4); //t[1] à 3
        assertEquals(a1.getB(),api.action(a1.getJoueur(),a1.getCoup()));
    }

    @Test
    public void testChangmentJoueur(){
        a1 = new Action(true,1,1);
        api.action(a1.getJoueur(),a1.getCoup());
        assertEquals("joueur2", api.statut());
        a2 = new Action(true,2,1);
        api.action(a2.getJoueur(),a2.getCoup());
        assertEquals("joueur1", api.statut());
    }

    /**
     * Test of vainqueur method, of class JeuPuissance4.
     */
    @Test
    public void testVainqueur() {
        a1 = new Action(true,1,1);
        a2 = new Action(true,1,1);
        a3 = new Action(true,1,1);
        a4 = new Action(true,1,1);
        Action tab[] = {a1,a2,a3,a4};
        for (int i = 0; i < tab.length; i++) {
            api.action(tab[i].getJoueur(), tab[i].getCoup());
        }
        assertEquals(1,api.vainqueur());
        assertEquals("finie",api.statut());
    }

    /**
     * Test of derniereAction method, of class JeuPuissance4.
     */
    @Test
    public void testDerniereAction() {
        a1 = new Action(true,1,1);
        api.action(a1.getJoueur(),a1.getCoup());
        assertEquals(api.getDernActionValide(), a1.getCoup());
    }   
    
    @Test
    public void testMauvaisCoup() {
        a1 = new Action(true,1,1);
        a2 = new Action(true,1,12);
        api.action(a1.getJoueur(),a1.getCoup());
        api.action(a2.getJoueur(),a2.getCoup());
        assertEquals(api.getDernActionValide(), a1.getCoup());    
    }
    
    @Test
    public void testNul(){
        a1 = new Action(true,1,0);
        a2 = new Action(true,2,1);
        a3 = new Action(true,1,2);
        a4 = new Action(true,2,3);
        a5 = new Action(true,1,4);
        a6 = new Action(true,2,5);
        a7 = new Action(true,1,6);
        a8 = new Action(true,1,0);
        a9 = new Action(true,2,1);
        a10 = new Action(true,1,2);
        a11 = new Action(true,2,3);
        a12 = new Action(true,1,4);
        a13 = new Action(true,2,5);
        a14 = new Action(true,1,6);
        a15 = new Action(true,1,0);
        a16 = new Action(true,2,1);
        a17 = new Action(true,1,2);
        a18 = new Action(true,2,3);
        a19 = new Action(true,1,4);
        a20 = new Action(true,2,5);
        a21 = new Action(true,1,6);
        a22 = new Action(true,2,0);
        a23 = new Action(true,1,1);
        a24 = new Action(true,2,2);
        a25 = new Action(true,1,3);
        a26 = new Action(true,2,4);
        a27 = new Action(true,1,5);
        a28 = new Action(true,2,6);
        a29 = new Action(true,2,0);
        a30 = new Action(true,1,1);
        a31 = new Action(true,2,2);
        a32 = new Action(true,1,3);
        a33 = new Action(true,2,4);
        a34 = new Action(true,1,5);
        a35 = new Action(true,2,6);
        a36 = new Action(true,2,0);
        a37 = new Action(true,1,1);
        a38 = new Action(true,2,2);
        a39 = new Action(true,1,3);
        a40 = new Action(true,2,4);
        a41 = new Action(true,1,5);
        a42 = new Action(true,2,6);
        Action tab[] = {a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12,a13,a14,a15,a16,a17,a18,a19,a20,a21,a22,a23,a24,a25,a26,a27,a28,a29,a30,a31,a32,a33,a34,a35,a36,a37,a38,a39,a40,a41,a42};
        for (int i = 0; i < tab.length; i++) {
            api.action(tab[i].getJoueur(), tab[i].getCoup());
        }
        assertEquals("finie",api.statut());
        assertEquals(0,api.vainqueur());
    }
}
