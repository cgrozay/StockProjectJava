package backhand.StockProjectJava.business.Abstracts;

import java.util.List;

import backhand.StockProjectJava.core.utilities.results.Result;
import backhand.StockProjectJava.entities.Concretes.Category;

public interface CategoryService {

	List<Category> getAll();
	Result add(Category category);
}
