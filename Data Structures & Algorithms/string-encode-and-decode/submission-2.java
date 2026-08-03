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
        String[] vals = str.split("_");
        if (vals.length == 0) {
            result.add("");
        }
        System.out.println(vals.length);
        for (String val : vals){
            System.out.println(val);
            if (val.equals(null) || val.isEmpty()) {
                result.add("");
                continue;
            }

            result.add(val);
        } 
        return result;

    }
}
