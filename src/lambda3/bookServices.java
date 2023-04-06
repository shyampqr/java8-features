package lambda3;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class bookServices {
public List<book> getbooksinSorting(){
	List<book> bookList=new bookDAO().getBooks();
	Collections.sort(bookList, new MyComprator());
	return bookList;
}
public static void main(String [] args) {
	//bookServices bs=new bookServices();
	//System.out.println(bs.getbooksinSorting());
	System.out.println(new bookServices().getbooksinSorting());
}
}
class MyComprator implements Comparator<book>{

	@Override
	public int compare(book o1, book o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}
	
	
}
