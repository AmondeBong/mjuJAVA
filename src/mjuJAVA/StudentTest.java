package mjuJAVA;
class Person{
	protected int SID,weight;
	protected String name;
	protected String tel;
	
	public Person() {
		SID = 60205210;
		name = "Minsu";
		tel = "0109698";
		weight = 50;
	}
	
	public int getSid() {
		return SID;
	}
	public String getName() {
		return name;
	}
	public int getWeight() {
		return weight;
	}
	
}

class Student extends Person{
	private int dept;
	public Student() {
		dept = 160;
	}
	public int getDept() {
		return dept;
	}
	
}
public class StudentTest {
	public static void main(String[] args){
		Student s= new Student();
		System.out.println("SID: "+s.getSid()+" , Name: "+s.getName()+" , tel: "+s.tel+" , weight: "+s.getWeight()+" , dept: "+s.getDept());
	}
}
