import java.util.List;

public abstract class User {
    private String _name;
    private String _membership;

    boolean _verified = false;

    void set_verified(boolean verified) {
        _verified = verified;
    }

    boolean get_verified() {
        return _verified;
    }

    // Set the default for testing overriding process
    void verify() {
        System.out.println("Verifying.......");
        set_verified(false); // Setter by passing value
    }

    // Static variables in class can be accessed directly (static data members)
    public static List<User> admins; // Declared an admins variable as a static variable with generic List<User> 

    // Static methods is a method that we can access directly (don't have to instantiate it)
    public static void print_admins() { // Cause this have the same static keyword no need to using main class (User) to access it
        for (User u : admins) {
            System.out.println("name :" + u.get_name() + "," + "membership :" + u.get_membership());
        }
    }

    // Method overriding is a process of replacing a method that already exists
    public String toString() { // toString build-in method overriding
        return "Name: " + get_name() + " Membership: " + get_membership();
    }
    // Overriding equals attribute
    public boolean equals(User u2) {
        if (get_name() == u2.get_name() && get_membership() == u2.get_membership()) {
            return true;
        } else {
            return false;
        }
    }

    // Defined a user constructor (There is no return type)
    public User() { // defined a default constructor

    }
    
    public User(String name) {
        set_name(name);
    }

    public User(String name, String membership) { // this is the purest form of encapsulation (can't be duplicated)
        set_name(name);
        set_membership(membership);
    }

    // Getter and setter allow us to have a consistent interface with working with objects
    void set_name(String name) { // Use this to give it a value
        _name = name;
    }

    String get_name() { // Use this to get the value 
        return _name;
    }

    // create different variations of methods with different types (Method overloading)

    public enum Membership { // Initialize an enum class
        Bronze, Siliver, Gold;
    }

    void set_membership(String membership) {
        _membership = membership;
    }

    void set_membership(Membership membership) {
        _membership = membership.name(); // Convert an enum value from this parameter to a string
    }

    String get_membership() {
        return _membership;
    }

}
