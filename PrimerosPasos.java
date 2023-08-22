/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Primero;

/**
 *
 * @author Alumno
 */
public class PrimerosPasos {

    public static void main(String[] args) {
        int entero = 1;
        
        for(int i = 0 ; i < 100 ; i++)
        {
         if(entero % 2 == 0)
         {
             System.out.println("Es Par " + entero);
         }
         else
         {
             System.out.println("" + entero);
         }
         
         entero++; 

        }
    }
}
