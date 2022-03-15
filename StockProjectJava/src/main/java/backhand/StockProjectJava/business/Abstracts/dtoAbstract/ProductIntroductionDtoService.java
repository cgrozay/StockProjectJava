package backhand.StockProjectJava.business.Abstracts.dtoAbstract;

import java.util.List;

import backhand.StockProjectJava.core.utilities.results.DataResult;
import backhand.StockProjectJava.entities.dto.ProductIntroductionDto;

public interface ProductIntroductionDtoService {

	DataResult<List<ProductIntroductionDto>> getAll();
}
