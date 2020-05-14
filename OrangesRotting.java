/**
994. Rotting Oranges
In a given grid, each cell can have one of three values:

the value 0 representing an empty cell;
the value 1 representing a fresh orange;
the value 2 representing a rotten orange.
Every minute, any fresh orange that is adjacent (4-directionally) to a rotten orange becomes rotten.

Return the minimum number of minutes that must elapse until no cell has a fresh orange.  If this is impossible, return -1 instead.
*/

class OrangesRotting {
    public int orangesRotting(int[][] grid) {
        //helper array
        int[] x = {0,0,-1,1};
        int[] y = {-1,1,0,0};
        
        Queue<Q> q = new ArrayDeque<>();
        int rLen = grid.length; int cLen = grid[0].length;
        for(int i = 0; i < rLen; i++){
            for(int j = 0; j < cLen; j++){
                if(grid[i][j]==2){
                    q.add(new Q(i,j, 0));
                }
            }
        }
        
        int res = 0;
        while(!q.isEmpty()){
            Q cur = q.poll();
            res = Math.max(res, cur.layer);

            for(int i = 0; i < x.length; i++){
                int r = cur.x + x[i];
                int c = cur.y + y[i];
                if(r >= 0 && c >= 0 && r < rLen && c < cLen && grid[r][c]==1){
                    q.add(new Q(r,c, cur.layer +1));
                    grid[r][c] = 2;
                }  
            }
            
        }
        
        for(int i = 0; i < rLen; i++){
            for(int j = 0; j < cLen; j++){
                if(grid[i][j]==1){
                    return -1;
                }
            }
        }
        return res;  
    }
}


class Q {
    int x; int y; int layer;
    public Q(int x, int y, int layer){
        this.x = x; this.y = y; this.layer = layer;
    }
}
