public class Book extends Item {
    private long isbn_number;
    private String author;

    public long getIsbn_number(){
        return isbn_number;
    }

    public void setIsbn_number(long isbn_number){
        this.isbn_number = isbn_number;
    }

    public String getAuthor(){
        return author;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    Book(){

    }

    Book(String title, long isbn_number, String author){
        setTitle(title);
        this.isbn_number = isbn_number;
        this.author = author;
    }

    @Override
    public String getListing(){
        String string =
                "Book Name - " + getTitle() +
                "\nAuthor - " + author +
                "\nISBN# - " + isbn_number;
        return string;
    }
}
