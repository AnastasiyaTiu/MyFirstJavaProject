package Day52.Book;

public interface KnowledgeBank {

    public abstract void takeNotes();
    public default void showTableOfContent(){
        System.out.println("Chapter 1 till Chapter 10 : you do the rest");
    }

}
