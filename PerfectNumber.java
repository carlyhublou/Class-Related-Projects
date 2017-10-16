//A perfect number is one that equals the sum of all of its factors. For example,
//6 is a perfect number because 1 + 2 + 3 = 6. There are four perfect numbers
//less than 10,000. Find them.

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
