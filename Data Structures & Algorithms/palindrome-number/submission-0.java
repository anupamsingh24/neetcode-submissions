class Solution {
    public boolean isPalindrome(int x) {

        List<Integer> list = new ArrayList<>();

        int temp = x;
        while (temp != 0) {
            list.add(temp % 10);
            temp = temp / 10;
        }

        if (list.size() == 1 && list.get(0) > 0) return true;
        if (list.size() == 1 && list.get(0) < 0) return false;

        int l = 0;
        int r = list.size() - 1;

        while (l < r) {
            if (list.get(l) != list.get(r)) return false;
            l++;
            r--;
        }

        return true;
        
    }
}