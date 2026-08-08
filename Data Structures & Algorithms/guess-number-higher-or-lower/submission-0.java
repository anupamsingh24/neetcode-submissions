/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {

        int l = 1, r = n;
        int mid = l + (r - l) / 2;
        int val = guess(mid);
        while (l < r) {
            if (val == 0) return mid;
            if (val == -1) r = mid;
            if (val == 1) l = mid + 1;
            mid = l + (r - l) / 2;
            val = guess(mid);
        }

        return l;
        
    }
}