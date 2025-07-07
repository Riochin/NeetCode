package java.Graphs;

// Number of Islands
// 🔗https://neetcode.io/problems/count-number-of-islands?list=neetcode150

/*
 * <BFS作戦>
 * 土地を見つけたとき: 
 * 上下左右に隣接する土地があれば、BFS的に訪れて島全体を無にしていく。
 * 
 * ↑繰り返す
 */

import java.util.*;

 class Solution {
    static int M;
    static int N;
    static final int[][] directions = {{1,0}, {-1,0},
                                       {0,1}, {0,-1}}; 

    public int numIslands(char[][] grid) {
        int count = 0;

        M = grid.length;
        N = grid[0].length;

        // m * n のgridに対して、島があったらcount++
        for(int i=0;i<M;i++){
            for(int j=0;j<N;j++){
                // System.out.println(i+" "+ j + "<- i,j");
                if(grid[i][j] == '1'){
                    bfs(grid, i, j);
                    count++;
                    System.out.println("--- 島が一つ消え去りました ---");
                }
            }
        }

        return count;
    }

    // r = 見つけた土地の行row, c = 見つけた時の列column
    public void bfs(char[][] grid, int r, int c){
        Queue<int[]> q = new LinkedList<>(); 

        grid[r][c] = '0';
        q.add(new int[] {r,c});

        while(!q.isEmpty()){
            int[] node = q.poll();
            int row = node[0], col = node[1];

            for(int[] dir: directions){
                int nr = row + dir[0], nc = col + dir[1];
                
                if( nr < M && nc < N &&
                    nr >= 0 && nc >= 0 && grid[nr][nc] == '1'){
                    q.add(new int[]{nr, nc});
                    grid[nr][nc] = '0';
                }
            }
        }
    }
}
