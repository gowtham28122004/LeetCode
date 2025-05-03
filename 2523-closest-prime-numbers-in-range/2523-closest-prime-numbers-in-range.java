import java.util.*;

class Solution {
    public int[] closestPrimes(int left, int right) {
        List<Integer> primes = generatePrimes(left, right);
        int minDiff = Integer.MAX_VALUE;
        int[] res = {-1, -1};

        for(int i = 1; i < primes.size(); i++) {
            int diff = primes.get(i) - primes.get(i - 1);
            if(diff < minDiff) {
                minDiff = diff;
                res[0] = primes.get(i - 1);
                res[1] = primes.get(i);
            }
        }

        return res;
    }

    public static List<Integer> generatePrimes(int left, int right) {
        int limit = right + 1;
        boolean[] isPrime = new boolean[limit];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for(int i = 2; i*i < limit; i++) {
            if(isPrime[i]) {
                for(int j = i*i; j < limit; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        List<Integer> result = new ArrayList<>();
        for(int i = Math.max(left, 2); i <= right; i++) {
            if(isPrime[i]) {
                result.add(i);
            }
        }

        return result;
    }
}
