import javafx.collections.ArrayChangeListener;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {

    // attribut coffeeMenu med typen ArrayList
    private ArrayList<String> coffeeMenu;

    //konstruktør som initialisere coffeeMenu som en tom ArrayList
    public Cafe(){
        this.coffeeMenu = new ArrayList<String>();
    }

    //getter metode
    public ArrayList<String> getCoffeeMenu(){
        return coffeeMenu;
    }

    //metode for at tilføje kaffer til coffeeeMenuen
    public void addCoffee(String coffeeName){
        coffeeMenu.add(coffeeName);
    }

    //metode til at indlæse coffees.txt filen
    public void loadMenuData(){
        try {
            File file = new File("data/coffees.txt");

            Scanner scan = new Scanner(file);

            while(scan.hasNextLine()) {
                coffeeMenu.add(scan.nextLine());
            }
            scan.close();
        }catch(FileNotFoundException e){
            System.out.println("File not found. Check path and file name");
        }
    }


}
