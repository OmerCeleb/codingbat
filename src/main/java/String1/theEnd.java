package String1;

public class theEnd {
    /*

Given a string, return a string length 1 from its front, unless front is false,
in which case return a string length 1 from its back. The string will be non-empty.


theEnd("Hello", true) → "H"
theEnd("Hello", false) → "o"
theEnd("oh", true) → "o"

     */


    public static String theEnd(String str, boolean front) {

        if (front) {
            return str.substring(0, 1);
        } else if (!front) {
            return str.substring(str.length() - 1);
        }
        return str;

    }


}
