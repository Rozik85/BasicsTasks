package loopDoWhileFor.task8;

/**
 * Napisz program, który korzystając z instrukcji do ... while,
 sumuje liczby całkowite od 1 do 100.
 */
public class SumDoWhile {
    public static void main(String[] args) {
        int a=0;int i =1;
        System.out.println("Program sumuje liczby całkowite od 1 do 100");
        do{
            a=a+i;
            System.out.println(a);
            i++;
        }while(i<=100);
    }
}
