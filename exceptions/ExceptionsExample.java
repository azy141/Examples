package com.fdmgroup.exceptions;

import java.io.IOException;

public class ExceptionsExample {
       
       public void openFile(String filename)throws IOException{
              if(filename.equals("ade.txt")){
                     throw new IOException("File not found exception");
              }
       }

       public static void main (String[] args){
              
              try{   
              int[] results = new int [10];
              int score = results[-1];                 
              int divisor =0;
              int result =1/divisor;
              

              
              //multiple catch blocks
              //multiple difference exceptions
              } catch(ArithmeticException e){
                     System.out.println("caught");
              } catch(ArrayIndexOutOfBoundsException a){
                     System.out.println("caught array index");
              //executes regardless if exception is used
              }finally{
                     System.out.println("Finally executed");
              }
       
              
              ExceptionsExample exceptionsExample = new ExceptionsExample();
              try {
                     exceptionsExample.openFile("ade.txt");
              } catch (IOException e) {
                     e.printStackTrace();
                     System.out.println(e.getMessage());
                     System.out.println(e.toString());
              }
       
       }
       
       
       
       //golden Rules:
       //dont catch Throwable
       //dont catch error and exception
       //dont catch runtimeerror
}
