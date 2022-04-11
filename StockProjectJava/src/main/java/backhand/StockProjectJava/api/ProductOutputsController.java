package backhand.StockProjectJava.api;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import backhand.StockProjectJava.business.Abstracts.ProductOutputService;
import backhand.StockProjectJava.core.utilities.results.DataResult;
import backhand.StockProjectJava.core.utilities.results.ErrorDataResult;
import backhand.StockProjectJava.entities.Concretes.ProductOutput;

@RestController
@RequestMapping("/api/productoutputs")
@CrossOrigin
public class ProductOutputsController {

	private ProductOutputService productOutputService;
	@Autowired
	public ProductOutputsController(ProductOutputService productOutputService) {
		super();
		this.productOutputService = productOutputService;
	}

	@GetMapping("/getall")
	public DataResult<List<ProductOutput>>  getAll(){
		return this.productOutputService.getAll();
	}
	@GetMapping("/getProductOutput")
	public DataResult<List<ProductOutput>> getByProductOutputIdAndProductId(int productOutputId,int productId){
		return this.productOutputService.getByProductOutputIdAndProductId(productOutputId, productId);
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
