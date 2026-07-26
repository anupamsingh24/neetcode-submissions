class Solution {
    public int evalRPN(String[] tokens) {

        Stack<Integer> operands = new Stack<>();
        
        for (String item : tokens) {
            if (!item.equals("+") && !item.equals("-") && !item.equals("*") && !item.equals("/")) {
                System.out.println(item.equals("+"));
                operands.push(Integer.parseInt(item));
            } else {
                Integer right = operands.pop();
                Integer left = operands.pop();
                if (item.equals("+")) {
                    operands.push(left + right);
                }
                if (item.equals("-")) {
                    operands.push(left - right);
                }
                if (item.equals("*")) {
                    operands.push(left * right);
                }
                if (item.equals("/")) {
                    operands.push(left / right);
                }
            }
        }

        return operands.peek();
        
    }
}
