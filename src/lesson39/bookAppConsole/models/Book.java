package lesson39.bookAppConsole.models;

public class Book {
    private String author;
    private String bookName;

    private String category;

    private int writeYear;

    private String rating;


    public Book(String author, String bookName, String category, int writeYear, String rating) {
        this.author = author;
        this.bookName = bookName;
        this.category = category;
        this.writeYear = writeYear;
        this.rating = rating;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getWriteYear() {
        return writeYear;
    }

    public void setWriteYear(int writeYear) {
        this.writeYear = writeYear;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "{Book" +
                "author='" + author + '\'' +
                ", bookName='" + bookName + '\'' +
                ", category='" + category + '\'' +
                ", writeYear=" + writeYear +
                ", rating='" + rating + '\'' +
                '}';
    }
}
