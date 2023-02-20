package WarmUp_1;

public class startOz {

    /*

Given a string, return a string made of the first 2 chars (if present), however include first char only
if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".


startOz("ozymandias") → "oz"
startOz("bzoo") → "z"
startOz("oxx") → "o"
     */

    public String startOz(String str) {

        if (str.length() > 1) {
            String result = "";
            {
                if (str.charAt(0) == 'o') {
                    result = result + "o";
                }
                if (str.charAt(1) == 'z') {
                    result = result + "z";
                }
                return result;
            }
        } else {
            return str;
        }
    }


}
