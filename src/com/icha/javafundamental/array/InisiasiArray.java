package com.icha.javafundamental.array;

public class InisiasiArray {
    public static void main(String[] args){
        int[] arrInt = new int[]{1,2,3,4,5,6};
        int[] arrInt2 = new int[6];
        int[] arrInt3 = {1,2,3};

        int[] arrInt4 = new int[10] ;

        arrInt2[0] = 1;

        System.out.println(arrInt[0]);
        System.out.println(arrInt2[0]);
        System.out.println(arrInt3[0]);

        for (int i=0; i<arrInt4.length; i++){
            arrInt4[i] = i+1;
            System.out.println(arrInt4[i]);
        }
    }
}
