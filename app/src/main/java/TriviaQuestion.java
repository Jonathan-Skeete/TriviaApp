public class TriviaQuestion {
    String question;
    String[] options;
    int correctAnswerIndex;
    public TriviaQuestion (String q, String o1, String o2, String o3, String o4, int correct){
        question = q;
        options = new String[4];
        options[0] = o1;
        options[1] = o2;
        options[2] = o3;
        options[3] = o4;
        correctAnswerIndex = correct;
    }
    public String getQuestion() { return question; }
    public String getOption(int index) { return options[index]; }
    public int getCorrectAnswerIndex() {return correctAnswerIndex; }
}