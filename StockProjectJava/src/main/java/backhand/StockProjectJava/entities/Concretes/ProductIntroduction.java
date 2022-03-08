package backhand.StockProjectJava.entities.Concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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
	@GeneratedValue
	@Column(name="product_introduction_id")
	private int productIntroductionId;
	
	@Column(name="category_id")
	private int categoryId;
	
	@Column(name="product_id")
	private int productId;
	
	@Column(name="unit_price")
	private double unitPrice;
	
	@Column(name="amount")
	private double amount;
	
	@Column(name="unit_type")
	private int unitType;
	
}
