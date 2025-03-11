package basic.string_methods;

public class Main {

    public static void main(String[] args) {
        /*
         * String = a reference data type that can store one or more character
         * reference data types have access to useful methos
         */

         String name = "Gunawan";

         boolean isGunawan = name.equals("gunawan"); // is string equals "gunawan" ?
         boolean isGunawanLowerCase = name.equalsIgnoreCase("gunawan"); // is string equals "gunawan"
         int lengthString = name.length(); // count length string
         char findCharIndex = name.charAt(0); // find character index
         int findIndexCharacter = name.indexOf("w"); // find index character
         boolean isEmpty = name.isEmpty(); // is string empty?
         String uppercase = name.toUpperCase(); // convert to uppercase
         String lowercase = name.toLowerCase(); // convert to lowercase
         String trim = name.trim(); // remove white space
         String replace = name.replace("w", "x"); // replace string

         System.out.println("equals()\t: " + isGunawan);
         System.out.println("equalsIgnoreCase()\t: " + isGunawanLowerCase);
         System.out.println("length()\t: " + lengthString);
         System.out.println("charAt()\t: " + findCharIndex);
         System.out.println("indexOf()\t: " + findIndexCharacter);
         System.out.println("isEmpty()\t: " + isEmpty);
         System.out.println("toUpperCase()\t: " + uppercase);
         System.out.println("toLowerCase()\t: " + lowercase);
         System.out.println("trim()\t: " + trim);
         System.out.println("replace()\t: " + replace);
    }
    
}
