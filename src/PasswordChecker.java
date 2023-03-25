
import java.util.*;
public class PasswordChecker {
    public static long ThePasswordChecker(int wantedLength) {

        boolean found = false;

//        String[] charListEverything = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z",
//                "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z","0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
//                "!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "-", "+", "=", "/", "?", "<", ">", "[", "]", "{", "}", "_", "~", "`", "|", "'", ";", ":", ",", ".", " "};
        String[] charListEverything = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z",
                "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z","0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};


        randomPhrase randomphrase = new randomPhrase();
        String password = randomphrase.randomgenerator(wantedLength, charListEverything);


        long starttime = System.nanoTime();
        if (!found) {
            for (int j = 0; j < charListEverything.length; j++) { // loop through all viable characters
                String c1 = charListEverything[j];
                if (c1.equals(password)) {
                    System.out.println("Found: " + c1);
                    long endtime = System.nanoTime();
                    return endtime - starttime;
                }
            }
        }

        if (!found) { //testing if it's two characters
            for (int j = 0; j < charListEverything.length; j++) { // loop through all viable characters
                String c1 = charListEverything[j];
                for (int k = 0; k < charListEverything.length; k++) { // try two characters
                    String c2 = c1 + charListEverything[k];
                    if (c2.equals(password)) {
                        System.out.println("Found: " + c2);
                        long endtime = System.nanoTime();
                        return endtime - starttime;
                    }
                }
            }
        }
        if (!found) { //length 3
            for (int j = 0; j < charListEverything.length; j++) { // loop through all viable characters
                String c1 = charListEverything[j];
                for (int k = 0; k < charListEverything.length; k++) { // try two characters
                    String c2 = c1 + charListEverything[k];
                    for (int l = 0; l < charListEverything.length; l++) { // try three characters
                        String c3 = c2 + charListEverything[l];
                        if (c3.equals(password)) {
                            System.out.println("Found: " + c3);
                            long endtime = System.nanoTime();
                            return endtime - starttime;
                        }
                    }
                }
            }
        }
        if (!found) { // length 4
            for (int j = 0; j < charListEverything.length; j++) { // loop through all viable characters
                String c1 = charListEverything[j];
                for (int k = 0; k < charListEverything.length; k++) { // try two characters
                    String c2 = c1 + charListEverything[k];
                    for (int l = 0; l < charListEverything.length; l++) { // try three characters
                        String c3 = c2 + charListEverything[l];
                        for (int m = 0; m < charListEverything.length; m++) { // try four characters
                            String c4 = c3 + charListEverything[m];
                            if (c4.equals(password)) {
                                System.out.println("Found: " + c4);
                                long endtime = System.nanoTime();
                                return endtime - starttime;
                            }
                        }
                    }
                }
            }
        }


        if (!found) {
            for (int j = 0; j < charListEverything.length; j++) { // length 5
                String c1 = charListEverything[j];
                for (int k = 0; k < charListEverything.length; k++) { // try two characters
                    String c2 = c1 + charListEverything[k];
                    for (int l = 0; l < charListEverything.length; l++) { // try three characters
                        String c3 = c2 + charListEverything[l];
                        for (int m = 0; m < charListEverything.length; m++) { // try four characters
                            String c4 = c3 + charListEverything[m];
                            for (int n = 0; n < charListEverything.length; n++) { // try five characters
                                String c5 = c4 + charListEverything[n];
                                if (c5.equals(password)) {
                                    System.out.println("Found: " + c5);
                                    long endtime = System.nanoTime();
                                    return endtime - starttime;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            System.out.println("unable crack password");
        }
        long endtime = System.nanoTime();
        return endtime - starttime;
    }
}

