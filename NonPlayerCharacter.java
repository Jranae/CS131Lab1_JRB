import java.util.*;
/*
 * *
 * This is our NonPlayer Character that inherits
 * from GameCharacter it represent objects the game controls 
 * (as opposed to objects a human player controls).
 * @author 
 * @version 1.3
 * Lab1
 * CS131ON
 */
public class NonPlayerCharacter extends GameCharacter{
	 private boolean active;
	 private String intelligenceType;

	 public boolean getactive(){
		 return active;
	 }
	 public String getintelligenceType(){
		 return intelligenceType;
	 }
	 public void setactive(boolean active){
		 this.active = active;
	 }
	 public void setintelligenceType(String intelligenceType){
		 this.intelligenceType = intelligenceType;
		 
	 }
	 public NonPlayerCharacter(String uniqueID, String personality, boolean active, String intelligenceType) {
		 super();
		 setactive(false);
		 setintelligenceType("AVERAGE");
		 
	 }
	 public NonPlayerCharacter() {
		 super();
		 setactive(false);
		 setintelligenceType("AVERAGE");
	 }
	public String reportStructure() {
		 super.reportStructure();
		 StringBuilder sb = new StringBuilder("==================================\n");
			sb.append("Active: "+getactive()+"\n");
			sb.append("Intelligence: "+getintelligenceType()+"\n");
			sb.append("==================================\n");
			
			return sb.toString();
			
		
		
	}
	public String introduce() {
		String introduce= "Hello, my name is "+ super.getUniqueID();
		return introduce;
		
		
	}
	public String exclaim() {
		String[] exclaim = {"Dag Gummit", "Doggone it", "Holy cow", "Jeez", "Well cheese and crackers"};
		Random generator = new Random();
		int index;
		index = generator.nextInt(5);
		return exclaim[index];
		
		
		
	}
}//end class
