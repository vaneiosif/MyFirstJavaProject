import org.w3c.dom.ls.LSOutput;

public class Loops {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);

        }
        int number[] = {1, 9, 8, 57, 2, 34};
        int max = 0;

        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
            if (number[i] > max) {
                max = number[i];
            }

        }
        System.out.println("max=" + max);

        String students[] = {"Andrei", "Brandusa", "Ionut"};
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);

        }
         try{
        System.out.println(students[3]); }
         catch (Exception  e) {
             System.out.println("Error");

        }
        System.out.println("-------------------");
        for (String S : students) {
            System.out.println(S);
        }

        //while
        int i = 0;
        while (i > 5) {
            System.out.println(i);
            i++;
        }

        do {
            System.out.println(i);
            i++;
        }
        while (i < 10);


    }



        }



