public class Main {
    public static void main(String[] args) {
        Book book = new Book("Dreamcatcher", "Stephen King", 2001);
        Book book2 = new Book("Animal Farm: A Fairy Story", "George Orwell", 1945);
        Book book3 = new Book("Recipes for happiness", "Elchin Safarli", 2013);
        System.out.println("book.bookName = " + book.bookName);
        System.out.println("book2.author = " + book2.author);
        System.out.println("book3.publicationYear = " + book3.publicationYear);

        Author author = new Author("Stephen", "King");
        Author author1 = new Author("George", "Orwell");
        Author author2 = new Author("Elchin", "Safarli");
        System.out.println("author.authorName = " + author.getAuthorName());
        System.out.println("author1.getAuthorSurname() = " + author1.getAuthorSurname());
    }

}