public class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int n = students.length;
        int idx = 0;

        int res = n;
        for (int sandwich : sandwiches) {
            int cnt = 0;
            while (cnt < n && students[idx] != sandwich) {
                idx++;
                idx %= n;
                cnt++;
            }
            if (students[idx] == sandwich) {
                students[idx] = -1;
                res--;
            } else {
                break;
            }
        }
        return res;
    }
}