//method = in build ds
class Solution
{ 
    static void reverse(Stack<Integer> s)
    {
        ArrayList<Integer> temp = new ArrayList<>();
        while(!s.isEmpty()) temp.add(s.pop());
        for(int ele: temp) s.push(ele);
    }
}
