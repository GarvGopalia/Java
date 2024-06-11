public class Overriding {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat(); 
    }
}

class Animal {
    void eat() {
        System.out.println("eats anything");
    }
}

class Dog {
    void eat() {
        System.out.println("eats food");
    }
}