package kodlamaio.nortwind.business.abstracts;

import java.util.List;

import kodlamaio.nortwind.entities.concretes.Product;


public interface ProductService {

	List<Product> getAll();
}
