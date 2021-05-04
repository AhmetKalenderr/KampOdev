
public class Main {

	public static void main(String[] args) {
		User user1 = new User();
		Instructor instructor1 = new Instructor();
		Student student1 = new Student();

		user1.id = 1;
		instructor1.userName = "Engin";
		instructor1.password = "1234"; //Değildir inş 
		student1.userName = "Ahmet";
		student1.password = "12345";
		
		UserManager userManager = new UserManager();
		InstructorManager instructorManager = new InstructorManager();
		StudentManager studentManager = new StudentManager();
		userManager.login(student1.userName);
		userManager.login(instructor1.userName);
		studentManager.ödevYükle();
		instructorManager.dersEkle();
		
		
	}

}
