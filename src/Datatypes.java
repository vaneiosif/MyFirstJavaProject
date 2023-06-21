public class Datatypes {
    public static void main(String[] args) {

        boolean myboolean = true;
        boolean myOtherBoolean = true;
        System.out.println(myboolean & myOtherBoolean);
        System.out.println(myOtherBoolean);

        char myChar = 'A';
        char myOtherChar = '1';
        System.out.println(myChar);
        byte myByte = 1;
        System.out.println(myByte);
        short myShort = 32765;
        System.out.println(myShort);
        int myInt = 35;
        System.out.println(myInt);
        long myLong = 18577448888887655L;
        System.out.println(myLong);
        float myFloat = 5.55f;
        System.out.println(myFloat);
        double myDouble = 1.76758;
        System.out.println(myDouble);
        int number1 = 1;
        double number2 = 2.5;
        number2 = number1;
        System.out.println(number2);// casting de la int la double
        double number3 = 450.5448521;
        number1 = (int) number2;
        System.out.println(number1);// casting de la double la int

        //ex1
        int myNumber = 9;
        float myFloatNumber = 8.99f;
        char myLetter = 'A';
        boolean myBool = false;

        String myText = "Hello";
        String myOthertext = "1a2b3c";

        //ex.2a

        byte myB = 5;
        int myCastb = myB;
        System.out.println("myCastb= " + myCastb);

        //ex2b

        float myF = 5.9f;
        int myCastF = (int) myF;
        System.out.println("myCastf= " + myCastF);
         char charArray []={'a','b','c','d'};
         for (int i=0;i<charArray.length;i++){
             System.out.println(charArray[i]);

        }
    }
}




