package backhand.StockProjectJava.dataAccess.Abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import backhand.StockProjectJava.entities.Concretes.ProductOutput;

public interface ProductOutputDao extends JpaRepository<ProductOutput, Integer> {

	List<ProductOutput> getByProductOutputIdAndProduct_ProductId(int productOutputId, int productId);

	@Query("From ProductOutput where productOutputId=:productOutputId and product.productId=:productId")
	List<ProductOutput> getByProductOutputIdAndProduct(int productOutputId, int productId);
}
