package fi.haagahelia.Bookstore1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Bookstore1Application {

	public static void main(String[] args) {
		SpringApplication.run(Bookstore1Application.class, args);
	}

	@Bean 
	public CommandLineRunner demo(BookRepository repository, CategoryRepository crepository, UserRepository urepository) {
		return (args) -> {
			
			Category c1 = new Category("Horror");
			Category c2 = new Category("War");
			Category c3 = new Category("Fiction");
			
			Book b1 = new Book("Tuntematon sotilas", "Väinö Linna", "123244-23131", 1985, 20.50, crepository.findByName("War").get(0) );
			Book b2 = new Book("Aku ankan seikkailut", "Aimo Nivaska", "13423244-23131", 1988, 26.50 );
			Book b3 = new Book("Viski", "Pekka Putkonen", "123244-11111", 2000, 28.50 );
			
			repository.save(b1);
			repository.save(b2);
			repository.save(b3);
			
			User user1 = new User("user", "$2a$10$9285oWcngh3lMdh1JULvGuqE4wNjNNCT05QfxTTtr5CGmkXdLoKMq", "USER");
			User user2 = new User("admin", "$2a$10$MNBzokIF1hsSPDSgUfNVSO6snIe51DjTBB1pacePmQmQBqguSA32a", "ADMIN");
			
			urepository.save(user1);
			urepository.save(user2);
			
		};
	}
}
