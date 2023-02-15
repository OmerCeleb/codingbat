package WarmUp_1;

public class delDel {

    /*

Given a string, if the string "del" appears starting at index 1, return a string where that "del"
has been deleted. Otherwise, return the string unchanged.


delDel("adelbc") → "abc"
delDel("adelHello") → "aHello"
delDel("adedbc") → "adedbc"
     */

    public String delDel(String str) {

        if (str.startsWith("del", 1))
            return str.charAt(0) + str.substring(4);
        else
            return str;


    }
}
