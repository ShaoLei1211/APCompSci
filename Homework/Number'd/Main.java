import java.util.ArrayList;

public class Main {

    public static int maximum_digit = 9;

    public static void main(String[] args) {

        int[]values = {0,1,63,127,255,256};

        for(int i = 0; i<values.length; i++){
            System.out.printf("%3d: (Binary) %s (Octal) %s (Hex) %s\n", i, Binary(i), Octal(i), Hex(i));
        }

    }


    public static String Binary(int input){

        String binary = "";
        ArrayList binary_digit = new ArrayList();

        for (int position = maximum_digit; position > 0; position-- ) {
            int base_value= (int) Math.pow(2, position - 1);
            int binary_converted_value= input/base_value;

            binary_digit.add(binary_converted_value);

            input = input%base_value;
        }

        for(int i = 0; i < maximum_digit; i++){
            binary+=binary_digit.get(i).toString();
        }

        return binary;
    }

    public static String Octal(int input){

        String octal = "";
        ArrayList octal_digits = new ArrayList();

        for (int position = maximum_digit; position > 0; position-- ) {
            int base_value = (int) Math.pow(8, position - 1);
            int octal_converted_value = input/base_value;

            octal_digits.add(octal_converted_value);

            input = input%base_value;
        }

        for(int i = 0; i < maximum_digit; i++){
            octal+=octal_digits.get(i).toString();
        }

        return octal;
    }

    public static String Hex(int input){

        String hex = "";

        ArrayList<String> hexStrings = new ArrayList();
        hexStrings.add("0");
        hexStrings.add("1");
        hexStrings.add("2");
        hexStrings.add("3");
        hexStrings.add("4");
        hexStrings.add("5");
        hexStrings.add("6");
        hexStrings.add("7");
        hexStrings.add("8");
        hexStrings.add("9");
        hexStrings.add("A");
        hexStrings.add("B");
        hexStrings.add("C");
        hexStrings.add("D");
        hexStrings.add("E");
        hexStrings.add("F");
        ArrayList hex_digit = new ArrayList();

        for (int position = maximum_digit; position > 0; position-- ) {
            int base_value = (int) Math.pow(16, position - 1);
            int hex_converted_value = input/base_value;

            hex_digit.add(hexStrings.get(hex_converted_value));

            input = input%base_value;
        }

        for(int i = 0; i < hex_digit.size(); i++){
            hex+=hex_digit.get(i);
        }

        return hex;
    }

    //Extra Credit

    public static String extra_credit(int input, int base){

        String convertedVal = "(Base: " + Integer.toString(base) + ") ";

        if(base>16){
            return convertedVal + "invalid base";
        }

        ArrayList<String> baseStrings = new ArrayList();
        baseStrings.add("0");
        baseStrings.add("1");
        baseStrings.add("2");
        baseStrings.add("3");
        baseStrings.add("4");
        baseStrings.add("5");
        baseStrings.add("6");
        baseStrings.add("7");
        baseStrings.add("8");
        baseStrings.add("9");
        baseStrings.add("A");
        baseStrings.add("B");
        baseStrings.add("C");
        baseStrings.add("D");
        baseStrings.add("E");
        baseStrings.add("F");

        ArrayList digits = new ArrayList();

        for (int position =maximum_digit; position > 0; position-- ) {
            int base_value = (int) Math.pow(base, position - 1);
            int intAtPosition = input/base_value;

            digits.add(baseStrings.get(intAtPosition));

            input = input%base_value;
        }

        for(int i = 0; i < digits.size(); i++){
            convertedVal+=digits.get(i);
        }

        return convertedVal;
    }
}
