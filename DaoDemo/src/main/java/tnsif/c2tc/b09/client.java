package tnsif.c2tc.b09;

public class client {

	public static void main(String[] args) throws Exception {
		Student s=new Student();
		s.setUID(2110624);
		s.setName("Yogesh");
		StudentDao sd=new StudentDao();
		sd.addStudent(s);

	}

}
