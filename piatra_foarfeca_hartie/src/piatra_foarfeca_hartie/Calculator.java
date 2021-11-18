package piatra_foarfeca_hartie;
import java.util.*;


public class Calculator {
private int calculator_choice;

public int calculator_Alegere(int calculator_Choice)
{
	Random rand = new Random();
	calculator_Choice = rand.nextInt(3);
	if (calculator_Choice == 0)
	{
		calculator_Choice++;
	}
	return calculator_Choice;
}
public String nume(int calculator_choice, String comp_choice_name)
{
	 if (calculator_choice == 1)
	 {
		 comp_choice_name = "Piatra";
	 }
	 else if (calculator_choice == 2)
	 {
		 comp_choice_name = "Hartie";
	 }
	 else
	 {
		 comp_choice_name = "Foarfece";
	 }
	 return comp_choice_name;
}


public int getCalculator_choice() {
	return calculator_choice;
}
public void setCalculator_choice(int calculator_choice) {
	this.calculator_choice = calculator_choice;
}


}
