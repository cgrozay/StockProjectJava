package backhand.StockProjectJava.api.dtos;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import backhand.StockProjectJava.business.Abstracts.dtos.ProductIntroductionDtoService;
import backhand.StockProjectJava.core.utilities.results.DataResult;
import backhand.StockProjectJava.entities.dtos.ProductIntroductionDto;
@RestController
@RequestMapping("/api/dto")
public class ProductIntroductionDtoController {

	private ProductIntroductionDtoService productIntroductionDtoService;

	@Autowired
	public ProductIntroductionDtoController(ProductIntroductionDtoService productIntroductionDtoService) {
		super();
		this.productIntroductionDtoService = productIntroductionDtoService;
	}
	@GetMapping("/getall")
	public DataResult<List<ProductIntroductionDto>> getAll(){
		return this.productIntroductionDtoService.getAll();
	}
}
