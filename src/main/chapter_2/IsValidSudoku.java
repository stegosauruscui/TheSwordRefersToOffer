package main.chapter_2;

/**
 * Created by cuijl on 12/17/16.
 * 该数独可能只填充了部分数字，其中缺少的数字用 . 表示。
 */
public class IsValidSudoku {

    /**
     * 方法一使用笨拙的方法，先判断这个数横线，纵向是否重复，然后判断（00，03，06，30，33，36，60，63，66）这9个宫格里面九个数是否重复
     * @param board
     * @return
     */
    public boolean isValidSudoku(char[][] board){
        for(int i=0; i < board.length; ++i){
            for(int j=0; j< board[i].length; ++j){
                if(board[i][j] != '.'){
                    for(int m=j+1; m<board[i].length; ++m){
                        if(board[i][m] != '.'  && board[i][j] <= '9' && board[i][m]>='0' && board[i][m] <= '9' && board[i][j] == board[i][m]){
                            return false;
                        }
                    }
                    for(int m=i+1; m<board.length; ++m){
                        if(board[m][j] != '.' && board[i][j] <='9' && board[m][j] >='0' && board[m][j] <= '9' && board[i][j] == board[m][j]){
                            return false;
                        }
                    }
                }

                if(i%3==0 && j%3==0){
                    for(int x=i; x<i+3; ++x){
                        for(int y=j; y<j+3; ++y){
                            for(int z=y+1;z<j+3;++z){
                                if (board[x][y] != '.' && board[x][z] != '.' && '0'<= board[x][y] && board[x][y] <= '9' && board[x][z] >='0' && board[x][z] <= '9' && board[x][y] == board[x][z]){
                                    return false;
                                }
                            }
                            for(int m=x+1; m < i+3; ++m){
                                for(int n=j;n<j+3; ++n){
                                    if (board[x][y] != '.' && board[m][n] != '.' && '0'<= board[x][y] && board[x][y] <= '9' && board[m][n] >='0' && board[m][n] <= '9' && board[x][y] == board[m][n]){
                                        return false;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    public boolean isValidSudoku_2(char[][] board){

    }

    public static void main(String[] args){
        IsValidSudoku Sudo = new IsValidSudoku();
        char[][] arr = {
                {'5','3','.', '.','7','.', '1','.','.'},
                {'6','.','.', '1','9','5', '.','.','.'},
                {'.','9','8', '.','.','.', '.','6','.'},

                {'8','.','.', '.','6','.', '.','.','3'},
                {'4','.','.', '8','.','3', '.','.','1'},
                {'7','.','.', '.','2','.', '.','.','6'},

                {'.','6','.', '.','.','.', '2','8','.'},
                {'.','.','.', '4','1','9', '.','.','5'},
                {'.','.','.', '.','8','.', '.','7','9'},
        };
        boolean result =  Sudo.isValidSudoku(arr);
        System.out.println(result);
    }
}
