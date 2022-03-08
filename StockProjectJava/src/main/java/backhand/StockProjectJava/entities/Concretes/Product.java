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
@Table(name="products")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

	@Id
	@GeneratedValue
	@Column(name="product_id")
	private int productId;
	
	@Column(name="category_id")
	private int categoryId;
	
	
	@Column(name="product_name")
	private String productName;
	
	
	
}
