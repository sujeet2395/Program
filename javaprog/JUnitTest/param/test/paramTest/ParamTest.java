/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paramTest;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import param.Param;

/**
 *
 * @author sharma
 */
@RunWith(JUnitParamsRunner.class)
public class ParamTest {

     @Test
     @FileParameters("test\\paramTest\\test.csv")
     public void addTest(int f, int s, int ex){
          Param pr=new Param();
          //assertTrue(pr.add(f,s)==ex);
          assertEquals(ex,pr.add(f, s));
     }
}
