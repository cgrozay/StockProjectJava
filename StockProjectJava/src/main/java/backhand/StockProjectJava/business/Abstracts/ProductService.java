package backhand.StockProjectJava.business.Abstracts;

import java.util.List;

import backhand.StockProjectJava.core.utilities.results.DataResult;
import backhand.StockProjectJava.core.utilities.results.Result;
import backhand.StockProjectJava.entities.Concretes.Product;

public interface ProductService {

	DataResult<List<Product>>  getAll();
	Result add(Product product);
	
	DataResult<Product>  getByProductName(String productName);
	
	
	
}
