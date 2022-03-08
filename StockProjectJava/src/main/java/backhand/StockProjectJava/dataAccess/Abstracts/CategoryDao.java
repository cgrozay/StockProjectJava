package backhand.StockProjectJava.dataAccess.Abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import backhand.StockProjectJava.entities.Concretes.Category;

public interface CategoryDao extends JpaRepository<Category, Integer>{

}
