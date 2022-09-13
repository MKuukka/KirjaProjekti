package fi.haagahelia.Bookstore1.domain;

import java.util.List;

public interface CategoryRepository extends Crudrepository<Category, Long> {
	
	List<Category> findByName(String name);

}
