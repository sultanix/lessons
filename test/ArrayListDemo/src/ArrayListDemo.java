import java.util.*;
public class ArrayListDemo {
public static void main(String args[]){
	ArrayList list=new ArrayList();
	System.out.println("������ ������� �����������"+list.size());
	list.add("A");
	list.add("�");
	list.add("�");
	list.add("�");
	list.add("E");
	list.add("F");
	list.add(1,"A2");
	list.add(56+2);
	Thread s=Thread.currentThread();
	
	list.add(s);
	System.out.println("������ ����� ����������"+list.size());
	System.out.println("����� ����� ������"+list);
	list.remove("A");
	list.remove(2);
//	Integer s=((Integer)list.get(5));
	System.out.println("������ ����� ��������"+list.size());
	System.out.println("�������� ����������"+list);
//try{
	//((Thread)list.get(6)).;
//}
//catch (InterruptedException e){
//	System.out.println("����������� ");
//}
	((Thread)list.get(6)).setName("My Thread");
	System.out.println("�����"+list.get(4).getClass());
System.out.println("�������� ����������"+list);

}
	
	
}

