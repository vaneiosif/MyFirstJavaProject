public class Conditii {

    public static void main(String[] args) {

        int ora= 10;
        boolean soare= true;
        if (ora<12){
            if (soare) {
                System.out.println("Buna dimineattaaaa viata mea te astept la o cafea!!!!");
            }

            System.out.println("Buna dimi");

        }

        else if (ora>=12&&ora<18) {
            System.out.println("buna ziua");
        }
            else if (ora>=18&&ora<24) {
                System.out.println("Buna seara");

        }
            else System.out.println("ora inc");
          //switch
           int FlorinSalam= 5;
             switch (FlorinSalam) {
                 case 1:
                     System.out.println("manele");
                     break;

                 case 2:
                     System.out.println("Buna dimineata vtm");
                     break;
                 case 3:
                     System.out.println("VANESSA");
                        break;
                 case 4:
                     System.out.println("orice");
                     break;
                 case 5:
                     System.out.println("vineri");
                     break;
                 case 6:
                     System.out.println("sambata");
                     break;
                 default:
                     System.out.println("bau");
                     break;



             }

             }

    }

