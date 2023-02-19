package PasswordGenerator;


import PwStrength.Password_Reader;
import PwStrength.Repeating_Character;
import PwStrength.Strength_Analyzer;
import PwStrength.Word_Finder;

import java.io.IOException;

public class Main {
    public static void main (String[] args) throws IOException {
        //Temporary for test
        //v1
        //new Engine();
        //v2
        /*EngineV2.upper = false;
        EngineV2.lower = true;
        EngineV2.number = true;
        EngineV2.symbol = false;
        EngineV2.generatePassword();*/
        //new ProgramFrame(); //starts the UI

        //v3
        /*EngineV3 passwordGen = new EngineV3.EngineV3Builder()
                .useDigits(true)
                .useLower(true)
                .useUpper(true)
                .usePunctuation(true)
                .build();
        String pw = passwordGen.generate(4);
        System.out.println(pw);*/
        //_______________________________________________
        new Word_Finder(); //starts the Word Finder program
        //new Repeating_Character(); //starts the program that is looking for a repeating characters

        /*new Password_Reader(); // analyzes a strength of a user's password
          System.out.println("password length: " + Password_Reader.length + " character(s)");
          System.out.println("contains special character: " + Password_Reader.containsSpecCharacter);
          System.out.println("contains uppercase letters: " + Password_Reader.containsUpper);
          System.out.println("contains lowercase letters: " + Password_Reader.containsLower);
          System.out.println("contains number: " + Password_Reader.containsNumbers);
          Strength_Analyzer.password_strength();*/



    }
}
