/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej4tp1;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ej4tp1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Ingrese Tamaño del cuadrado de buscaminas. primero  largo, despues ancho:");
        int l=sc.nextInt();
        int a=sc.nextInt();
        String[] c=new String[l];
        char[][] b=new char[l][a];
        int[][] vb=new int[l][a];
        for(int i=0;i<c.length;i++){
            Scanner gg=new Scanner(System.in);
            System.out.println("ingrese la linea de caracteres a leer numero: "+(i+1));
            c[i]=gg.nextLine();
            while(c[i].length()>a||c[i].length()<a){
                System.out.println("Ingrese una cantidad de caracteres valida, es decir: "+a);
                c[i]=gg.nextLine();
            }
            for(int v=0;v<=b[i].length-1;v++){
             b[i][v]=c[i].charAt(v);
            
            }
        }
        
            for(int i=0;i<=b.length-1;i++){
                for(int x=0;x<=b[i].length-1;x++){
                    if(b[i][x]=='.'){
                        vb[i][x]=0;
                    }else
                    {
                        vb[i][x]=-10;
                    }
                }
            }
            
            for(int i=0;i<=vb.length-1;i++){
                for(int x=0;x<=vb[i].length-1;x++){
            if(vb[i][x]<=-1){
            if(i==0 ){
                if(x==0){
                vb[i][x+1]++;
                vb[i+1][x]++;
                vb[i+1][x+1]++;
            }
           else if(x==a-1){
                vb[i][x-1]++;
                vb[i+1][x]++;
                vb[i+1][x-1]++;
            }
           else {
               vb[i][x-1]++;
               vb[i][x+1]++;
               vb[i+1][x]++;
               vb[i+1][x-1]++;
               vb[i+1][x+1]++;
           }}
            else if(i==l-1)
            {
                if(x==0){
                vb[i-1][x]++;    
                vb[i][x+1]++;
                vb[i-1][x+1]++;
                }
               else if(x==a-1){
                    vb[i][x-1]++;
                    vb[i-1][x]++;
                    vb[i-1][x-1]++;
                }
               else{
                   vb[i][x-1]++;
                   vb[i][x+1]++;
                   vb[i-1][x]++;
                   vb[i-1][x-1]++;
                   vb[i-1][x+1]++;
               }
            }else if(x==0){
                vb[i][x+1]++;
                vb[i-1][x]++;
                vb[i-1][x+1]++;
                vb[i+1][x]++;
                vb[i+1][x+1]++;
            }else if(x==a-1){
                vb[i][x-1]++;
                vb[i-1][x-1]++;
                vb[i-1][x]++;
                vb[i+1][x]++;
                vb[i+1][x-1]++;
            }else {
                vb[i][x-1]++;
                vb[i][x+1]++;
                vb[i-1][x]++;
                vb[i-1][x-1]++;
                vb[i-1][x+1]++;
                vb[i+1][x]++;
                vb[i+1][x-1]++;
                vb[i+1][x+1]++;
            }
            }
            }}
            String[][] mn=new String[l][a];
            for(int i=0;i<=vb.length-1;i++){
                for(int x=0;x<=vb[i].length-1;x++){
                if(b[i][x]!='*'){
                    mn[i][x]=Integer.toString(vb[i][x]);
                
                }
                else
                {
                    mn[i][x]=Character.toString(b[i][x]);
                }
                }}
            for(int i=0;i<=mn.length-1;i++){
                System.out.println("");
                for(int x=0;x<=mn[i].length-1;x++){
                    System.out.print(mn[i][x]);
                
                }
                }
            System.out.println("\n");
            }
        }
        
        
        
     
    