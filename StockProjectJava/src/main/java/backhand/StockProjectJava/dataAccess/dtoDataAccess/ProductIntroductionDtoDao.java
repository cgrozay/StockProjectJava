package backhand.StockProjectJava.dataAccess.dtoDataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import backhand.StockProjectJava.entities.dto.ProductIntroductionDto;

public interface ProductIntroductionDtoDao extends JpaRepository<ProductIntroductionDto, Integer> {

}
