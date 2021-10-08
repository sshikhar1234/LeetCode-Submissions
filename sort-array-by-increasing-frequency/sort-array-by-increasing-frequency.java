class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> dict = new HashMap<Integer,Integer>();
        
        Arrays.stream(nums).forEach(n -> dict.put(n, dict.getOrDefault(n, 0) + 1));
        
        return Arrays.stream(nums).boxed()
            .sorted((a,b) -> dict.get(a) != dict.get(b) ? dict.get(a) - dict.get(b) : b - a)
            .mapToInt(n->n)
            .toArray();
        }
    }