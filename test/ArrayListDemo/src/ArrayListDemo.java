import java.util.*;
public class ArrayListDemo {
public static void main(String args[]){
	ArrayList list=new ArrayList();
	System.out.println("Размер вначале определения"+list.size());
	list.add("A");
	list.add("В");
	list.add("С");
	list.add("В");
	list.add("E");
	list.add("F");
	list.add(1,"A2");
	list.add(56+2);
	Thread s=Thread.currentThread();
	
	list.add(s);
	System.out.println("Размер после заполнения"+list.size());
	System.out.println("Вывод всего списка"+list);
	list.remove("A");
	list.remove(2);
//	Integer s=((Integer)list.get(5));
	System.out.println("Размер после удаления"+list.size());
	System.out.println("Конечное содержимое"+list);
//try{
	//((Thread)list.get(6)).;
//}
//catch (InterruptedException e){
//	System.out.println("ВЫнужденное ");
//}
	((Thread)list.get(6)).setName("My Thread");
	System.out.println("Класс"+list.get(4).getClass());
System.out.println("Конечное содержимое"+list);

}
	
	
}

