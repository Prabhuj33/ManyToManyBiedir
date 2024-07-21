package Controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dao.CourseDao;
import dao.StudentDao;
import dto.Course;
import dto.Student;

public class StudentCourseControl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Course c1=new Course();
//		c1.setId(1);
//		c1.setName("HTML");
//		c1.setPrice(2000);
//		
//		Course c2=new Course();
//		c2.setId(2);
//		c2.setName("CSS");
//		c2.setPrice(3000);
//		
//		Course c3=new Course();
//		c3.setId(3);
//		c3.setName("Java Script");
//		c3.setPrice(4000);
//		
//		List<Course> cou= new ArrayList<Course>() ;
//		cou.add(c1);
//		cou.add(c2);
//		cou.add(c3);
//	
//	
//		
//		
//		Student s1=new Student();
//		s1.setId(1);
//		s1.setName("prabhu");
//		s1.setAddress("Trichy");
//		
//		Student s2=new Student();
//		s2.setId(2);
//		s2.setName("Lathapandi");
//		s2.setAddress("Kumbaonam");
//		
//		Student s3=new Student();
//		s3.setId(3);
//		s3.setName("Ramya");
//		s3.setAddress("Kanchipuram");
//		
//	
//		List<Student> stu=new ArrayList<Student>();
//		stu.add(s1);
//		stu.add(s2);
//		stu.add(s3);
//		
//			
//		s1.setCourses(cou);
//		s2.setCourses(cou);
//		s3.setCourses(cou);
//		
//		c1.setStudents(stu);
//		c2.setStudents(stu);
//		c3.setStudents(stu);
//		
//		EntityManagerFactory emf=Persistence.createEntityManagerFactory("prabhu");
//		EntityManager em=emf.createEntityManager();
//		EntityTransaction et=em.getTransaction();
//		et.begin();
//		em.persist(s1);
//		em.persist(s2);
//		em.persist(s3);
//		em.persist(c1);
//		em.persist(c2);
//		em.persist(c3);
//		et.commit();

		
			//update
		
//		Course c=new Course();
//		c.setId(3);
//		c.setName("Python");
//		c.setPrice(50000);
//	
//		CourseDao d=new CourseDao();
//		d.updateCourse(3, c);
//		
//		Student s=new Student();
//		s.setId(3);
//		s.setName("Saasii");
//		s.setAddress("Andhra");
//	
//		StudentDao st=new StudentDao();
//		st.updateStudent(3, s);

		
		
		//find
//		
//		CourseDao c=new CourseDao();
//		c.findCourse(2);
		
		
		

//		CourseDao c=new CourseDao();
//		c.deleteCourse(3);

//      StudentDao d=new StudentDao();
//      d.deleteStudent(3);


}
	}