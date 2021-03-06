/*
 * Copyright 2019 Centre for Computational Geography, University of Leeds.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package uk.ac.leeds.ccg.math;

import java.math.BigInteger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Andy Turner
 * @version 1.0.0
 */
public class Math_LongTest {

    public Math_LongTest() {
    }

    @BeforeAll
    public static void setUpClass() throws Exception {
    }

    @AfterAll
    public static void tearDownClass() throws Exception {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testIsLong() {
       String funcName = "isLong";
        System.out.println("Test " + funcName);
       long x;
        String s;
        boolean result;
        // Test 1
        x = Long.MIN_VALUE;
        s = Long.toString(x);
        result = Math_Long.isLong(s);
        assertFalse(result);
        // Test 2
        x += 1;
        s = Long.toString(x);
        result = Math_Long.isLong(s);
        assertTrue(result);
        // Test 3
        BigInteger bi = Math_BigInteger.LONG_MAX_VALUE.add(BigInteger.ONE);
        s = bi.toString();
        result = Math_Long.isLong(s);
        assertFalse(result);
    }
    
    @Test
    public void testIsEven() {
        String funcName = "isEven";
        System.out.println("Test " + funcName);
        long x;
        boolean expResult;
        boolean result;
        // Test 1
        x = 1L;
        expResult = false;
        result = Math_Long.isEven(x);
        assertEquals(expResult, result);
        // Test 2
        x = 2L;
        expResult = true;
        result = Math_Long.isEven(x);
        assertEquals(expResult, result);
        // Test 3
        x = 3L;
        expResult = false;
        result = Math_Long.isEven(x);
        assertEquals(expResult, result);
        // Test 4
        x = 4L;
        expResult = true;
        result = Math_Long.isEven(x);
        assertEquals(expResult, result);
        // Test 5
        x = 5L;
        expResult = false;
        result = Math_Long.isEven(x);
        assertEquals(expResult, result);
        // Test 6
        x = 6L;
        expResult = true;
        result = Math_Long.isEven(x);
        assertEquals(expResult, result);
        // Test 7
        x = 7L;
        expResult = false;
        result = Math_Long.isEven(x);
        assertEquals(expResult, result);
        // Test 8
         x = 8L;
        expResult = true;
        result = Math_Long.isEven(x);
        assertEquals(expResult, result);
        // Test 9
        x = 9L;
        expResult = false;
        result = Math_Long.isEven(x);
        assertEquals(expResult, result);
        // Test 10
        x = 0L;
        expResult = true;
        result = Math_Long.isEven(x);
        assertEquals(expResult, result);
        // Test 11
        x = -1L;
        expResult = false;
        result = Math_Long.isEven(x);
        assertEquals(expResult, result);
        // Test 12
        x = -2L;
        expResult = true;
        result = Math_Long.isEven(x);
        assertEquals(expResult, result);
        // Test 13
        x = -3L;
        expResult = false;
        result = Math_Long.isEven(x);
        assertEquals(expResult, result);
        // Test 14
        x = -4L;
        expResult = true;
        result = Math_Long.isEven(x);
        assertEquals(expResult, result);
        // Test 15
        x = -5L;
        expResult = false;
        result = Math_Long.isEven(x);
        assertEquals(expResult, result);
        // Test 16
        x = -6L;
        expResult = true;
        result = Math_Long.isEven(x);
        assertEquals(expResult, result);
        // Test 17
        x = -7L;
        expResult = false;
        result = Math_Long.isEven(x);
        assertEquals(expResult, result);
        // Test 18
        x = -8L;
        expResult = true;
        result = Math_Long.isEven(x);
        assertEquals(expResult, result);
        // Test 19
        x = -9L;
        expResult = false;
        result = Math_Long.isEven(x);
        assertEquals(expResult, result);
        // Test 20
        x = 123456789L;
        expResult = false;
        result = Math_Long.isEven(x);
        assertEquals(expResult, result);
        // Test 21
        x = 12345678L;
        expResult = true;
        result = Math_Long.isEven(x);
        assertEquals(expResult, result);
        // Test 22
        x = -123456789L;
        expResult = false;
        result = Math_Long.isEven(x);
        assertEquals(expResult, result);
        // Test 23
        x = -12345678L;
        expResult = true;
        result = Math_Long.isEven(x);
        assertEquals(expResult, result);
    }
}
