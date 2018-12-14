/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Demo2.Demo2;
import Demo2.Demo3;
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
public class Demo3JUnitTest {
    
    public Demo3JUnitTest() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void addTest(){
    System.out.println("add");
        String i = "3";
        String j = "3";
        Demo3 instance = new Demo3();
        int expResult = 6;
        int result = instance.add(i, j);
        assertEquals(expResult, result);
    }
    
    @Test
    public void subTest(){
    System.out.println("sub");
        String i = "3";
        String j = "3";
        Demo2 instance = new Demo2();
        int expResult = 0;
        int result = instance.sub(i, j);
        assertEquals(expResult, result);
    }
    
}
