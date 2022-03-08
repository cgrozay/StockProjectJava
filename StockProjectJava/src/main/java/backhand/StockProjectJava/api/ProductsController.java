package backhand.StockProjectJava.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import backhand.StockProjectJava.business.Abstracts.ProductService;
import backhand.StockProjectJava.entities.Concretes.Product;

@RestController
@RequestMapping("/api/products")
public class ProductsController {

	private ProductService productService;

	@Autowired
	public ProductsController(ProductService produtService) {
		super();
		this.productService = produtService;
	}
	@GetMapping("/getall")
	public List<Product> getAll(){
		return this.productService.getAll();
	}
	
}