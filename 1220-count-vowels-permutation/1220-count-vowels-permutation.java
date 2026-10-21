
class Solution {
    public int countVowelPermutation(int n) {

        int mod = 1_000_000_007;

       
        long a = 1;
        long e = 1;
        long i = 1;
        long o = 1;
        long u = 1;

       
        for (int len = 2; len <= n; len++) {

            long newA = (e + i + u) % mod;
            long newE = (a + i) % mod;
            long newI = (e + o) % mod;
            long newO = i % mod;
            long newU = (i + o) % mod;

           
            a = newA;
            e = newE;
            i = newI;
            o = newO;
            u = newU;
        }

        return (int) ((a + e + i + o + u) % mod);
    }
}
