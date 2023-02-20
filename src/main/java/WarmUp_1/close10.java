package WarmUp_1;

public class close10 {

    /*

Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie. Note that Math.abs(n) returns the absolute value of a number.


close10(8, 13) → 8
close10(13, 8) → 8
close10(13, 7) → 0
     */

    public int close10(int a, int b) {

        int dis_a = Math.abs(10 - a);
        int dis_b = Math.abs(10 - b);
        if (dis_b == dis_a) {
            return 0;
        }
        if (dis_a < dis_b) {
            return a;
        } else return b;
    }

}
