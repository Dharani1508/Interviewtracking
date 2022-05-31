package com.track.util;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.track.dto.AdminDTO;
import com.track.dto.CandidateDTO;
import com.track.dto.EmployeeDTO;
import com.track.dto.InterviewScheduleDTO;
import com.track.dto.UserDTO;
import com.track.entity.Admin;
import com.track.entity.Candidate;
import com.track.entity.Employee;
import com.track.entity.InterviewSchedule;
import com.track.entity.User;

@Component
public class Converter {

//..................candidate.....................
	// converting DTO to Entity
	public static Candidate covertToCandidateEntity(CandidateDTO candidateDTO) {
		Candidate candidate = new Candidate();
		BeanUtils.copyProperties(candidateDTO, candidate);
		return candidate;
	}

	// converting Entity to DTO
	public static CandidateDTO covertToCandidateDTO(Candidate candidate) {
		CandidateDTO candidateDTO = new CandidateDTO();
		BeanUtils.copyProperties(candidate, candidateDTO);
		return candidateDTO;
	}

//.....................Admin..................
	public static Admin convertToAdminEntity(AdminDTO adminDTO) {
		Admin admin = new Admin();
		BeanUtils.copyProperties(adminDTO, admin);
		return admin;
	}

	public static AdminDTO convertToAdminDTO(Admin admin) {
		AdminDTO adminDTO = new AdminDTO();
		BeanUtils.copyProperties(admin, adminDTO);
		return adminDTO;
	}

//.........................InterviewSchedule...........................	
	public static InterviewSchedule convertToInterviewScheduleEntity(InterviewScheduleDTO interviewScheduleDTO) {
		InterviewSchedule interviewSchedule = new InterviewSchedule();
		BeanUtils.copyProperties(interviewScheduleDTO, interviewSchedule);
		return interviewSchedule;
	}

	public static InterviewScheduleDTO convertToInterviewScheduleDTO(InterviewSchedule interviewSchedule) {
		InterviewScheduleDTO interviewScheduleDTO = new InterviewScheduleDTO();
		BeanUtils.copyProperties(interviewSchedule, interviewScheduleDTO);
		return interviewScheduleDTO;
	}

	// .................user..........................
	public static User convertTouserEntity(UserDTO userDTO) {
		User user = new User();
		BeanUtils.copyProperties(userDTO, user);
		return user;
	}

	public static UserDTO convertToUserDTO(User user) {
		UserDTO userDTO = new UserDTO();
		BeanUtils.copyProperties(user, userDTO);
		return userDTO;
	}

	// ...................Employee.....................

	public static Employee convertToUserEntity(EmployeeDTO employeeDTO) {
		Employee employee = new Employee();
		BeanUtils.copyProperties(employeeDTO, employee);
		return employee;
	}

	public static EmployeeDTO convertToEmployeeDTO(Employee employee) {
		EmployeeDTO employeeDTO = new EmployeeDTO();
		BeanUtils.copyProperties(employee, employeeDTO);
		return employeeDTO;
	}

}
