public class Static {
   public static void main(String[] args) {
        Student s1 = new Student();
        s1.schoolName = "JMV";

        Student s2 = new Student();
        System.out.println(s2.schoolName);

        Student s3 = new Student();
        s3.schoolName = "ABC";
        System.out.println(s3.schoolName);
   } 
}

class Student {
    String name;
    int roll;

    static String schoolName;

    void getName(String name) {
        this.name = name;
    }
    String getName() {
        return this.name;
    }
}