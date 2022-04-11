package backhand.StockProjectJava.entities.Concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "unit_types")
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLzyInitializer","handler","productOutputs"})
public class UnitType {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "unit_type_id")
	private int unitTypeId;
	
	@Column(name = "unit_type_name")
	private String unitTypeName;
	
	@OneToMany(mappedBy = "unitType")
	private List<ProductOutput> productOutputs;
}
