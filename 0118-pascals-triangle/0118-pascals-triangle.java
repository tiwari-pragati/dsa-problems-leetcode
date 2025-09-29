class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        if(numRows <= 0) return res;

        res.add(new ArrayList<>(List.of(1)));
        for(int i = 1; i < numRows; i ++) {
            List<Integer> prev = res.get(res.size() - 1);
            List<Integer> row = new ArrayList<>();
            row.add(1);
            for(int j = 1; j < i; j ++){
                row.add(prev.get(j-1) + prev.get(j));
            }
            row.add(1);
            res.add(row);
        }
        return res;
    }
}