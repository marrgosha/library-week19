package fi.margokomarova.library_week19.repository;

import fi.margokomarova.library_week19.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface AuthorRepository extends JpaRepository<Author, Long>, JpaSpecificationExecutor<Author> {
    Optional<Author> findAuthorByName(String name);

    @Query(nativeQuery = true, value = "SELECT * FROM author WHERE name = ?")
    Optional<Author> findAuthorByNameBySql(String name);

}
