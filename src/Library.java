import java.util.ArrayList;
import java.util.List;

public class Library {

    String Name;
    List<Book> Books;
    List<Reader> Readers;
    List<String> History;
    public Library(String name){
        Name=name;
        Books=new ArrayList<>();
        Readers=new ArrayList<>();
        History=new ArrayList<>();
    }

    public  void addBook(Book book) {
        Books.add(book);
        System.out.println(book.Name+" книга добавленна в библиотеку:"+Name);
        System.out.println();

    }
    public void addReader(Reader reader){
        Readers.add(reader);
        System.out.println("Читатель "+reader.FIO+" был добавлен в библиотеку:"+Name);
        System.out.println();

    }
    public void addRecord(String record) {
        History.add(record);
    }
    public void getHistory() {
        System.out.println();
        System.out.println("История передвижения книг в библиотеке " + Name);
        for (String record : History) {
            System.out.println(record);
        }
    }
    public Book findBook(int bookId) {
        for (Book book : Books) {
            if (book.ID == bookId) return book;
        }
        System.out.println("Книга с id = " + bookId + " не найдена.");
        return null;
    }








}
