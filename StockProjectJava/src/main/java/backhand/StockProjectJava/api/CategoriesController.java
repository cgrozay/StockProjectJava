package backhand.StockProjectJava.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import backhand.StockProjectJava.business.Abstracts.CategoryService;
import backhand.StockProjectJava.entities.Concretes.Category;

@RestController
@RequestMapping("/api/categories")
public class CategoriesController {

	private CategoryService categoryService;

	@Autowired
	public CategoriesController(CategoryService categoryService) {
		super();
		this.categoryService = categoryService;
	}
	@GetMapping("/getall")
	public List<Category> getAll(){
		return this.categoryService.getAll();
	}
}
