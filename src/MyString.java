import com.sun.jdi.VMCannotBeModifiedException;

public class MyString {

    public static void main (String[] args) {
       String myString = "buna seara";
       System.out.println(myString);
       String nume = "Andrei";
       System.out.println(myString + " " + nume);

       int lungimeanumelui = nume.length();
       System.out.println(lungimeanumelui);

       String numeMic = nume.toLowerCase();
       System.out.println(numeMic);

       String numeMare = nume.toUpperCase();
       System.out.println(numeMare);

       char atreiaLitera = nume.charAt(3);
       System.out.println(atreiaLitera);
//ex3
       String myName = "Vanessa";
       int myStringlength = myName.length();
       System.out.println("myStringlength = " + myStringlength);
       char primaLitera = myName.charAt(0);
       System.out.println("Prima litera din text este:"+primaLitera);

       String film="filmul meu preferat este \" Avatar.\"";
       System.out.println(film);
       boolean continePreferat= film.contains("Preferat");
       System.out.println(continePreferat);

       boolean ultimulCaracter= film.endsWith(".");
       System.out.println(ultimulCaracter);
       String primulcuvant= film.substring(0,6);
       System.out.println(primulcuvant);
        //Ex 1 modul 4

       String text1= "The quick brown fox jumps over the lazy dog.";
               String text2= "This is a good text";
       String text3= "dog";
       String text4= "dog";

       // ex 1
      int length= text1.length();
       System.out.println(length);
       //ex 2
       String lMare =text2.toUpperCase();
       System.out.println(lMare);
        //ex3

       String lMic=text2.toLowerCase();
       System.out.println(lMic);
       //ex4

       boolean contineDog = text1.contains(text3);
       System.out.println(contineDog);

       //ex5

       String replace=text1.replace("o","a");
       System.out.println(replace);

       //ex 6

       boolean terminatieC=text2.endsWith(".");
        System.out.println(terminatieC);

      boolean incepecuT=text1.startsWith("T");
        System.out.println(incepecuT);

         String impreunare= text1.concat(text2);
        System.out.println(impreunare);
        boolean identice= text3.matches(text4);
        System.out.println(identice);
        // ex7,8,9,20 Tema

        int pozitie=text3.indexOf('o');
        System.out.println(pozitie);

        String primelezecelit=text1.substring(0,9);
        System.out.println(primelezecelit);



    }
}
