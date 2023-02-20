package pwStrength;

public class Strength_Analyzer {

    /*This program analyzes a password strength*/

    public static void password_strength(){

        //Extremely weak
        if (Password_Reader.containsNumbers && !Password_Reader.containsLower //only numbers
                && !Password_Reader.containsUpper
        && !Password_Reader.containsSpecCharacter && Password_Reader.length<=11
            ||
        !Password_Reader.containsNumbers && Password_Reader.containsLower //only lowercase
                && !Password_Reader.containsUpper
                && !Password_Reader.containsSpecCharacter && Password_Reader.length<=8
            ||
        !Password_Reader.containsNumbers && !Password_Reader.containsLower //only uppercase
                && Password_Reader.containsUpper
                        && !Password_Reader.containsSpecCharacter && Password_Reader.length<=8
            ||
        !Password_Reader.containsNumbers && !Password_Reader.containsLower //only spec char
                && !Password_Reader.containsUpper
                        && Password_Reader.containsSpecCharacter && Password_Reader.length<=8
            ||
        !Password_Reader.containsNumbers && Password_Reader.containsLower// lower and upper
                        && Password_Reader.containsUpper
                        && !Password_Reader.containsSpecCharacter && Password_Reader.length<=6
            ||
        Password_Reader.containsNumbers && Password_Reader.containsLower// lower and number
                        && !Password_Reader.containsUpper
                        && !Password_Reader.containsSpecCharacter && Password_Reader.length<=6
            ||
        Password_Reader.containsNumbers && !Password_Reader.containsLower// number and upper
                        && Password_Reader.containsUpper
                        && !Password_Reader.containsSpecCharacter && Password_Reader.length<=6
            ||
        Password_Reader.containsNumbers && !Password_Reader.containsLower// number and spec
                        && !Password_Reader.containsUpper
                        && Password_Reader.containsSpecCharacter && Password_Reader.length<=6
            ||
        Password_Reader.containsNumbers && Password_Reader.containsLower //numbers, lower and upper
                && Password_Reader.containsUpper
                        && !Password_Reader.containsSpecCharacter && Password_Reader.length<=6
            ||
        Password_Reader.containsNumbers && Password_Reader.containsLower //numbers, lower and spec
                        && !Password_Reader.containsUpper
                        && Password_Reader.containsSpecCharacter && Password_Reader.length<=6
            ||
        Password_Reader.containsNumbers && !Password_Reader.containsLower //numbers, spec and upper
                        && Password_Reader.containsUpper
                        && Password_Reader.containsSpecCharacter && Password_Reader.length<=6
            ||
        !Password_Reader.containsNumbers && Password_Reader.containsLower //upper, lower and spec
                        && Password_Reader.containsUpper
                        && Password_Reader.containsSpecCharacter && Password_Reader.length<=6
            ||
        Password_Reader.containsNumbers && Password_Reader.containsLower// all
                && Password_Reader.containsUpper
                        && Password_Reader.containsSpecCharacter && Password_Reader.length<=6)

            System.out.println("Extremely weak");

        //Weak
        else if (Password_Reader.containsNumbers && !Password_Reader.containsLower //only numbers
                && !Password_Reader.containsUpper
                && !Password_Reader.containsSpecCharacter && Password_Reader.length>=12
                ||
                !Password_Reader.containsNumbers && Password_Reader.containsLower //only lowercase
                        && !Password_Reader.containsUpper
                        && !Password_Reader.containsSpecCharacter && Password_Reader.length<=13
                ||
                !Password_Reader.containsNumbers && !Password_Reader.containsLower //only uppercase
                        && Password_Reader.containsUpper
                        && !Password_Reader.containsSpecCharacter && Password_Reader.length<=13
                ||
                !Password_Reader.containsNumbers && !Password_Reader.containsLower //only spec char
                        && !Password_Reader.containsUpper
                        && Password_Reader.containsSpecCharacter && Password_Reader.length<=13
                ||
                !Password_Reader.containsNumbers && Password_Reader.containsLower// lower and upper
                        && Password_Reader.containsUpper
                        && !Password_Reader.containsSpecCharacter && Password_Reader.length<=11
                ||
                Password_Reader.containsNumbers && Password_Reader.containsLower// lower and number
                        && !Password_Reader.containsUpper
                        && !Password_Reader.containsSpecCharacter && Password_Reader.length<=11
                ||
                Password_Reader.containsNumbers && !Password_Reader.containsLower// number and upper
                        && Password_Reader.containsUpper
                        && !Password_Reader.containsSpecCharacter && Password_Reader.length<=11
                ||
                Password_Reader.containsNumbers && !Password_Reader.containsLower// number and spec
                        && !Password_Reader.containsUpper
                        && Password_Reader.containsSpecCharacter && Password_Reader.length<=11
                ||
                Password_Reader.containsNumbers && Password_Reader.containsLower //numbers, lower and upper
                        && Password_Reader.containsUpper
                        && !Password_Reader.containsSpecCharacter && Password_Reader.length<=10
                ||
                Password_Reader.containsNumbers && Password_Reader.containsLower //numbers, lower and spec
                        && !Password_Reader.containsUpper
                        && Password_Reader.containsSpecCharacter && Password_Reader.length<=10
                ||
                Password_Reader.containsNumbers && !Password_Reader.containsLower //numbers, spec and upper
                        && Password_Reader.containsUpper
                        && Password_Reader.containsSpecCharacter && Password_Reader.length<=10
                ||
                !Password_Reader.containsNumbers && Password_Reader.containsLower //upper, lower and spec
                        && Password_Reader.containsUpper
                        && Password_Reader.containsSpecCharacter && Password_Reader.length<=10
                ||
                Password_Reader.containsNumbers && Password_Reader.containsLower// all
                        && Password_Reader.containsUpper
                        && Password_Reader.containsSpecCharacter && Password_Reader.length<=10)

            System.out.println("Weak");

            //Not so strong
        else if (/*Password_Reader.containsNumbers && !Password_Reader.containsLower //only numbers
                && !Password_Reader.containsUpper
                && !Password_Reader.containsSpecCharacter && Password_Reader.length>=12
                ||*/
                !Password_Reader.containsNumbers && Password_Reader.containsLower //only lowercase
                        && !Password_Reader.containsUpper
                        && !Password_Reader.containsSpecCharacter && Password_Reader.length<=17
                ||
                !Password_Reader.containsNumbers && !Password_Reader.containsLower //only uppercase
                        && Password_Reader.containsUpper
                        && !Password_Reader.containsSpecCharacter && Password_Reader.length<=17
                ||
                !Password_Reader.containsNumbers && !Password_Reader.containsLower //only spec char
                        && !Password_Reader.containsUpper
                        && Password_Reader.containsSpecCharacter && Password_Reader.length<=17
                ||
                !Password_Reader.containsNumbers && Password_Reader.containsLower// lower and upper
                        && Password_Reader.containsUpper
                        && !Password_Reader.containsSpecCharacter && Password_Reader.length<=14
                ||
                Password_Reader.containsNumbers && Password_Reader.containsLower// lower and number
                        && !Password_Reader.containsUpper
                        && !Password_Reader.containsSpecCharacter && Password_Reader.length<=14
                ||
                Password_Reader.containsNumbers && !Password_Reader.containsLower// number and upper
                        && Password_Reader.containsUpper
                        && !Password_Reader.containsSpecCharacter && Password_Reader.length<=14
                ||
                Password_Reader.containsNumbers && !Password_Reader.containsLower// number and spec
                        && !Password_Reader.containsUpper
                        && Password_Reader.containsSpecCharacter && Password_Reader.length<=14
                ||
                Password_Reader.containsNumbers && Password_Reader.containsLower //numbers, lower and upper
                        && Password_Reader.containsUpper
                        && !Password_Reader.containsSpecCharacter && Password_Reader.length<=13
                ||
                Password_Reader.containsNumbers && Password_Reader.containsLower //numbers, lower and spec
                        && !Password_Reader.containsUpper
                        && Password_Reader.containsSpecCharacter && Password_Reader.length<=13
                ||
                Password_Reader.containsNumbers && !Password_Reader.containsLower //numbers, spec and upper
                        && Password_Reader.containsUpper
                        && Password_Reader.containsSpecCharacter && Password_Reader.length<=13
                ||
                !Password_Reader.containsNumbers && Password_Reader.containsLower //upper, lower and spec
                        && Password_Reader.containsUpper
                        && Password_Reader.containsSpecCharacter && Password_Reader.length<=13
                ||
                Password_Reader.containsNumbers && Password_Reader.containsLower// all
                        && Password_Reader.containsUpper
                        && Password_Reader.containsSpecCharacter && Password_Reader.length<=12)

            System.out.println("Not so strong");

            //Strong
        else if (/*Password_Reader.containsNumbers && !Password_Reader.containsLower //only numbers
                && !Password_Reader.containsUpper
                && !Password_Reader.containsSpecCharacter && Password_Reader.length>=12
                ||*/
                !Password_Reader.containsNumbers && Password_Reader.containsLower //only lowercase
                        && !Password_Reader.containsUpper
                        && !Password_Reader.containsSpecCharacter && Password_Reader.length>=18
                        ||
                        !Password_Reader.containsNumbers && !Password_Reader.containsLower //only uppercase
                                && Password_Reader.containsUpper
                                && !Password_Reader.containsSpecCharacter && Password_Reader.length>=18
                        ||
                        !Password_Reader.containsNumbers && !Password_Reader.containsLower //only spec char
                                && !Password_Reader.containsUpper
                                && Password_Reader.containsSpecCharacter && Password_Reader.length>=18
                        ||
                        !Password_Reader.containsNumbers && Password_Reader.containsLower// lower and upper
                                && Password_Reader.containsUpper
                                && !Password_Reader.containsSpecCharacter && Password_Reader.length<=17
                        ||
                        Password_Reader.containsNumbers && Password_Reader.containsLower// lower and number
                                && !Password_Reader.containsUpper
                                && !Password_Reader.containsSpecCharacter && Password_Reader.length<=17
                        ||
                        Password_Reader.containsNumbers && !Password_Reader.containsLower// number and upper
                                && Password_Reader.containsUpper
                                && !Password_Reader.containsSpecCharacter && Password_Reader.length<=17
                        ||
                        Password_Reader.containsNumbers && !Password_Reader.containsLower// number and spec
                                && !Password_Reader.containsUpper
                                && Password_Reader.containsSpecCharacter && Password_Reader.length<=17
                        ||
                        Password_Reader.containsNumbers && Password_Reader.containsLower //numbers, lower and upper
                                && Password_Reader.containsUpper
                                && !Password_Reader.containsSpecCharacter && Password_Reader.length<=16
                        ||
                        Password_Reader.containsNumbers && Password_Reader.containsLower //numbers, lower and spec
                                && !Password_Reader.containsUpper
                                && Password_Reader.containsSpecCharacter && Password_Reader.length<=16
                        ||
                        Password_Reader.containsNumbers && !Password_Reader.containsLower //numbers, spec and upper
                                && Password_Reader.containsUpper
                                && Password_Reader.containsSpecCharacter && Password_Reader.length<=16
                        ||
                        !Password_Reader.containsNumbers && Password_Reader.containsLower //upper, lower and spec
                                && Password_Reader.containsUpper
                                && Password_Reader.containsSpecCharacter && Password_Reader.length<=16
                        ||
                        Password_Reader.containsNumbers && Password_Reader.containsLower// all
                                && Password_Reader.containsUpper
                                && Password_Reader.containsSpecCharacter && Password_Reader.length<=15)

            System.out.println("Strong");

            //Super strong
        else if (/*Password_Reader.containsNumbers && !Password_Reader.containsLower //only numbers
                && !Password_Reader.containsUpper
                && !Password_Reader.containsSpecCharacter && Password_Reader.length>=12
                ||
                !Password_Reader.containsNumbers && Password_Reader.containsLower //only lowercase
                        && !Password_Reader.containsUpper
                        && !Password_Reader.containsSpecCharacter && Password_Reader.length>=18
                        ||
                        !Password_Reader.containsNumbers && !Password_Reader.containsLower //only uppercase
                                && Password_Reader.containsUpper
                                && !Password_Reader.containsSpecCharacter && Password_Reader.length>=18
                        ||
                        !Password_Reader.containsNumbers && !Password_Reader.containsLower //only spec char
                                && !Password_Reader.containsUpper
                                && Password_Reader.containsSpecCharacter && Password_Reader.length>=18
                        ||*/
                        !Password_Reader.containsNumbers && Password_Reader.containsLower// lower and upper
                                && Password_Reader.containsUpper
                                && !Password_Reader.containsSpecCharacter && Password_Reader.length>=18
                        ||
                        Password_Reader.containsNumbers && Password_Reader.containsLower// lower and number
                                && !Password_Reader.containsUpper
                                && !Password_Reader.containsSpecCharacter && Password_Reader.length>=18
                        ||
                        Password_Reader.containsNumbers && !Password_Reader.containsLower// number and upper
                                && Password_Reader.containsUpper
                                && !Password_Reader.containsSpecCharacter && Password_Reader.length>=18
                        ||
                        Password_Reader.containsNumbers && !Password_Reader.containsLower// number and spec
                                && !Password_Reader.containsUpper
                                && Password_Reader.containsSpecCharacter && Password_Reader.length>=18
                        ||
                        Password_Reader.containsNumbers && Password_Reader.containsLower //numbers, lower and upper
                                && Password_Reader.containsUpper
                                && !Password_Reader.containsSpecCharacter && Password_Reader.length>=17
                        ||
                        Password_Reader.containsNumbers && Password_Reader.containsLower //numbers, lower and spec
                                && !Password_Reader.containsUpper
                                && Password_Reader.containsSpecCharacter && Password_Reader.length>=17
                        ||
                        Password_Reader.containsNumbers && !Password_Reader.containsLower //numbers, spec and upper
                                && Password_Reader.containsUpper
                                && Password_Reader.containsSpecCharacter && Password_Reader.length>=17
                        ||
                        !Password_Reader.containsNumbers && Password_Reader.containsLower //upper, lower and spec
                                && Password_Reader.containsUpper
                                && Password_Reader.containsSpecCharacter && Password_Reader.length>=17
                        ||
                        Password_Reader.containsNumbers && Password_Reader.containsLower// all
                                && Password_Reader.containsUpper
                                && Password_Reader.containsSpecCharacter && Password_Reader.length>=16)

            System.out.println("Super strong");

    }
}
