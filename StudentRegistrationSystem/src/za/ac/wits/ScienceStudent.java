/**
 * Class inherits Student
 */
package za.ac.wits;

/**
 *@author SirLinda
 *@version 1.0
 *
 */
class ScienceStudent extends Student{
	private String field;
	public ScienceStudent(String name, long studentNum, final String field) throws Exception {
		super(name, studentNum);
		// validation
		if(field == null) {
			throw new Exception("Invalid field");
		}
		this.field = field;
	}
	public String getField() {
		return field;
	}
	public void setField(String field) {
		this.field = field;
	}
}
