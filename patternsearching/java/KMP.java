import java.util.List;
import java.util.ArrayList;

public class KMP {
    static void computeLPSArray(String pat, int M, int[] lps) {
        // length of the previous longest prefix suffix
        int len = 0;
        // lps[0] is always 0
        lps[0] = 0;

        // the loop calculates lps[i] for i = 1 to M-1
        int i = 1;
        while (i < M) {
            if (pat.charAt(i) == pat.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            }
            else {
                if (len != 0) {
                    len = lps[len - 1];
                }
                else {
                    lps[i] = len;
                    i++;
                }
            }
        }
    }

    static List<Integer> search(String pat, String txt) {
        int M = pat.length();
        int N = txt.length();

        int[] lps = new int[M];
        List<Integer> res = new ArrayList<>();

        computeLPSArray(pat, M, lps);

        int i = 0; // index for txt[]
        int j = 0; // index for pat[]
        while ((N-i) >= (M-j)) {
            if (pat.charAt(j) == txt.charAt(i)) {
                i++;
                j++;
            }

            if (j == M) {
                res.add(i-j+1);
                j = lps[j-1];
            }
            else if (i < N && pat.charAt(j) != txt.charAt(i)) {
                if (j != 0) {
                    j = lps[j-1];
                }
                else {
                    i++;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String txt = "AABAACAADAABAABA";
        String pat = "AABA";
        List<Integer> res = search(pat, txt);
        for (int i : res) {
            System.out.println("Pattern found at index " + i);
        }
    }
}
