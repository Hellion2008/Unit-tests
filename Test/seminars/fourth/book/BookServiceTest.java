package seminars.fourth.book;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class BookServiceTest {

    @Test
    void findBookById(){
        Book book = mock(Book.class);
        when(book.getAuthor()).thenReturn("Author1");

        BookRepository bookRepository = mock(BookRepository.class);
        when(bookRepository.findById("1")).thenReturn(book);

        BookService bookService = new BookService(bookRepository);
        String res = bookService.findBookById("1").getAuthor();

        Assertions.assertEquals("Author1", res);
    }
    @Test
    void findAll() {
        List<Book> books = mock(List.class);
        when(books.size()).thenReturn(2);

        BookRepository bookRepository = mock(BookRepository.class);
        when(bookRepository.findAll()).thenReturn(books);

        BookService bookService = new BookService(bookRepository);
        int res = bookService.findAllBooks().size();

        Assertions.assertEquals(2, res);

    }
}