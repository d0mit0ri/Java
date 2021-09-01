public class HomeWorkApp {
    public static void main(String[] args)  {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
        ;

    }
    public static void checkSumSign(){
        int a=11;
        int b=22;
        if(a + b >= 0){
            System.out.println("Сумма положительная");
        }else{
            System.out.println("Сумма отрицательная");
        }

    }
    public static void printColor() {
        int valie = 22;
        if (valie <= 0)
        { System.out.println("Красный");
        }
        if (valie > 0 && valie <= 100)
        { System.out.println("Желтый");
        }
        if (valie > 100)
        { System.out.println("Зеленый");
        };
    }
    public static void compareNumbers() {
        int a = 12;
        int b = -11;
        if (a>=b)
        {
            System.out.println("a >= b");}
        else  {
            System.out.println("a < b");}
    }

}