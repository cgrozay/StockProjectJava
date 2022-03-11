package backhand.StockProjectJava.business.Concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import backhand.StockProjectJava.business.Abstracts.ProductOutputService;
import backhand.StockProjectJava.dataAccess.Abstracts.ProductOutputDao;
import backhand.StockProjectJava.entities.Concretes.ProductOutput;

@Service
public class ProductOutputManager implements ProductOutputService {

	private ProductOutputDao productOutputDao;
	@Autowired
	public ProductOutputManager(ProductOutputDao productOutputDao) {
		super();
		this.productOutputDao = productOutputDao;
	}

	@Override
	public List<ProductOutput> getAll() {
		return this.productOutputDao.findAll();
	}

}
