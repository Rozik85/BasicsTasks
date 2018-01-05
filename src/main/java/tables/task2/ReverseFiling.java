package tables.task2;

/**
 * 4.2 Napisz program, który w 10-elementowej tablicy jednowymiarowej
 o nazwie dane umieszcza liczby od 9 do 0 (zobacz
 poniżej reprezentację graficzną tablicy).
 */
public class ReverseFiling {
    public static void main(String[] args) {
        int boardSize =10;
        int dane[] = new int[boardSize];
        for (int i = 0; i < dane.length; i++) {
                dane[i]=boardSize-1-i;
                System.out.println("dane["+i+"]="+dane[i]);
            }
        }
    }

