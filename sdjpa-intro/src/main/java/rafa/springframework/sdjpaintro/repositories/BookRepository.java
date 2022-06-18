package rafa.springframework.sdjpaintro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import rafa.springframework.sdjpaintro.domain.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}
