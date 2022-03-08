package backhand.StockProjectJava.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import backhand.StockProjectJava.business.Abstracts.ProductIntroductionService;
import backhand.StockProjectJava.entities.Concretes.ProductIntroduction;

@RestController
@RequestMapping("/api/productsintroduction")
public class ProductIntroductionsController {

	private ProductIntroductionService productIntroductionService;

	@Autowired
	public ProductIntroductionsController(ProductIntroductionService productIntroductionService) {
		super();
		this.productIntroductionService = productIntroductionService;
	}
	@GetMapping("/getall")
	public List<ProductIntroduction> getAll() {
		
		return this.productIntroductionService.getAll();
	}
}
