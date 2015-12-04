package edu.mattsam.semesterProject;

import java.io.Serializable;

public class Assignment implements Serializable{
	private String name;
	private double maxP;
	private double earnedP;
	private double bonusP; 
	private double average;
	private double totalPoints;
	private double totalAssignments;
	public Assignment(String n, double max, double earned, double bonus)
	{
		this.name = n;
		this.maxP = max;
		this.earnedP = earned;
		this.bonusP = bonus;
	}
	
	public double getTotalPoints(){
		return totalPoints;
	}
	
	public void setTotalPoints(){
		
	}
	
	public double getTotalAssignments(){
		return totalAssignments;
	}
	
	public double getAverage(){
		
		return average;
	}
	
	public void setAverage(double average){
		average = totalPoints/totalAssignments;
		this.average= average;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public double getMaxP() {
		return maxP;
	}
	public void setMaxP(double maxP) {
		this.maxP = maxP;
	}
	
	public double getEarnedP() {
		return earnedP;
	}
	public void setEarnedP(double earnedP) {
		this.earnedP = earnedP;
	}
	
	public double getBonusP() {
		return bonusP;
	}
	public void setBonusP(double bonusP) {
		this.bonusP = bonusP;
	}
	
	public double getPercent()
	{
		return (earnedP+bonusP)/maxP *100;
	}
	
	public String getLetterGrade()
	{
		double percent = this.getPercent();
		if(percent>= 90)
		{
			return "A";
		}
		else if(percent >=87)
		{
			return "B+";
		}
		else if(percent >=80)
		{
			return "B";
		}
		else if(percent >=77)
		{
			return "C+";
		}
		else if(percent >=70)  
		{
			return "C";
		}
		else if(percent >=67)
		{
			return "D+";
		}
		else if(percent >=60)
		{
			return "D";
		}
		else
		{
			return "F";
		}
	}
	
	
}
