package backhand.StockProjectJava.business.Abstracts;

import java.util.List;

import backhand.StockProjectJava.entities.Concretes.Category;

public interface CategoryService {

	List<Category> getAll();
}
