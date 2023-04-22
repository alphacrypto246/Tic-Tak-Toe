import java.util.*;

public class ticktaktoe 
{
    Scanner in = new Scanner(System.in);

    String[][] gameBoard = 
    {
        {"1","|","2","|","3"},
        {"-","+","-","+","-"},
        {"4","|","5","|","6"},
        {"-","+","-","+","-"},
        {"7","|","8","|","9"}
    };

    String userSign, botSign, userMove, botMove;
    boolean win;

    public ticktaktoe()
    {
        userSign = ""; botSign = ""; userMove = ""; botMove = ""; win = false;
    }

    // Prints Game Board
    public void printGameboard()
    {
        int i, j;

        System.out.println();
        for(i = 0; i < gameBoard.length; i++)
        {
            for(j = 0; j < gameBoard.length; j++)
            {
                System.out.print(gameBoard[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    // Sets the Preference whether 'X' or 'O'
    public void setPreference()
    {
        System.out.println("Enter Your Prefernce: 'x' or 'o'");
        userSign = in.next().toUpperCase();

        System.out.println();

        botSign = (userSign.equals("X")) ? "O" : "X";

        System.out.println("User : " + userSign + "\t" + "Bot : " + botSign);
        System.out.println();
    }

    // Gets User Move
    public void getUserMove()
    {
        System.out.println("Enter Your Move: ");
        userMove = Integer.toString(in.nextInt());

        // This code will check whether or not the position is empty or not
        int i, j;

        for(i = 0; i < gameBoard.length; i++)
        {
            for(j = 0; j < gameBoard.length; j++)
            {
                if(userMove.equals(gameBoard[i][j]) && gameBoard[i][j].equals(userSign) || gameBoard[i][j].equals(botSign))
                {
                    System.out.println("Try Again!");
                    getUserMove();
                }
                else
                {
                    i = 7;  // This code will terminate the outer loop
                    break;
                }
            }
        }
    }

    // Generate Moves Automatically for Bot 
    public void getBotMove()
    {
        int min = 1, max = 9;
        
        botMove = Integer.toString((int)Math.floor(Math.random() * (max - min + 1) + min));

        // This code will check whether or not the position is empty or not
        int i, j;

        for(i = 0; i < gameBoard.length; i++)
        {
            for(j = 0; j < gameBoard.length; j++)
            {
                if(botMove.equals(gameBoard[i][j]) && gameBoard[i][j].equals(userSign) || gameBoard[i][j].equals(botSign))
                {
                    getBotMove();
                }
                else
                {
                    System.out.println("Bot's Move: \n" + botMove);
                    i = 7;  // This code will terminate the outer loop
                    break;
                }
            }
        }
    }

    // Sets Move and Places move only if there is no other sign sitting
    public void setMove(String pos, String sign)
    {
        int i, j;

        for(i = 0; i < gameBoard.length; i++)
        {
            for(j = 0; j < gameBoard.length; j++)
            {
                if(pos.equals(gameBoard[i][j]))
                {
                    gameBoard[i][j] = sign;
                }
            }
        }
    }

    // Check for winner
    /**
    *   Winning Conditions are common for both computer and player
    *   The conditions are:
    *       > 1, 5, 9
    *       > 3, 5, 7
    *       
    *       > 1, 2, 3
    *       > 4, 5, 6
    *       > 7, 8, 9
    *       
    *       > 1, 4, 7
    *       > 2, 5, 8
    *       > 3, 6, 9
    */
    public void checkWinner(String sign)
    {
        if(sign.equals(userSign))
        {
            //   1, 5, 9
            if(gameBoard[0][0].equals(userSign) && gameBoard[2][2].equals(userSign) && gameBoard[4][4].equals(userSign))
            {
                System.out.println("User Won!");
                System.exit(0);
            }
            //   3, 5, 7
            if(gameBoard[0][4].equals(userSign) && gameBoard[2][2].equals(userSign) && gameBoard[4][0].equals(userSign))
            {
                System.out.println("User Won!");
                System.exit(0);
            }
            //   1, 2, 3
            if(gameBoard[0][0].equals(userSign) && gameBoard[0][2].equals(userSign) && gameBoard[0][4].equals(userSign))
            {
                System.out.println("User Won!");
                System.exit(0);
            }
            //   4, 5, 6
            if(gameBoard[2][0].equals(userSign) && gameBoard[2][2].equals(userSign) && gameBoard[2][4].equals(userSign))
            {
                System.out.println("User Won!");
                System.exit(0);
            }
            //   7, 8, 9
            if(gameBoard[4][0].equals(userSign) && gameBoard[4][2].equals(userSign) && gameBoard[4][4].equals(userSign))
            {
                System.out.println("User Won!");
                System.exit(0);
            }
            //   1, 4, 7
            if(gameBoard[0][0].equals(userSign) && gameBoard[2][0].equals(userSign) && gameBoard[4][0].equals(userSign))
            {
                System.out.println("User Won!");
                System.exit(0);
            }
            //   2, 5, 8
            if(gameBoard[0][2].equals(userSign) && gameBoard[2][2].equals(userSign) && gameBoard[4][2].equals(userSign))
            {
                System.out.println("User Won!");
                System.exit(0);
            }
            //   3, 6, 9
            if(gameBoard[0][4].equals(userSign) && gameBoard[2][4].equals(userSign) && gameBoard[4][4].equals(userSign))
            {
                System.out.println("User Won!");
                System.exit(0);
            }     
        }
        if(sign.equals(botSign))
        {
            //   1, 5, 9
            if(gameBoard[0][0].equals(botSign) && gameBoard[2][2].equals(botSign) && gameBoard[4][4].equals(botSign))
            {
                System.out.println("Bot Won!");
                System.exit(0);
            }
            //   3, 5, 7
            if(gameBoard[0][4].equals(botSign) && gameBoard[2][2].equals(botSign) && gameBoard[4][0].equals(botSign))
            {
                System.out.println("Bot Won!");
                System.exit(0);
            }
            //   1, 2, 3
            if(gameBoard[0][0].equals(botSign) && gameBoard[0][2].equals(botSign) && gameBoard[0][4].equals(botSign))
            {
                System.out.println("Bot Won!");
                System.exit(0);
            }
            //   4, 5, 6
            if(gameBoard[2][0].equals(botSign) && gameBoard[2][2].equals(botSign) && gameBoard[2][4].equals(botSign))
            {
                System.out.println("Bot Won!");
                System.exit(0);
            }
            //   7, 8, 9
            if(gameBoard[4][0].equals(botSign) && gameBoard[4][2].equals(botSign) && gameBoard[4][4].equals(botSign))
            {
                System.out.println("Bot Won!");
                System.exit(0);
            }
            //   1, 4, 7
            if(gameBoard[0][0].equals(botSign) && gameBoard[2][0].equals(botSign) && gameBoard[4][0].equals(botSign))
            {
                System.out.println("Bot Won!");
                System.exit(0);
            }
            //   2, 5, 8
            if(gameBoard[0][2].equals(botSign) && gameBoard[2][2].equals(botSign) && gameBoard[4][2].equals(botSign))
            {
                System.out.println("Bot Won!");
                System.exit(0);
            }
            //   3, 6, 9
            if(gameBoard[0][4].equals(botSign) && gameBoard[2][4].equals(botSign) && gameBoard[4][4].equals(botSign))
            {
                System.out.println("Bot Won!");
                System.exit(0);
            }
        }
    }
    public void play()
    {
        switch(userSign)
        {
            case "X":   while(win != true)
                        {
                            getUserMove();
                            setMove(userMove, userSign);
                            printGameboard();
                            checkWinner(userSign);
                    
                            getBotMove();
                            setMove(botMove, botSign);
                            printGameboard();     
                            checkWinner(botSign);   
                        }
            break;
            case "O":   while(win != true)
                        {
                            getBotMove();
                            setMove(botMove, botSign);
                            printGameboard();
                            checkWinner(botSign);
                            
                            getUserMove();
                            setMove(userMove, userSign);
                            printGameboard();
                            checkWinner(userSign);
                        }
            break;
        }
    }

    public static void main(String[] args) 
    {
        ticktaktoe game = new ticktaktoe();
        game.printGameboard();
        game.setPreference();
        game.play();
    }
}