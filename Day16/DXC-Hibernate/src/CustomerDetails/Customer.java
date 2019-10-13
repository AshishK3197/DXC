package CustomerDetails;

import javax.persistence.Id;

import javax.persistence.Entity;

	@Entity
	public class Customer {

	@Id
	int custId;
	String custName;

	
	
	
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
	return custName;
	}
	public void setCustName(String custName) {
	this.custName = custName;
	}

    @Override
	public String toString() {
		return getCustName();
	}
	
	}

