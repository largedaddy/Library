public class Book {
    int ID;
    String Name;
    String Author;
    int YearOfRelease;
    boolean isTaken;


    public Book(int id,String name,String author,int yearOfRelease){
        ID=id;
        Name=name;
        Author=author;
        YearOfRelease=yearOfRelease;
        isTaken=false;

    }

    public void setTaken(boolean taken){
        isTaken=taken;
    }
}
