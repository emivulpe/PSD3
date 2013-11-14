import java.util.ArrayList;




public class Student extends User {
	
	String email;
	int year;
	ArrayList<Course> courses;
	ArrayList<LabSession> labGroups;
	
	Student (String id,String fn, String ln, String mail,int y, ArrayList<Course> c, ArrayList<LabSession> lab){
		super(id, fn, ln);
		firstName=fn;
		lastName=ln;
		year=y;
		email=mail;
		courses=c;
		labGroups=c;
	}
	
	
	public int getYear(){
		return year;
	}
	
	public void setYear(int y){
		year=y;
	}
	
	public String getEmail(){
		return email;
	}
	
	public void setEmail(String mail){
		email=mail;
	}
	
	public ArrayList<Course> getCourseList(){
		return courses;
	}
	
	public void addToCourses(Course c){
		courses.add(c);
	}
	
	public void setCourses(ArrayList<Course> courseList){
		courses=courseList;
	}
	
	public ArrayList<LabSession> getLabSessions(){
		return labGroups;
	}
	
	public void setLabSession(ArrayList<LabSession> labs){
		labGroups=labs;
	}
	
	public void addLab(LabSession lab){
		labGroup.add(lab);
	}
	
	
	
	
}
