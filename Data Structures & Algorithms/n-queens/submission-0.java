class Solution { 
    public List<List<String>> solveNQueens(int n) { 
        char[][] board = new char[n][n]; 
        for(int i = 0; i < n; i++) { 
            for(int j = 0; j < n; j++) { 
                board[i][j] = '.'; 
            } 
        } 
        List<List<String>> result = new ArrayList<>(); 
        int[] upperLeft = new int[2 * n - 1]; 
        int[] bottomLeft = new int[2 * n - 1]; 
        int[] left = new int[n]; 
        
        findPosition(board, result, 0, n, upperLeft, left, bottomLeft); 
        return result; 
    } 

    public static void findPosition(char[][] board, List<List<String>> result, int c, int n, int[] upperLeft, int[] left, int[] bottomLeft) { 
        if(c == n) { 
            // Fix: Construct the list of row strings properly
            List<String> currentSolution = new ArrayList<>(); 
            for(int i = 0; i < n; i++) { 
                currentSolution.add(new String(board[i])); 
            } 
            result.add(currentSolution); 
            return; 
        } 

        for(int r = 0; r < n; r++) { 
            if(left[r] != 1 && upperLeft[n - 1 + c - r] != 1 && bottomLeft[r + c] != 1) { 
                board[r][c] = 'Q'; 
                left[r] = 1; 
                upperLeft[n - 1 + c - r] = 1; 
                bottomLeft[r + c] = 1; 

                findPosition(board, result, c + 1, n, upperLeft, left, bottomLeft); 

                left[r] = 0; 
                upperLeft[n - 1 + c - r] = 0; 
                bottomLeft[r + c] = 0; 
                board[r][c] = '.'; 
            } 
        } 
    } 
}
