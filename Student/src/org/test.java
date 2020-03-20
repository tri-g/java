package org;

public class test {

	public static void main(String[] args) {
		Students st=new Students();
		Teachers ta=new Teachers();
		st.name="Triveni";
		st.age=22;
		st.address="bangalore";
		st.phone=9876765456l;
		
		st.display();
		ta.name="jay ryan";
		ta.age=32;
		ta.address="sydney";
		
		ta.course="computer";
		
		ta.display();
		

	}

}
