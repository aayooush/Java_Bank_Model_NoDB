
//REGISTERATION CLASS


//REGISTRATION PAGE PANEL

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;

public class Register extends Bank
{
	private static final long serialVersionUID = 1L;
	
	//CREATE FRAME
	public Register() 
	{
		initComponents();
		setVisible(true);
		setSize(600,720);
		setLocationRelativeTo(null);
		this.getContentPane().setBackground(new Color(0, 153, 76));
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setTitle("REGISTER");
		setResizable(false);
	}


	//COMPONENT DECLARATION
	JPanel P1;
	
	JLabel L1, L2, L3, L4, L5, L6, L7, LE1, LabelHead;

	JTextField T1, T2, T3, T4;
	
	JPasswordField Pwd1, Pwd2;
	
	JButton B1, BC1;

	void initComponents() 
	{
		P1 = new JPanel();
		
		LabelHead = new JLabel();
		L1 = new JLabel();
		L2 = new JLabel();
		L3 = new JLabel();
		L4 = new JLabel();
		L5 = new JLabel();
		L6 = new JLabel();
		L7 = new JLabel();
		LE1 = new JLabel();
		
		T1 = new JTextField(15);
		T2 = new JTextField(15);
		T3 = new JTextField(15);
		T4 = new JTextField(15);
		
		Pwd1 = new JPasswordField(15);
		Pwd2 = new JPasswordField(15);
		
		B1 = new JButton();
		BC1 = new JButton();

		setLayout(null);
		
		//TITLE
		LabelHead.setFont(new Font("Cambria Math", 1, 36)); 
		LabelHead.setHorizontalAlignment(SwingConstants.CENTER);
		LabelHead.setText("REGISTER  YOURSELF");
		LabelHead.setForeground(Color.white);
		LabelHead.setVerticalAlignment(SwingConstants.BOTTOM);
		LabelHead.setBounds(30, 30, 540, 40);

		//PANEL 1
		P1.setLayout(null);
		P1.setBackground(new Color(204, 255, 204));
		P1.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		P1.setBounds(50, 80, 490, 550);

		L1.setFont(new Font("Verdana", 0, 14));
		L1.setText("ENTER USERNAME: ");
		L1.setBounds(40, 40, 200, 40);

		T1.setFont(new Font("Verdana", 0, 14));
		T1.setBounds(260, 40, 200, 40);

		L2.setFont(new Font("Verdana", 0, 14));
		L2.setText("ENTER PASSWORD: ");
		L2.setBounds(40, 100, 200, 40);

		Pwd1.setFont(new Font("Verdana", 0, 14));
		Pwd1.setBounds(260, 100, 200, 40);

		L3.setFont(new Font("Verdana", 0, 14)); 
		L3.setText("CONFIRM PASSWORD: ");
		L3.setToolTipText("");
		L3.setBounds(40, 160, 200, 40);

		Pwd2.setFont(new Font("Verdana", 0, 14)); 
		Pwd2.setBounds(260, 160, 200, 40);

		L4.setFont(new Font("Verdana", 0, 13)); 
		L4.setText("SAVINGS INITIAL AMOUNT: ");
		L4.setBounds(40, 220, 200, 40);

		T2.setFont(new Font("Verdana", 0, 14));
		T2.setBounds(260, 220, 200, 40);

		L5.setFont(new Font("Verdana", 0, 13)); 
		L5.setText("CURRENT INITIAL AMOUNT: ");
		L5.setBounds(40, 280, 200, 40);

		T3.setFont(new Font("Verdana", 0, 14));
		T3.setBounds(260, 280, 200, 40);
		
		L6.setFont(new Font("Verdana", 1, 11)); 
		L6.setHorizontalAlignment(SwingConstants.CENTER);
		L6.setText("SECURITY QUESTION :- WHAT IS YOUR FAVOURITE WORD?");
		L6.setBounds(40, 340, 400, 30);
		
		L7.setFont(new Font("Verdana", 0, 13)); 
		L7.setText("ENTER ANSWER : ");
		L7.setBounds(40, 380, 200, 40);
		
		T4.setFont(new Font("Verdana", 0, 14));
		T4.setBounds(260, 380, 200, 40);

		LE1.setFont(new Font("Verdana", 0, 10));
		LE1.setForeground(Color.red);
		LE1.setBounds(160, 420, 300, 40);

		BC1.setText("CLEAR");
		BC1.setBounds(60, 480, 160, 40);
		BC1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				T1.setText("");
				T2.setText("");
				T3.setText("");
				T4.setText("");
				Pwd1.setText("");
				Pwd2.setText("");
				LE1.setText("");
			}
		});

		B1.setText("SUBMIT");
		B1.setBounds(280, 480, 160, 40);
		B1.setForeground(Color.red);
		B1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				int k=0, t=0, x=0, n=0, i=0;
				String p2, p1;
				String u, sqa;
				double asd,acd;
				asd=acd=0;
				String tmp1 = T2.getText();
				String tmp2 = T3.getText();
				p1=new String(Pwd1.getPassword());
				p2=new String(Pwd2.getPassword());
				u=T1.getText();
				sqa=T4.getText();

				try
				{
					if(u.equals("")||p1.equals("")||p1.equals("")||tmp1.equals("")||tmp2.equals("")||sqa.equals(""))
					{
						throw new Exp("PLEASE FILL ALL FIELDS");
					}
					else
					{
						for(int j=0;j < U.length; j++)
						{
							if(u.equals(U[j]))
							{
								throw new Exp("USERNAME ALREADY TAKEN");
							}
						}
						
						
						if(!isNumber(tmp1))
							throw new Exp("ENTER NUMERIC VALUE IN DEPOSIT");
						if(!isNumber(tmp2))
							throw new Exp("ENTER NUMERIC VALUE IN DEPOSIT");
						
						asd=Double.parseDouble(tmp1);
						if(asd<0)
							throw new Exp("INVALID AMOUNT");
						acd=Double.parseDouble(tmp2);
						if(acd<0)
							throw new Exp("INVALID AMOUNT");
						
						char c[]=new char[p1.length()];
						c=p1.toCharArray();
						for(i=0;i<p1.length();i++)
						{
							if(c[i]>='A' && c[i]<='Z')
								k++;
							else if(c[i]>='a' && c[i]<='z')
								x++;
							else if(c[i]>='0' && c[i]<='9')
								t++;
							else if(c[i]>='!' && c[i]<='/')
								n++;
							else if(c[i]>=':' && c[i]<='@')
								n++;
						}
						if(i<5)
							throw new Exp("PASSWORD MINIMUM LIMIT 5");
						else if(i>10)
							throw new Exp("PASSWORD LIMIT 10 ONLY");
						else if(k==0&&x==0)
							throw new Exp("ATLEAST ONE LETTER NEEDED");
						else if(k==0)
							throw new Exp("ATLEAST ONE UPPER CASE NEEDED");
						else if(x==0)
							throw new Exp("ATLEAST ONE LOWER CASE NEEDED");
						else if(t==0)
							throw new Exp("ATLEAST ONE DIGIT NEEDED");
						else if(n==0)
							throw new Exp("ATLEAST ONE SPECIAL CHAR NEEDED");
						else if(n>1)
							throw new Exp("ONLY ONE SPECIAL CHAR ALLOWED");
						else
						{
							if(p1.compareTo(p2)==0)
							{
								U[no]=u;
								PS[no]=p1;
								Save[no]=asd;
								Curr[no]=acd;
								SQAns[no]=sqa;
								JOptionPane.showMessageDialog(null,"ACCOUNT NO 00000"+(no+1));
								no++;
								dispose();
							}
							else
								throw new Exp("PASSWORDS DO NOT MATCH");
							LE1.setText("");
						}
					}
				}catch(Exp a)
				{
					LE1.setText(a.toString());
				}	
			}
		});

		//ADD TO PANEL
		P1.add(L1);
		P1.add(T1);
		P1.add(L2);
		P1.add(Pwd1);
		P1.add(L3);
		P1.add(Pwd2);
		P1.add(L4);
		P1.add(T2);
		P1.add(L5);
		P1.add(T3);
		P1.add(L6);
		P1.add(L7);
		P1.add(T4);
		P1.add(LE1);
		P1.add(BC1);
		P1.add(B1);

		//ADD TO FRAME
		add(LabelHead);
		add(P1);
	}
	public static void main(String arg[])
	{
		new Register();
	}
}