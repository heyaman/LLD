package LibraryManagemntSystem.Tester;

public class SearchByBookName implements Search{
    private final String bookName;

    public SearchByBookName(String bookName) {
        this.bookName = bookName;
    }

    @Override
    public List<BookCopy> search() {
       //had to use this.bookname to get list of bookCopy
        return null;
    }
}
