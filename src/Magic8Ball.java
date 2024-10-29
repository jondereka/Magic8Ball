import java.util.Random;

/**
 * This is a class that simulates a magic 8 ball.  There
 * are 20 stored answers for a yes-no question.  These answers
 * are randomly chosen and used in the server class to be
 * sent to the client after a question is asked.
 */
public class Magic8Ball
{
    private static final String[] DEFAULT_ANSEWERS = {"It is certain", "Reply hazy, try again",
        "Don’t count on it", "It is decidedly so", "Ask again later", "My reply is no",
        "Without a doubt", "Better not tell you now", "My sources say no", "Yes definitely",
        "Cannot predict now", "Outlook not so good", "You may rely on it",
        "Concentrate and ask again", "Very doubtful", "As I see it, yes", "Most likely",
        "Outlook good", "Yes", "Signs point to yes"};

    private final String[] answers;

    /**
     * Creates a magic 8 ball object that uses the default answers.
     */
    public Magic8Ball() {
        this.answers = DEFAULT_ANSEWERS;
    }

    /**
     * Creates a magic 8 ball object with answers
     * @param answers the answers of the magic 8 ball
     * @throws IllegalArgumentException if array is empty (length is 0)
     */
    public Magic8Ball(String[] answers) {
        if (answers.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }
        this.answers = answers;
    }

    /**
     * Gets the magic 8 ball answer
     * @return a randomly chosen answer from the array of answers
     */
    public String getAnswer() {
        Random randomAnswer = new Random();
        int i = randomAnswer.nextInt(answers.length);
        return answers[i];
    }

}
