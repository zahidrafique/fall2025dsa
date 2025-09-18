/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.csun.fall2025dsa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;

/**
 *
 * @author zrafique
 */
public class TestArrayTest {
    private static int[] data;
    
    @Test
    @BeforeAll
    @DisplayName("Set up data")
    static void setup() {
        data = new int[5];
        
        data[0] = 4;
        data[1] = 14;
        data[2] = 12;
        data[3] = 34;
        data[4] = 5;
        
    }
    
    @Test
    @DisplayName("Test Found - Linear Search")
    void testFound() {       
        Assertions.assertEquals(2, TestArray.linearSearch(data, 12));
        Assertions.assertEquals(0, TestArray.linearSearch(data, 4));
    }
    
    @Test
    @DisplayName("Test Not Found - Linear Search")
    void testNotFound() {       
        Assertions.assertEquals(-1, TestArray.linearSearch(data, 120));
    }
    
    
}
