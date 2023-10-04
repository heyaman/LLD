package LibraryManagemntSystem.Tester;
import java.util.*;

public class Book {
    private final int id;
    private final String name;
    private final List<String>authors;
    private final List<Category>categoryList;

    public Book(int id, String name, List<String> authors, List<Category> categoryList) {
        this.id = id;
        this.name = name;
        this.authors = authors;
        this.categoryList = categoryList;
    }
}
