package PasswordGenerator;

public class Main {
    public static void main (String[] args){
        //Temporary for test
        //v1
        //new Engine();
        //v2
        /*EngineV2.upper = false;
        EngineV2.lower = true;
        EngineV2.number = true;
        EngineV2.symbol = false;
        EngineV2.generatePassword();*/
        new ProgramFrame();

        //v3
        /*EngineV3 passwordGen = new EngineV3.EngineV3Builder()
                .useDigits(true)
                .useLower(true)
                .useUpper(true)
                .usePunctuation(true)
                .build();
        String pw = passwordGen.generate(4);
        System.out.println(pw);*/



    }
}
