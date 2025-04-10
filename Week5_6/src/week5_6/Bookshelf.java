package week5_6;

class Bookshelf {
    private Book[] books;
    private int count;

    public Bookshelf(int capacity) {
        books = new Book[capacity];
        count = 0;
    }

    public void addBook(Book book) {
        if (count < books.length) {
            books[count++] = book;
        } else {
            System.out.println("Bookshelf is full.");
        }
    }

    public void listBooks() {
        for (int i = 0; i < count; i++) {
            System.out.println(books[i]);
        }
    }
    public static void main(String[] args) {
        Bookshelf shelf = new Bookshelf(3);
        shelf.addBook(new Book("The Hobbit", "J.R.R. Tolkien"));
        shelf.addBook(new Book("1984", "George Orwell"));
        shelf.addBook(new Book("Clean Code", "Robert C. Martin"));
        shelf.listBooks();
    }
}


