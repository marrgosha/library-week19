package fi.margokomarova.library_week19.repository;

import fi.margokomarova.library_week19.model.Author;
import fi.margokomarova.library_week19.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
