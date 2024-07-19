import java.util.*;
class GameAlgorithm{
    char board[][]={{'A','B','C'},
                    {'D','E','F'},
                    {'G','H','I'}};
    static int conut=0;
    String Xuser;
    String Ouser;
    public void showBoard()
    {
        System.out.print(board[0][0]+" | "+board[0][1] +" | "+ board[0][2]);
        System.out.println();
        System.err.print(board[1][0]+" | "+board[1][1] +" | "+ board[1][2]);
        System.out.println();
        System.out.print(board[2][0]+" | "+board[2][1] +" | "+ board[2][2]);
        System.out.println();
    }
    public void operationOnTable(char pos, char symbol)
    {
        conut++;
        if(conut==9)
            winChecker();
        char table[][]=board;
            for(int i=0;i<table.length;i++)
            {
                for(int j=0;j<table[i].length;j++)
                {
                    if(table[i][j]==pos)
                        table[i][j]=symbol;
                }
            }
        board=table;
        showBoard();
    }
    public void takeInput(char input,String name)
    {
        char symbol=input;
        Scanner sc=new Scanner(System.in);
        System.out.println(name+" Please enter your position: ");
        char pos=sc.next().toUpperCase().charAt(0);
        if(pos=='X' || pos=='O')
        {
            System.out.println("This are not applicable... Please enter the provided named position to continue the game!!!!");
            takeInput(input, name);
        }
        if(pos=='A' || pos== 'B' || pos=='C' || pos=='D' || pos=='E' || pos=='F' || pos=='G' || pos=='H' || pos=='I')
        {
            operationOnTable(pos,symbol);
        }
        else
        {
             System.out.println("Please enter the valid position not anything else....");
            takeInput(input, name);
        }
    }
    public void decideUser()
    {
        String Xuser;
        String Ouser;
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your name: ");
        System.out.println("Who will choose 'X' as symbol: ");
        Xuser=sc.next();
        System.out.println("Who will choose 'O' as symbol: ");
        Ouser=sc.next();
        Random random=new Random();
        int toss=2;
        int win=random.nextInt(toss);
        if(win==0)
            System.out.println(Xuser+" is Win.");
        else
            System.out.println(Ouser+" is win.");
        GameAlgorithm drawTable=new GameAlgorithm();
        drawTable.moveOfUsers(Xuser,Ouser,win);
    }
    public void moveOfUsers(String user1, String user2, int win)
    {
        Xuser=user1;
        Ouser=user2;
        int firstMove=win;
        if (firstMove==0){
            takeInput('X',Xuser);
            firstMove=1;
            moveOfUsers(Xuser, Ouser, firstMove);
        }
        else{
            takeInput('O',Ouser);
            firstMove=0;
            moveOfUsers(Xuser, Ouser, firstMove);
        }

    }
    //A problem arises---have to sovle.
    public void winChecker()
    {
        if((board[0][0]=='X' && board[1][0]=='X' && board[2][0]=='X') || (board[0][0]=='X' && board[0][1]=='X' && board[0][2]=='X') || (board[0][1]=='X' && board[1][1]=='X' && board[2][1]=='X') || (board[1][0]=='X' && board[1][1]=='X' && board[1][2]=='X') || (board[0][2]=='X' && board[1][2]=='X' && board[2][2]=='X') || (board[2][0]=='X' && board[2][1]=='X' && board[2][2]=='X')){
            System.out.println(Xuser+" won the match");
            System.exit(0);
        }
        else if((board[0][0]=='O' && board[1][0]=='O' && board[2][0]=='O') || (board[0][0]=='O' && board[0][1]=='O' && board[0][2]=='O') || (board[0][1]=='O' && board[1][1]=='O' && board[2][1]=='O') || (board[1][0]=='O' && board[1][1]=='O' && board[1][2]=='O') || (board[0][2]=='O' && board[1][2]=='O' && board[2][2]=='O') || (board[2][0]=='O' && board[2][1]=='O' && board[2][2]=='O')){
            System.out.println(Ouser+" won the match.");
            System.exit(0);
        }
        else{
            System.out.println("draw-match");
            System.exit(0);
        }
    }
}
public class TicTacToe {
    public static void main(String[] args) {
        System.out.println("........LET'S PLAY THE ONE AND ONLY TIC-TAC-TOE GAME.......");
        GameAlgorithm drawTable=new GameAlgorithm();
        drawTable.showBoard();
        drawTable.decideUser();
    }
}