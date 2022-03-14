package backhand.StockProjectJava.business.Concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import backhand.StockProjectJava.business.Abstracts.ProductIntroductionService;
import backhand.StockProjectJava.core.utilities.results.DataResult;
import backhand.StockProjectJava.core.utilities.results.SuccessDataResult;
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

	@Override
	public DataResult<List<ProductIntroduction>> getByProductIntroductionIdAndProductId(int productIntroductionId,
			int productId) {
		
		return new SuccessDataResult<List<ProductIntroduction>>(this.productIntroductionDao.getByProductIntroductionIdAndProduct_ProductId(productIntroductionId, productId));
	}
}
