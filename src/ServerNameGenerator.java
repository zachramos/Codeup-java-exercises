import java.util.Random;

public class ServerNameGenerator {
    public static void main(String[] args) {

        String[] adjectives = new String[10];
        adjectives[0] = "Spacey";
        adjectives[1] = "dedicated";
        adjectives[2] = "annoying";
        adjectives[3] = "cold";
        adjectives[4] = "heated";
        adjectives[5] = "defensive";
        adjectives[6] = "collected";
        adjectives[7] = "boring";
        adjectives[8] = "powerful";
        adjectives[9] = "frosty";

        String[] nouns = new String[10];
        nouns[0] = "genius";
        nouns[1] = "cat";
        nouns[2] = "dog";
        nouns[3] = "chair";
        nouns[4] = "cube";
        nouns[5] = "photon";
        nouns[6] = "knight";
        nouns[7] = "table";
        nouns[8] = "duck";
        nouns[9] = "cup";
        System.out.println("Here is your server name: ");
           System.out.println(adjectives[getIndex(adjectives)] + "-" + nouns[getIndex(nouns)]);
    }

    private static int getIndex(String[] input) {
        Random random = new Random();
        int index = random.nextInt(input.length);
        return index;
    }








}
