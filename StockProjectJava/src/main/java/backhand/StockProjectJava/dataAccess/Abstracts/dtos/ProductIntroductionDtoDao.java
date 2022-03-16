package backhand.StockProjectJava.dataAccess.Abstracts.dtos;

import org.springframework.data.jpa.repository.JpaRepository;

import backhand.StockProjectJava.entities.dtos.ProductIntroductionDto;

public interface ProductIntroductionDtoDao extends JpaRepository<ProductIntroductionDto, Integer> {

}
