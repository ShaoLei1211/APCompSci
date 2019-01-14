public class Main {
    public static void main(String args[]) {
      Palindrome();
      Civic();
      Rader();
      Level();
      Eva();
      A_Man();
      Mr();
      Never();
      Doc();

    }
    public static void Palindrome(){
        String tester = new String();
        String word = new String();
        word = "Palindrome";
        int n = word.length();
        for (int i = n - 1; i >= 0; i--) // the program will keep running until the last digit is zero
            tester = tester + word.charAt(i);
        {
            if (word.equalsIgnoreCase(tester)) {
                System.out.println("The string is a palindrome.");
            } else {
                System.out.println("The string is not a palindrome.");
            }
        }
    }
    public static void Civic() {
        String tester = new String();
        String word = new String();
        word = "Civic";
        int n = word.length();
        for (int i = n - 1; i >= 0; i--)  // the program will keep running until the last digit is zero
            tester = tester + word.charAt(i);
            {
                if (word.equalsIgnoreCase(tester)) {
                    System.out.println("The string is a palindrome.");
                } else {
                    System.out.println("The string is not a palindrome.");
                }
            }
    }
    public static void Rader() {
        String tester = new String();
        String word = new String();
        word = "Radar";
        int n = word.length();
        for (int i = n - 1; i >= 0; i--)  // the program will keep running until the last digit is zero
            tester = tester + word.charAt(i);
        {
            if (word.equalsIgnoreCase(tester)) {
                System.out.println("The string is a palindrome.");
            } else {
                System.out.println("The string is not a palindrome.");
            }
        }
    }
    public static void Level() {
        String tester = new String();
        String word = new String();
        word = "Level";
        int n = word.length();
        for (int i = n - 1; i >= 0; i--)  // the program will keep running until the last digit is zero
            tester = tester + word.charAt(i);
        {
            if (word.equalsIgnoreCase(tester)) {
                System.out.println("The string is a palindrome.");
            } else {
                System.out.println("The string is not a palindrome.");
            }
        }
    }
    public static void Eva() {
        String tester = new String();
        String word = new String();
        word = "Eva, can I stab bats in a cave?";
        String lettersonly = word.replaceAll("[\\W]", "");
        int n = lettersonly.length();
        for (int i = n - 1; i >= 0; i--)  // the program will keep running until the last digit is zero
            tester = tester + lettersonly.charAt(i);
        {
            if (lettersonly.equalsIgnoreCase(tester)) {
                System.out.println("The string is a palindrome.");
            } else {
                System.out.println("The string is not a palindrome.");
            }
        }
    }
    public static void A_Man() {
        String tester = new String();
        String word = new String();
        word = "A man, a plan, a canal, Panama";
        String lettersonly = word.replaceAll("[\\W]", "");
        int n = lettersonly.length();
        for (int i = n - 1; i >= 0; i--)  // the program will keep running until the last digit is zero
            tester = tester + lettersonly.charAt(i);
        {
            if (lettersonly.equalsIgnoreCase(tester)) {
                System.out.println("The string is a palindrome.");
            } else {
                System.out.println("The string is not a palindrome.");
            }
        }
    }
    public static void Mr() {
        String tester = new String();
        String word = new String();
        word = "Mr. Owl ate my metal worm";
        String lettersonly = word.replaceAll("[\\W]", "");
        int n = lettersonly.length();
        for (int i = n - 1; i >= 0; i--)  // the program will keep running until the last digit is zero
            tester = tester + lettersonly.charAt(i);
        {
            if (lettersonly.equalsIgnoreCase(tester)) {
                System.out.println("The string is a palindrome.");
            } else {
                System.out.println("The string is not a palindrome.");
            }
        }
    }
    public static void Never() {
        String tester = new String();
        String word = new String();
        word = "Never odd or even";
        String lettersonly = word.replaceAll("[\\W]", "");
        int n = lettersonly.length();
        for (int i = n - 1; i >= 0; i--)  // the program will keep running until the last digit is zero
            tester = tester + lettersonly.charAt(i);
        {
            if (lettersonly.equalsIgnoreCase(tester)) {
                System.out.println("The string is a palindrome.");
            } else {
                System.out.println("The string is not a palindrome.");
            }
        }
    }
    public static void Doc() {
        String tester = new String();
        String word = new String();
        word = "Doc, Note: I Dissent. A fast never prevents a fatness. I diet on cod.";
        String lettersonly = word.replaceAll("[\\W]", "");
        int n = lettersonly.length();
        for (int i = n - 1; i >= 0; i--)  // the program will keep running until the last digit is zero
            tester = tester + lettersonly.charAt(i);
        {
            if (lettersonly.equalsIgnoreCase(tester)) {
                System.out.println("The string is a palindrome.");
            } else {
                System.out.println("The string is not a palindrome.");
            }
        }
    }





}
