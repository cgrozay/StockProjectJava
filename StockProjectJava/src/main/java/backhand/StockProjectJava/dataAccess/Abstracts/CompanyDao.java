package backhand.StockProjectJava.dataAccess.Abstracts;




import org.springframework.data.jpa.repository.JpaRepository;


import backhand.StockProjectJava.entities.Concretes.Company;

public interface CompanyDao extends JpaRepository<Company, Integer> {

	
}
