class MedianFinder {
    private PriorityQueue<Integer> lowerPart;
    private PriorityQueue<Integer> upperPart;

    public MedianFinder() {
        lowerPart= new PriorityQueue<>(Collections.reverseOrder());
        upperPart= new PriorityQueue<>();
    }
    
    public void addNum(int num) {
        lowerPart.offer(num);
        upperPart.offer(lowerPart.poll());
        if(upperPart.size()>lowerPart.size()){
            lowerPart.offer(upperPart.poll());
        }
    }
    
    public double findMedian() {
        if(lowerPart.size()>upperPart.size()){
            return lowerPart.peek();
        }
        return ((double) lowerPart.peek()+ upperPart.peek())/2.0;
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */