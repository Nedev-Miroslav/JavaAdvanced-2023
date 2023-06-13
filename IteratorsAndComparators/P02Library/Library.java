package IteratorsAndComparators.P02Library; //При събмит трбява да се премахне package!


import java.util.Iterator;

public class Library implements Iterable<Book> {
    Book[] books;
    public Library(Book...books) {
        this.books = books;
    }



    @Override
    public Iterator<Book> iterator() {
        return new LibraryIterator();
    }
    private class LibraryIterator implements Iterator<Book> {
        private int count = 0;

        @Override
        public boolean hasNext() {
            return count < books.length;
        }

        @Override
        public Book next() {
            return books[count++];
        }
    }
}
