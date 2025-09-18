public class FibIteration implements FindFib{
    public int calculate_fib(int number) {
        int num1 = 1;
        int num2 = 1;
        int num3 = 1;
        for(int i = 1; i <= number - 2; i++){
            if(number == 1 || number == 2){
                num3 = 1;
                break;
            }else{
                num3 = (num1 + num2);
                num2 = num1;
                num1 = num3;
            }
        }
        return num3;
    }
}
