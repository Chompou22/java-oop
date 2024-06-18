// Generic list
// Instead of just creating user variables it's probably better ideal to create a list that can contain numerous users.

// OOP allows us to create our own types this is our own data type.
// So we can use generic types as the type.
// A generic type is a generic list.

import java.util.ArrayList;

public class Generic {
    public static void main(String[] args) {
        /*
        User u = new User();
        u.set_name("John");
         */

        // Using generic types instead of initialize a user one by one.
        ArrayList<User> users = new ArrayList<User>(); // Any user can go in this list and that's fine. (based on all the customizes constructor)
        // users.add(new User("John")); // User can't be instantiated
        // users.add(new User("John", "Gold"));

        for (User u : users) {
            System.out.println("name :" + u.get_name() + "," + "membership :" + u.get_membership());
        }

        // Accessing the admins static variable that was declared in class users
        User.admins = new ArrayList<User>();
        // User.admins.add(new User("Pou")); // User can't be instantiated
        // User.admins.add(new User("Pou", "Siliver"));

        // for (User u : User.admins) {
        //     System.out.println("name :" + u.get_name() + "," + "membership :" + u.get_membership());
        // }

        User.print_admins(); // It prints the same thing.
    }
}
