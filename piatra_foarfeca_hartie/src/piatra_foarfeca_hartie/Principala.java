package piatra_foarfeca_hartie;
import java.util.*;
public class Principala {
	
	public static void afisare(int choice, int comp_choice, String choice_name, String comp_choice_name, String result)
	{
		
		System.out.println(choice_name + "Vs" + comp_choice_name);
		if((choice == 1 && comp_choice == 2) || (choice == 2 && comp_choice == 1))
		{
			System.out.println("Hartia a invins!");
			result = "Hartie";
		}
		else if((choice == 1 && comp_choice == 3) || (choice == 3 && comp_choice == 1))
		{
			System.out.println("Piatra a invins!");
			result = "Piatra";
		}
	
		else
		{
			System.out.println("Foarfeca a invins!");
			result = "Foarfece";
		}
	
		if (result == choice_name)
		{
			System.out.println("\nAi Castigat!");
		}
		
		else 
		{
			System.out.println("\nCalculatorul a castigat!");
		}
	}
	
	
	public static char raspuns(char ans)
	{
		System.out.println("Continuati sa jucati? Y/N?");
		Scanner tastatura = new Scanner(System.in);
		ans = tastatura.next().charAt(0);
	
		return ans;
	}
	
	public static void main(String[] args)
	{
		boolean ok = true;
		
		int choice = 0;
		
		int comp_choice = 0;
		
		String choice_name = "";
		
		String comp_choice_name = "";
		
		String result ="";
		
		char ans = 1;
		
		//Afisam Regulile Jocului;
		
		System.out.println("Regulile pentru castigarea jocului sunt urmatoarele:\n"+
		"Piatra vs Hartie -> Hartia castiga\n"+
		 "Piatra vs Foarfece -> Piatra castiga\n"+
		 "Hartie vs Foarfece -> Foarfecele castiga\n");
		
		Utilizator util = new Utilizator();
		
		Calculator calc = new Calculator();
		
		while (ok)
		{
			choice = util.alegere(choice);
			while (choice > 3 || choice < 1)
			{
				System.out.println("Introduceti o valoare buna");
				choice = util.alegere(choice);
			}
		 
		choice_name = util.nume(choice, choice_name);
		 
		 System.out.println("\nAlegerea ta este: " + choice_name);
		 
		 System.out.println("\nAcum este randul calculatorului sa aleaga...");
		 
		 comp_choice = calc.calculator_Alegere(comp_choice);
		 
		 while (comp_choice == choice)
		 {
			 comp_choice = calc.calculator_Alegere(comp_choice);
		 }
		 
		 comp_choice_name = calc.nume(comp_choice, comp_choice_name);
		
		 System.out.println("\nAlegerea calculatorului este: " + comp_choice_name);
		 
		 afisare(choice, comp_choice, choice_name,  comp_choice_name,  result);
		
		 ans = raspuns(ans);
		 
		 if (ans == 'n' || ans == 'N')
			 ok = false;
		
		}
	
		System.out.println("\nMultumim ca ati jucat!");
	
	}

}
