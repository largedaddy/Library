import java.util.Date;

public class Reader {
    String FIO;
    int NumberRiderTiket;
    String Faculty;
    String DateBorn;
    long NumberTelephone;


   public Reader(String fio,int numberRiderTiket,String faculty,String dateBorn,long numberTelephone){
       FIO=fio;
       NumberRiderTiket=numberRiderTiket;
       Faculty=faculty;
       DateBorn=dateBorn;
       NumberTelephone=numberTelephone;

   }
    public void takeBook(Library library, int bookId) {
        Book book = library.findBook(bookId);
        if (library.Readers.contains(this) && book != null && !book.isTaken) {
            book.setTaken(true);
            library.addRecord("Книга " + book.Name + " была взята пользователем " + FIO + " в библиотеке " + library.Name);
        } else {
            System.out.println("Такого пользователя не существует в данной библиотеке или книги с таким id не существует.");
        }
    }
    public void returnBook(Library library, int bookId) {
        Book book = library.findBook(bookId);
        if (library.Readers.contains(this) && book != null && book.isTaken) {
            book.setTaken(false);
            library.addRecord("Книга " + book.Name + " была возвращена пользователем " + FIO + " в библиотеку " + library.Name);
        } else {
            System.out.println("Такого пользователя не существует в данной библиотеке или книги с таким id не существует2.");
        }
    }








}
