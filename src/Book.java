public class Book implements Comparable<Book>{

    private final String bookName;
    private final int PageNumber;
    private final String AuthorName;
    private final int releaseDate;

    public Book(String bookName, int pageNumber, String authorName, int releaseDate) {
        this.bookName = bookName;
        this.PageNumber = pageNumber;
        this.AuthorName = authorName;
        this.releaseDate = releaseDate;
    }


    public String getBookName() {
        return bookName;
    }

    public int getPageNumber() {
        return PageNumber;
    }

    public String getAuthorName() {
        return AuthorName;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    @Override
    public int compareTo(Book book1) {
        return (this.getBookName().compareTo(book1.getBookName()));
    }
}
