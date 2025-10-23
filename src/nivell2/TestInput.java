package nivell2;

import static nivell2.Input.*;

class TestInput {

    public static void main(String[] args) {

        System.out.println("Welcome to a data input tester:");
        System.out.println(readByte("First of all introduce a Byte data type:"));
        System.out.println(readInt("Now introduce an Integer data type:"));
        System.out.println(readFloat("Continue by introducing a float data type:"));
        System.out.println(readDouble("Now it's double data type time. Introduce a double type value:"));
        System.out.println(readChar("Moving forward to Char type. Enter one character and only one:"));
        System.out.println(readString("Now introduce a string but uppercase letters aren't valid, just lower case:"));
        System.out.println(readYesOrNo("Last but not least, have you enjoyed this program? type 's' (yes) or 'n' (no):"));

    }

}
