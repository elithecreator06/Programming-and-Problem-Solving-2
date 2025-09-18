public abstract class Item {
    private String title;

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    Item(){
        title = "";
    }

    Item(String title){
        this.title = title;
    }

    public abstract String getListing();
    public String toString(){
        String string = "Title: " + title;
        return string;
    }
}
