package backhand.StockProjectJava.business.Concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import backhand.StockProjectJava.business.Abstracts.ProductService;
import backhand.StockProjectJava.core.utilities.results.DataResult;
import backhand.StockProjectJava.core.utilities.results.Result;
import backhand.StockProjectJava.core.utilities.results.SuccessDataResult;
import backhand.StockProjectJava.core.utilities.results.SuccessResult;
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
	public DataResult<List<Product>>  getAll() {
		return new SuccessDataResult<List<Product>>( this.productDao.findAll());
	}
	@Override
	public Result add(Product product) {
		this.productDao.save(product);
	 	return new SuccessResult("Ürün Eklendi");
		
	}
	@Override
	public DataResult<Product> getByProductName(String productName) {
		return new SuccessDataResult<Product>(this.productDao.getByProductName(productName),"Listelendi");
	}
	
	

}
