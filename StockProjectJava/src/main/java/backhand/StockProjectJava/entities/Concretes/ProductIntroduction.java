package backhand.StockProjectJava.entities.Concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="product_introduction")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductIntroduction {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="product_introduction_id")
	private int productIntroductionId;
	
	//@Column(name="category_id")
	//private int categoryId;
	
		
	//@Column(name="unit_price")
	//private double unitPrice;
	
	@Column(name="amount")
	private double amount;
	
	@Column(name = "unit_price")
	private double unitPrice;
	
	@Column(name="unit_type_id")
	private int unitType;
	
	//@Column(name = "company_id")
	//private int companyId;
	
	
	@ManyToOne()
	@JoinColumn(name = "category_id")
	private Category category;
	
	@ManyToOne()
	@JoinColumn(name = "product_id")
	private Product product;
	
	@ManyToOne()
	@JoinColumn(name = "company_id")
	private Company company;
	
	
}
