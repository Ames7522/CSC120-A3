import java.util.Random;
import java.util.Scanner;

public class Conversation {
  public static void main(String[] arguments) {
		Scanner input = new Scanner(System.in);

/* Reads an int value for the number of rounds for the conversation */
    System.out.print("Enter the number of rounds: ");
		int numRounds = input.nextInt();

/* Clears buffer by reading the nect line */
		input.nextLine(); 

    /* Creation of transcript to hold on to the whole interaction */
    StringBuilder transcript = new StringBuilder();


/*  Welcoming statement */
    System.out.print("Awesome! Hello, Lets get started. What's on your mind? \n");
    transcript.append("Program: ").append("Awesome! Hello, Lets get started. What's on your mind? ").append("\n");


/*  You will start the conversation here.*/

    /*Base response statements*/
    String[] cannedResponses = { "uh-huh", "interesting", "mhm", "I see...", "*GASP*" };
    Random random = new Random();



/*  Loop to start conversation */
    for (int round = 1; round <= numRounds; round++) {
      String userResponse = input.nextLine();
      transcript.append("User: ").append(userResponse).append("\n");


      if (userResponse.toLowerCase().contains("I ")) {
        String mirResponse = userResponse.replace("I ", "You ");
        System.out.print(mirResponse);
        transcript.append("Program: ").append(mirResponse).append("\n");

/*  Prints random responses from cannedResponses*/
      } else {
          int randomIndex = random.nextInt(cannedResponses.length);
          String randomResponse = cannedResponses[randomIndex];
          System.out.print(randomResponse);
          System.out.print("\n");
          transcript.append("Program: ").append(randomResponse).append("\n");
  }

} 

/*  Goodbye statement */
        System.out.print("It was lovely talking with you! Have a nice day ;) \n ");
        transcript.append("Program - ").append("It was lovely talking with you! Have a nice day ;)").append("\n");

/* Print Transcript */
        System.out.print("----------Transcript----------");
        System.out.print("\n");
        System.out.print(transcript);

/*  Closing the scanner just for good practice */
        input.close();
  }
}
