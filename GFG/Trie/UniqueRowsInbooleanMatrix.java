/*Complete the given function*/
class GfG {
    public static class TrieNode{
        TrieNode[] nodes = new TrieNode[2];
        TrieNode(){
            Arrays.fill(this.nodes, null);
        }
    }
    public static TrieNode root;
    
    public static boolean insertTrie(int row[]){
        TrieNode cur = root;
        boolean isNew = false;
        for(int i=0; i<row.length; i++){
            if(cur.nodes[row[i]] == null){
                cur.nodes[row[i]] = new TrieNode();
                isNew = true;
            }
            cur = cur.nodes[row[i]];
        }
        return isNew;
    }
    
    public static ArrayList<ArrayList<Integer>> uniqueRow(int a[][], int r, int c) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        root = new TrieNode();
        
        for(int[] row: a){
            if(insertTrie(row)){
                ArrayList<Integer> lst = new ArrayList<>();
                for(int i: row){
                    lst.add(i);
                }
                res.add(lst);
            }
        }
        return res;
    }
}
