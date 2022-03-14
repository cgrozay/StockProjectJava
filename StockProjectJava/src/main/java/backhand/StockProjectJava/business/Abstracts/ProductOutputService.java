package backhand.StockProjectJava.business.Abstracts;

import java.util.List;

import backhand.StockProjectJava.core.utilities.results.DataResult;
import backhand.StockProjectJava.entities.Concretes.ProductOutput;

public interface ProductOutputService {

	List<ProductOutput> getAll();
	
	DataResult<List<ProductOutput>> getByProductOutputIdAndProductId(int productOutputId,int productId);
}
