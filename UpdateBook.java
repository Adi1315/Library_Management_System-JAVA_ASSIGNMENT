package CTS_Text_Java;

import java.awt.*;

public class UpdateBook {
	
	//Update Name of the Book:
	public void update(int id, String name, java.util.List<AddBook> ablist) {
		for (int i = 0; i < ablist.size(); i++) {
			AddBook ab1 = ablist.get(i);
			if (id == ab1.getBook_Id()) {
				ab1.setBook_Name(name);
			}
		}
	}

}
