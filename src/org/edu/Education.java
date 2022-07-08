package org.edu;

public class Education extends Engineer{
 void Ug() {
	 String ug="BBA";
	 System.out.println(ug);
 }
 public static void main(String[] args) {
	 Education ed=new Education();
	 ed.Ug();
	 ed.Ba();
	 ed.Ece();
}
}
