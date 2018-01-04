package loopDoWhileFor.task9;

/**
 * Napisz program, który przy wykorzystaniu instrukcji while
 sumuje liczby całkowite od 1 do 100.
 */
public class SumWhile {
    public static void main(String[] args) {
int a=0,i=1;
        System.out.println("Program sumuje liczby całkowite od 1 do 100");
    while (i<=100){
        a+=i;
        System.out.println(a);
        i++;
    }
    }
}
