class Solution {
    public int calPoints(String[] operations) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < operations.length; i++) {
            if (!operations[i].contains("+") && !operations[i].contains("C") && !operations[i].contains("D")) {
                list.add(Integer.parseInt(operations[i]));
            } else {
                if (operations[i].equals("+")) {
                    list.add(list.get(list.size() - 1) + list.get(list.size() - 2));
                }
                if (operations[i].equals("C")) {
                    list.remove(list.size() - 1);
                }
                if (operations[i].equals("D")) {
                    int val = list.get(list.size() - 1) * 2;
                    list.add(val);
                }
            }
        }


        int res = 0;
        for (int val : list) res += val;
        return res;
        
    }
}