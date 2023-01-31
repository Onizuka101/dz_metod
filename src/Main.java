public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        tast1();
        tast2();
        tast3();
    }


    private static boolean definingLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
    private static void tast1() {
        int year = 400;
        if (definingLeapYear(year)) {
            System.out.println(year + "год является високосным");
        } else
        {
            System.out.println(year + "год не является високосным");
        }
    }
    private static void tast2() {
        ocAndYearYou(0,2012);
    }

    private static void ocAndYearYou(int clientOC,int clientDivaesYear) {


        if (clientOC==0) {
            if (clientDivaesYear < 2015)
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            else {
                System.out.println("Установите  версию приложения для iOS по ссылке");
            }
        }
        if (clientOC==1) {
            if (clientDivaesYear < 2015)
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            else {
                System.out.println("Установите  версию приложения для Android по ссылке");
            }
        }
    }
    private static void tast3()
    {
        int deliveryDistance = 21;
        int days = deliveryDays(deliveryDistance) ;
        if (days == -1)
            System.out.println("доставка невозможна на растояние в " + deliveryDistance + "км");
        else {
            System.out.println("доставка займет " + days + "дня");
        }
    }
    public static int deliveryDays(int deliveryDistance) {

        if (deliveryDistance > 0 && 20 >= deliveryDistance) {
            return 1;
        }
        if (deliveryDistance > 20 && 60 >= deliveryDistance) {
            return 2;
        }
        if (deliveryDistance > 60 && 100 >= deliveryDistance) {
            return 3;
        }
            else {
                return -1;
        }
    }

    }
