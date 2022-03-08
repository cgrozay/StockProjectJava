package backhand.StockProjectJava.dataAccess.Abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import backhand.StockProjectJava.entities.Concretes.Product;

public interface ProductDao extends JpaRepository<Product, Integer> {

}
