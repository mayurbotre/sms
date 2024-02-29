package net.javaguides.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.javaguides.sms.entity.Student;
import net.javaguides.sms.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication  implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
		/*
		 * studentRepository.save(new Student("Ramesh", "Bhosale", "ramesh@gmail.com"));
		 * studentRepository.save(new Student("Suresh", "Shinde", "suresh@gmail.com"));
		 * studentRepository.save(new Student("Prakash", "Jadhav",
		 * "prakash@gmail.com")); studentRepository.save(new Student("Rajesh", "Rane",
		 * "rajesh@gmail.com")); studentRepository.save(new Student("Kamlesh",
		 * "Kulkarni", "kamlesh@gmail.com")); studentRepository.save(new
		 * Student("Jitesh", "Deshpande", "jitesh@gmail.com"));
		 * studentRepository.save(new Student("Jignesh", "Joshi", "jignesh@gmail.com"));
		 * studentRepository.save(new Student("Kritesh", "Kale", "kritesh@gmail.com"));
		 */
	}

}
