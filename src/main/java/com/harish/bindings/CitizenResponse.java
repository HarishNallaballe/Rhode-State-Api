package com.harish.bindings;

public class CitizenResponse {
	
		private String name;
		private Long ssn;
		private String stateName;
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Long getSsn() {
			return ssn;
		}
		public void setSsn(Long ssn) {
			this.ssn = ssn;
		}
		
		public String getStateName() {
			return stateName;
		}
		public void setStateName(String stateName) {
			this.stateName = stateName;
		}
}

