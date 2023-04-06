package project7;

public class Main {
public static void main(String[] args) {
	MySortedSet<Integer> mss=new MySortedSet<Integer>();
	mss.add(1);
	mss.add(2);
	mss.add(3);
	mss.add(15);
	mss.add(135);
	mss.add(156);
	mss.add(174);
	mss.add(175);
	MySortedSet<String> mss2=new MySortedSet<String>();
	mss2.add("Pencil");
	mss2.add("NoteBook");
	mss2.add("TextBook");
	mss2.add("Rubber");
	mss2.add("Pen");
	mss2.add("Marker");
	MySortedSet<ClassA> mss3=new MySortedSet<ClassA>();
	mss3.add(new ClassA());
	mss3.add(new ClassA());
	mss3.add(new ClassA());
	mss3.add(new ClassA());
	mss3.add(new ClassA());
	mss3.add(new ClassA());
	
	System.out.println(mss);
	System.out.println(mss2);
	System.out.println(mss3);
}
}
