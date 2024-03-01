package org.example.logic;

import java.util.HashMap;

public class Subtractor implements Operation{
    @Override
    public Polynomial performOperation(Polynomial p1, Polynomial p2)  {
        HashMap<Integer, Double> result = new HashMap<>();
        for(int exponent : p1.getTerms().keySet()){
            result.put(exponent, p1.getCoefficient(exponent) - p2.getCoefficient(exponent));
        }
        for(int exponent : p2.getTerms().keySet()){
            if(!result.containsKey(exponent)){
                result.put(exponent, -1f * p2.getCoefficient(exponent));
            }
        }
        return new Polynomial(result);
    }
}
