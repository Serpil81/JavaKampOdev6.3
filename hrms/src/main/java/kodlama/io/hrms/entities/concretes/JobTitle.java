package kodlama.io.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;



import lombok.Data;


@Entity 
@Table(name="job_titles")
@Data
public class JobTitle {

	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="job_name")
	private String job_name;
	
	
	public JobTitle() {}
	
	public JobTitle(int id, String job_name) {
		super();
		this.id = id;
		this.job_name = job_name;
	}
}
