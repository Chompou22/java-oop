// extends keyword (User) you can think of it like extra stuff in it.

public class Student extends User { // Inheritance concept, Student is a subclass that inherits from the User superclass.
    void verify() {
        System.out.println("Verifying through email");
        set_verified(true); // Setter by passing value
    }
}
