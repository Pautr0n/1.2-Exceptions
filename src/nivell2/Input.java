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
                IO.println("Age introduced:");
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
                IO.println("DNI Introduced:");
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
                return doubleInput;
            }catch (InputMismatchException e){
                IO.println("This is not a double, please enter a double:");
                src.nextLine();
            }

        }

    }

    public static char readChar(String message){


    }

}
