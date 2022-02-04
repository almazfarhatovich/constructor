package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Pryamaugol pryamaugol = new Pryamaugol(5,7,5,7 );
        System.out.println("a="+pryamaugol.getA()+"\n"+"b="+pryamaugol.getB()+"\n"+"c="+pryamaugol.getC()+"\n"+"d="+pryamaugol.getD());
        System.out.println("Аянты="+(pryamaugol.getA()* pryamaugol.getB()));
       }
}
