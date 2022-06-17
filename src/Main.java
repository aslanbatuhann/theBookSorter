import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Alice in Wonderland", 96, "Levis Corrol", 1865);
        Book book2 = new Book("War and Peace", 1316, "Tolstoy", 1867);
        Book book3 = new Book("Çalıkuşu", 409, "Reşat Nuri Güntekin", 1922);
        Book book4 = new Book("Yaprak Dökümü", 515, "Reşat Nuri Güntekin", 1930);
        Book book5 = new Book("Crime and Punishment", 497, "Dostoevsky", 1866);


        TreeSet<Book> bookTreeName = new TreeSet<Book>();

        bookTreeName.add(book1);
        bookTreeName.add(book2);
        bookTreeName.add(book3);
        bookTreeName.add(book4);
        bookTreeName.add(book5);

        for (Book book : bookTreeName) {
            System.out.println("Book :" + book.getBookName());
        }

        TreeSet<Book> bookTreePageNumber = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPageNumber() - o2.getPageNumber();
            }
        });

        bookTreePageNumber.add(book1);
        bookTreePageNumber.add(book2);
        bookTreePageNumber.add(book3);
        bookTreePageNumber.add(book4);
        bookTreePageNumber.add(book5);

        for (Book book : bookTreePageNumber) {
            System.out.println("Book Name:" + book.getBookName()+ "Page Number : " + book.getPageNumber());
        }

    }
}
