public class Main{

    public static void main(String[] args) {
        CMP202 cmp202 = new CMP202();
        //cmp202.printUserDetails();

        Person person = new Person(); // Constructor(first method that gets called when you create an instance of a class
        person.setName("dawn");
//        System.out.println(person.getName());

        person.setPassword("123456");
//        System.out.println(person.getPassword());

        Physics physics = new Physics();
        System.out.println(physics.calculateVelocity(6, 8));
        System.out.println(physics.calculateVelocity(5,7,5));
    }
}
