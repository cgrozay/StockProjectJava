package backhand.StockProjectJava.entities.Concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="product_outputs")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductOutput {

	@Id
	@GeneratedValue
	@Column(name = "product_output_id")
	private int productOutputId;
	
	@Column(name = "product_id")
	private int productId;
	
	@Column(name = "unit_type")
	private int unitType;
	
	@Column(name ="amount")
	private double amount;
	
	@Column(name = "output_date")
	private Date date;
	
	@Column(name = "department_id")
	private int departmentId;
}
