//    Michael Wells
//    EN.605.201.83.SU19
//    Mini Project 2
//    07/28/19
//


import java.util.Scanner;

public class BlackjackGameSimulator
{
  public static void main( String [] args )
  {
    Scanner input = new Scanner(System.in);

    int startMoney = 10;
    int startWager = 1;
    int dealerInit = 1;
    int round = 1;
    boolean validBet = false;


    Player player1 = new Player(startMoney, startWager);
    Dealer dealer = new Dealer();


    // Header
    System.out.println("********************************");
    System.out.println("********************************");
    System.out.println("**** Welcome to Casino Java ****");
    System.out.println("********************************");
    System.out.println("********************************");
    System.out.println("");
    System.out.println("");
    System.out.println("");
    System.out.println("--------  Black Jack  ---------");
    System.out.println("");

    // Loop for each round
    while(round != 0){

        // Print Player Money
        player1.getMoneyString();

        //Promt User to bet
        System.out.print("Enter your bet(only whole $) or Enter 0 to walk away:");
        int bet = input.nextInt();

        // Handle Bet
        if(bet == 0){
          round = 0;
          System.out.println("...Walking Away...");
          player1.getMoneyString();
        } else{
          validBet = player1.allowWager(bet);
          if(validBet){
            int gameResult = 0;
            while(gameResult == 0){


              // Game Play
              System.out.println("");

              boolean playerResult = false;
              boolean dealerResult = false;
              boolean catch17 = false;


              // Dealing Cards

              // Player1
              player1.setWager(bet);                    // Set the Wager

              String playedCard = dealer.drawCard();    // Deal card
              player1.addCard(playedCard);              // Give Card to player1
              playedCard = dealer.drawCard();           // Deal Card
              player1.addCard(playedCard);              // Give Card to player1
              player1.setScore();                       // Calculate your score

              // Dealer
              playedCard = dealer.drawCard();           // Deal Card
              dealer.addCard(playedCard);               // Dealer keeps card
              playedCard = dealer.drawCard();           // Deal Card
              dealer.addCard(playedCard);               // Dealer keeps card
              dealer.setScore();                        // Calculate Dealer score


              // Check for 21
              playerResult = player1.catch21();
              dealerResult = dealer.catch21();

              if(playerResult == true | dealerResult == true){
                gameResult = 1;
                break;
              }



              // Showing UI

              System.out.println("Dealer Hand:");
              dealer.showFirstCard();                   // Show Dealer cards
              int dealerScore = dealer.getScore();      // Get Score

              System.out.println("Dealer Score:" + dealerScore);


              System.out.println("Your Hand:");
              player1.showCards();                      // Show your cards
              int playerScore = player1.getScore();     // Get Score

              System.out.println("\nYour Score:"+ playerScore); // Show Score



              // Player choices


              int choices = 1;
              String hit = "hit";
              String stay = "stay";

              while(choices != 0){
                System.out.print("hit or stay??:");
                String choice = input.next();
                if(choice.equalsIgnoreCase(hit)){
                  System.out.println("");
                  System.out.println("");

                  playedCard = dealer.drawCard();           // Deal Card
                  player1.addCard(playedCard);              // Give Card to player1
                  player1.setScore();                       // Calculate your score


                  // Check for 21
                  playerResult = player1.catch21();

                  if(playerResult == true){
                    gameResult = 1;
                    break;
                  }

                  playerResult = player1.catchBust();
                  if(playerResult == true){
                    gameResult = 1;
                    break;
                  }





                  // Showing UI

                  System.out.println("Dealer Hand:");
                  dealer.showFirstCard();                   // Show Dealer cards
                  dealerScore = dealer.getScore();          // Get Score


                  System.out.println("Your Hand:");
                  player1.showCards();                      // Show your cards
                  playerScore = player1.getScore();               // Get Score

                  System.out.println("\nYour Score:"+ playerScore); // Show Score




                } else if(choice.equalsIgnoreCase(stay)){


                  int dealerPlay = 0;

                  while(dealerPlay == 0){
                    dealerScore = dealer.getScore();
                    playerScore = player1.getScore();

                    // Check if the dealer is winning
                    if(dealerScore > playerScore){
                      dealerPlay = 1;
                      break;
                    }

                    // Check if the dealer had busted
                    dealerResult = dealer.catchBust();
                    if(dealerResult == true){
                      dealerPlay = 1;
                      break;
                    }

                    // Check if the dealer has more than 17
                    dealerResult = dealer.catch17();
                    if(dealerResult == true){
                      dealerPlay = 1;
                      break;
                    }

                    // Dealer
                    playedCard = dealer.drawCard();           // Deal Card
                    dealer.addCard(playedCard);               // Dealer keeps card
                    dealer.setScore();                        // Calculate Dealer score


                    // Showing UI

                    System.out.println("Dealer Hand:");
                    dealer.showCards();                       // Show Dealer cards
                    dealerScore = dealer.getScore();          // Get Score

                    System.out.println("Dealer Score:" + dealerScore);


                    System.out.println("Your Hand:");
                    player1.showCards();                      // Show your cards
                    playerScore = player1.getScore();               // Get Score

                    System.out.println("\nYour Score:"+ playerScore); // Show Score





                  }

                  choices = 0;
                  gameResult = 1;
                  break;
                } else{
                  System.out.println("Invalid... Please enter hit or stay...");
                }

              }


            }


            // Handle End game
            System.out.println("\n\n");
            System.out.println("END OF GAME");


            // Showing UI
            System.out.println("");
            System.out.println("Dealer Hand:");
            dealer.showCards();                       // Show Dealer cards
            int dealerScore = dealer.getScore();          // Get Score

            System.out.println("Dealer Score:" + dealerScore);


            System.out.println("Your Hand:");
            player1.showCards();                      // Show your cards
            int playerScore = player1.getScore();               // Get Score

            System.out.println("\nYour Score:"+ playerScore); // Show Score
            System.out.println("\n\n");




            // !!!!!! Need to finish !!!!!!
            // Handle Outcome
            if(playerScore > dealerScore){
              System.out.print("You win!!!")

            } else if(playerScore < dealerScore){
              System.out.print("Dealer Wins.... :(")

            } else {
              System.out.print("Dealer Wins.... :(")
            }

            // Handle Bets


            // Reset
            player1.resetCards();
            dealer.resetCards();




          } else {
            System.out.println("Invalid Bet");
          }
        }

    }

  }











}
