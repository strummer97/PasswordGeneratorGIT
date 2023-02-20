package pwStrength;

import java.util.Locale;

public class Repeating_Character {

    /*This program analyzes if the password contains a repeating character, and how many times the character is
    repeated. If the character is repeating at least 3 times, it will indicate that there is a repeating character.
     */

    static int repeat_count = 0;
    static boolean charIsRepeating = false;

   public Repeating_Character(){
        String str = "abAb1яяuuuuuuuuuuсссb77dr".toLowerCase(Locale.ROOT);
        //System.out.println("Max repeating character is: "+maxRepeating(str));
        maxRepeating(str);
        System.out.println("It is repeated "+repeat_count+" time(s)");
        System.out.println(charIsRepeating);
    }
        static void maxRepeating(String str){
        Repeating_Character repeating_character;
        int str_length = str.length();
        int count = 0;

        char res = str.charAt(0);
        for (int i=0; i<str_length; i++){
            int cur_count = 1;
            for (int j=i+1; j<str_length; j++){
                if (str.charAt(i) != str.charAt(j))
                    break;
                cur_count++;
            }
            if (cur_count > count){
                count = cur_count;
                res = str.charAt(i);
            }
        }
            System.out.println("Max repeated character is: "+res);
            repeat_count = count;
            if (count >= 3)
                charIsRepeating = true;
    }
}
