package Day52.Book;

public class PolymorphicBookTest {
    public static void main(String[] args) {
        // we can refer the paper book object using
        // ---- it's own type: PaperBook;
        // --- or it's super type: Book, Readable< knowledgeBank, Object

       Book b1 = new PaperBook("Java", "Akbar",3);
       b1.displayBookInfo();
       // this is the very similar idea as putting
        // the small coffee cup into grand cup
       KnowledgeBank kb = b1;
       kb.takeNotes();
       kb.showTableOfContent();
        System.out.println("-----------------");
        Book b2 = new PaperBook("Selenium","Vasyl",2);
        Book b3 = new AudioBook("Agile","Guljannat",1.8);
        b3.showTableOfContent();
        b3.displayBookInfo();
        System.out.println("b3 = " + b3);

        Book b4 = new PaperBook("The Kite Runner","Khaled Hosseini",3);
        Book b5 = new PaperBook("Lord of the Rings","J. R. R. Tolkien",2000);
        Book b6 = new AudioBook("Game of Thrones","George R. R. Martin",95.5);
    }
}
