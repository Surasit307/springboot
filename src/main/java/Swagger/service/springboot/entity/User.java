package Swagger.service.springboot.entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
@Table(name="USER")
@Entity
public class User {

	@Id
	 @GeneratedValue(strategy= GenerationType.IDENTITY)
	 private Long sid;
	
	 @Column(name ="emr_fie_txt")
	 private String emr;
	  
	 
	 public Long getSid() {
	  return sid;
	 }
	 
	 public void setSid(Long sid) {
	  this.sid = sid;
	 }
	 
	 public String getEmr_fie_txt() {
	  return emr;
	 }
	 
	 public void setName(String emr) {
	  this.emr = emr;
	 }
	 
}
	 

