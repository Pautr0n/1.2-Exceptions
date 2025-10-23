package nivell2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {

    private static final Scanner src = new Scanner(System.in);


    public static byte readByte(String message) {

        while (true) {

            try {
                System.out.println(message);
                byte byteInput;
                byteInput = src.nextByte();
                System.out.println("That's right, this is a byte data type:");
                return byteInput;
            } catch (InputMismatchException e) {
                System.out.println("This is not a bye, please enter a byte:" + e);
                src.nextLine();
            }

        }

    }

    public static int readInt(String message) {

        while (true) {

            try {
                System.out.println(message);
                int intInput;
                intInput = src.nextInt();
                System.out.println("That's right, this is an integer data type:");
                return intInput;
            } catch (InputMismatchException e) {
                System.out.println("This is not a integer, please enter an integer:");
                src.nextLine();
            }

        }

    }

    public static float readFloat(String message) {

        while (true) {

            try {
                System.out.println(message);
                float floatInput;
                floatInput = src.nextFloat();
                System.out.println("That's right, this is a float data type:");
                return floatInput;
            } catch (InputMismatchException e) {
                System.out.println("This is not a float, please enter a float:");
                src.nextLine();
            }

        }

    }

    public static double readDouble(String message) {

        while (true) {

            try {
                System.out.println(message);
                double doubleInput;
                doubleInput = src.nextDouble();
                System.out.println("That's right, this is a double data type:");
                return doubleInput;
            } catch (InputMismatchException e) {
                System.out.println("This's not a double, please enter a double:");
                src.nextLine();
            }

        }

    }

    public static char readChar(String message) {

        while (true) {

            try {
                System.out.println(message);
                String initialInput;
                char charInput;
                initialInput = src.next();
                if (initialInput.length() > 1) {
                    throw new InputException("That's not a single Character, please enter a single Characte.");
                }
                charInput = initialInput.charAt(0);
                return charInput;
            } catch (InputException cie) {
                System.out.println(cie.getMessage());
                src.nextLine();
            }

        }

    }

    public static String readString(String message) {

        while (true) {
            try {
                System.out.println(message);
                String stringInput;
                char ch;
                stringInput = src.next();
                for (int i = 0; i < stringInput.length(); i++) {
                    ch = stringInput.charAt(i);
                    if (Character.isUpperCase(ch)) {
                        throw new InputException("¡¡¡I said no UPPERCASE!!");
                    }
                }
                return stringInput;
            } catch (InputException cie) {
                System.out.println(cie.getMessage());
                src.nextLine();
            }

        }

    }

    public static boolean readYesOrNo(String message) {

        while (true) {

            try {
                System.out.println(message);
                String initialInput;
                char answerInput;
                initialInput = src.next();
                if (initialInput.length() > 1) {
                    throw new InputException("No other input allowed, just 's' or 'n' allowed.");
                }
                answerInput = initialInput.charAt(0);
                answerInput = Character.toLowerCase(answerInput);
                if (answerInput == 's') {
                    return true;
                } else if (answerInput == 'n') {
                    return false;
                }
                throw new InputException("No other input allowed, just 's' or 'n' allowed.");
            } catch (InputException cie) {
                System.out.println(cie.getMessage());
                src.nextLine();
            }

        }

    }

}
