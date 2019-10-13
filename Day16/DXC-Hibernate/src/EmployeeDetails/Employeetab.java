package EmployeeDetails;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employeetab {
	
	@Id
	int empid;
	String empname;
	int empage;
	String empdept;
	String city;
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public int getEmpage() {
		return empage;
	}
	public void setEmpage(int empage) {
		this.empage = empage;
	}
	public String getEmpdept() {
		return empdept;
	}
	public void setEmpdept(String empdept) {
		this.empdept = empdept;
	}
	
	public String toString() {
		return getEmpid()+ " "+ getEmpname()+ " " + getEmpage()+ " "+ getEmpdept()+ " " +getCity();
	}
	
}
