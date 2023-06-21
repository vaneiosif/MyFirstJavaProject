import java.sql.SQLOutput;

public class JavaMethods {
    public static void main(String[] args) {
        metoda1();
        metoda2(" " + "Cristina");
        metoda3(4, 5);
        metoda3(3, 2);
        metoda4(1, 2, 3);
        int results= sumReturn(5,8);
        System.out.println(results);
        System.out.println(media(5,2,6));;
        String op = "soare";
        String invers = inversulSirului(op);
        System.out.println(invers);  // Output: eraos
        String str = "Hello World";
        int numarVocale = numarulVocalelor(str);
        System.out.println("Numărul de vocale din șir: " + numarVocale);  // Output: 3



        String str2 = "albina";
        String mijloc2 = caractereleMijloc(str2);
        System.out.println(mijloc2);



    }

    private static void metoda1() {
        System.out.println("Hello World");


    }

    private static void metoda2(String nume) {
        System.out.println("Heloo" + nume);
    }

    private static void metoda3(int a, int b) {
        System.out.println(a+b);
    }

    private static void metoda4(int a, int c, int b) {
        System.out.println(a + b + c);}

           private static int sumReturn(int f,  int q){
          return (f+q); }

          private static int media(int m, int s, int u){
          return (m+s+u)/3; }
    public static String inversulSirului(String str) {
        char[] sirCaractere = str.toCharArray();
        int lungime = str.length();

        for (int i = 0; i < lungime / 2; i++) {
            char temp = sirCaractere[i];
            sirCaractere[i] = sirCaractere[lungime - i - 1];
            sirCaractere[lungime - i - 1] = temp;
        }

        return new String(sirCaractere);
    }

    public static int numarulVocalelor(String str) {
        int numarVocale = 0;
        String vocale = "aeiouAEIOU";

        for (int i = 0; i < str.length(); i++) {
            if (vocale.contains(String.valueOf(str.charAt(i)))) {
                numarVocale++;
            }
        }

        return numarVocale;
    }
    public static String caractereleMijloc(String str) {
        int lungime = str.length();
        int mijloc = lungime / 2;

        if (lungime % 2 == 0) {
            // Șirul are o lungime pară, returnăm cei doi caractere din mijloc
            return str.substring(mijloc - 1, mijloc + 1);
        } else {
            // Șirul are o lungime impară, returnăm caracterul din mijloc
            return String.valueOf(str.charAt(mijloc));
        }
    }



}

