import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

class Solution {
    public List<List<Integer>> getAncestors(int n, int[][] edges) {
        HashMap<Integer, List<Integer>> map=new HashMap<>();
        for (int [] arr:edges)
        {
            if (!map.containsKey(arr[1]))
            {
                map.put(arr[1],new LinkedList<>());
            }
            map.get(arr[1]).add(arr[0]);
        }
        //System.out.println(map.toString());
        List<List<Integer>>res=new LinkedList<>();
        for (int i=0;i<n;i++)
        {
            boolean []visited=new boolean[n];
            List <Integer> temp=new LinkedList<>();
            dfs(i,map,visited,temp);
            Collections.sort(temp);
            res.add(temp);
        }
        return res;
    }
    void dfs(int i,HashMap<Integer,List<Integer>>map,boolean [] visited,List<Integer>temp)
    {
        visited[i]=true;
        //System.out.println(i);
        if (map.containsKey(i))
        {
            for (int node:map.get(i))
            {
                if (!visited[node])
                {
                    temp.add(node);
                    dfs(node,map,visited,temp);
                }
            }
        }
    }
}