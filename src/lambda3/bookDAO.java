package lambda3;

import java.util.ArrayList;
import java.util.List;

public class bookDAO {
public List<book> getBooks(){
	List<book> books=new ArrayList<>();
	books.add(new book(10,"hcv",2000));
	books.add(new book(11,"rd sharma",3500));
	books.add(new book(12,"RS Aggrawal",3000));
	books.add(new book(11,"NCERT",3400));
	return books;
}
}
