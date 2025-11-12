class Animal {
    String name;

    void eat() {
        System.out.println(name + " is eating.");
    }
}

// Child class (Sub class)
class Dog extends Animal {
    void bark() {
        System.out.println(name + " is barking.");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.name = "Buddy";

        myDog.eat();   // Inherited from Animal
        myDog.bark();  // Defined in Dog
    }
}

