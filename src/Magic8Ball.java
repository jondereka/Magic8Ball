import java.util.Random;

public class Magic8Ball
{
    private static final String[] DEFAULT_ANSEWERS = {"It is certain", "Reply hazy, try again",
        "Don’t count on it", "It is decidedly so", "Ask again later", "My reply is no",
        "Without a doubt", "Better not tell you now", "My sources say no", "Yes definitely",
        "Cannot predict now", "Outlook not so good", "You may rely on it",
        "Concentrate and ask again", "Very doubtful", "As I see it, yes", "Most likely",
        "Outlook good", "Yes", "Signs point to yes"};

    private final String[] answers;

    public Magic8Ball() {
        this.answers = DEFAULT_ANSEWERS;
    }

    public Magic8Ball(String[] answers) {
        if (answers.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }
        this.answers = answers;
    }

    public String getAnswer() {
        Random randomAnswer = new Random();
        int i = randomAnswer.nextInt(answers.length);
        return answers[i];
    }

}
