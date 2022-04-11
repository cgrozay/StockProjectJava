package backhand.StockProjectJava.api;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import backhand.StockProjectJava.business.Abstracts.ProductIntroductionService;
import backhand.StockProjectJava.core.utilities.results.DataResult;
import backhand.StockProjectJava.core.utilities.results.ErrorDataResult;
import backhand.StockProjectJava.core.utilities.results.Result;
import backhand.StockProjectJava.entities.Concretes.ProductIntroduction;

@RestController
@RequestMapping("/api/productintroductions")
@CrossOrigin
public class ProductIntroductionsController {

	private ProductIntroductionService productIntroductionService;

	@Autowired
	public ProductIntroductionsController(ProductIntroductionService productIntroductionService) {
		super();
		this.productIntroductionService = productIntroductionService;
	}
	@PostMapping("/add")
	public Result add(@Valid @RequestBody ProductIntroduction produtIntroduction) {
		return this.productIntroductionService.add(produtIntroduction);
	}
	
	@GetMapping("/getall")
	public DataResult<List<ProductIntroduction>>  getAll() {
		
		return this.productIntroductionService.getAll();
	}
	@GetMapping("/getProductIntroductionIdAndProductId")
	public DataResult<List<ProductIntroduction>> getByProductIntroductionIdAndProductId(int productIntroductionId,
			int productId) {
		return this.productIntroductionService.getByProductIntroductionIdAndProductId(productIntroductionId, productId);
	}
	@GetMapping("/getByProductIntroductionIdAndCompanyId")
	public DataResult<List<ProductIntroduction>> getByProductIntroductionIdAndCompanyId(int productIntroductionId,int companyId){
		return this.productIntroductionService.getByProductIntroductionIdAndCompanyId(productIntroductionId, companyId);
	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public ErrorDataResult<Object> handleValidationException(MethodArgumentNotValidException exceptions) {
		Map<String, String> validationErrors = new HashMap<String, String>();
		for (FieldError fieldError : exceptions.getBindingResult().getFieldErrors()) {
			validationErrors.put(fieldError.getField(), fieldError.getDefaultMessage());
		}
		ErrorDataResult<Object> errors = new ErrorDataResult<Object>(validationErrors, "Doğrulama Hataları");
		return errors;
	}
}
