package br.ufrn.dimap.services;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class CalculadoraDescontoTest {
    
    @Test
    public void calcularTotalFalha(){

        CalculadoraDesconto calc = new CalculadoraDesconto();
        double total = calc.calcularTotal(100, 1, true);
        Assertions.assertEquals(100.0, total);
    }
}
