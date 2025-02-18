public class Variable {
    public static void main(String[] args)
    {
        int age =18;
        double price = 89.90;
        char grade = 'A';
        boolean isStudent = true;
        String name = "Gyanesh";
        int sum = 10+45;
        int product = 10*2;
        int remainder = 10%3;
        boolean result = (10>4);
        boolean isValid = (10>4)&&(5<2);
        boolean isNotValid = (10>5)||(5<2);

        System.out.println(sum);
        System.out.println(result);
        System.out.println(isValid);
        System.out.println(isNotValid);
        System.out.println(product);
        System.out.println(remainder);
        System.out.println("Age: " + age);
        System.out.println("Price: " + price);
        System.out.println("Grade: " + grade);
        System.out.println("Is Student: " + isStudent);
        System.out.println("Name: " + name);
    }
}
