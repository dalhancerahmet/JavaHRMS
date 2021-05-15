package MyProject.Hrms.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pozitions")
public class Pozition {
	
	@Id
	@GeneratedValue
	@Column(name="pozition_id")
	private int id;
	
	@Column(name="pozition_title")
	private String title;
	
	@Column(name="pozition_description")
	private String description;
	
	public Pozition() {}
	
	public Pozition(int id, String title, String description) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
	}
	

	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	

}
