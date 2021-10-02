package main;

import java.io.InputStream;
import java.util.Scanner;

public class egglatin {
    private static String egg = "\"egg\"";

    public static void egglatin() {
        InputStream file = egglatin.class.getResourceAsStream("egglatininput");
        Scanner scan = new Scanner(file);
        format(scan.nextLine());
        format(scan.nextLine());
        format(scan.nextLine());
        format(scan.nextLine());
        format(scan.nextLine());
    }

    private static void format (String input) {
        String output = "";
        String search = input.toLowerCase();
        int index = search.indexOf("e");
        // if e is the first character there is no front section to the string
        if (index != 0) {
            output = input.substring(0, index);
        }
        output += egg + (input.substring(index));
        System.out.print(output + " ");
        System.out.print(output + " ");
        System.out.print(output + " \n");
    }
}


//
//
//        if (i <= 3) {
//            System.out.print(word2.substring(0, word2.indexOf("e"))
//                    + egg
//                    + (word2.substring(word2.indexOf("e") + egg.length()) ) );
//            i++;
//        } else {
//            System.lineSeparator();
//            i = 1;
//        }
//
//
//
//        if (i <= 3) {
//            System.out.print(word3.substring(0, word3.indexOf("e"))
//                    + egg
//                    + (word3.substring(word3.indexOf("e") + egg.length()) ) );
//            i++;
//        } else {
//            System.lineSeparator();
//            i = 1;
//        }
//        if (i <= 3) {
//            System.out.print(word4.substring(0, word4.indexOf("e"))
//                    + egg
//                    + (word4.substring(word4.indexOf("e") + egg.length()) ) );
//            i++;
//        } else {
//            System.lineSeparator();
//            i = 1;
//        }
//
//        if (i <= 3) {
//            System.out.print(word5.substring(0, word5.indexOf("e"))
//                    + egg
//                    + (word5.substring(word5.indexOf("e") + egg.length()) ) );
//            i++;
//        } else {
//            System.lineSeparator();
//            i = 1;
//        }