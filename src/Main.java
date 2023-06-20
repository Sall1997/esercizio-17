/*ESERCIZIO 17
Achieve encapsulation using getters/setters for a class House that has the following instance variables:
  - an int floorsNumber
  - a string address
  - an array of strings residentsNames
use a tester class to:
  - set the values by asking the user to input them
  - for the residentsNames, the user will have to input a list of names separated by a comma (e.g. John,Lucy,Peter)
  - prints the house details using the getters and String.format()
 */
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String nameResidentsList;
        String details;

        House house1 = new House();

        // soluzione per settare le variabili dell'oggetto, da tastiera.

        System.out.println("Please, enter the floors number: ");

        house1.setFloorsNumber(input.nextInt());
        input.nextLine();

        System.out.println("Please, enter the address:");
        house1.setAddress(input.nextLine());

        System.out.println("Please, enter the residents number: ");
        house1.setResidentNumber(input.nextInt());
        input.nextLine();

// soluzuione per scrivere e salvare i nomi dei residenti, in base alla lunghezza del metodo getResidentsName
        System.out.println("Please, enter the residents names: ");

        for (int i = 0; i < house1.getResidentsNames().length; i++) {
            house1.setResidentsNames(i, input.nextLine());
        }

        System.out.println();

// soluzione per stampare i dettagli della casa nel formato qui sotto:
        nameResidentsList= String.join(", ",(house1.getResidentsNames()));

        //formato
        details = String.format("Details:\nfloors number: %d;\nAddress: %s; \nName residents: %s.",
                                house1.getFloorsNumber(), house1.getAddress(), nameResidentsList);

        System.out.println(details);
    }
}