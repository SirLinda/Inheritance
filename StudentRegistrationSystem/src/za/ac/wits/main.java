package za.ac.wits;

/**
 *@author SirLinda
 *@version 1.0
 *
 */
public class main {

	public static void main(String[] args) {
		// Test
		try {
			Student s1 = new Student("SirLinda",100000);
			System.out.println(s1.getName());
			System.out.println(s1.getStudentNum());
			Student s2 = new ScienceStudent("Linda",100001,"Computer science");
			System.out.print(((ScienceStudent) s2).getField());
		} catch (Exception e) {
			// catch block
			e.printStackTrace();
		}
	}

}
