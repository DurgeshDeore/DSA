class TrieNode{
    TrieNode[] child;
    String word;
    TrieNode(){
        child = new TrieNode[26];
        word = null;
    }
}
class Solution {
    public int[][] dir = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    List<String> res = new ArrayList<>();
    TrieNode root = new TrieNode();

    public boolean search(char[][] board, String word, boolean[][] isTaken, int r, int c, int i){
        if(i == word.length()) return true;
        if(r<0 || r == board.length || c < 0 ||c == board[0].length || board[r][c] != word.charAt(i) || isTaken[r][c]) return false;
        isTaken[r][c] = true;
        for(int[] d: dir){
            if(search(board, word, isTaken, r+d[0], c+d[1], i+1)) return true;
        }
        isTaken[r][c] = false;
        return false;
    }

    public void search(char[][] board, TrieNode node, int r, int c){
        if(r<0 || r == board.length || c < 0 ||c == board[0].length || board[r][c] == '*') return;
        char ch = board[r][c];
        int indx = board[r][c]-'a';
        
        if(node.child[indx] == null) return;
        node = node.child[indx];

        if(node.word != null){
            res.add(node.word);
            node.word = null;
            // return;
        }
        board[r][c] = '*';
        for(int[] d: dir){
            search(board, node, r+d[0], c+d[1]);
        }
        board[r][c] = ch;
    }
    public List<String> findWords(char[][] board, String[] words) {
        int n = board.length, m = board[0].length;
        // Brute force : Backtracking
        // TLC (63/65)
        // HashSet<String> set = new HashSet<>();
        // List<List<int[]>> pos = new ArrayList<>(26);
        // for (int i = 0; i < 26; i++) pos.add(new ArrayList<>());
        // for(int i=0; i<board.length; i++){
        //     for(int j=0; j<board[0].length; j++){
        //         int indx = board[i][j]-'a';
        //         pos.get(board[i][j]-'a').add(new int[]{i, j});
        //     }
        // }
        // for(String word: words){
        //     boolean flag = false;
        //     int indx = word.charAt(0)-'a';
        //     if(pos.get(indx).size() > 0){
        //         for(int[] curPos: pos.get(indx)){
        //             if(search(board, word, new boolean[n][m], curPos[0], curPos[1], 0)){
        //                 if(!set.contains(word)) res.add(word);
        //                 set.add(word);
        //             }
        //         }
        //     }
        // }

        // Trie
        for(String w: words){
            TrieNode cur = root;
            for(char c: w.toCharArray()){
                if(cur.child[c-'a'] == null) cur.child[c-'a'] = new TrieNode();
                cur = cur.child[c-'a'];
            }
            cur.word = w;
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                search(board, root, i, j);
            }
        }
        return res;
    }
}
