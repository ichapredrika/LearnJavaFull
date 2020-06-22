package com.icha.javafundamental.oop.inputoutput;

import java.io.*;

public class Main {
    public static void main(String[] args){
        //Byte Stream
        FileInputStream in = null;
        FileOutputStream out = null;

        try{
            in = new FileInputStream("latihan_input.txt");
            out = new FileOutputStream("latihan_output.txt");
            int c;

            while ((c= in.read()) != -1){
                out.write(c);
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                if(in != null){
                    in.close();
                }
                if(out != null){
                    out.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }

        //Character Streams
        FileReader inF = null;
        FileWriter outF = null;

        try{
            inF = new FileReader("input.txt");
            outF = new FileWriter("output.txt");
            int c;
            while ((c = inF.read()) != -1){
                outF.write(c);
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try{
                if(inF != null) inF.close();
                if(outF != null) outF.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }

        //FILE NAVIGATION
        String dirname = "/java/latihan1";
        //File file2 = new File(dirname);
        File file = null;
        String[] paths;

        //create directory
        //file2.mkdirs();

        try{
            //instantiation object File
            file = new File(dirname);

            //ambil list files dan masukkan ke string paths
            paths = file.list();

            //tampilkan semua path yg ada
            for(String path: paths){
                System.out.println(path);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
