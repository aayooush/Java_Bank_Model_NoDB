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

public class FPass extends Bank
{
	private static final long serialVersionUID = 1L;

	public FPass()
	{
		initComponents();
		setVisible(true);
		setSize(600,540);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		this.getContentPane().setBackground(new Color(32, 32, 32));
		setTitle("Change Password");
		setResizable(false);
	}
	void initComponents()
	{
		JPanel P1;
		
		JLabel L1, L2, L3, L4, LE1, LabelHead;
		
		JPasswordField Pwd1, Pwd2;
		
		JTextField T1, T2;
		
		JButton B1, BC1;
		
		P1 = new JPanel();
		
		LabelHead = new JLabel();
		L1 = new JLabel();
		L2 = new JLabel();
		L3 = new JLabel();
		L4 = new JLabel();
		LE1 = new JLabel();
		
		T1 = new JTextField(15);
		T2 = new JTextField(15);
		
		Pwd1 = new JPasswordField(15);
		Pwd2 = new JPasswordField(15);
		
		BC1 = new JButton();
		B1 = new JButton();
		
		setLayout(null);
		
		LabelHead.setFont(new Font("Cambria Math", 1, 36)); 
		LabelHead.setHorizontalAlignment(SwingConstants.CENTER);
		LabelHead.setText("CHANGE PASSWORD");
		LabelHead.setForeground(Color.white);
		LabelHead.setVerticalAlignment(SwingConstants.BOTTOM);
		LabelHead.setBounds(30, 30, 540, 40);
		
		P1.setLayout(null);
		P1.setBackground(new Color(204, 255, 204));
		P1.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		P1.setBounds(50, 80, 490, 370);

		L1.setFont(new Font("Verdana", 0, 13));
		L1.setText("ENTER USERNAME: ");
		L1.setBounds(40, 40, 200, 40);

		T1.setFont(new Font("Verdana", 0, 13));
		T1.setBounds(260, 40, 200, 40);

		L2.setFont(new Font("Verdana", 0, 13));
		L2.setText("ENTER SECURITY ANSWER: ");
		L2.setBounds(40, 100, 200, 40);

		T2.setFont(new Font("Verdana", 0, 13));
		T2.setBounds(260, 100, 200, 40);

		
		L3.setFont(new Font("Verdana", 0, 13));
		L3.setText("ENTER NEW PASSWORD: ");
		L3.setBounds(40, 160, 200, 40);

		Pwd1.setFont(new Font("Verdana", 0, 13));
		Pwd1.setBounds(260, 160, 200, 40);

		L4.setFont(new Font("Verdana", 0, 13)); 
		L4.setText("CONFIRM PASSWORD: ");
		L4.setToolTipText("");
		L4.setBounds(40, 220, 200, 40);

		Pwd2.setFont(new Font("Verdana", 0, 13)); 
		Pwd2.setBounds(260, 220, 200, 40);

		LE1.setFont(new Font("Verdana", 0, 10));
		LE1.setForeground(Color.red);
		LE1.setBounds(160, 260, 300, 30);

		BC1.setText("CLEAR");
		BC1.setBounds(60, 300, 160, 40);
		BC1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				T1.setText("");
				T2.setText("");
				Pwd1.setText("");
				Pwd2.setText("");
				LE1.setText("");
			}
		});

		B1.setText("CHANGE");
		B1.setBounds(280, 300, 160, 40);
		B1.setForeground(Color.red);
		B1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				int k=0, t=0, x=0, n=0, i=0;
				String p2, p1;
				String u, sqa;
				p1=new String(Pwd1.getPassword());
				p2=new String(Pwd2.getPassword());
				u=T1.getText();
				sqa=T2.getText();
				try
				{
					if(u.equals("")||p1.equals("")||p1.equals("")||sqa.equals(""))
					{
						throw new Exp("PLEASE FILL ALL FIELDS");
					}
					else
					{
						int no = getAccNo(u);
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
						if(!sqa.equals(SQAns[no]))
							throw new Exp("INCORRECT SECURITY ANSWER");
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
								PS[no]=p1;
								JOptionPane.showMessageDialog(null,"PASSWORD UPDATED");
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
		
		P1.add(L1);
		P1.add(T1);
		P1.add(L2);
		P1.add(Pwd1);
		P1.add(L3);
		P1.add(Pwd2);
		P1.add(L4);
		P1.add(T2);
		P1.add(LE1);
		P1.add(BC1);
		P1.add(B1);
		
		add(LabelHead);
		add(P1);
	}
}
