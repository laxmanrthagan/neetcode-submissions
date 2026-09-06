

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // 1. Count element frequencies
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // 2. Create frequency buckets (index = frequency)
        // Array of List<Integer> where size is nums.length + 1
        List<Integer>[] buckets = new List[nums.length + 1];
        
        for (int key : countMap.keySet()) {
            int frequency = countMap.get(key);
            if (buckets[frequency] == null) {
                buckets[frequency] = new ArrayList<>();
            }
            buckets[frequency].add(key);
        }

        // 3. Collect top k elements from highest frequency to lowest
        int[] result = new int[k];
        int index = 0;

        for (int i = buckets.length - 1; i >= 0 && index < k; i--) {
            if (buckets[i] != null) {
                for (int num : buckets[i]) {
                    result[index++] = num;
                    if (index == k) {
                        return result;
                    }
                }
            }
        }

        return result;
    }
}

