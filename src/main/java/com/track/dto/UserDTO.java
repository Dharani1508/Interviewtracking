package com.track.dto;

import org.springframework.stereotype.Component;

@Component
public class UserDTO {
		
	    private int userId;
		
		private String name;
	
		private String gender;
	    
		private String address;
	
		private String dob;
	    
		private String qualification;
		
		private float experience;
		
		private String userName;
	
		private String password;

		public UserDTO() {
			super();
		}

     
		public UserDTO(int userId, String name, String gender, String address, String dob, String qualification, float experience, String userName, String password) {
			super();
			this.userId = userId;
			this.name = name;
			this.gender = gender;
			this.address = address;
	
			this.dob = dob;
			this.qualification = qualification;
			this.experience = experience;
			this.userName = userName;
			this.password = password;
		}


		public int getUserId() {
			return userId;
		}

		public void setUserId(int userId) {
			this.userId = userId;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public String getAddress() {
			return address;
		}

		public String getDob() {
			return dob;
		}

		public void setDob(String dob) {
			this.dob = dob;
		}

		public String getQualification() {
			return qualification;
		}

		public void setQualification(String qualification) {
			this.qualification = qualification;
		}

		public float getExperience() {
			return experience;
		}

		public void setExperience(float experience) {
			this.experience = experience;
		}

		public String getUserName() {
			return userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		@Override
		public String toString() {
			return "User [userId=" + userId + ", name=" + name + ", gender=" + gender + ", address=" + address + ", dob=" + dob + ", qualification="
					+ qualification + ", experience=" + experience + ", userName=" + userName + ", password=" + password
					+ "]";
		}

	}