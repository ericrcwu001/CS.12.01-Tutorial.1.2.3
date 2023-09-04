import java.util.LinkedList;
import java.util.List;

public class Scramble {
    public static String scrambleWord(String s) {
        int i = 1;
        String nS = "";
        while (i <= s.length()) {
            if (i == s.length()) {
                nS += s.charAt(i-1);
            }
            else if (s.charAt(i-1)=='A' && s.charAt(i) != 'A') {
                nS += "" + s.charAt(i) + s.charAt(i-1);
                i++;
            }
            else {
                nS += s.charAt(i-1);
            }
            i++;
        }
        return nS;
    }
    public static void scrambleOrRemove(List<String> l) {
        int i = 0;
        for (String s : l) {
            String scrambledS = scrambleWord(s);
            if (scrambledS.equals(s)) {
                continue;
            } else {
                l.set(i++, scrambledS);
            }
        }

        int amtToRemove = l.size() - i;
        for (int j = 0; j < amtToRemove; ++j) {
            l.remove(i);
        }
        return;
    }
}
