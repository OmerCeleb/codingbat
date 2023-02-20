package WarmUp_1;

public class max1020 {
    /*

Given 2 positive int values, return the larger value that is in the range 10..20 inclusive,
or return 0 if neither is in that range.


max1020(11, 19) → 19
max1020(19, 11) → 19
max1020(11, 9) → 11

     */

    public int max1020(int a, int b) {

        boolean a_in = (a <= 20) && (a >= 10);
        boolean b_in = (b <= 20) && (b >= 10);
        if (a_in && b_in) {
            return Math.max(a, b);
        } else if (a_in) {
            return a;
        } else if (b_in) {
            return b;
        } else return 0;
    }


}
