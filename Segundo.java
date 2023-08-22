/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Segundo;

/**
 *
 * @author Alumno
 */
public class Segundo {
    
    public static void main(String[] args) {
        int Num = 50; 

        Primo(Num);    
    }
    
    public static void Primo(int x)
    {    
      boolean primo = true;
      
      for(int i = 2 ; i <= Math.sqrt(x) ; i++)
      {
          if(x % i == 0)
          {
              primo = false;
              
              for(i = 0 ; i < x ; i++)
              {
                  if(x % i == 0)
                  {
                      System.out.println(" " + i);
                  }
              }
          }
          else
          {
               System.out.println(" es primo : " + x);
          }
      }

    }
}
   
