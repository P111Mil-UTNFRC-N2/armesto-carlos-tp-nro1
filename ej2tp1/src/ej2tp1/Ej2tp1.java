/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2tp1;
import java.util.Scanner;

/**
 *
 * @author armes
 */
public class Ej2tp1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese codigo del libro");
        String n=sc.nextLine();
        int[] nnn=new int[n.length()];
        n=n.replace("-","");
        System.out.println(n);
         float suma=0;
        int nu=10;

        char[] l=new char[n.length()];
        for(int i=0;i<=l.length-1;i++){
            l[i]=n.charAt(i);
           nnn[i]=Character.getNumericValue(l[i]);
             suma=suma+(nnn[i]*nu);
           nu--;
        }
          
        if(suma%11==0){
            System.out.println("valido");
        }
        else
        {
            System.out.println("invalido");
        }
        System.out.println(suma);
    }
}


