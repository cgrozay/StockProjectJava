package backhand.StockProjectJava.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import backhand.StockProjectJava.business.Abstracts.ProductOutputService;
import backhand.StockProjectJava.entities.Concretes.ProductOutput;

@RestController
@RequestMapping("/api/productoutput")
public class ProductOutputsController {

	private ProductOutputService productOutputService;
	@Autowired
	public ProductOutputsController(ProductOutputService productOutputService) {
		super();
		this.productOutputService = productOutputService;
	}

	@GetMapping("/getall")
	List<ProductOutput> getAll(){
		return this.productOutputService.getAll();
	}
}
