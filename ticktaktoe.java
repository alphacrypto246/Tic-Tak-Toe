import java.util.Scanner;
public class tiktaktoe
{
    public static void printGameboard(String gb[][])
    {
        int i, j;
        for(i = 0; i < 5; i++)
        {
            for(j = 0; j < 5; j++)
            {
                System.out.print(gb[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
    
        String signP = "", signC = "";
        int choice = 0, flgP = 0, flgC = 0;
    
        String[][] gameBoard = 
        {
            {"1","|","2","|","3"},
            {"-","+","-","+","-"},
            {"4","|","5","|","6"},
            {"-","+","-","+","-"},
            {"7","|","8","|","9"}
        };
    
        int i, j;
        for(i = 0; i < 5; i++)
        {
            for(j = 0; j < 5; j++)
            {
                System.out.print(gameBoard[i][j]);
            }
            System.out.println();
        }
    
        System.out.println("To selelct: \nEnter 1 for 'X' \nEnter 2 for 'O'");
        choice = in.nextInt();
        System.out.println();
    
        //   For Player
        if(choice == 1)
        {
            signP = "X";
        }
        if(choice == 2)
        {
            signP = "O";
        }
    
        //   For Computer
        if(choice == 1)
        {
            signC = "O";
        }
        if(choice == 2)
        {
            signC = "X";
        }
        while(true)
        {
            while(flgP != 1)
            {
                //   Player's turn
                if(flgP != 1)
                {
                    System.out.println("Your Turn!");
                    choice = in.nextInt();
    
                    flgP = 1;
                    switch(choice)
                    {
                        case 1: if(gameBoard[0][0] == signP || gameBoard[0][0] == signC)
                                {    
                                    System.out.println("Try Again!");
                                    flgP = 0;
                                    continue;
                                }
                                else
                                {
                                    gameBoard[0][0] = signP;
                                }
                        break;
                        case 2: if(gameBoard[0][2] == signP || gameBoard[0][2] == signC)
                                {
                                    System.out.println("Try Again!");
                                    flgP = 0;
                                    continue;
                                }
                                else
                                {
                                    gameBoard[0][2] = signP;
                                }
                        break;
                        case 3: if(gameBoard[0][4] == signP || gameBoard[0][4] == signC)
                                    {
                                        System.out.println("Try Again!");
                                        flgP = 0;
                                        continue;
                                    }
                                    else
                                    {
                                        gameBoard[0][4] = signP;
                                    }
                        break;
                        case 4: if(gameBoard[2][0] == signP || gameBoard[2][0] == signC)
                                {
                                    System.out.println("Try Again!");
                                    flgP = 0;
                                    continue;
                                }
                                else
                                {
                                    gameBoard[2][0] = signP;
                                }
                        break;
                        case 5: if(gameBoard[2][2] == signP || gameBoard[2][2] == signC)
                                {
                                    System.out.println("Try Again!");
                                    flgP = 0;
                                    continue;
                                }
                                else
                                {
                                    gameBoard[2][2] = signP;
                                }
                        break;
                        case 6: if(gameBoard[2][4] == signP || gameBoard[2][4] == signC)
                                {
                                    System.out.println("Try Again!");
                                    flgP = 0;
                                    continue;
                                }
                                else
                                {
                                    gameBoard[2][4] = signP;
                                }
                        break;
                        case 7: if(gameBoard[4][0] == signP || gameBoard[4][0] == signC)
                               {
                                   System.out.println("Try Again!");
                                   flgP = 0;
                                   continue;
                               }
                               else
                               {
                                   gameBoard[4][0] = signP;
                               }
                        break;
                        case 8: if(gameBoard[4][2] == signP || gameBoard[4][2] == signC)
                                {
                                    System.out.println("Try Again!");
                                    flgP = 0;
                                    continue;
                                }
                                else
                                {
                                    gameBoard[4][2] = signP;
                                }
                        break;
                        case 9: if(gameBoard[4][4] == signP || gameBoard[4][4] == signC)
                                {
                                    System.out.println("Try Again!");
                                    flgP = 0;
                                    continue;
                                }
                                else
                                {
                                    gameBoard[4][4] = signP;
                                }
                        break;
                        default: System.out.println("Try Again!");
                                 flgP = 0;
                        continue;
                    }
                    flgC = 0;
                }
            }
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
            //   1, 5, 9
            if(gameBoard[0][0] == signP && gameBoard[2][2] == signP && gameBoard[4][4] == signP)
            {
                printGameboard(gameBoard);
                System.out.println("You Won!");
                break;
            }
            //   3, 5, 7
            if(gameBoard[0][4] == signP && gameBoard[2][2] == signP && gameBoard[4][0] == signP)
            {
                printGameboard(gameBoard);
                System.out.println("You Won!");
                break;
            }
            //   1, 2, 3
            if(gameBoard[0][0] == signP && gameBoard[0][2] == signP && gameBoard[0][4] == signP)
            {
                printGameboard(gameBoard);
                System.out.println("You Won!");
                break;
            }
            //   4, 5, 6
            if(gameBoard[2][0] == signP && gameBoard[2][2] == signP && gameBoard[2][4] == signP)
            {
                printGameboard(gameBoard);
                System.out.println("You Won!");
                break;
            }
            //   7, 8, 9
            if(gameBoard[4][0] == signP && gameBoard[4][2] == signP && gameBoard[4][4] == signP)
            {
                printGameboard(gameBoard);
                System.out.println("You Won!");
                break;
            }
            //   1, 4, 7
            if(gameBoard[0][0] == signP && gameBoard[2][0] == signP && gameBoard[4][0] == signP)
            {
                printGameboard(gameBoard);
                System.out.println("You Won!");
                break;
            }
            //   2, 5, 8
            if(gameBoard[0][2] == signP && gameBoard[2][2] == signP && gameBoard[4][2] == signP)
            {
                printGameboard(gameBoard);
                System.out.println("You Won!");
                break;
            }
            //   3, 6, 9
            if(gameBoard[0][4] == signP && gameBoard[2][4] == signP && gameBoard[4][4] == signP)
            {
                printGameboard(gameBoard);
                System.out.println("You Won!");
                break;
            }     
            
            // System.out.println("Computer's Turn!");
            System.out.println("Computer's Turn!");
            while(flgC != 1)
            {
                //   Computer's turn
                if(flgC != 1)
                {                  
                   int min = 1;
                   int max = 9;
                   
                   choice = (int)Math.floor(Math.random() * (max - min + 1) + min);
                   
                   flgC = 1;
                   switch(choice)
                   {
                       case 1: if(gameBoard[0][0] == signP || gameBoard[0][0] == signC)
                                {    
                                    //System.out.println("Try Again!");
                                    flgC = 0;
                                    continue;
                                }
                                else
                                {
                                    gameBoard[0][0] = signC;
                                    System.out.println(choice);
                                }
                        break;
                        case 2: if(gameBoard[0][2] == signP || gameBoard[0][2] == signC)
                                {
                                    //System.out.println("Try Again!");
                                    flgC = 0;
                                    continue;
                                }
                                else
                                {
                                    gameBoard[0][2] = signC;
                                    System.out.println(choice);
                                }
                        break;
                        case 3: if(gameBoard[0][4] == signP || gameBoard[0][4] == signC)
                                    {
                                        //System.out.println("Try Again!");
                                        flgC = 0;
                                        continue;
                                    }
                                    else
                                    {
                                        gameBoard[0][4] = signC;
                                        System.out.println(choice);
                                    }
                        break;
                        case 4: if(gameBoard[2][0] == signP || gameBoard[2][0] == signC)
                                {
                                    //System.out.println("Try Again!");
                                    flgC = 0;
                                    continue;
                                }
                                else
                                {
                                    gameBoard[2][0] = signC;
                                    System.out.println(choice);
                                }
                        break;
                        case 5: if(gameBoard[2][2] == signP || gameBoard[2][2] == signC)
                                {
                                    //System.out.println("Try Again!");
                                    flgC = 0;
                                    continue;
                                }
                                else
                                {
                                    gameBoard[2][2] = signC;
                                    System.out.println(choice);
                                }
                        break;
                        case 6: if(gameBoard[2][4] == signP || gameBoard[2][4] == signC)
                                {
                                    //System.out.println("Try Again!");
                                    flgC = 0;
                                    continue;
                                }
                                else
                                {
                                    gameBoard[2][4] = signC;
                                    System.out.println(choice);
                                }
                        break;
                        case 7: if(gameBoard[4][0] == signP || gameBoard[4][0] == signC)
                               {
                                   //System.out.println("Try Again!");
                                   flgC = 0;
                                   continue;
                               }
                               else
                               {
                                   gameBoard[4][0] = signC;
                                   System.out.println(choice);
                               }
                        break;
                        case 8: if(gameBoard[4][2] == signP || gameBoard[4][2] == signC)
                                {
                                    //System.out.println("Try Again!");
                                    flgC = 0;
                                    continue;
                                }
                                else
                                {
                                    gameBoard[4][2] = signC;
                                    System.out.println(choice);
                                }
                        break;
                        case 9: if(gameBoard[4][4] == signP || gameBoard[4][4] == signC)
                                {
                                    //System.out.println("Try Again!");
                                    flgC = 0;
                                    continue;
                                }
                                else
                                {
                                    gameBoard[4][4] = signC;
                                    System.out.println(choice);
                                }
                        break;
                        default: flgC = 0;
                        continue;
                   }
                   flgP = 0;
                }    
                
                for(i = 0; i < 5; i++)
                {
                    for(j = 0; j < 5; j++)
                    {
                        System.out.print(gameBoard[i][j]);
                    }
                    System.out.println();
                }  
            }
            //   1, 5, 9
            if(gameBoard[0][0] == signC && gameBoard[2][2] == signC && gameBoard[4][4] == signC)
            {
                System.out.println("Computer Wins!");
                break;
            }
            //   3, 5, 7
            if(gameBoard[0][4] == signC && gameBoard[2][2] == signC && gameBoard[4][0] == signC)
            {
                System.out.println("Computer Wins!");
                break;
            }
            //   1, 2, 3
            if(gameBoard[0][0] == signC && gameBoard[0][2] == signC && gameBoard[0][4] == signC)
            {
                System.out.println("Computer Wins!");
                break;
            }
            //   4, 5, 6
            if(gameBoard[2][0] == signC && gameBoard[2][2] == signC && gameBoard[2][4] == signC)
            {
                System.out.println("Computer Wins!");
                break;
            }
            //   7, 8, 9
            if(gameBoard[4][0] == signC && gameBoard[4][2] == signC && gameBoard[4][4] == signC)
            {
                System.out.println("Computer Wins!");
                break;
            }
            //   1, 4, 7
            if(gameBoard[0][0] == signC && gameBoard[2][0] == signC && gameBoard[4][0] == signC)
            {
                System.out.println("Computer Wins!");
                break;
            }
            //   2, 5, 8
            if(gameBoard[0][2] == signC && gameBoard[2][2] == signC && gameBoard[4][2] == signC)
            {
                System.out.println("Computer Wins!");
                break;
            }
            //   3, 6, 9
            if(gameBoard[0][4] == signC && gameBoard[2][4] == signC && gameBoard[4][4] == signC)
            {
                System.out.println("Computer Wins!");
                break;
            }          
        }
    }
}
