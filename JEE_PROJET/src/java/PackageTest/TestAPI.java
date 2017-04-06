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
    
    private API api;
    
    @Before
    public void setUp()
    {
        api = new API();
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
        api.Initialisation();
        assertEquals("joueur1",api.statut());
    }
    
    @Test
    public void testTableau(){
        for (Object object : api.getTab()) {
            assertEquals(object.getAction(),api.action(object.getJoueur(),object.getCoup()));
        }
    }
    
    @Test
    public void testDerniereAction(){
        if(api.action(x,y)){
            assertEquals(action.getY(),api.derniereAction());
        }
    }
    
}