package com.icha.javafundamental.percabangan;

public class IfThenElseIfThenElse {
    public static void main (String[] args){
        int nilaiUjian = 80;
        char indesksPrestasi;

        if(nilaiUjian >= 90){
            indesksPrestasi = 'A';
        }else if (nilaiUjian >=80){
            indesksPrestasi = 'B';
        }else if(nilaiUjian >=70){
            indesksPrestasi = 'C';
        }else if( nilaiUjian >=60){
            indesksPrestasi = 'D';
        }else if (nilaiUjian >=50){
            indesksPrestasi = 'E';
        }else {
            indesksPrestasi = 'F';
        }

        System.out.println("Nilai akhir: " + indesksPrestasi);
    }
}
