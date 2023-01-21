public class Lambda {
    public static void main(String[] args) {
        Book book = new Book("A Brief History of Time", "Stephen Hawking", 1988);

        Readable readable;

        readable = (book1 -> System.out.println("Reading " + "\"" + book1.getName() + "\""));

        readable.readBook(book);
    }

    interface Readable{
        void readBook(Book book);
    }
}
