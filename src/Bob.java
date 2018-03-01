import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
//        Create a class Bob for the following exercise with a main method. Bob is a lackadaisical teenager. In conversation, his            responses are very limited.
//
//Bob answers 'Sure.' if you ask him a question.
//He answers 'Whoa, chill out!' if you yell at him.
//He says 'Fine. Be that way!' if you address him without actually saying anything.
//He answers 'Whatever.' to anything else.
        //======================================================================================
        Scanner scan = new Scanner(System.in);
        System.out.println("Say something to bob:");
        String userInput = scan.nextLine();

        if (userInput.endsWith("?")){
            System.out.println("Sure..");
        } else if (userInput.equals("")){
            System.out.println("Fine, be that way.");
        }if (userInput.endsWith("!") || userInput.toUpperCase().equals(userInput)){
            System.out.println("whoah, chill out!");
        }else{
            System.out.println("whatever");
        }
    }
}
