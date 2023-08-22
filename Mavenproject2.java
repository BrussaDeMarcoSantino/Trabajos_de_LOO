/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Tercero;
/**
 *
 * @author Alumno1
 */
import java.util.Scanner;
public class Mavenproject2 {
        public static void main(String[] args) {
       
            boolean primo = true;
            Scanner Numero = new Scanner(System.in);
            System.out.println("N xfa: ");
                int num = Numero.nextInt();
            
            do 
            {
             primo = true;
                System.out.println("N xfa: ");
                num = Numero.nextInt();
                
                   for(int i = 2 ; i <= Math.sqrt(num) ; i++)
                    {
                     if(num % i == 0)
                      {
                        primo = false;

                      }
                    
                    }      
            }while(num < 100 || primo == false);
     
    }
}
