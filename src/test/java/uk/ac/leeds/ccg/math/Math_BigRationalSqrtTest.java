/*
 * Copyright 2020 Centre for Computational Geography, University of Leeds.
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

import ch.obermuhlner.math.big.BigRational;
import java.math.BigInteger;
import org.hamcrest.Matchers;
import static org.hamcrest.MatcherAssert.assertThat;
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
public class Math_BigRationalSqrtTest {

    public Math_BigRationalSqrtTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getSqrtRational method, of class Math_BigRationalSqrt.
     */
    @Test
    public void testGetSqrtRational() {
        System.out.println("getSqrtRational");
        BigRational x = BigRational.valueOf(2);
        BigRational expResult = null;
        BigRational result = Math_BigRationalSqrt.getSqrtRational(x);
        assertNull(result);
        // Test 2
        x = BigRational.valueOf(4);
        expResult = BigRational.valueOf(2);
        result = Math_BigRationalSqrt.getSqrtRational(x);
        assertTrue(expResult.compareTo(result) == 0);
    }

    /**
     * Test of multiply method, of class Math_BigRationalSqrt.
     */
    @Test
    public void testMultiply() {
        System.out.println("multiply");
        Math_BigRationalSqrt y = new Math_BigRationalSqrt(BigRational.valueOf(2));
        Math_BigRationalSqrt instance = new Math_BigRationalSqrt(BigRational.valueOf(2));
        BigRational expResult = BigRational.valueOf(2);
        BigRational result = instance.multiply(y);
        assertTrue(expResult.compareTo(result) == 0);
        // Test 2
        y = new Math_BigRationalSqrt(BigRational.valueOf(2));
        instance = new Math_BigRationalSqrt(BigRational.valueOf(8));
        expResult = BigRational.valueOf(4);
        result = instance.multiply(y);
        assertTrue(expResult.compareTo(result) == 0);
        // Test 3
        y = new Math_BigRationalSqrt(BigRational.valueOf(8));
        instance = new Math_BigRationalSqrt(BigRational.valueOf(2));
        expResult = BigRational.valueOf(4);
        result = instance.multiply(y);
        assertTrue(expResult.compareTo(result) == 0);
        // Test 4
        y = new Math_BigRationalSqrt(BigRational.valueOf(12));
        instance = new Math_BigRationalSqrt(BigRational.valueOf(3));
        expResult = BigRational.valueOf(6);
        result = instance.multiply(y);
        assertTrue(expResult.compareTo(result) == 0);
    }

    /**
     * Test of getNumeratorAndDenominator method, of class Math_BigRationalSqrt.
     */
    @Test
    public void testGetNumeratorAndDenominator() {
        System.out.println("getNumeratorAndDenominator");
        BigRational x = BigRational.valueOf(4);
        BigInteger[] expResult = new BigInteger[2];
        expResult[0] = BigInteger.valueOf(4);
        expResult[1] = BigInteger.valueOf(1);        
        BigInteger[] result = Math_BigRationalSqrt.getNumeratorAndDenominator(x);
        for (int i =0; i < result.length; i ++) {
            assertThat(result[i], Matchers.comparesEqualTo(expResult[i]));
        }
    }

}
