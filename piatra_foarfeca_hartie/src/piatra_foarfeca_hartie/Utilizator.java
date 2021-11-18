package piatra_foarfeca_hartie;
import java.util.*;


public class Utilizator {

private int choice;


public int alegere(int decizie)
{
	Scanner tastatura = new Scanner(System.in);
	System.out.println("\nIntroduceti alegere:\n 1.Piatra\n 2.Hartie \n 3. Foarfece \n");
	//Input de la utilizator;
	System.out.println("\nRandul tau: ");
	decizie = tastatura.nextInt();
	return decizie;
}

public String nume(int choice, String choice_name)
{
	 if (choice == 1)
	 {
		 choice_name = "Piatra";
	 }
	 else if (choice == 2)
	 {
		 choice_name = "Hartie";
	 }
	 else
	 {
		 choice_name = "Foarfece";
	 }
	 return choice_name;
}


public Utilizator() {
	super();
}

public int getChoice() {
	return choice;
}

public void setChoice(int choice) {
	this.choice = choice;
}



}
