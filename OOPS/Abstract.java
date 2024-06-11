public class Abstract {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();

        Chicken c = new Chicken();
        c.eat();
        c.walk();

        System.out.println(h.color);
    }
}

abstract class Animal {
    String color;

    Animal() {
        color = "peach";
    }
    void eat() {
        System.out.println("animal eats");
    }

    abstract void walk();
}

class Horse extends Animal {
    void changeColor() {
        color = "brown";
    }
    void walk() {
        System.out.println("walks on 4 legs");
    }
}

class Chicken extends Animal {
    void changeColor() {
        color = "white";
    }
    void walk() {
        System.out.println("walks on 2 legs");
    }
}