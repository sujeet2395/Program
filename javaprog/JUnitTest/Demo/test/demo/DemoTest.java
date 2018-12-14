/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sharma
 */
public class DemoTest {
    
    public DemoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of add method, of class Demo.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        int i = 2;
        int j = 1;
        Demo instance = new Demo();
        int expResult = 3;
        int result = instance.add(i, j);
        assertEquals(expResult, result);
    }
    @Test
    public void testAdd1() {
        System.out.println("add");
        int i = 3;
        int j = 1;
        Demo instance = new Demo();
        int expResult = 4;
        int result = instance.add(i, j);
        assertEquals(expResult, result);
    }
}
