package backhand.StockProjectJava.entities.dtos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = ("product_introduction_view"))
public class ProductIntroductionDto {

	@Id
	@Column(name = "product_introduction_id")
	private int productIntroductionId;
	
	@Column(name = "category_name")
	private String categoryName;
	
	@Column(name = "product_name")
	private String productName;
	
	@Column(name = "amount")
	private double amount;
	
	@Column(name = "unit_type_name")
	private String unitType;
	
	@Column(name = "unit_price")
	private double unitPrice;
	
	@Column(name = "company_name")
	private String companyName;

}
