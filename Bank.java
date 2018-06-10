/*
OOPM MINI PROJECT

BANK

AAYUSH SINGH B349
DEEPANSHU SONPAROTE B351
NITISH TALEKAR B354

COMPS SE
*/


import javax.swing.JFrame;

public class Bank extends JFrame
{
	private static final long serialVersionUID = 1L;

	//VARIABLES FOR DATA
	static int no = 1;
	static String u, p;
	static double intr=4;

	static String U[]=new String[10];
	static double Save[]=new double[10];
	static double Curr[]=new double[10];
	static String PS[]=new String[10];

	static String FName[] = new String[10];
	static String LName[] = new String[10];
	static String IDType[] = new String[10];
	static String IDNo[] = new String[10];
	static String SQAns[] = new String[10];

	public int getAccNo(String x)//TO GET ACC NO.
	{
		for(int i=0;i<U.length;i++)
		{
			if(U[i].equals(x))
				return (i);
		}
		return -1;
	}

	public static boolean isNumber(String str)//TO CHECK NUMERIC VALUE
	{
		try 
		{
			Double.parseDouble(str);
		}catch(Exception e) 
		{
			return false;
		}
		return true;
	}

	public static void main(String[] args) 
	{
		U[0] = new String("User123");//DEFAULT ACCOUNT
		Save[0] = 20000;
		Curr[0] = 20000;
		PS[0] = new String("User123@");
		FName[0] = new String("NAME");
		LName[0] = new String("LASTNAME");
		IDType[0] = new String("ID CARD");
		IDNo[0] = new String("123456789000");
		SQAns[0] = new String("RGIT");

		new LoginPage();
	}
}