import java.lang.reflect.Array;
import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;

    public Library(){
        books = new ArrayList<Book>();
    }

    public void addBook(Book newBook){
        books.add(newBook);
    }

    public void printBooks(){
        for (Book book : books){
            System.out.println(book.toString());
        }
    }

    public ArrayList<Book> searchByTitle(String title){
        ArrayList<Book> found = new ArrayList<Book>();

        for (Book b : books){
            if (StringUtils.included(b.title(), title)){
                found.add(b);
            }
        }

        return found;
    }

    public ArrayList<Book> searchByPublisher(String publisher){
        ArrayList<Book> found = new ArrayList<Book>();

        for (Book b : this.books){
            if (StringUtils.included(b.publisher(), publisher)){
                found.add(b);
            }
        }

        return found;
    }

    public ArrayList<Book> searchByYear(int year){
        ArrayList<Book> found = new ArrayList<Book>();
        int asd = 0;

        for (Book b : this.books){
            if (b.year() == year){
                found.add(b);
            }
        }

        return found;
    }


}
