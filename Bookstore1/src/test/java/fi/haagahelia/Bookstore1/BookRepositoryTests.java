package fi.haagahelia.Bookstore1;


import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.junit.jupiter.api.Test;

import fi.haagahelia.course.domain.Category;
import fi.haagahelia.course.domain.Book;
import fi.haagahelia.course.domain.BookRepository;

@ExtendWith(SpringExtension.class)
@DataJpaTest

public class BookRepositoryTests {
	
	@Autowired
    private BookRepository repository;

    @Test
    public void findByTitleShouldReturnBook() {
        List<Book> books = repository.findByTitle("Tuntematon sotilas");
        
        assertThat(books).hasSize(1);
        assertThat(books.get(0).getTitle()).isEqualTo("Tuntematon sotilas");
    }
    
    @Test
    public void createNewBook() {
    	Book book = new Book("Olipa kerran", "Pekka Puupää", "111111-32131312", 1985, 10.50, new Category("Fiction"));
    	repository.save(book);
    	assertThat(book.getId()).isNotNull();
    }    
    @Test
    public void deleteNewBook() {
		List<Book> books = repository.findByTitle("Tuntematon sotilas");
		Book book = books.get(0);
		repository.delete(book);
		List<Book> newBooks = repository.findByTitle("Tuntematon sotilas");
		assertThat(newBooks).hasSize(0);
     }

}
