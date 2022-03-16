package backhand.StockProjectJava.business.Abstracts;

import java.util.List;

import backhand.StockProjectJava.core.utilities.results.DataResult;
import backhand.StockProjectJava.core.utilities.results.Result;
import backhand.StockProjectJava.entities.Concretes.ProductIntroduction;

public interface ProductIntroductionService {

	Result add(ProductIntroduction produtIntroduction);
	DataResult<List<ProductIntroduction>> getByProductIntroductionIdAndProductId(int productIntroductionId,int productId );
	DataResult<List<ProductIntroduction>> getByProductIntroductionIdAndCompanyId(int productIntroductionId,int productId);
	
	List<ProductIntroduction> getAll();
	
}
