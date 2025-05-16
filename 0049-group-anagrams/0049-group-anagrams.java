class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> resultList = new ArrayList<>();
        Map<String, List<String>> strMap = new HashMap<>();

        for (int i=0; i<strs.length; i++) {
            String currStr = strs[i];

            char[] charArray = currStr.toCharArray();
            Arrays.sort(charArray);
            String str = new String(charArray);
            if (!strMap.containsKey(str)) {
                List<String> strList = new ArrayList<>();
                strList.add(currStr);
                strMap.put(str, strList);
            }
            else {
                List<String> strList = strMap.get(str);
                strList.add(currStr);
                strMap.replace(str, strList);
            }
        }

        for (List<String> strList : strMap.values()) {
            resultList.add(strList);
        }

        return resultList;
    }

}