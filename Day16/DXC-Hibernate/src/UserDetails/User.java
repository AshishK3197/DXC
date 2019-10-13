package UserDetails;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="users")
@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, nullable = false)
	int uid;
	String UserName;
	
	@Embedded
	@AttributeOverrides({
	@AttributeOverride(name = "city", column = @Column(name = "HOME_CITY_NAME")),
	@AttributeOverride(name = "pinCode", column = @Column(name = "HOME_PINCODE_NAME")),
	@AttributeOverride(name = "Street", column = @Column(name = "HOME_STREET_NAME")),
	})
	Address homeaddress; 
	
	
	public Address getOfficeaddress() {
		return officeaddress;
	}
	public void setOfficeaddress(Address officeaddress) {
		this.officeaddress = officeaddress;
	}
	public Address getHomeaddress() {
		return homeaddress;
	}
	public void setHomeaddress(Address homeaddress) {
		this.homeaddress = homeaddress;
	}
	@Embedded
	@AttributeOverrides({
	@AttributeOverride(name = "city", column = @Column(name = "OFFICE_CITY_NAME")),
	@AttributeOverride(name = "pinCode", column = @Column(name = "OFFICE_PINCODE_NAME")),
	@AttributeOverride(name = "Street", column = @Column(name = "OFFICE_STREET_NAME")),
	})
	Address officeaddress;

	
	
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	
	
	
}
