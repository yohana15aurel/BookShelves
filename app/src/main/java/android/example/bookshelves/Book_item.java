package android.example.bookshelves;

public class Book_item {
    private String title, author, imageURL, year, rating;

    public Book_item(String title, String author, String year, String rating ) {
        this.title = title;
        this.author = author;
        this.imageURL = imageURL;
        this.year = year;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return author;
    }

    public String getAuthor() {
        return author;
    }

    public String getImageURL() {
        return imageURL;
    }

    public String getYear() {
        return year;
    }

    public String getRating() {
        return rating;
    }
}
