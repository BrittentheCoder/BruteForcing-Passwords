
import java.util.*;
public class PasswordChecker {
    public static long ThePasswordChecker(int wantedLength) {

        boolean found = false;

        String[] charList = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z",
                "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z",
                "!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "-", "+", "=", "/", "?", "<", ">", "[", "]", "{", "}", "_", "~", "`", "|", "'", ";", ":", ",", ".", " ", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};


        randomPhrase randomphrase = new randomPhrase();
        String password = randomphrase.randomgenerator(wantedLength,charList);


        long starttime = System.currentTimeMillis();
        if(!found){
        for (int j = 0; j < charList.length && !found; j++) { // loop through all viable characters
            String c1 = charList[j];
            if (c1.equals(password)) {
                System.out.println("Found: " + c1);
                found = true;
                break;
            }}}

        else if(!found){ //testing if it's two characters
            for (int j = 0; j < charList.length && !found; j++) { // loop through all viable characters
                String c1 = charList[j];
                for (int k = 0; k < charList.length && !found; k++) { // try two characters
                    String c2 = c1 + charList[k];
                    if (c2.equals(password)) {
                        System.out.println("Found: " + c2);
                        found = true;
                        break;
                    }}}}
        else if(!found){ //length 3
            for (int j = 0; j < charList.length && !found; j++) { // loop through all viable characters
                String c1 = charList[j];
                for (int k = 0; k < charList.length && !found; k++) { // try two characters
                    String c2 = c1 + charList[k];
                    for (int l = 0; l < charList.length && !found; l++) { // try three characters
                        String c3 = c2 + charList[l];
                        if (c3.equals(password)) {
                            System.out.println("Found: " + c3);
                            found = true;
                            break;
                        }

                    }}}}
        else if(!found){ // length 4
            for (int j = 0; j < charList.length && !found; j++) { // loop through all viable characters
                String c1 = charList[j];
                for (int k = 0; k < charList.length && !found; k++) { // try two characters
                    String c2 = c1 + charList[k];
                    for (int l = 0; l < charList.length && !found; l++) { // try three characters
                        String c3 = c2 + charList[l];
                        for (int m = 0; m < charList.length && !found; m++) { // try four characters
                            String c4 = c3 + charList[m];
                            if (c4.equals(password)) {
                                System.out.println("Found: " + c4);
                                found = true;
                                break;
                            }}}}}}


        for (int j = 0; j < charList.length && !found; j++) { // length 5
            String c1 = charList[j];
            if (c1.equals(password)) {
                System.out.println("Found: " + c1);
                found = true;
                break;
            }
            for (int k = 0; k < charList.length && !found; k++) { // try two characters
                String c2 = c1 + charList[k];
                if (c2.equals(password)) {
                    System.out.println("Found: " + c2);
                    found = true;
                    break;
                }
                for (int l = 0; l < charList.length && !found; l++) { // try three characters
                    String c3 = c2 + charList[l];
                    if (c3.equals(password)) {
                        System.out.println("Found: " + c3);
                        found = true;
                        break;
                    }
                    for (int m = 0; m < charList.length && !found; m++) { // try four characters
                        String c4 = c3 + charList[m];
                        if (c4.equals(password)) {
                            System.out.println("Found: " + c4);
                            found = true;
                            break;
                        }
                        for (int n = 0; n < charList.length && !found; n++) { // try five characters
                            String c5 = c4 + charList[n];
                            if (c5.equals(password)) {
                                System.out.println("Found: " + c5);
                                found = true;
                                break;
                            }
                        }
                    }
                }
            }
        }
        if(!found){
            System.out.println("unable crack password");
        }
        long endtime = System.currentTimeMillis();

        return endtime-starttime;
    }
}

