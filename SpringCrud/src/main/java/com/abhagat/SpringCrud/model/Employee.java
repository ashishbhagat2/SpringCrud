package com.abhagat.SpringCrud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "employee")

public class Employee {

	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    @Column(nullable = false, updatable = false)
	    private Long id;
	    private String name;
	    private String email;
	    private String jobTitle;
	    private String phone;
	    private String imageUrl;
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getJobTitle() {
			return jobTitle;
		}
		public void setJobTitle(String jobTitle) {
			this.jobTitle = jobTitle;
		}
		public String getPhone() {
			return phone;
		}
		public Employee() {
			super();
			// TODO Auto-generated constructor stub
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public String getImageUrl() {
			return imageUrl;
		}
		public void setImageUrl(String imageUrl) {
			this.imageUrl = imageUrl;
		}
		public Employee(Long id, String name, String email, String jobTitle, String phone, String imageUrl) {
			super();
			this.id = id;
			this.name = name;
			this.email = email;
			this.jobTitle = jobTitle;
			this.phone = phone;
			this.imageUrl = imageUrl;
		}
		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", jobTitle=" + jobTitle + ", phone="
					+ phone + ", imageUrl=" + imageUrl + "]";
		}
	    
	}
