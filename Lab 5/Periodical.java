public class Periodical extends Item {
    private int issueNum;

    public int getIssueNum(){
        return issueNum;
    }

    public void setIssueNum(int issueNum) {
        this.issueNum = issueNum;
    }

    Periodical(){

    }

    Periodical(String title, int issueNum){
        setTitle(title);
        this.issueNum = issueNum;
    }

    @Override
    public String getListing(){
        String string =
                "Periodical Title - " + getTitle() +
                        "\nIssue# - " + issueNum;
        return string;
    }
}
