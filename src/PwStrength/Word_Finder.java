package PwStrength;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Word_Finder {

        /*This program analyzes a string of text to determine if it contains a dictionary words that are
                listed in a dictionary file read by the BufferReader. If the string contains multiple dictionary
                * words, it will pick the longest one*/
       public Word_Finder() throws IOException {

        String inputStr = "nuclearweaponзапальничка".toUpperCase(); //reads the password
        boolean hasWord = false; //shows if the input string contains a dictionary word
        String[] fileWords;
        String wordFound = null;
        int wordFoundLength = 0;
        StringBuilder stringBuilder = new StringBuilder(); //will combine all lines into 1 string

        InputStream inputStreamENG = this.getClass().getClassLoader(). //reads an ENG dictionary text file from the src folder
                getResourceAsStream("ENG_DICT+QWERTY_kbrdAndNum_Sequences.txt");

        InputStream inputStreamCYR = this.getClass().getClassLoader(). //reads an CYR dictionary text file from the src folder
                getResourceAsStream("CYR_DICT+QWERTY_kbrdAndNum_Sequences(CYR).txt");

        assert inputStreamENG != null;
        BufferedReader readerENG = new BufferedReader(new InputStreamReader(inputStreamENG)); //reads an ENG dictionary text file

        assert inputStreamCYR != null;
        BufferedReader readerCYR = new BufferedReader(new InputStreamReader(inputStreamCYR)); //reads a CYR dictionary text file

        String line; //reserved to store the words found in the dictionary file

        while((line = readerENG.readLine())!=null||(line = readerCYR.readLine())!=null){ //reading content from the file
                fileWords = line.split(" "); //splits the words with space
                for(String dictionaryWord : fileWords){
                        if(inputStr.contains(dictionaryWord)&&dictionaryWord.length()>=4){ //checks if the password has
                                hasWord = true;                                            //a dictionary word >=4 chars
                                stringBuilder.append(line).append(" ");
                                wordFound = longestWord(stringBuilder.toString());
                                wordFoundLength = wordFound.length();
                        }
                }
        }
        System.out.println("Contains dictionary word(s): "+hasWord); //shows if the password contains a dictionary word
                System.out.println("The longest word is: "+wordFound);
                System.out.println("The word's length is "+wordFoundLength+" characters");
        }
        public static  String longestWord (String wordString){ //this method searches for the longest word in a string
                String longest = "";
                for(String word: wordString.split(" "))
                        if(word.length()>=longest.length())
                                longest = word;
                return longest;
        }
    }

