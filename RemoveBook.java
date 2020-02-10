package CTS_Text_Java;

public class RemoveBook {

	//Method to delete book from list:
	public static void remove(int id, java.util.List<AddBook> ablist) {
		for (int i = 0; i < ablist.size(); i++) {
			AddBook ab1 = ablist.get(i);
			if (id == ab1.getBook_Id()) {
				ablist.remove(ablist.indexOf(i));
				i--;
				break;

			}
		}
	}
}
