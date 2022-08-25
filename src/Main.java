public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        for (int i=1; i < 11; i++) {
            System.out.print(i + " ");
        }
       System.out.println("");

        for (int i=10;i >0;i -- ) {
            System.out.print(i + " ");
        } System.out.println(" ");
        // отчёт в пятницу
        int number = 2;
        for (; number < 31; number=number + 7) {
            System.out.println("Сегодня пятница " + number + "-е число." +
                    "необходимо подготовить отчёт ");
        }
        // комета
        int data = 1896;
        System.out.println("Комета пролетит в эти года: ");
        for (; data<2022;data=data +79) {
            System.out.println(data);
        }
        System.out.print(data);
    }


}