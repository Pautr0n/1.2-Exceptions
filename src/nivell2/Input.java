package nivell2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {

    private static Scanner src = new Scanner(System.in);


    public static byte readByte(String message) throws InputMismatchException {

        while(true){

            try{
                IO.println(message);
                byte byteInput;
                byteInput = src.nextByte();
                IO.println("That's right, this is a byte data type:");
                return byteInput;
            }catch (InputMismatchException e){
                IO.println("This is not a bye, please enter a byte:");
                src.nextLine();
            }

        }

    }

    public static int readInt(String message)throws InputMismatchException {

        while(true){

            try{
                IO.println(message);
                int intInput;
                intInput = src.nextInt();
                IO.println("That's right, this is an integer data type:");
                return intInput;
            }catch (InputMismatchException e){
                IO.println("This is not a integer, please enter an integer:");
                src.nextLine();
            }

        }

    }

    public static float readFloat(String message)throws InputMismatchException {

        while(true){

            try{
                IO.println(message);
                float floatInput;
                floatInput = src.nextFloat();
                IO.println("That's right, this is a float data type:");
                return floatInput;
            }catch (InputMismatchException e){
                IO.println("This is not a float, please enter a float:");
                src.nextLine();
            }

        }

    }

    public static double readDouble(String message)throws InputMismatchException {

        while(true){

            try{
                IO.println(message);
                double doubleInput;
                doubleInput = src.nextDouble();
                IO.println("That's right, this is a double data type:");
                return doubleInput;
            }catch (InputMismatchException e){
                IO.println("This is not a double, please enter a double:");
                src.nextLine();
            }

        }

    }


}
