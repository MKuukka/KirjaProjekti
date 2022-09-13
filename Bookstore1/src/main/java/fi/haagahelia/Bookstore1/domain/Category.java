package fi.haagahelia.Bookstore1.domain;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;

@Entity
public class Category {

	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private Long categoryid; 
	private String name;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "category")
	private List<Book> books;
	
	public Category() {}
	
	public Category(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}
	
}
