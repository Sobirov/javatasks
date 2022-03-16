
import java.util.Random;
//In this task I replaced recursion method getAllNumbersBetween to loop
public class Solution {
    private static int numberA;
    private static int numberB;

    public static String getAllNumbersBetween(int a, int b) {
        StringBuilder str = new StringBuilder();
        if (a > b){
            while(a != b) {
                str.append(a).append(" ");
                a--;
            }
            str.append(a);
        }else {
            while (a != b) {
                str.append(a).append(" ");
                a++;
            }
            str.append(a);
        }
        return str.toString();
    }

    public static void main(String[] args) {
        Random random = new Random();
        numberA = random.nextInt(1000);
        numberB = random.nextInt(1000);
        System.out.println(getAllNumbersBetween(numberA, numberB));
        System.out.println(getAllNumbersBetween(numberB, numberA));
    }
}