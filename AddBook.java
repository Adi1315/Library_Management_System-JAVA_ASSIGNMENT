package CTS_Text_Java;

import java.util.List;

public class AddBook {
	int book_Id;
	String book_Name;
	String book_Aurthor;
	String book_Publisher;

	public AddBook(int book_Id, String book_Name, String book_Aurthor, String book_Publisher) {
		super();
		this.book_Id = book_Id;
		this.book_Name = book_Name;
		this.book_Aurthor = book_Aurthor;
		this.book_Publisher = book_Publisher;
	}

	public int getBook_Id() {
		return book_Id;
	}

	public void setBook_Id(int book_Id) {
		this.book_Id = book_Id;
	}

	public String getBook_Name() {
		return book_Name;
	}

	public void setBook_Name(String book_Name) {
		this.book_Name = book_Name;
	}

	// Display List of book:
	public static void display(List<AddBook> ablist) {
		for (int i = 0; i < ablist.size(); i++) {
			System.out.println(ablist.get(i));
		}

	}

	@Override
	public String toString() {
		return "AddBook [book_Id=" + book_Id + ", book_Name=" + book_Name + ", book_Aurthor=" + book_Aurthor
				+ ", book_Publisher=" + book_Publisher + "]";
	}

}
