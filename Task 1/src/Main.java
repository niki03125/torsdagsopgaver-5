import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<Customer>();

        customers.add(new Customer("Line","Mikkelsen","Line999"));
        customers.add(new Customer("Ash","Andersen","ash999"));

        for(Customer c: customers){
            System.out.println(c);
        }
    }
}