public class OOPS {
    public static void main(String[] args) {
        // Pen p1 = new Pen(); // created a pen object called p1
        // p1.setColor("Blue");
        // System.out.println(p1.getColor());
        // p1.setTip(5);
        // System.out.println(p1.getTip());

        // Student s1 = new Student("Garv");
        // Student s2 = new Student();
        // Student s3 = new Student(123);
        // System.out.println(s1.name);

        Student s1 = new Student();
        s1.name = "Garv";
        s1.roll = 456;
        s1.password = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Student s2 = new Student(s1);
        s2.password = "xyz";
        s1.marks[2] = 100;

        for(int i=0; i<3; i++) {
            System.out.println(s2.marks[i]);
        }
    }
}



class Student {

    String name;
    int roll;
    String password;
    int marks[];

    //shallow copy constructor
    // Student(Student s1) {
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.roll = s1.roll; 
    //     this.marks = s1.marks;
    // }

    //deep copy constructor
    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll; 
        for(int i=0; i<marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }

    Student() {
        marks = new int[3];
        System.out.println("constructor is created....");
    }

    Student(String name) {
        marks = new int[3];
        this.name = name;
    }

    Student(int roll) {
        marks = new int[3];
        this.roll = roll;
    }
}

// class Pen {
//     private String color;
//     private int tip;

//     String getColor() {
//         return this.color;
//     }

//     int getTip() {
//         return this.tip; 
//     }

//     void setColor(String newColor) {
//         color = newColor;
//     }

//     void setTip(int newTip) {
//         tip = newTip;
//     } 
// }
// class BankAccount {
//     public String username;
//     private String password;
//     public void setPassword(String pwd) {
//         password = pwd;
//     }
// }
