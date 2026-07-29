class MovingAverage {

    List<Integer> list;
    int size;

    public MovingAverage(int size) {
        list = new ArrayList<>(size);
        this.size = size;
    }
    
    public double next(int val) {
        if (list.size() < this.size) {
            list.add(val);
            int sum = list.stream().reduce(0, Integer::sum);
            return  (double)sum / list.size();
        } else {
            list.remove(0);
            list.add(val);
            int sum = list.stream().reduce(0, Integer::sum);
            return (double)sum / this.size;
        }
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */
