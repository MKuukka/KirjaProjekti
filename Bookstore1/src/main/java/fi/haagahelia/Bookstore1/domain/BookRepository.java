package fi.haagahelia.Bookstore1.domain;


import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {

}

