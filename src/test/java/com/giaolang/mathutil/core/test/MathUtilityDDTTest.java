/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.giaolang.mathutil.core.test;

import com.giaolang.mathutil.core.MathUtility;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author ADMIN
 */
public class MathUtilityDDTTest {
    // chuan bi data, sau nay dua vao framework
    // data nay se tu tu duoc trich vao trong ham assrt()
    // no nam trong ham co style la static - nam co dinh o 1 vung ram
    //Test case
    // 0! -> 1; 1!-> 1; 2!->2; 3!-> 6, 4-> 24, 5!->120
    // ta thay cac bo data
    // {0,1}, {1,1},{2,2},{3,6}, {4,24},{5,20}, {6,720}
    // [7][2] mang 7 2 
    // ta de rieng data nay ra 1 mang 2 chieu
    public static Object [][] initData(){
        return new Object[][] {{0, 1}, {1, 1}, {2, 2}, {3, 6}, {4, 24}, {5, 120}, {6, 720}};
    }
   // TEST case so sanh ham co tra ve giong ki vong khong
    @ParameterizedTest
    @MethodSource("initData")
    public void testFactorialGivenRightArgumentReturnWell(int n, long expected){
        assertEquals(expected, MathUtility.getFactorial(n));
    }
}
