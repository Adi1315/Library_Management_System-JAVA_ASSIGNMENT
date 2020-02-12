package CTS_Text_Java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class LibraryMain {
	public static void main(String[] args) throws Exception {

		List<AddBook> bookList = new ArrayList<AddBook>();
		List<AddStudent> studentList = new ArrayList<AddStudent>();

		System.out.println("\n -------------------------Library Management System---------------------------\n");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			System.out.println("1.Add Book\n" + "2.Add Student \n" + "3.Update Book \n" + "4.Delete Book \n"
					+ "5.Issue Book To Student\n" + "6.Display List Of Students\n" + "7.Display List of Book\n"
					+ "8.Search Student By Id and display List Of Books Issued to Student\n"
					+ "9.Search Book By Id and display List Of Student Books has Issued\n" + "10.Exit");

			int choice = Integer.parseInt(br.readLine());
			switch (choice) {

			case 1: // Add book:
				System.out.println("Enter Book Id");
				int book_Id = Integer.parseInt(br.readLine());
				System.out.println("Enter Book Name");
				String book_Name = br.readLine();
				System.out.println("Enter Author Name");
				String bookAuthor = br.readLine();
				System.out.println("Enter Book Publisher");
				String book_Publisher = br.readLine();
				AddBook ab = new AddBook(book_Id, book_Name, bookAuthor, book_Publisher);
				bookList.add(ab);
				break;
			case 2:
				// add Student
				System.out.println("Enter Student Id");
				int student_Id = Integer.parseInt(br.readLine());
				System.out.println("Enter Student Name");
				String student_Name = br.readLine();
				System.out.println("Enter Student Branch");
				String student_Branch = br.readLine();
				AddStudent as = new AddStudent(student_Id, student_Name, student_Branch);
				studentList.add(as);
				break;
			case 3:
				// update book
				System.out.println("Enter Book Id");
				int update_book_Id = Integer.parseInt(br.readLine());
				System.out.println("Enter Book Name");
				String update_book_Name = br.readLine();
				UpdateBook upb = new UpdateBook();
				upb.update(update_book_Id, update_book_Name, bookList);
				break;
			case 4:
				// delete book
				System.out.println("Enter Book Id");
				int delete_book_Id = Integer.parseInt(br.readLine());
				RemoveBook.remove(delete_book_Id, bookList);
				break;
			case 5:
				// issue book to student
				System.out.println("Enter Student Id");
				int sid = Integer.parseInt(br.readLine());
				System.out.println("Enter Book Id");
				int bid = Integer.parseInt(br.readLine());
				IssueBook.issue(bookList, studentList, sid, bid);

				break;
			case 6:
				// display list of student
				AddStudent.display(studentList);
				break;
			case 7:
				// display list of Book
				AddBook.display(bookList);
				break;
			case 8:
				// Search Student By Id and display List Of Books Issued to Student
				System.out.println("Enter Student Id");
				int sid1 = Integer.parseInt(br.readLine());
				IssueBook.searchByStudentId(bookList, studentList, sid1);
				break;
			case 9:
				// 9.Search Book By Id and display List Of Student Books has Issued
				System.out.println("Enter Book Id");
				int bid1 = Integer.parseInt(br.readLine());
				IssueBook.searchByBookId(bookList, studentList, bid1);
				break;
			case 10:
				System.exit(0);
				break;

			}
		}

	}

}
