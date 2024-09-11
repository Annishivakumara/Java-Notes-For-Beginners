public class Main {
    public static void main(String[] args) {
      
        String name = "Alice";
        int age = 30;
        double height = 165.5;
        boolean isStudent = true;

    
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Is Student: " + isStudent);


        age = 31;


        System.out.println("Updated Age: " + age);

 
        int birthYear = 2024 - age;
        System.out.println("Birth Year: " + birthYear);
    }
}
