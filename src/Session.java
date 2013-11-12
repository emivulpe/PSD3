import java.util.*;

public class Session {
	private boolean repeated;
	private boolean compulsory;
	private int	tutorNum;
	private String	location;
	private String	course;
	private String	name;
	private Time begin;
	private Time end;
	private ArrayList<Integer> years;
	private ArrayList<Student> listStudents;
	private int capacity;
	private int studentNum;
	
	public Session(boolean r,boolean c,int t, String l, String crs, int bh,int bm,int eh,int em, int[] y,int cap){
		repeated=r;
		compulsory=c;
		tutorNum=t;
		capacity=cap;
		studentNum=0;
		location=l;
		course=crs;
		listStudents=new ArrayList<Student>();
		begin=new Time(bh,bm);
		begin=new Time(eh,em);
		years=new ArrayList<Integer>();
		for(int i=0;i<y.length;i++){
			years.add(y[i]);
		}
	}
	
	public Session(boolean r,boolean c,int t, String l, String crs, String b,String e, int[] y,int cap){
		repeated=r;
		compulsory=c;
		tutorNum=t;
		location=l;
		course=crs;
		studentNum=0;
		listStudents=new ArrayList<Student>();
		capacity=cap;
		begin=new Time(b);
		begin=new Time(e);
		years=new ArrayList<Integer>();
		for(int i=0;i<y.length;i++){
			years.add(y[i]);
		}
	}
	
	public void addStudent(Student s) throws CapacityException{
		listStudents.add(s);
		studentNum++;
	}
	
	public void setListStudents(ArrayList<Student> listStudents) {
		this.listStudents = listStudents;
		studentNum=listStudents.size();
	}

	public int getCapacity() {
		return capacity;
	}
	
	public boolean isRepeated() {
		return repeated;
	}

	public void setRepeated(boolean repeated) {
		this.repeated = repeated;
	}

	public boolean isCompulsory() {
		return compulsory;
	}

	public void setCompulsory(boolean compulsory) {
		this.compulsory = compulsory;
	}

	public int getTutorNum() {
		return tutorNum;
	}

	public void setTutorNum(int tutors) {
		this.tutorNum = tutors;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Time getBegin() {
		return begin;
	}

	public void setBegin(Time begin) {
		this.begin = begin;
	}

	public Time getEnd() {
		return end;
	}

	public void setEnd(Time end) {
		this.end = end;
	}

	public ArrayList<Integer> getStudentClasses() {
		return years;
	}

	public void setStudentClasses(ArrayList<Integer> studentClasses) {
		this.years = studentClasses;
	}
	
	public int getNumStudent(){
		return studentNum;
	}
}
