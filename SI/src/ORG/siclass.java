package ORG;

public class siclass {
public double principle;
public double rate;
public double time;
public double si;
public void calculate()
{
	si=(principle*time*rate)/100;
	System.out.println(si);
}
}
