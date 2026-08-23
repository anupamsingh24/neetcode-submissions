class Solution {
    public String addBinary(String a, String b) {
        Stack<Character> stackA = new Stack<>();
        Stack<Character> stackB = new Stack<>();

        String result = "";
        for (int i = 0; i < a.length(); i++) {
            stackA.push(a.charAt(i));
        }

        for(int i = 0; i < b.length(); i++) {
            stackB.push(b.charAt(i));
        }
        int carry = 0;
        while(!stackA.isEmpty() && !stackB.isEmpty()) {
            char aa = stackA.pop();
            char bb = stackB.pop();

            int sum = (aa - '0') + (bb - '0') + carry;
            carry = sum / 2;
            sum = sum % 2;

            result += Integer.toString(sum);
        }

        while(!stackA.isEmpty()) {
            char aa = stackA.pop();
            int sum = (aa - '0') + carry;
            carry = sum / 2;
            sum = sum % 2;
            result += Integer.toString(sum);
        }

        while(!stackB.isEmpty()) {
            char aa = stackB.pop();
            int sum = (aa - '0') + carry;
            carry = sum / 2;
            sum = sum % 2;
            result += Integer.toString(sum);
        }

        return new StringBuilder(result).reverse().toString();
        
    }
}