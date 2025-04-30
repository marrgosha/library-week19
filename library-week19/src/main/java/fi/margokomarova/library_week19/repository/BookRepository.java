package fi.margokomarova.library_week19.repository;

import fi.margokomarova.library_week19.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

}
