package com.track.dto;

import org.springframework.stereotype.Component;

@Component
public class CandidateDTO extends UserDTO{

		
		private String candidateName;
		
		private int interviewID;
	
		private String primarySkils;
		
		private String secondarySkils;
		
		private float experience;
		
		private String qualification;
		
		private String designation;
		
		private float noticePeriod;
	
		private String location;
		
		private String status;

		public CandidateDTO() {
			super();
			// TODO Auto-generated constructor stub
		}

		
		public CandidateDTO(String candidateName, int interviewID, String primarySkils, String secondarySkils,
				float experience, String qualification, String designation, float noticePeriod, String location,
				String status) {
			super();
			this.candidateName = candidateName;
			this.interviewID = interviewID;
			this.primarySkils = primarySkils;
			this.secondarySkils = secondarySkils;
			this.experience = experience;
			this.qualification = qualification;
			this.designation = designation;
			this.noticePeriod = noticePeriod;
			this.location = location;
			this.status = status;
		}


		public String getCandidateName() {
			return candidateName;
		}

		public void setCandidateName(String candidateName) {
			this.candidateName = candidateName;
		}

		public int getInterviewID() {
			return interviewID;
		}

		public void setInterviewID(int interviewID) {
			this.interviewID = interviewID;
		}

		public String getPrimarySkils() {
			return primarySkils;
		}

		public void setPrimarySkils(String primarySkils) {
			this.primarySkils = primarySkils;
		}

		public String getSecondarySkils() {
			return secondarySkils;
		}

		public void setSecondarySkils(String secondarySkils) {
			this.secondarySkils = secondarySkils;
		}

		public float getExperience() {
			return experience;
		}

		public void setExperience(float experience) {
			this.experience = experience;
		}

		public String getQualification() {
			return qualification;
		}

		public void setQualification(String qualification) {
			this.qualification = qualification;
		}

		public String getDesignation() {
			return designation;
		}

		public void setDesignation(String designation) {
			this.designation = designation;
		}

		public float getNoticePeriod() {
			return noticePeriod;
		}

		public void setNoticePeriod(float noticePeriod) {
			this.noticePeriod = noticePeriod;
		}

		public String getLocation() {
			return location;
		}

		public void setLocation(String location) {
			this.location = location;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		@Override
		public String toString() {
			return "Candidate [candidateName=" + candidateName + ", interviewID="
					+ interviewID + ", primarySkils=" + primarySkils + ", secondarySkils=" + secondarySkils
					+ ", experience=" + experience + ", qualification=" + qualification + ", designation=" + designation
					+ ", noticePeriod=" + noticePeriod + ", location=" + location + ", status=" + status + "]";
		}

	}

