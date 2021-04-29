
package com.mycompany.weighlossprogram;
import javax.swing.JOptionPane;

/**The program calculates how many miles an individual needs  
 * to walk in order to reach his or her weight goal.
 * @author kiwin
 */
public class WeightLossProgram {
	private String UserName;
	private int UserAge;
	private float UserWeight, UserHeight, GoalWeight;
	private int MilesWalked;
	String input;

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String UserName) {
		this.UserName = UserName;
	}

	public int getUserAge() {
		return UserAge;
	}

	public void setUserAge(int UserAge) {
		this.UserAge = UserAge;
	}

	public float getUserWeight() {
		return UserWeight;
	}

	public void setUserWeight(float UserWeight) {
		this.UserWeight = UserWeight;
	}

	public float getUserHeight() {
		return UserHeight;
	}

	public void setUserHeight(float UserHeight) {
		this.UserHeight = UserHeight;
	}

	public float getGoalWeight() {
		return GoalWeight;
	}

	public void setGoalWeight(float GoalWeight) {
		this.GoalWeight = GoalWeight;
	}

	public int getMilesWalked() {
		return MilesWalked;
	}

	public void setMilesWalked(int MilesWalked) {
		this.MilesWalked = MilesWalked;
	}


	public String getInput() {
		return input;
	}

	public void setInput(String input) {
		this.input = input;
	}
	
	public static void main (String[] args){
		
		
	String response;
	response = JOptionPane.showInputDialog(" Enter your name: ");
	String name = response;
	
	response = JOptionPane.showInputDialog(" Enter your age: ");
		int age = Integer.parseInt(response); 
		
	response = JOptionPane.showInputDialog(" Enter your weight: ");
	 float weight = Float.parseFloat(response);
	 
	 response = JOptionPane.showInputDialog(" Enter your height: ");
	 float height = Float.parseFloat(response);
	 
	 response = JOptionPane.showInputDialog(" Enter your goal weight: ");
	 float goalweight = Float.parseFloat(response);
	
	response = JOptionPane.showInputDialog(" Walking 5miles per day is equal to one l pound of weight loss. Enter number of miles walked today: " );
	 int miles  = Integer.parseInt(response);
	
	
	
	
	
	
	
	
}
	
}
