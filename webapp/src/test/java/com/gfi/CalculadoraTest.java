package com.gfi.prueba;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import com.gfi.Calculadora;

/**
 * Unit test for simple App.
 */
public class CalculadoraTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public CalculadoraTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( CalculadoraTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testSumarPositivos()
    {
        int rsEsp=14;
        int resultado=Calculadora.suma(9,5);
        assertEquals(resultado,rsEsp);
    }
    
        public void testSumarNegativos()
    {
        int rsEsp=14;
        int resultado=Calculadora.suma(9,5);
        assertEquals(resultado,rsEsp);
    }
    
        public void testSumarPositivos1()
    {
        int rsEsp=14;
        int resultado=Calculadora.suma(9,5);
        assertEquals(resultado,rsEsp);
    }

}
