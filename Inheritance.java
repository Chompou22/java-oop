public class Inheritance {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.get_verified());
        // Inheritance getter and setter methods from (User)
        s.set_membership("Gold");
        System.out.println(s.get_membership());
    }
}
