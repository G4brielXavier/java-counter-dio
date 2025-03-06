package Flow;

import java.security.InvalidParameterException;
import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Type the first param:");
        int paramOne = terminal.nextInt();

        System.out.println("Type the second param:");
        int paramTwo = terminal.nextInt();


        try {
            counter(paramOne, paramTwo);
        }
        catch(InvalidParameterException e)
        {
            System.out.println("The second parameter need to be higher than first parameter");
        }
    }

    static void counter(int paramOne, int paramTwo) throws InvalidParameterException {
        
        if (paramOne > paramTwo)
        {
            throw new InvalidParameterException();
        }        
        
        int counterNumber = paramOne - paramTwo;

        for (int i = 0; i < counterNumber; i++) {
            System.out.println("Printing the number " + i);
        }
        
    }
}
