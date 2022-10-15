package L001.ARRAYS;

public class Slimak {
    public static void main(String[] args) {
        int[][] board = new int[10][10];
        for(int i = 0; i < 10; i ++){
            for(int j = 0; j < 10; j++){
                board[i][j] = 100;
            }
        }
        int l = 0;
        char direction = 'r';
        int x = 0, y =0;
        boolean posibleMove = true;
        while(posibleMove){
            switch (direction){
                case 'r':
                    if(x+1 == 10){
                        direction = 'd';
                    }else if( board[y][x+1] != 100){
                        direction = 'd';
                    }
                    break;
                case 'd':
                    if(y+1 == 10){
                        direction = 'l';
                    }else if(board[y+1][x] != 100){
                        direction = 'l';
                    }
                    break;
                case 'l':
                    if(x-1 == -1){
                        direction = 'u';
                        //System.out.println("here1");
                    }else if(board[y][x-1] != 100){
                        direction = 'u';
                        //System.out.println(x+ " " +y+"\n"+(x-1)+" "+board[x-1][y]);
                    }
                    break;
                case 'u':
                    if(y-1 == -1){
                        direction = 'r';
                    }else if(board[y-1][x] != 100){
                        direction = 'r';
                    }
                    break;
            }
            board[y][x] = l;
            l++;
            switch (direction){
                case 'r':
                    x++;
                    break;
                case 'd':
                    y++;
                    break;
                case 'l':
                    x--;
                    break;
                case 'u':
                    y--;
                    break;
            }

            if(l==100) {
                posibleMove = false;
            }
        }
        for(int i = 0; i < 10; i ++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(board[i][j] + (j != 9 ? "\t" : "\n"));
            }
        }
    }
}
