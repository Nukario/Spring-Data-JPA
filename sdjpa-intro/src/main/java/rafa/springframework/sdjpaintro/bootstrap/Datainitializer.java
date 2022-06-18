package rafa.springframework.sdjpaintro.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import rafa.springframework.sdjpaintro.domain.Book;
import rafa.springframework.sdjpaintro.repositories.BookRepository;

@Component
public class Datainitializer implements CommandLineRunner {

    private final BookRepository bookRepository;

    public Datainitializer(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }


    @Override
    public void run(String... args) throws Exception {
        Book bookDDD= new Book("Domain Driven Design", "123", "randomHouse");
        System.out.println("id: " + bookDDD.getId() );

        Book savedDDD = bookRepository.save(bookDDD);
        System.out.println("id: " + savedDDD.getId() );

        Book bookSIA = new Book("Spring In Action", "234324", "oriely");
        System.out.println("id: " + bookSIA.getId() );

        Book savedSIA = bookRepository.save(bookSIA);
        System.out.println("id: " + savedSIA.getId() );

        bookRepository.findAll().forEach(book -> {
            System.out.println("Book Id: " + book.getId());
            System.out.println("Book Id: " + book.getTitle());
        } );

    }
}
