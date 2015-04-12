package wlane.RegexTester;

import java.io.*;
import java.util.regex.*;

public class RegexCountText {

    public static void main(String[] args) throws IOException {

        //Initialized user input reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            //Prompt user for regex pattern
            System.out.println("Enter your regex: ");
            Pattern pattern = Pattern.compile(br.readLine());

            //Read in source file
            BufferedReader br2 = new BufferedReader(new FileReader(new File ("src/data/CountOfMonteCristo.txt")));

            //initialize Matcher object with no source material to begin with
            Matcher matcher = pattern.matcher("");

            //Declare some variable used inside the whil loops below
            String line = null;
            int occurenceCount = 0;
            boolean found = false;

            //Read each line of the input text into the variable "line"
            while((line = br2.readLine()) != null)
            {
                //Match all occurrences of the pattern found in the current line
                matcher = pattern.matcher(line);

                //Loop through the matches found in the current line
                while (matcher.find()) {
//                  System.out.println("Text Matched: " + matcher.group() +" starting at index: " + matcher.start() + " and ending at index: " + matcher.end());
                    //print out the match
                    System.out.println(matcher.group());
                    occurenceCount++;
                    found = true;
                }
            }

            //After searching entire input text, print out the total number of occurences found
            if(found) {
                System.out.print("Occurences of \"" + pattern.toString() + "\" : " + occurenceCount + "\n");
            }
            else{
                System.out.println("No occurrences found.");
            }
        }
    }
}