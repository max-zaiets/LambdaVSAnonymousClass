public class AnonymousClass {
    public static void main(String[] args) {
        Book book = new Book("Lord of the rings", "J.R.R. Tolkien", 1954);

        Readable readable = new Readable() {
            @Override
            public void readBook(Book book) {
                System.out.println("Reading " + "\"" + book.getName() + "\"");
            }
        };

        readable.readBook(book);

    }

    interface Readable{
        void readBook(Book book);
    }
}
