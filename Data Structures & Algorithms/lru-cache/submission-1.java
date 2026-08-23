class LRUCache {

    List<int[]> list;
    int capacity;

    public LRUCache(int capacity) {
        list = new ArrayList<>();
        this.capacity = capacity;
        
    }
    
    public int get(int key) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)[0] == key) {
                int[] temp = list.get(i);
                list.remove(i);
                list.add(temp);
                return temp[1];
            }
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if (list.size() == this.capacity) {
            list.remove(0);
            list.add(new int[]{key, value});
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)[0] == key) {
                int[] temp = list.get(i);
                temp[1] = value;
                list.remove(i);
                list.add(temp);
                return;
            }
        }

        list.add(new int[]{key, value});
    }
}
