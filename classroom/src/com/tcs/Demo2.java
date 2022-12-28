package com.tcs;

class Demo2 {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setName("Chandrani");
		s1.setRoll(179);

		Student s2 = new Student();
		s2.setName("Rishikesh");
		s2.setRoll(170);

		Student s3 = new Student();
		s3.setName("Nibedita");
		s3.setRoll(17);

		Student s[] = new Student[3];
		s[0] = s1;
		s[1] = s2;
		s[2] = s3;

		for (int i = 0; i < s.length; i++)
			System.out.println("Student name is " + s[i]);

		Student ss[] = { new Student("Piyush", 12), new Student("Bristi", 178), new Student("Ankita", 12) };

		for (Student x : ss)
			System.out.println("Student name is " + x.getName());
	}

}
