package Support;

import java.util.Scanner;

public class Support {
    public static Integer inputInteger(Scanner scan, String inputText, String errorText){
        int temp = -1;
        System.out.println (inputText);
        boolean error = false;
        try{
            temp = Integer.parseInt (scan.nextLine ());
        }
        catch (NumberFormatException numberFormatException){
            error = true;
        }
        while (error){
            System.out.println (errorText);
            try{
                temp = Integer.parseInt (scan.nextLine ());
                error = false;
            }
            catch (NumberFormatException ignored){
            }
        }
        return temp;
    }
}
