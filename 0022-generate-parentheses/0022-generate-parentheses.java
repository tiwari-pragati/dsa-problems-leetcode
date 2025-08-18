class Solution {
    public void generate(int n, int l, int r, String s, List<String>ans){
        //basecase
        if(r == n){
        ans.add(s);
        return; 
        }
        if(l < n) 
        generate(n,l+1,r,s+"(",ans);
        if(r < l)
        generate(n,l,r+1,s+")",ans);
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        generate(n,0,0,"",ans);
        return ans; 
    }
}