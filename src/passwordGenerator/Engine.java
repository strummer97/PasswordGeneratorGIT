package passwordGenerator;

import java.util.Scanner;

public class Engine {
    //Temp scanner
    Scanner in = new Scanner(System.in);
    char[] specialChar = {'!','"','#','$','%','&','\'','(',')','*','+',',','-','.','/'};

    public Engine(){
        System.out.print("Enter password length: ");
        int length = in.nextInt();

        //-------------------------------------------------------
        //Generate a random password
        String randomPassword = "";
        for (int i = 0; i < length; i++){
            //generate 1 random character
            randomPassword = randomPassword + randomCharacter(); //or randomPassword += randomCharacter();
        }
        //Prints random password
        System.out.print(randomPassword);

    }
    public static char randomCharacter(){
        // ! - / = 33-47 in ASCII
        // 0 - 9 = 48-57 in ASCII
        // A - Z = 65-90 in ASCII
        // a - z = 97-122 in ASCII

        //Generate a random number that represents all possible characters
        int rand = (int) (Math.random()*77); //77, 15 special char + 10 digits + 26 uppercase + 26 lowercase

        //Breakup rand into intervals to represent numbers, uppercase letters and lowercase letters
        //rand is between is between 0-61 inclusive
        //if rand is between 0-14 = special char
        //if rand is between 15-24 = number
        //if rand is between 25-50 = uppercase
        //if rand is between 51-76 = lowercase
        if(rand <= 14){
            //spec char
            int ascii = rand + 33;//33-0=33
            return (char)(ascii);

        }else if (rand <= 24){
            int ascii = rand + 33;//48-15=33
            return (char)(ascii);
            //number
        }else if (rand <= 50){
            int ascii = rand + 35;//65-25=35
            return (char)(ascii);
            //uppercase letter

        }else{
            int ascii = rand + 46;//97-51=46
            return (char)(ascii);
            //lowercase letter
        }

    }
}
