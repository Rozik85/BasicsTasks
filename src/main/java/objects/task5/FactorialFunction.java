package objects.task5;

public class FactorialFunction {
    public long factorial (int number){
        long result =1;
        if(number>=2){
            result=number*factorial
                    (number-1);
        }
        return result;
    }

}
