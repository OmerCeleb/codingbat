package String1;

public class right2 {
    /*
    Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start.
    The string length will be at least 2.


    right2("Hello") → "loHel"
    right2("java") → "vaja"
    right2("Hi") → "Hi"
     */

    public String right2(String str) {

        int a = str.length() - 2;
        return (str.substring(a) + str.substring(0, a));
    }


}
