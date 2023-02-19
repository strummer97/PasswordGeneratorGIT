package PasswordGenerator;

import java.security.SecureRandom;
import java.util.Random;

public class  EngineV2 {

  static boolean upper = false;
  static boolean lower = true;
  static boolean number = false;
  static boolean symbol = false;
  static int pwLength = 5;

        public static StringBuilder generatePassword() {
        //Scanner sc = new Scanner(System.in);
        //System.out.print("length: ");
        //int length = sl.getValue();
        //minimum length of 5

        final char[] lowercase = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        final char[] uppercase = "ABCDEFGJKLMNPRSTUVWXYZ".toCharArray();
        final char[] numbers = "0123456789".toCharArray();
        final char[] symbols = "^$?!@#%&".toCharArray();
        final char[] allAllowed = ("abcdefghijklmnopqrstuvwxyz" +               //all allowed
                "ABCDEFGJKLMNPRSTUVWXYZ0123456789^$?!@#%&").toCharArray();
        final char[] allowed1 = "abcdefghijklmnopqrstuvwxyz".toCharArray(); //only lowercase letters
        final char[] allowed2 = "0123456789".toCharArray(); //only digits
        final char[] allowed3 = ("abcdefghijklmnopqrstuvwxyz" +
                "ABCDEFGJKLMNPRSTUVWXYZ").toCharArray(); //only letters + uppercase
        final char[] allowed4 = ("abcdefghijklmnopqrstuvwxyz" +
                "0123456789").toCharArray();             // only lowercase and numbers
        final char[] allowed5 = ("abcdefghijklmnopqrstuvwxyz" +      // only upper + lower + numbers
                "ABCDEFGJKLMNPRSTUVWXYZ0123456789").toCharArray();
        final char[] allowed6 = ("abcdefghijklmnopqrstuvwxyz" +    //only lower and spec
                "^$?!@#%&").toCharArray();
        final char[] allowed7 = ("ABCDEFGJKLMNPRSTUVWXYZ^$?!@#%&").toCharArray(); //only upper and spec
        final char[] allowed8 = ("abcdefghijklmnopqrstuvwxyz" +
                "ABCDEFGJKLMNPRSTUVWXYZ^$?!@#%&").toCharArray(); //only upper, lower and spec
        final char[] allowed9 = ("0123456789^$?!@#%&").toCharArray(); //only num and spec
        final char[] allowed10 = ("0123456789" +   //only upper, num and symb
                "ABCDEFGJKLMNPRSTUVWXYZ^$?!@#%&").toCharArray();
        final char[] allowed11 = ("0123456789" +   //only upper and num
                "ABCDEFGJKLMNPRSTUVWXYZ").toCharArray();
        final char[] allowed12 = ("abcdefghijklmnopqrstuvwxyz0123456789" +   //only lower, num and spec
                    "^$?!@#%&").toCharArray();
//--------------------------------------------------------------------------------------------------------
        //password parameters

        Random random = new SecureRandom();
        StringBuilder password = new StringBuilder();

        //for all allowed
        if (EngineV2.lower && EngineV2.upper && EngineV2.number && EngineV2.symbol) {

            for (int i = 0; i < pwLength - 4; i++) {
                password.append(allAllowed[random.nextInt(allAllowed.length)]);
            }
            //Ensure password policy is met by inserting required random chars in random positions
            password.insert(random.nextInt(password.length()), lowercase[random.nextInt(lowercase.length)]);
            password.insert(random.nextInt(password.length()), uppercase[random.nextInt(uppercase.length)]);
            password.insert(random.nextInt(password.length()), numbers[random.nextInt(numbers.length)]);
            password.insert(random.nextInt(password.length()), symbols[random.nextInt(symbols.length)]);

            //only lowercase letters
        }else if (EngineV2.lower && !EngineV2.upper && !EngineV2.number && !EngineV2.symbol){

            for (int i = 0; i < pwLength - 4; i++) {
                password.append(allowed1[random.nextInt(allowed1.length)]);
            }
            //Ensure password policy is met by inserting required random chars in random positions
            password.insert(random.nextInt(password.length()), lowercase[random.nextInt(lowercase.length)]);
            password.insert(random.nextInt(password.length()), lowercase[random.nextInt(lowercase.length)]);
            password.insert(random.nextInt(password.length()), lowercase[random.nextInt(lowercase.length)]);
            password.insert(random.nextInt(password.length()), lowercase[random.nextInt(lowercase.length)]);

            //only digits
        }else if (!EngineV2.lower && !EngineV2.upper && EngineV2.number && !EngineV2.symbol) {
            for (int i = 0; i < pwLength - 4; i++) {
                password.append(allowed2[random.nextInt(allowed2.length)]);
            }
            password.insert(random.nextInt(password.length()), numbers[random.nextInt(numbers.length)]);
            password.insert(random.nextInt(password.length()), numbers[random.nextInt(numbers.length)]);
            password.insert(random.nextInt(password.length()), numbers[random.nextInt(numbers.length)]);
            password.insert(random.nextInt(password.length()), numbers[random.nextInt(numbers.length)]);

            //only letters + uppercase
        }else if (EngineV2.lower && EngineV2.upper && !EngineV2.number && !EngineV2.symbol) {
            for (int i = 0; i < pwLength - 4; i++) {
                password.append(allowed3[random.nextInt(allowed3.length)]);
            }
            password.insert(random.nextInt(password.length()), lowercase[random.nextInt(lowercase.length)]);
            password.insert(random.nextInt(password.length()), uppercase[random.nextInt(uppercase.length)]);
            password.insert(random.nextInt(password.length()), lowercase[random.nextInt(lowercase.length)]);
            password.insert(random.nextInt(password.length()), uppercase[random.nextInt(uppercase.length)]);


            //only lowercase and numbers
        }else if (EngineV2.lower && !EngineV2.upper && EngineV2.number && !EngineV2.symbol) {
            for (int i = 0; i < pwLength - 4; i++) {
                password.append(allowed4[random.nextInt(allowed4.length)]);
            }
            password.insert(random.nextInt(password.length()), lowercase[random.nextInt(lowercase.length)]);
            password.insert(random.nextInt(password.length()), numbers[random.nextInt(numbers.length)]);
            password.insert(random.nextInt(password.length()), lowercase[random.nextInt(lowercase.length)]);
            password.insert(random.nextInt(password.length()), numbers[random.nextInt(numbers.length)]);

            //only upper + lower + numbers
        }else if (EngineV2.lower && EngineV2.upper && EngineV2.number && !EngineV2.symbol) {
            for (int i = 0; i < pwLength - 4; i++) {
                password.append(allowed5[random.nextInt(allowed5.length)]);
            }
            password.insert(random.nextInt(password.length()), lowercase[random.nextInt(lowercase.length)]);
            password.insert(random.nextInt(password.length()), lowercase[random.nextInt(lowercase.length)]);
            password.insert(random.nextInt(password.length()), uppercase[random.nextInt(uppercase.length)]);
            password.insert(random.nextInt(password.length()), numbers[random.nextInt(numbers.length)]);

            //only lower and spec
        }else if (EngineV2.lower && !EngineV2.upper && !EngineV2.number && EngineV2.symbol) {
            for (int i = 0; i < pwLength - 4; i++) {
                password.append(allowed6[random.nextInt(allowed6.length)]);
            }
            password.insert(random.nextInt(password.length()), lowercase[random.nextInt(lowercase.length)]);
            password.insert(random.nextInt(password.length()), symbols[random.nextInt(symbols.length)]);
            password.insert(random.nextInt(password.length()), lowercase[random.nextInt(lowercase.length)]);
            password.insert(random.nextInt(password.length()), symbols[random.nextInt(symbols.length)]);

            //only upper and spec
        }else if (!EngineV2.lower && EngineV2.upper && !EngineV2.number && EngineV2.symbol) {
            for (int i = 0; i < pwLength - 4; i++) {
                password.append(allowed7[random.nextInt(allowed7.length)]);
            }
            password.insert(random.nextInt(password.length()), uppercase[random.nextInt(uppercase.length)]);
            password.insert(random.nextInt(password.length()), symbols[random.nextInt(symbols.length)]);
            password.insert(random.nextInt(password.length()), uppercase[random.nextInt(uppercase.length)]);
            password.insert(random.nextInt(password.length()), symbols[random.nextInt(symbols.length)]);

            //only upper, lower and spec
        }else if (EngineV2.lower && EngineV2.upper && !EngineV2.number && EngineV2.symbol) {
            for (int i = 0; i < pwLength - 4; i++) {
                password.append(allowed8[random.nextInt(allowed8.length)]);
            }
            password.insert(random.nextInt(password.length()), uppercase[random.nextInt(uppercase.length)]);
            password.insert(random.nextInt(password.length()), lowercase[random.nextInt(lowercase.length)]);
            password.insert(random.nextInt(password.length()), symbols[random.nextInt(symbols.length)]);
            password.insert(random.nextInt(password.length()), lowercase[random.nextInt(lowercase.length)]);

            //only num and spec
        }else if (!EngineV2.lower && !EngineV2.upper && EngineV2.number && EngineV2.symbol) {
            for (int i = 0; i < pwLength - 4; i++) {
                password.append(allowed9[random.nextInt(allowed9.length)]);
            }
            password.insert(random.nextInt(password.length()), symbols[random.nextInt(symbols.length)]);
            password.insert(random.nextInt(password.length()), numbers[random.nextInt(numbers.length)]);
            password.insert(random.nextInt(password.length()), symbols[random.nextInt(symbols.length)]);
            password.insert(random.nextInt(password.length()), numbers[random.nextInt(numbers.length)]);

            //only upper, num and symb
        }else if (!EngineV2.lower && EngineV2.upper && EngineV2.number && EngineV2.symbol) {
            for (int i = 0; i < pwLength - 4; i++) {
                password.append(allowed10[random.nextInt(allowed10.length)]);
            }
            password.insert(random.nextInt(password.length()), uppercase[random.nextInt(uppercase.length)]);
            password.insert(random.nextInt(password.length()), numbers[random.nextInt(numbers.length)]);
            password.insert(random.nextInt(password.length()), symbols[random.nextInt(symbols.length)]);
            password.insert(random.nextInt(password.length()), numbers[random.nextInt(numbers.length)]);

            //only upper and num
        }else if (!EngineV2.lower && EngineV2.upper && EngineV2.number && !EngineV2.symbol) {
            for (int i = 0; i < pwLength - 4; i++) {
                password.append(allowed11[random.nextInt(allowed11.length)]);
            }
            password.insert(random.nextInt(password.length()), uppercase[random.nextInt(uppercase.length)]);
            password.insert(random.nextInt(password.length()), uppercase[random.nextInt(uppercase.length)]);
            password.insert(random.nextInt(password.length()), numbers[random.nextInt(numbers.length)]);
            password.insert(random.nextInt(password.length()), numbers[random.nextInt(numbers.length)]);

            //only lower, num and spec
        }else if (EngineV2.lower && !EngineV2.upper && EngineV2.number && EngineV2.symbol) {
            for (int i = 0; i < pwLength - 4; i++) {
                password.append(allowed12[random.nextInt(allowed12.length)]);
            }
            password.insert(random.nextInt(password.length()), lowercase[random.nextInt(lowercase.length)]);
            password.insert(random.nextInt(password.length()), numbers[random.nextInt(numbers.length)]);
            password.insert(random.nextInt(password.length()), numbers[random.nextInt(numbers.length)]);
            password.insert(random.nextInt(password.length()), symbols[random.nextInt(symbols.length)]);
        }
        //-------------------------------------------------------------------------------
        //System.out.println(password);
            return password;


    }

}



