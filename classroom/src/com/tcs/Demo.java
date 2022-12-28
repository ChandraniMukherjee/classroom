package com.tcs;

class Demo {

	public static void main(String[] args) {
		Student s = new Student();
		s.setName("Chandrani");
		s.setRoll(179);

		Teacher t = new Teacher();
		t.setSubject("Core Java");

		System.out.println(s);
		System.out.println(t);

		Logic.takeClass(t);
		Logic.getClass(s);
	}

}
