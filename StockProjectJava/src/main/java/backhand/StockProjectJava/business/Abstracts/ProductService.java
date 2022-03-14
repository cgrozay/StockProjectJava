package backhand.StockProjectJava.business.Abstracts;

import java.util.List;

import backhand.StockProjectJava.core.utilities.results.DataResult;
import backhand.StockProjectJava.entities.Concretes.Product;

public interface ProductService {

	List<Product> getAll();
	void add(Product product);
	
	DataResult<Product>  getByProductName(String productName);
	
	
	
}
