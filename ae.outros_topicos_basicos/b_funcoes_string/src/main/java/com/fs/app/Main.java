package main.java.com.fs.app;

public class Main {
    
    public static void main(String[] args) {
        
        String original = "abcde FGHIJ ABC abc DEFG     ";

        String palavras = "potato apple lemon";

        String s01 = original.toLowerCase();
        String s02 = original.toUpperCase();
        String s03 = original.trim();
        String s04 = original.substring(2);
        String s05 = original.substring(2, 9);
        String s06 = original.replace('a', 'x');
        String s07 = original.replace("abc", "xyz");
        int i = original.indexOf("bc");
        int j = original.lastIndexOf("bc");

        String[] vect = palavras.split(" ");

        String p01 = vect[0];
        String p02 = vect[1];
        String p03 = vect[2];

        System.out.println("Original: -" + original + "-");

        System.out.println("toLowerCase: -" + s01 + "-");
        System.out.println("toUpperCase: -" + s02 + "-");
        System.out.println("trim: -" + s03 + "-");
        System.out.println("subString(2): -" + s04 + "-");
        System.out.println("subString(2, 9): -" + s05 + "-");
        System.out.println("replace('a', 'x'): -" + s06 + "-");
        System.out.println("repalce(''abc'', ''xyz''): -" + s07 + "-");
        System.out.println("indexOf(''bc''): " + i);
        System.out.println("lastIndexOf(''bc''): " + j);

        System.out.println("Palvras: " + palavras);

        System.out.println("split('' '') | palvra 1: " + p01);
        System.out.println("split('' '') | palvra 2: " + p02);
        System.out.println("split('' '') | palvra 3: " + p03);

    }
}
