package backhand.StockProjectJava.business.Abstracts;

import java.util.List;

import backhand.StockProjectJava.entities.Concretes.Product;

public interface ProductService {

	List<Product> getAll();
}
