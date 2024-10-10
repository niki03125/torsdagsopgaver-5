public class Customer {

    // 1.a
    private String firstName;
    private String lastName;
    private String username;
    private int id;
    private static int counter = 0;

    // 1.b
    public Customer(String firstName,String lastName, String userName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = userName;

        // 1.c
        counter++;
        this.id = counter;
    }
    // 1.d
    @Override
    public String toString(){
        return "first and last name: " +this.firstName + " " +
                this.lastName + " and username and id: "+
                this.username+ " " + this.id;

    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getUsername(){
        return username;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }



}
