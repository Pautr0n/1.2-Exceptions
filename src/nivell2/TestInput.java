package nivell2;

class TestInput {

    void main() {

        IO.println("Welcome to a data input tester:");
        IO.println(Input.readByte("First of all introduce a Byte data type:"));
        IO.println(Input.readInt("Now introduce an Integer data type:"));
        IO.println(Input.readFloat("Continue by introducing a float data type:"));
        IO.println(Input.readDouble("Now it's double data type time. Introduce a double type value:"));
        IO.println(Input.readChar("Moving forward to Char type. Enter one character and only one:"));
        IO.println(Input.readString("Now introduce a string but uppercase letters aren't valid, just lower case:"));
        IO.println(Input.readYesOrNo("Last but not least, have you enjoyed this program? type 's' (yes) or 'n' (no):"));

    }

}
