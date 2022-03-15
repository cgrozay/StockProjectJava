package backhand.StockProjectJava.business.Abstracts;

import java.util.List;

import backhand.StockProjectJava.core.utilities.results.DataResult;
import backhand.StockProjectJava.entities.Concretes.Company;
import backhand.StockProjectJava.entities.Concretes.Product;

public interface CompanyService {

	
	DataResult<List<Company>> getAll();

}
