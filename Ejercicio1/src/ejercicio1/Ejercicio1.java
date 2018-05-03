/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;
import java.util.Scanner;
/**
 *
 * @author armes
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         // TODO code application logic here
        int op=0;
         Scanner sc=new Scanner(System.in);
         System.out.println("Menu de Opciones");
         System.out.println("1: figura 1");
         System.out.println("2: figura 2");
         System.out.println("3: figura 3");
         System.out.println("4: figura 4");
         System.out.println("cualquier otra opcion. sale del menu");
         op=sc.nextInt();
         while(op>=1&&op<=4){
         switch(op){
             case 1:
                 System.out.println("Figura 1");
                for(int i=0;i<4;i++){
                System.out.println("");
                for(int l=0;l<6;l++){
                System.out.print("* ");
                    }
                    }
                 System.out.println("");
                break;
             case 2:
                
                System.out.println("Figura 2");
                for(int j=0;j<2;j++){
                    for(int y=0;y<=6;y++){
                        System.out.print("* ");
                        }
                        System.out.println("");
                        for(int y=0;y<=6;y++){
                        System.out.print(" *");
                        }
                        System.out.println("");
                        }
                        break;
             case 3:
                    System.out.println("Figura 3");
                    for(int x=0;x<5;x++){
                    System.out.println("");
                    for(int z=0;z<=x;z++){
                    System.out.print(" *");
            }
                    }
                    System.out.println("");
                    break;  
             case 4:
        
             System.out.println("");
         System.out.println("Figura 4");
          
        for(int t=0;t<5;t++){
            System.out.println("");
            for(int f=0;f<=t;f++){
                System.out.print(" *");
            }
        }
        for(int t=4;t>=0;t--){
            System.out.println("");
            for(int f=0;f<t;f++){
                System.out.print(" *");
            }
        }
       break;
             default: System.out.println("no ingreso una opcion valida");
    }
             System.out.println("Ingrese opcion");
             op=sc.nextInt();
}
    }
}

