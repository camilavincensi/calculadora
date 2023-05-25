package org.example;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Calculadora {

    public BigDecimal soma(BigDecimal a, BigDecimal b){
        return  a.add(b).setScale(2, RoundingMode.DOWN);
    }

    public BigDecimal subtracao(BigDecimal a, BigDecimal b){
        return  a.subtract(b).setScale(2, RoundingMode.DOWN);
    }

    public BigDecimal divisao(BigDecimal a, BigDecimal b){

        if (b.equals(new BigDecimal(0))){
            System.out.println("Não existe calculo para essa operação!");
            return new BigDecimal(0);
        }else {

            MathContext mc = new MathContext(2, RoundingMode.HALF_UP) ;

            return a.divide(b, mc);
        }
    }

    public BigDecimal multiplicacao(BigDecimal a, BigDecimal b){
        return  a.multiply(b);
    }
}
