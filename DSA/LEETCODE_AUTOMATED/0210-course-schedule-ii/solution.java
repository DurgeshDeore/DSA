class Solution {
    public boolean[] isVisited;
    public boolean[] isParentNode;
    public Stack<Integer> stack;
    public ArrayList<ArrayList<Integer>> graph;

    public boolean isCycle(int node){ // cycle detection
        isVisited[node] = true;
        isParentNode[node] = true;
        for(int neg: graph.get(node)){
            if(!isVisited[neg]){
                if(isCycle(neg)) return true;
            }else if(isParentNode[neg]){
                return true;
            }
        }
        isParentNode[node] = false;
        return false;
    }

    public void dfs(int node){ // topological sort for order off execution
        isVisited[node] = true;
        for(int neg: graph.get(node)){
            if(!isVisited[neg]) dfs(neg);
        }
        stack.push(node);
    }
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        isVisited = new boolean[numCourses];
        isParentNode = new boolean[numCourses];
        stack = new Stack<>();
        graph = new ArrayList<>();

        //create graph
        for(int i=0; i<numCourses; i++) graph.add(new ArrayList<>());

        for(int[] prerequisite: prerequisites){
            graph.get(prerequisite[1]).add(prerequisite[0]);
        }

        // find the cycle 
        for(int i=0; i<numCourses; i++){
            if(!isVisited[i]){
                if(isCycle(i)) return new int[]{};;
            }
        }

        isVisited = new boolean[numCourses]; // reset vis array
        //traaverse
        for(int i=0; i<numCourses; i++){
            if(!isVisited[i]){
                dfs(i);
            }
        }

        int[] res = new int[stack.size()];
        for(int i=0; i<numCourses; i++){
            res[i] = stack.pop();
        }
        return res;
    }
}
