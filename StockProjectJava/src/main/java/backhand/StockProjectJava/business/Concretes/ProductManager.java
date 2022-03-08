package backhand.StockProjectJava.business.Concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import backhand.StockProjectJava.business.Abstracts.ProductService;
import backhand.StockProjectJava.dataAccess.Abstracts.ProductDao;
import backhand.StockProjectJava.entities.Concretes.Product;

@Service
public class ProductManager implements ProductService{

	private ProductDao productDao;
	@Autowired
	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}
	@Override
	public List<Product> getAll() {
		return this.productDao.findAll();
	}

}
