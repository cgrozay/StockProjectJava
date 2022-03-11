package backhand.StockProjectJava.dataAccess.Abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import backhand.StockProjectJava.entities.Concretes.ProductOutput;

public interface ProductOutputDao extends JpaRepository<ProductOutput, Integer> {

}
