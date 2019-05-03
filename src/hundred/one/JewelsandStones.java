package hundred.one;

/**
 * leetcode
 *
 * @author jiage
 * @date 2019/05/02
 */
public class JewelsandStones {
    public static void main(String[] args) {
        System.out.println(numJewelsInStones("aA", "aAAbbbb"));
        System.out.println(best("aA", "aAAbbbb"));
    }

    public static int numJewelsInStones(String J, String S) {
        int result = 0;
        for (int i = 0; i < S.length(); i++) {
            boolean b = J.contains(S.subSequence(i, i + 1));
            if (b) {
                result++;
            }
        }
        return result;
    }

    public static int best(String J, String S) {

        int num = 0;

        for (int i = 0; i < S.length(); i++) {

            if (J.indexOf(S.charAt(i)) >= 0) {
                num++;
            }
        }
        return num;
    }
}
