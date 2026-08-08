class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        Map<Integer, Integer> map = new HashMap<>();

        Stack<Integer> stack = new Stack<>();

        map.put(nums2[nums2.length - 1], -1);
        stack.push(nums2[nums2.length - 1]);

        for (int j = nums2.length -2; j >= 0; j--) {
            int top = stack.peek();
            while (!stack.isEmpty() && top < nums2[j]) {
                top = stack.peek();
                stack.pop();
            }
            if (top > nums2[j]) {
                map.put(nums2[j], top);
            } else {
                map.put(nums2[j], -1);
            }


            stack.push(nums2[j]);
        }

        int[] res = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            res[i] = map.get(nums1[i]);
        }
        return res;
        
    }
}