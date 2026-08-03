class Solution {

    public String encode(List<String> strs) {
        String encode = "";
        for (String str : strs) {
            encode += str + "_";
        }
        return encode;

    }

    public List<String> decode(String str) {

        List<String> result = new ArrayList<>();
        if (str.equals("_")) {
            result.add("");
            return result;
        } 
        String[] vals = str.split("_");
        for (String val : vals) result.add(val);
        return result;

    }
}
