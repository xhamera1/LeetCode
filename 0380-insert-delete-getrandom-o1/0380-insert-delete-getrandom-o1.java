class RandomizedSet {

    private List<Integer> list;
    private Map<Integer, Integer> map; 

    public RandomizedSet() {
        list = new ArrayList<>();
        map = new HashMap<>();
    }
    
    public boolean insert(int val) {
        if (map.containsKey(val)) {
            return false;
        }

        list.add(val);
        map.put(val, 1);
        return true;
        
    }
    
    public boolean remove(int val) {
        if (!map.containsKey(val)) {
            return false;
        }
        map.remove(val);
        list.remove(Integer.valueOf(val));
        return true;
    }
    
    public int getRandom() {
        Random random = new Random();
        return list.get(random.nextInt(0, list.size()));
        
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */