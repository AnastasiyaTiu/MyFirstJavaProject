package Day52.Book;

public class PaperBook extends Book implements Readable {
    int weight;

    public PaperBook(String name, String author, int weight) {
        super(name, author);
        this.weight = weight;
    }

    @Override
    public void displayBookInfo() {
        System.out.println("Paper Book's name is: "+name+
                ", and the author is: "+author
                +" and it weight " + weight + " pound");
    }

    public void read() {
        System.out.println("Reading the "+name+" written by "+author);
    }

    @Override
    public String toString() {
        return "PaperBook{" +
                "weight=" + weight +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
    @Override
    public void takeNotes() {
        System.out.println("Bookmark and making notes from " + name);
    }

}