class Solution {
    public int hIndex(int[] citations) {
        int maxH = 0;
        int len = citations.length;
        List<Integer> list = new ArrayList<>();

        for (int i=0; i<len; i++) {
            list.add(citations[i]);
        }

        Collections.sort(list);
        // Collections.reverse(list);

        System.out.println(list);

        Integer candidate = len;
        for (int i=0; i<len; i++) {
            if (list.get(i) >= candidate) {
                return candidate;
            }
            candidate--;
        }

        return candidate;
        
    }
}