package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.w3c.dom.Entity;

import dto.Course;
import dto.Student;

public class CourseDao 
{

	public EntityManager getEntityManager()
	{
		return Persistence.createEntityManagerFactory("prabhu").createEntityManager();
	}
	
	public void updateCourse(int id,Course course)
	{
		EntityManager em=getEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Course dbCourse=em.find(Course.class,id);
	    if(dbCourse!=null)
	    {
	    	et.begin();
	    	course.setId(id);
	    	course.setStudents(dbCourse.getStudents());
	    	em.merge(course);
	    	et.commit();
	    }
	    else 
	    {
	    	System.out.println("sorry id is not be present");
	    }
	}


      public void deleteCourse(int id)
      {
    	  EntityManager em=getEntityManager();
    	  EntityTransaction et=em.getTransaction();
    	  Course dbCourse=em.find(Course.class,id);
    	  if(dbCourse!=null)
    	  {
    		  et.begin();
    		  
    		  List<Student> students=dbCourse.getStudents();
    		  for(Student student:students)
    		  {
    			  List<Course> courses=student.getCourses();
    			  courses.remove(dbCourse);
    			  student.setCourses(courses);
    		  }
    		  em.remove(dbCourse);
    		  et.commit();
    	  }
    	  else 
    	  {
    		  System.out.println("sorry id is not be present");
    	  }
      }

      
      public void findCourse(int id)
      {
    	  EntityManager em=getEntityManager();
    	  Course dbCourse=em.find(Course.class,id);
          
    	  if(dbCourse!=null)
    	  {
    		  System.out.println(dbCourse);
    	  }
    	  else
    	  {
    		  System.out.println("sorry id is not be present");
    	  }
    	  
      
      
      }









}

