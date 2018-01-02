package iOOperations.task5;

public class Division {
    public static void main(String[] args) {

        int numberOne = 37;
        int numberTwo = 11;

        System.out.println("Liczba całkowita: "+resultDivision(numberOne, numberTwo)+
                " jest wynikiem dzielenia bez reszty dwoch liczb "+numberOne+ " oraz "+numberTwo+".");
    }
    public static int resultDivision (int firstNumber, int secendNumber){
        return firstNumber/secendNumber;
    }
}
