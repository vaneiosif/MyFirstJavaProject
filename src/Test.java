public class Test {public static void main (String[] args) {

    int a = 5;
    int b = 10;
    int c = 8;
    boolean abc = a>b || c>b || c>a;
    System.out.println(abc);

    boolean bool1 = true;
    boolean bool2 = !bool1;
    boolean bool3 = bool1 && bool2;
    System.out.println(!bool3);
    if (false)
    {System.out.print("a");}
    else if (true)
    {System.out.print("b");}
    else
    {System.out.print("c");};
}
}
