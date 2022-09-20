package fi.haagahelia.Bookstore1.domain;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Long> {
	User findByUserName(String username);
}
