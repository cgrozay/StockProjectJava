package backhand.StockProjectJava.business.Concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import backhand.StockProjectJava.business.Abstracts.ProductIntroductionService;
import backhand.StockProjectJava.dataAccess.Abstracts.ProductIntroductionDao;
import backhand.StockProjectJava.entities.Concretes.ProductIntroduction;

@Service
public class ProductIntroductionManager implements ProductIntroductionService {

	private ProductIntroductionDao productIntroductionDao;
	
	@Autowired
	public ProductIntroductionManager(ProductIntroductionDao productIntroductionDao) {
		super();
		this.productIntroductionDao = productIntroductionDao;
	}

	@Override
	public List<ProductIntroduction> getAll() {
		
		return this.productIntroductionDao.findAll();
	}
}
