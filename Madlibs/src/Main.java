/*
Reference here: https://github.com/banubot/intro-java-madlibs
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        // Define text of story
        String storyText = "Once upon a time there was a A1 N1 who always bought a N2 and thought " +
                "N3 was always a A2 N4\n" +
                ". Well here we are again with A3 N5";
//        System.out.println(storyText);
        HashMap<String, String> myBlanks = new HashMap<>();

        myBlanks.put("A1", "Adjective");
        myBlanks.put("N1", "Noun");
        myBlanks.put("N2", "Noun");
        myBlanks.put("N3", "Noun");
        myBlanks.put("N4", "Noun");
        myBlanks.put("A3", "Adjective");
        myBlanks.put("N5", "Noun");

        Scanner scanny = new Scanner(System.in);

        for (String key : myBlanks.keySet()) {
            System.out.println(myBlanks.get(key));
//            scanny.nextLine(); // to continue to receive input from user - can be wrapped in while loop
            myBlanks.replace(key, scanny.nextLine());
        }
        System.out.println(myBlanks);
        String[] splitStory = storyText.split(" ");
        for (int i = 0; i < splitStory.length; i++) {
            if (myBlanks.containsKey(splitStory[i])) {
                splitStory[i] = myBlanks.get(splitStory[i]);
            }
        }
//        System.out.println(Arrays.toString(splitStory));
        storyText = String.join(" ", splitStory);
        System.out.println(storyText);
    }

}
