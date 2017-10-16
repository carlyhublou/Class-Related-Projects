package perfectnumber;

public class PerfectNumber {

    public static void main(String[] args) {
        for (int i = 6; i <= 10000; i++) {
            int sum = 0;
            for (int j = i - 1; j >= 1; j--){
                if (i % j == 0)
                    sum += j; 
            }
            if (i == sum)
                System.out.println(i);
        } 
    }
}
