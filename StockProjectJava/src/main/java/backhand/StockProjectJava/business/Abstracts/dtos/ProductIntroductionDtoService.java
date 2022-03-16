package backhand.StockProjectJava.business.Abstracts.dtos;

import java.util.List;

import backhand.StockProjectJava.core.utilities.results.DataResult;
import backhand.StockProjectJava.entities.dtos.ProductIntroductionDto;

public interface ProductIntroductionDtoService {

	DataResult<List<ProductIntroductionDto>> getAll();
}
