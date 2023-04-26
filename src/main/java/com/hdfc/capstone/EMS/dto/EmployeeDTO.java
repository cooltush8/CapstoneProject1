package com.hdfc.capstone.EMS.dto;

public class EmployeeDTO {

	
	
	 private int employeeId;
	    private String employeeName;

	    private String dateOfBirth;

		public int getEmployeeId() {
			return employeeId;
		}

		public void setEmployeeId(int employeeId) {
			this.employeeId = employeeId;
		}

		public String getEmployeeName() {
			return employeeName;
		}

		public void setEmployeeName(String employeeName) {
			this.employeeName = employeeName;
		}

		public String getDateOfBirth() {
			return dateOfBirth;
		}

		public void setDateOfBirth(String dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
		}

		public EmployeeDTO(int employeeId, String employeeName, String dateOfBirth) {
			super();
			this.employeeId = employeeId;
			this.employeeName = employeeName;
			this.dateOfBirth = dateOfBirth;
		}

		public EmployeeDTO() {
			super();
		}
	    
	    
	    
}
