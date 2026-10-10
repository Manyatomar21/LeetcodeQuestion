class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> occurrence= new HashMap<>();
        for(int num:nums){
            occurrence.put(num, occurrence.getOrDefault(num,0)+1);
        }
        List<Integer>[] buckets= new List[nums.length+1];
        for(int num:occurrence.keySet()){
            int value= occurrence.get(num);
            if(buckets[value]==null){
                buckets[value]= new ArrayList<>();
            }
            buckets[value].add(num);
        }
        int[] result= new int[k];
        int index=0;
        for(int value= buckets.length-1; value>=1; value--){
            if(buckets[value]!=null){
                for(int num:buckets[value]){
                    result[index++]=num;
                    if(index==k){
                        return result;
                    }
                }
            }
        }
        return result;
    }
}