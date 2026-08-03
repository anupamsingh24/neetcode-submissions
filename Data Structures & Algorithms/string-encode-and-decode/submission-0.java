class Solution {

    public String encode(List<String> strs) {
        String encode = "";
        for (String str : strs) {
            encode += str + " ";
        }
        return encode;

    }

    public List<String> decode(String str) {

        List<String> result = new ArrayList<>();
        if (str.equals(" ")) {
            result.add("");
            return result;
        } 
        String[] vals = str.split(" ");
        for (String val : vals) result.add(val);
        return result;

    }
}
