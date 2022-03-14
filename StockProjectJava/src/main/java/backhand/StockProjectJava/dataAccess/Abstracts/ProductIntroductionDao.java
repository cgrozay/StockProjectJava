package backhand.StockProjectJava.dataAccess.Abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import backhand.StockProjectJava.entities.Concretes.ProductIntroduction;

public interface ProductIntroductionDao extends JpaRepository<ProductIntroduction, Integer>{
	
	
	List<ProductIntroduction> getByProductIntroductionIdAndProduct_ProductId(int productIntroductionId,int productId);
	
	@Query("From ProductIntroduction where productIntroductionId=:productIntroductionId and product.productId=:productId")
	List<ProductIntroduction> getByProductIntroductionIdAndProduct(int productIntroductionId,int productId);
}
