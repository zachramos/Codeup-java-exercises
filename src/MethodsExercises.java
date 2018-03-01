import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
//        System.out.println(add(2, 2));
//
//        System.out.println(subtract(10, 5));
//
//        System.out.println(multiply(5, 5));
//
//        System.out.println(divide(10, 2));
//
//        System.out.println(modulo(10, 3));

//        System.out.println(times(5,5));

        Scanner scan = new Scanner(System.in);

        getFactorial();
        rollDie();


    }

    public static int add (int a, int b ){
        return a + b;
    }

    public static int subtract(int a, int b){
        return a - b;
    }

    public static int multiply (int a, int b){
        return a * b;
    }

    public static int divide (int a, int b){
        return a/b;
    }

    public static int modulo (int a, int b){
        return a%b;
    }
    public static int times (int a, int b){
        int c = a;
        for(int i = 1;i < b;i++){
            a += c;
        }
        return a;
    }

    public static int getInteger(int min, int max){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number between " + min + " and " + max + " to get factorial:");
        int userInput = scan.nextInt();
        if (userInput < min || userInput > max){
            return getInteger(min, max);
        }
        return userInput;

    }


    public static void getFactorial (){
        Scanner scan = new Scanner(System.in);
        int userInput = getInteger(1,10);

        int i,fact = 1;
        for (i = 1; i <= userInput; i++){
            fact=fact*i;
        }
        System.out.println("Factorial of " + userInput + " is: " + fact);

    }

    public static int getRand(int n) {
        return (int)(Math.random() * n + 1);
    }

    public static void rollDie() {
        Scanner scan = new Scanner(System.in);
        System.out.print("How Many Sides? ");
        int numSides = scan.nextInt();
        System.out.printf("You rolled: %d & %d!\n", getRand(numSides), getRand(numSides));
        System.out.print("Roll again? ");
        if("y".equals(scan.next().toLowerCase())) rollDie();
    }



}
