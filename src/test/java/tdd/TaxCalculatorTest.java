package tdd;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by Evegeny on 19/07/2016.
 */
public class TaxCalculatorTest {



    @Test
    public void testWithMaam() throws Exception {
        TaxCalculator taxCalculator = new TaxCalculator();

        MaamService mock = mock(MaamService.class);
        when(mock.getMaam()).thenReturn(0.1);


        taxCalculator.setMaamService(mock);
        double withMaam = taxCalculator.withMaam(100);
        Assert.assertEquals(110,withMaam,0.00001);
    }


}