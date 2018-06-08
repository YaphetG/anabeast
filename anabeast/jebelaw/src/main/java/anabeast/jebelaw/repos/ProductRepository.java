package anabeast.jebelaw.repos;

import anabeast.jebelaw.models.Product;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {

	public Product findByName(String name);
	public List<Product> findByDescription(String keyword);
}
