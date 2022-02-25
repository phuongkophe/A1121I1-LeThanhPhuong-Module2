package ss2_java_loop.exercise;

public class PrimeNumberLessThen100 {
    public static void main(String[] args) {

        for (int number= 2;number<100;number++){
            boolean isPrime = true;
            for (int i =2;i<number;i++){
                if (number%i==0){
                    isPrime = false;
                }
            }
            if (isPrime){
                System.out.printf(" %d",number);
            }
        }
    }
}

