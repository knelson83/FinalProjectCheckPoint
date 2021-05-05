
package com.mycompany.weighlossprogram;
import javax.swing.JOptionPane;

/**The program calculates how many miles an individual needs  
 * to walk in order to reach his or her weight goal.
 * @author kiwin
 */
public class WeightLossProgram {

	private String UserName;
	private int UserAge;
	private double UserWeight, GoalWeight;
	private double MilesWalked;
	String input;

	public WeightLossProgram(String UserName, int Userage, double UserWeight, double GoalWeigh,double MilesWalked){
		
	}
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

	public double getUserWeight() {
		return UserWeight;
	}

	public void setUserWeight(double UserWeight) {
		this.UserWeight = UserWeight;
	}

	public double getGoalWeight() {
		return GoalWeight;
	}

	public void setGoalWeight(double GoalWeight) {
		this.GoalWeight = GoalWeight;
	}

	public double getMilesWalked() {
		return MilesWalked;
	}

	public void setMilesWalked(double MilesWalked) {
		this.MilesWalked = MilesWalked;
	}

	public String getInput() {
		return input;
	}

	public void setInput(String input) {
		this.input = input;
	}

	public static void main(String[] args) {

		String response;
		response = JOptionPane.showInputDialog(" Enter your name: ");

		String name = response;

		response = JOptionPane.showInputDialog(" Enter your age: ");
		int age = Integer.parseInt(response);

		response = JOptionPane.showInputDialog(" Enter your weight: ");
		double weight = Double.parseDouble(response);

		response = JOptionPane.showInputDialog(" Enter your goal weight: ");
		double goalweight = Double.parseDouble(response);

		response = JOptionPane.showInputDialog(" Walking 5miles per day "
			+ "equals l pound of weight loss. Enter number "
			+ "of miles walked today: ");
		double miles = Double.parseDouble(response);

		String message = "Welcome " + name +"!" + " your current weight is "
			+ weight + " and your goalweight is " 
			+ goalweight + " you need to walk"
			+ " 5 miles per day to reach your goal weight.";

		System.out.println(message);


	}
}
