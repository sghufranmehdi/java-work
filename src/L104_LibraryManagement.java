import java.util.ArrayList;

class Book{
    String name, auther;

    public Book(String name, String auther) {
        this.name = name;
        this.auther = auther;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", auther='" + auther + '\'' +
                '}';
    }
}

class MyLibrary{
    ArrayList <Book> books;
    MyLibrary(ArrayList<Book> books)
    {

        this.books = books;
        
    }
    public void addBook(Book b)
    {
        System.out.println("The Book has been added");
        this.books.add(b);
    }

    public void issueBook(Book b, String issued_to,String issued_on)
    {
        System.out.println("The Book " +b.name+" has been issued to: "+ issued_to+" on "+issued_on);
        this.books.remove(b);
    }
    public void returnBook(Book b)
    {
        System.out.println("The Book "+b.name+" has been returned");
        this.books.add(b);
    }


}
public class L104_LibraryManagement {
    public static void main(String[] args) {
        /*
        Create a library management system which is capable of issuing books to the students.
        Book should have info like:
        1. Book name
        2. Book Author
        3. Issued to
        4. Issued on
        User should be able to add books, return issued books, issue books
        Assume that all the users are registered with their names in the central database
         */
        ArrayList<Book> bk = new ArrayList<>();
        Book b1 = new Book("Algo1", "Ghufran1");
        bk.add(b1);

        Book b2 = new Book("Algo2", "Ghufran2");
        bk.add(b2);

        Book b3 = new Book("Algo3", "Ghufran3");
        bk.add(b3);

        Book b4 = new Book("Algo4", "Ghufran4");
        bk.add(b4);

        Book b5 = new Book("Algo15", "Ghufran5");
        bk.add(b5);


        MyLibrary ml = new MyLibrary(bk);
        ml.addBook(new Book("Algo6","Ghufran6"));
        System.out.println(ml.books);
        ml.issueBook(b2,"Ghufran Mehdi","02-03-2023");

        System.out.println(ml.books);

    }
}
