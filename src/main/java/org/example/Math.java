package org.example;

import java.util.LinkedList;
import java.util.List;

public class Math {
    public List<Integer> generatoreNumeriPrimi(int n){
        List<Integer> numeriPrimi = new LinkedList<>();

        if(n>=2)
            numeriPrimi.add(2);

        for(int i=3; i<n; i++)
        {
            if(isPrime(i))
                numeriPrimi.add(i);
        }

        return numeriPrimi;
    }

    boolean isPrime(int j)
    {
        if (j<=2)
            return false;

        for(int i=2; i< j/2; i++)
        {
            if (j%i==0)
                return false;
        }
        return true;
    }


}
