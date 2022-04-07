package com.cofomo.calcule.services;

import org.springframework.stereotype.Service;

@Service
public class CalculeService {

    public int addition(int a, int b) {
        return a+b;
    }

    public int multiplication(int a, int b){
        return a*b;
    }

    public int subtraction(int a, int b){
        return a-b;
    }

    public float division (int a, int b) throws Exception {
        if (b==0) throw new Exception("Cannot divis by 0");

        return (float) a/b ;
    }

}
