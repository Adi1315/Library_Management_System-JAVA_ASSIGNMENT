package CTS_Text_Java;

import java.util.List;

public class AddStudent {
	int student_Id;
	String student_Name;
	String student_Branch;

	public AddStudent(int student_Id, String student_Name, String student_Branch) {
		super();
		this.student_Id = student_Id;
		this.student_Name = student_Name;
		this.student_Branch = student_Branch;
	}

	public int getStudent_Id() {
		return student_Id;
	}

	public void setStudent_Id(int student_Id) {
		this.student_Id = student_Id;
	}

	public String getStudent_Name() {
		return student_Name;
	}

	public void setStudent_Name(String student_Name) {
		this.student_Name = student_Name;
	}

	public String getStudent_Branch() {
		return student_Branch;
	}

	public void setStudent_Branch(String student_Branch) {
		this.student_Branch = student_Branch;
	}

	// Display List of Students:
	public static void display(List<AddStudent> stlist) {
		// TODO Auto-generated method stub
		for (int i = 0; i < stlist.size(); i++) {
			System.out.println(stlist.get(i));
		}

	}

	@Override
	public String toString() {
		return "AddStudent [student_Id=" + student_Id + ", student_Name=" + student_Name + ", student_Branch="
				+ student_Branch + "]";
	}

}
