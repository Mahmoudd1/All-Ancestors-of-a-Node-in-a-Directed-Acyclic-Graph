import java.util.List;

public class main {
    public static void main(String[] args) {
         int n = 8 ;
        int[][]edgeList ={{0,3},{0,4},{1,3},{2,4},{2,7},{3,5},{3,6},{3,7},{4,6}};
        Solution sol=new Solution();
        List<List<Integer>>ancestors= sol.getAncestors(n,edgeList);
        System.out.println(ancestors);
    }
}
