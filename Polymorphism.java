import java.util.ArrayList;

public class Polymorphism {
    public static void main(String[] args) {
        Student s = new Student();
        s.set_name("Student");

        Teacher t = new Teacher();
        t.set_name("Teacher");

        User.admins = new ArrayList<User>();
        User.admins.add(s);
        User.admins.add(t);

        for (User u : User.admins) {
            u.verify(); // Invoke the method
            System.out.println("name :" + u.get_name() + "," + "verify :" + u._verified);
        }

    }
}
