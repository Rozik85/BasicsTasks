package loopDoWhileFor.task3;

public class EquationWhile {
    public static void main(String[] args) {
        int x=0,y=0;
        System.out.println("Program oblicza wartość funkcji y=3*x dla " +
                "x zmieniającego się od 0 do 10");
        while (x<=10){
            y=3*x;
            System.out.println("x= " + x + "\t" + "y= " + y);
            x++;
        }
    }
}
