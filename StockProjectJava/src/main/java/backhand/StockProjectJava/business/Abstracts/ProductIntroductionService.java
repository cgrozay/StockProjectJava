package backhand.StockProjectJava.business.Abstracts;

import java.util.List;

import backhand.StockProjectJava.core.utilities.results.DataResult;
import backhand.StockProjectJava.entities.Concretes.ProductIntroduction;

public interface ProductIntroductionService {

	DataResult<List<ProductIntroduction>> getByProductIntroductionIdAndProductId(int productIntroduction,int productId);
	
	List<ProductIntroduction> getAll();
	
}
