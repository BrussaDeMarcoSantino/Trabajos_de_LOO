
import java.util.Scanner; 
import java.util.HashMap;
import java.util.Map;

public class ero {

	  public static void main(String[] args)
	  {
		  String primera;
		  String segunda; 
		  Scanner sc = new Scanner(System.in); 
		  boolean anagrama = true; 
		  int count;
		  System.out.println("Ingrese una cadena de caracteres");
		  primera = sc.nextLine();
		  System.out.println("Ingrese una segunda cadena de caracteres");
		  segunda = sc.nextLine();
		  
      
if(Anagramas(primera, segunda))
{
	System.out.println("Son enagramas");
}
else
{
	System.out.println("No son enagramas");
}


		    
	  }
	  
	  public static boolean Anagramas(String primera, String segunda)
	  {
		  if(primera.length() != segunda.length())
		  {
			  return false; 
		  }
		  
		  Map<Character, Integer> frecuencia = new HashMap<>();
		  
		  for(char letra : primera.toCharArray())
		  {
			  frecuencia.put(letra, frecuencia.getOrDefault(letra, 0) + 1);
		  }
		  
		  for(char letra : segunda.toCharArray())
		  {
			  if(!frecuencia.containsKey(letra))
			  {
				  return false;  
			  }
			  
			 frecuencia.put(letra, frecuencia.get(letra) - 1);
			 
			 if(frecuencia.get(letra) < 0)
			 {
				 return false;
			 }
		  }
		  
		  return true;
		  
	  }
		  
	  }

