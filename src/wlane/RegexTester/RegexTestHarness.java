package wlane.RegexTester;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.*;

public class RegexTestHarness {

    public static void main(String[] args) throws IOException {

        //Initialized user input reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            Pattern pattern = Pattern.compile("");

            System.out.println("Enter input string to search: ");
            Matcher matcher =
                    pattern.matcher(br.readLine());

            boolean found = false;
            while (matcher.find()) {
                System.out.println("Text Matched: " + matcher.group() +" starting at index: "
                        + matcher.start() + " and ending at index: " + matcher.end());
                found = true;
            }
            if(!found){
                System.out.println("No match found.%n");
            }
        }
    }

}