public class Question {
    private String question;
    private String answer;
    private int levelOfDifficulty;

    Question(String question, String answer, int levelOfDifficulty){
        this.question = question;
        this.answer = answer;
        this.levelOfDifficulty = levelOfDifficulty;
    }

    public void setQuestion(String question){
        this.question = question;
    }
    public void setAnswer(String answer){
        this.answer = answer;
    }
    public void setLevelOfDifficulty(int levelOfDifficulty){
        this.levelOfDifficulty = levelOfDifficulty;
    }
    public String getQuestion() {
        return question;
    }
    public String getAnswer(){
        return answer;
    }
    public int getLevelOfDifficulty(){
        return levelOfDifficulty;
    }
}
