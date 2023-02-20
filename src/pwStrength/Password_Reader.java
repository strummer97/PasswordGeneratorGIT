package pwStrength;

import java.util.Scanner;
 public class Password_Reader {

     /*This program analyzes a password and shows if it contains uppercase, lowercase, numbers or special characters*/
        public static boolean containsSpecCharacter = false;
        public static boolean containsNumbers = false;
        public static boolean containsLower = false;
        public static boolean containsUpper = false;
        public static int length = 0;
        public Password_Reader(){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your password: ");
        String userInput = sc.next();
        length = userInput.length();
        containsSpecCharacter = specialChar(userInput);
        containsNumbers = number(userInput);
        containsUpper = uppercase(userInput);
        containsLower = lowercase(userInput);
    }
    private static boolean specialChar (String input){//searches spec chars

        String specialChars = "`~!@#$%^&*()\\\\-_=+\\\\\\\\|\\\\[{\\\\]};:'\\\",<.>/?";
        char currentCharacter;

        for (int i = 0; i < input.length(); i++){
            currentCharacter = input.charAt(i);
            if (specialChars.contains(String.valueOf(currentCharacter))){
                containsSpecCharacter = true;
            }
        }
        return
                containsSpecCharacter;
    }
    private static boolean number (String input){//searches numbers

        char currentCharacter;


        for (int i = 0; i < input.length(); i++){
            currentCharacter = input.charAt(i);
            if (Character.isDigit(currentCharacter)){
                containsNumbers = true;
            }
        }
        return
                containsNumbers;
    }
    private static boolean lowercase (String input){//searches lowercase letters

        char currentCharacter;


        for (int i = 0; i < input.length(); i++){
            currentCharacter = input.charAt(i);
            if (Character.isLowerCase(currentCharacter)){
                containsLower = true;
            }
        }
        return
                containsLower;
    }
    private static boolean uppercase (String input){//searches uppercase letters

        char currentCharacter;


        for (int i = 0; i < input.length(); i++){
            currentCharacter = input.charAt(i);
            if (Character.isUpperCase(currentCharacter)){
                containsUpper = true;
            }
        }
        return
                containsUpper;
    }

}
