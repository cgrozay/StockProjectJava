package backhand.StockProjectJava.dataAccess.Abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import backhand.StockProjectJava.entities.Concretes.ProductIntroduction;

public interface ProductIntroductionDao extends JpaRepository<ProductIntroduction, Integer>{

}
