package nivell2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {

    private static Scanner src = new Scanner(System.in);


    public static byte readByte(String message){

        while(true){

            try{
                IO.println(message);
                byte byteInput;
                byteInput = src.nextByte();
                IO.println("That's right, this is a byte data type:");
                return byteInput;
            }catch (InputMismatchException e){
                IO.println("This is not a bye, please enter a byte:" + e);
                src.nextLine();
            }

        }

    }

    public static int readInt(String message){

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

    public static float readFloat(String message){

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

    public static double readDouble(String message){

        while(true){

            try{
                IO.println(message);
                double doubleInput;
                doubleInput = src.nextDouble();
                IO.println("That's right, this is a double data type:");
                return doubleInput;
            }catch (InputMismatchException e){
                IO.println("This's not a double, please enter a double:");
                src.nextLine();
            }

        }

    }

    public static char readChar(String message) {

        while(true){

            try{
                IO.println(message);
                String initialInput;
                char charInput;
                initialInput = src.next();
                if(initialInput.length()>1){
                    throw new CustomInputException("That's not a single Character, please enter a single Characte.");
                }
                charInput = initialInput.charAt(0);
                return charInput;
            }catch (CustomInputException cie){
                IO.println(cie.getMessage());
                src.nextLine();
            }

        }

    }

    public static String readString(String message){

        while(true){
            try{
                IO.println(message);
                String stringInput;
                char ch;
                stringInput = src.next();
                for(int i=0; i < stringInput.length(); i++){
                    ch = stringInput.charAt(i);
                    if(Character.isUpperCase(ch)){
                        throw new CustomInputException("¡¡¡I said no UPPERCASE!!");
                    }
                }
                return stringInput;
            }catch (CustomInputException cie){
                IO.println(cie.getMessage());
                src.nextLine();
            }

        }

    }

    public static boolean readYesOrNo(String message){

        while(true){

            try{
                boolean answer;
                IO.println(message);
                String initialInput;
                char answerInput;
                initialInput = src.next();
                if(initialInput.length()>1){
                    throw new CustomInputException("No other input allowed, just 's' or 'n' allowed.");
                }
                answerInput = initialInput.charAt(0);
                answerInput = Character.toLowerCase(answerInput);
                if(answerInput == 's'){
                    return answer = true;
                }else if (answerInput == 'n'){
                    return answer = false;
                }
                throw new CustomInputException("No other input allowed, just 's' or 'n' allowed.");
            }catch(CustomInputException cie){
                IO.println(cie.getMessage());
                src.nextLine();
            }

        }

    }

}
