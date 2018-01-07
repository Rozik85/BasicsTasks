package objects.task6;

public class TriangularNumber {
    public int triangular(int number) {
        if (number == 1) {
            return 1;
        } else {
            return (number + triangular(number - 1));
        }
    }
}
