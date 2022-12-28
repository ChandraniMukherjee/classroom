package com.tcs;

class Teacher {
	private String subject;

	Teacher() {
		// TODO Auto-generated constructor stub
	}

	Teacher(String subject) {
		this.subject = subject;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Teacher [subject=" + subject + "]";
	}

}
