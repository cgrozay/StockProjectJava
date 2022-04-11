package backhand.StockProjectJava.business.Concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import backhand.StockProjectJava.business.Abstracts.CategoryService;
import backhand.StockProjectJava.core.utilities.results.DataResult;
import backhand.StockProjectJava.core.utilities.results.Result;
import backhand.StockProjectJava.core.utilities.results.SuccessDataResult;
import backhand.StockProjectJava.core.utilities.results.SuccessResult;
import backhand.StockProjectJava.dataAccess.Abstracts.CategoryDao;

import backhand.StockProjectJava.entities.Concretes.Category;

@Service
public class CategoryManager implements CategoryService{

	private CategoryDao categoryDao;
	@Autowired
	public CategoryManager(CategoryDao categoryDao) {
		super();
		this.categoryDao = categoryDao;
	}

	@Override
	public DataResult< List<Category>> getAll() {
		
		return new SuccessDataResult<List<Category>>(this.categoryDao.findAll());
	}

	@Override
	public Result add(Category category) {
		this.categoryDao.save(category);
		return new SuccessResult("Kategori Eklendi");
	}
	

}
