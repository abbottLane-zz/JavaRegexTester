package wlane.RegexTester;

import java.io.*;
import java.util.regex.*;

public class RegexCountText {

    public static void main(String[] args) throws IOException {

        //Initialized user input reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println("Enter your regex: ");
            Pattern pattern = Pattern.compile(br.readLine());

            //System.out.println("Enter input string to search: ");
            BufferedReader br2 = new BufferedReader(new FileReader(new File ("src/data/CountOfMonteCristo.txt")));
            Matcher matcher = pattern.matcher("");

            String line = null;
            int occurenceCount = 0;
            boolean found = false;
            while((line = br2.readLine()) != null)
            {
                matcher = pattern.matcher(line);
                while (matcher.find()) {
//                    System.out.println("Text Matched: " + matcher.group() +" starting at index: "
//                            + matcher.start() + " and ending at index: " + matcher.end());
                    occurenceCount++;
                    found = true;
                }
            }
            if(found) {
                System.out.print("Occurences of \"" + pattern.toString() + "\" : " + occurenceCount + "\n");
            }
            else{
                System.out.println("No occurrences found.");
            }
        }
    }
}