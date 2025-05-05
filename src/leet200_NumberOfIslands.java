public class leet200_NumberOfIslands {
    public static void main(String[] args) {

        char[][] grid = {
                {'1', '1', '0', '1', '1'},
                {'0', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'1', '0', '0', '1', '1'}
        };

        System.out.println(numIslands(grid));

    }

    public static int numIslands(char[][] grid) {
        int islands = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    islands++;
                    callBFS(grid, i, j);
                }
            }
        }
        return islands;
    }


    public static void callBFS(char[][] grid, int i, int j) {

        if (j < 0 || i < 0 || i >= grid.length || j >= grid[i].length || grid[i][j] == '0'){
            return;
        }

        grid[i][j] = '0';
        callBFS(grid, i - 1, j);
        callBFS(grid, i + 1, j);
        callBFS(grid, i, j - 1);
        callBFS(grid, i, j + 1);
    }
}
