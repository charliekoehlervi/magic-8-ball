import java.util.Scanner;

public class Magic8Ball
{
    public static void main(String[] args)
    {
        String question = "";
        int randomNum;
        String[] responses = {"Yes", "No", "Most likely", "Ask again later", "Not likely"};
        final String QUIT = "QUIT";
        Scanner input = new Scanner(System.in);

        System.out.println("The Magic 8-Ball knows all!");

        while (!question.equalsIgnoreCase(QUIT))
        {
            System.out.println("Type your yes or no question, or type " + QUIT + " to return to your ordinary life.");
            question = input.nextLine();
            if (!question.equalsIgnoreCase(QUIT))
            {
                randomNum = (int)(Math.random() * responses.length);
                System.out.println(responses[randomNum]);
                System.out.println();
                System.out.println("Any more questions?");
            }
        }

        System.out.println("Goodbye!");
    }
}