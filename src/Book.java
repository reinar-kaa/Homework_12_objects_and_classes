public class Book {
    String bookName;
    String author;
    int publicationYear;

    public Book (String bookName, String author, int publicationYear) {
        this.bookName = bookName;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthor() {
        return author;
    }

    public int setPublicationYear(int publicationYear) {
        return publicationYear;
    }
}

