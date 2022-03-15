package backhand.StockProjectJava.business.Concretes.dtoConcrete;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import backhand.StockProjectJava.business.Abstracts.dtoAbstract.ProductIntroductionDtoService;
import backhand.StockProjectJava.core.utilities.results.DataResult;
import backhand.StockProjectJava.core.utilities.results.SuccessDataResult;
import backhand.StockProjectJava.dataAccess.dtoDataAccess.ProductIntroductionDtoDao;
import backhand.StockProjectJava.entities.dto.ProductIntroductionDto;
@Service
public class ProductIntroductionDtoManager implements ProductIntroductionDtoService {

	private ProductIntroductionDtoDao productIntroductionDtoDao;
	@Autowired
	public ProductIntroductionDtoManager(ProductIntroductionDtoDao productIntroductionDtoDao) {
		super();
		this.productIntroductionDtoDao = productIntroductionDtoDao;
	}
	@Override
	public DataResult<List<ProductIntroductionDto>> getAll() {
		
		return new SuccessDataResult<List<ProductIntroductionDto>>(this.productIntroductionDtoDao.findAll(),"Ürün Girişleri Listelendi");
	}

}
