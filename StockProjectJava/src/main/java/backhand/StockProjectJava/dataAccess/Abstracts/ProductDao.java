package backhand.StockProjectJava.dataAccess.Abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import backhand.StockProjectJava.entities.Concretes.Product;


public interface ProductDao extends JpaRepository<Product, Integer> {

	Product getByProductName(String productName);
	
	@Query("From Product where productName=:productName and category.categoryId=:categoryId")
	List<Product> getByNameAndCategory(String productName,int categoryId);
	
	
	
	
}
