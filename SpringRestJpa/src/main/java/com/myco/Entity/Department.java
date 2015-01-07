package com.myco.Entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.codehaus.jackson.annotate.JsonManagedReference;

@Entity	
public class Department {

		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
	    private int dep_id;
		
		@Column()
	    private String name;
	    
	    @OneToMany(mappedBy="department")
	    @JsonManagedReference
	    private List<Employee> elist;
	    
	    
	    public List<Employee> getElist() {
			return elist;
		}

		public void setElist(List<Employee> elist) {
			this.elist = elist;
		}

		public int getId() {

	    	return dep_id;
	    }
	    
	    public void setId(int id) {

	    	this.dep_id = id;
	    }
	    
	    public String getName() {

	    	return name;
	    }
	    
	    public void setName(String deptName) {

	    	this.name = deptName;
	    }

		@Override
		public String toString() {
			return "Department [id=" + dep_id + ", name=" + name + "]";
		}

	
	
}
