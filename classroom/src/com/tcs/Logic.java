package com.tcs;

class Logic {
	public static void getClass(Student s) {
		System.out.println("The teacher is teaching the student " + s.getName());

	}

	public static void takeClass(Teacher t) {
		System.out.println("The student is taking class in the subject " + t.getSubject());
	}
}
