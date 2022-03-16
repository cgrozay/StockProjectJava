package backhand.StockProjectJava.entities.Concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name="products")
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties({"hibernateLzyInitializer","handler",("productIntroductions"),("productOutputs")})
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="product_id")
	private int productId;
	
	//@Column(name="category_id")
	//private int categoryId;
	
	
	@Column(name="product_name")
	@NotBlank(message = "Doğru veri giriniz...")
	@NotNull(message = "Boş geçilemez...")
	private String productName;
	
	@ManyToOne()
	@JoinColumn(name = "category_id")
	private Category category;
	
	@OneToMany(mappedBy = "productIntroductionId")
	private List<ProductIntroduction> productIntroductions;
	
	@OneToMany(mappedBy = "productOutputId")
	private List<ProductOutput> productOutputs;
	
	
}
