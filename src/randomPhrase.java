import java.util.Random;

public class randomPhrase {

    public static String randomgenerator(int wantedLength, String[] charList){
        Random rand = new Random();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < wantedLength; i++) {
            int index = rand.nextInt(charList.length); // choose a random character from the list
            sb.append(charList[index]);
        }

        String randomPhrase = sb.toString();
        System.out.println("Random Phrase: " + randomPhrase);
        return randomPhrase;
    }
}
