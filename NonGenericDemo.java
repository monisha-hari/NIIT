import java.util.*;
public class NonGenericDemo {
public static void main(String args[])
{
	ArrayList list=new ArrayList();
	list.add("Sudhir");
	list.add("Rohith");
	list.add("Mohith");
	Integer intr=(Integer)list.get(1);
	System.out.println(intr);
	
}
}
