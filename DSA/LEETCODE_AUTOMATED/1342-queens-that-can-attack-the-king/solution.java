class Solution {
    public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
        List<List<Integer>> res = new ArrayList<>();
        HashSet<ArrayList<Integer>> set = new HashSet<>();
        for(int[] queen: queens) // add queen in set
            set.add(new ArrayList<>(List.of(queen[0], queen[1])));
        // check each direction
        for(int r=king[0]; r>=0; r--){      //up
            ArrayList<Integer> cur = new ArrayList<>(List.of(r, king[1]));
            if(set.contains(cur)){
                res.add(cur);
                break;
            }
        }
        for(int r=king[0]; r<8; r++){      //down
            ArrayList<Integer> cur = new ArrayList<>(List.of(r, king[1]));
            if(set.contains(cur)){
                res.add(cur);
                break;
            }
        }
        for(int c=king[1]; c>=0; c--){      //left
            ArrayList<Integer> cur = new ArrayList<>(List.of(king[0], c));
            if(set.contains(cur)){
                res.add(cur);
                break;
            }
        }
        for(int c=king[1]; c<8; c++){      //right
            ArrayList<Integer> cur = new ArrayList<>(List.of(king[0], c));
            if(set.contains(cur)){
                res.add(cur);
                break;
            }
        }
        // diagonals
        for(int r=king[0], c=king[1]; r>=0 && c>=0; r--, c--){      //up left
            ArrayList<Integer> cur = new ArrayList<>(List.of(r, c));
            if(set.contains(cur)){
                res.add(cur);
                break;
            }
        }
        for(int r=king[0], c=king[1]; r>=0 && c<8; r--, c++){      //up right
            ArrayList<Integer> cur = new ArrayList<>(List.of(r, c));
            if(set.contains(cur)){
                res.add(cur);
                break;
            }
        }
        for(int r=king[0], c=king[1]; r<8 && c>=0; r++, c--){      //bottom left
            ArrayList<Integer> cur = new ArrayList<>(List.of(r, c));
            if(set.contains(cur)){
                res.add(cur);
                break;
            }
        }
        for(int r=king[0], c=king[1]; r<8 && c<8; r++, c++){      //bottom right
            ArrayList<Integer> cur = new ArrayList<>(List.of(r, c));
           if(set.contains(cur)){
                res.add(cur);
                break;
            }
        }
        return res;
    }
}
