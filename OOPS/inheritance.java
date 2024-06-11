public class inheritance {
    public static void main(String[] args) {

    }
}
//Base Class
class Animal {
    String color;
    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }
}

class Mammal extends Animal {
    void walk() {
        System.out.println("walks");
    }
}

class Fish extends Animal {
    void swim() {
        System.out.println("swim");
    }
}

// class Dog extends Mammal {
//     String breed;
// }

//Derived Class
// class Fish extends Animal {
//     int fins;

//     void swim() {
//         System.out.println("swims in water");
//     }
// }