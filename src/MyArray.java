public class MyArray {
    public static void main(String[] args) {
        int [] numerePare={2,4,6,8};
        System.out.println( numerePare[0]);
        System.out.println(numerePare[3]);

        // pentru fiecare element din array, afiseaza val lui
        for (int i=0; i< numerePare.length;i++) {
        System.out.println(numerePare[i]);}

        String cursanti []= {"Vanessa","Brandusa","Crina"};
        System.out.println(cursanti[1]);
        for (int idx=0; idx< cursanti.length;idx++){
            System.out.println(cursanti[idx] +",");

            System.out.println("\n-------------------");
            double doubleArray[]= {1.5,2.6,7.8,9.0};
            for(int i=1; i< doubleArray.length; i+=2){
                System.out.println(doubleArray[1]);
                
            }

        }

    }
}
