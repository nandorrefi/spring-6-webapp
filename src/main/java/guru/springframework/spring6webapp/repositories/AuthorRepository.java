package guru.springframework.spring6webapp.repositories;

import guru.springframework.spring6webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

// We will not implement this interface, Spring Data JPA will automatically generate an implementation and creates a Spring Bean of it in the context
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
