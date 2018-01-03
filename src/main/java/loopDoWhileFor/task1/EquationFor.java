package loopDoWhileFor.task1;

public class EquationFor {
    public static void main(String[] args) {
        int y;
        System.out.println("Program oblicza równanie y=3*x");
        for (int x = 0; x < 11; x++) {
            System.out.print("Dla x= "+x+"\t");
            y=3*x;
            System.out.println("y= "+y+"\n");

        }
    }
}
