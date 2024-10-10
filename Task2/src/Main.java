//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Cafe cafe = new Cafe();

        // Load the coffee menu data from the file
        cafe.loadMenuData();

        // Step 2.h: Get the coffee menu and print it
        for (String coffee : cafe.getCoffeeMenu()) {
            System.out.println(coffee);
        }

    }
}