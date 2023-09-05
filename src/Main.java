import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Library library1=new Library("Библиотека имени Маяковского ");
        Library library2= new Library("Вторая городская библиотека");

        Book book1=new Book(1,"Граф Мотне-Кристо","Александр Дюма",1825);
        Book book2=new Book(2,"Исскусство Войны","Сунь-Зы",800);
        Book book3=new Book(3,"Отцы и дети","Тургенев",1843);
        Book book4=new Book(4,"Капитанская дочка","А.С Пушкин",1856);
        Book book5=new Book(5,"Гарри Пеоттер","Джоан Роулинг",1998);
        Book book6=new Book(6,"Игра пресолов ","Джордж Мартин",2001);

        library1.addBook(book1);
        library1.addBook(book2);
        library1.addBook(book3);
        library2.addBook(book4);
        library2.addBook(book5);
        library2.addBook(book6);

        Reader reader1=new Reader("Кирпичников М.Р",25,"Физический","29.06.2002",896656621);
        Reader reader2=new Reader("Домов М.П",133,"Биологический","30.07.2003",898486621);
        Reader reader3=new Reader("Глинов П.Р",7,"Математический","31.08.2004",896384621);
        Reader reader4=new Reader("Майнкрафтэтомояжизнинов М.Р",13,"Филосовский","22.05.2010",845756621);

        library1.addReader(reader1);
        library1.addReader(reader2);
        library2.addReader(reader3);
        library2.addReader(reader4);


        reader1.takeBook(library1,1);
        reader2.takeBook(library1,2);
        reader3.takeBook(library2,4);
        reader4.takeBook(library2,6);

        reader1.returnBook(library1,1);
        reader3.returnBook(library2,4);

        library1.getHistory();
        library2.getHistory();









    }







    }
