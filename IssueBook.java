package CTS_Text_Java;

import java.util.*;

public class IssueBook {
	int stid;
	int bkid;
	static List<IssueBook> islist = new ArrayList<IssueBook>();

	public IssueBook(int stid, int bkid) {
		super();
		this.stid = stid;
		this.bkid = bkid;
	}

	public int getStid() {
		return stid;
	}

	public void setStid(int stid) {
		this.stid = stid;
	}

	public int getBkid() {
		return bkid;
	}

	public void setBkid(int bkid) {
		this.bkid = bkid;
	}

	// Method for issue book to student:
	public static void issue(List<AddBook> ablist, List<AddStudent> aslist, int sid, int bid) {
		// TODO Auto-generated method stub

		int flag = 0;
		for (int i = 0; i < aslist.size(); i++) {
			AddStudent as = aslist.get(i);
			if (as.getStudent_Id() == sid) {
				for (int j = 0; j < ablist.size(); j++) {
					AddBook ab = ablist.get(j);
					if (ab.book_Id == bid) {

						islist.add(new IssueBook(sid, bid));
						flag = 1;
					}

				}
			}
		}
		if (flag == 0) {
			System.out.println("Book or Student not found!");
		} else {
			System.out.println("Book Issued!");
			System.out.println("___________________________________________");
		}
	}

	// To search Student by Id and Shows List of books issued to that student::
	public static void searchByStudentId(List<AddBook> ablist, List<AddStudent> stlist, int sid1) {
		for (int i = 0; i < islist.size(); i++) {
			IssueBook ib = islist.get(i);
			if (ib.getStid() == sid1) {
				for (int j = 0; j < ablist.size(); j++) {
					AddBook ab = ablist.get(j);
					if (ib.getBkid() == ab.getBook_Id()) {
						System.out.println(
								"Student ID:- " + sid1 + " Issue Book " + ib.getBkid() + " " + ab.getBook_Name());
					}
				}
			}
		}

	}

	// To search book by Id and Shows List of students who issues the book:
	public static void searchByBookId(List<AddBook> ablist, List<AddStudent> stlist, int bid1) {
		for (int i = 0; i < islist.size(); i++) {
			IssueBook ib = islist.get(i);
			if (ib.getBkid() == bid1) {
				for (int j = 0; j < stlist.size(); j++) {
					AddStudent as = stlist.get(j);
					if (ib.getStid() == as.getStudent_Id()) {
						System.out.println("Book ID:- " + bid1 + " Issue By " + ib.getStid() + " "
								+ as.getStudent_Name() + " " + as.getStudent_Branch());
					}
				}
			}
		}
	}

}
