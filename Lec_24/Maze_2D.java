package Lec_24;

public class Maze_2D {
    public static void main(String[] args) {
        // System.out.println("Welcome to Online IDE!! Happy Coding :)");
        // comb(0,0,4,4,3,0,"", new boolean[4][4]);
             int[][] maze =  {{0,1,0,0},
                               {0,0,0,0},
                               {0,1,0,0},
                               {0,0,1,0}};
            ghoom(0,0,maze,"",new boolean[maze.length][maze[0].length]);

    }
   public static void ghoom(int r, int c, int[][] maze,String path, boolean[][]visited){
       
    //   System.out.println(r+","+c);
       if(r==maze.length-1 && c==maze[0].length-1){
           System.out.println(path);
           return;
       }
       if(r<0||c<0||r==maze.length||c==maze[0].length||maze[r][c]==1||visited[r][c]){ //-ve BC
        // if(maze[r][c]==1||r<0||c<0||r==maze.length||c==maze[0].length){ //-ve BC
           return ;
       }
       visited[r][c] = true;
       ghoom(r-1,c,maze,path+"U",visited);
       ghoom(r+1,c,maze,path+"D",visited);
       ghoom(r,c+1,maze,path+"R",visited);
       ghoom(r,c-1,maze,path+"L",visited);
   }
}

