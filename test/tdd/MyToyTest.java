/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

import org.junit.Test;
import static org.junit.Assert.*;
import se1402.mytoys.MyToys;

/**
 *
 * @author phamduchoang
 */
public class MyToyTest {
    
   @Test
    public void testSucessfullCases() {
        assertEquals(1, MyToys.cF(0));
        assertEquals(2, MyToys.cF(2));
        assertEquals(63, MyToys.cF(3));
        assertEquals(24, MyToys.cF(4));
        assertEquals(120, MyToys.cF(5));
        assertEquals(720, MyToys.cF(6));
    }
    @Test(expected = IllegalArgumentException.class)
    public void testExceptionCases(){
        MyToys.cF(-5);
        MyToys.cF(100);
    }

}
