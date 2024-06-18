/*
    The User class has private variables and public methods to access and update those variables. 
    This ensures that the variables can't be directly accessed from outside the class, providing better control over the data.
 */

public class OOP {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        /*
            // Instantiate class of object
            User u = new User(); // Every time we create a new object ( class instance) we are invoking the constructor ( default constructor)
            // u._name = "John"; // The field User._name is not visible (private access)
            u.set_name("John");
            u.set_membership(User.Membership.Gold); // The method overloading with enum access
         */
        
        // Every object attributes (Everything done at once in a constructor)
        // User u = new User("John", "Gold"); // User can't be instantiated
        // User u2 = new User("John", "Gold");

        // System.out.println(u.get_name());
        // System.out.println(u.get_membership());
        // System.out.println(u.toString()); // Method overriding

        // So if you want to compare two projects they're by default going to compare by address (Equals attribute)
        // System.out.println(u == u2);
        // System.out.println(u.equals(u2)); // u going to object of starting point and u2 going to object passed in ( Overriding equals attribute instead of of comparing their address we going to comparing object properties)
    }
}
