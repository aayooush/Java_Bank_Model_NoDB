
//LOGIN PAGE CLASS

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;

//COMMON EXCEPTION CLASS
class Exp extends Exception
{
	private static final long serialVersionUID = 1L;

	public Exp(String s)
	{
		super(s);
	}
}

public class LoginPage extends Bank
{
	private static final long serialVersionUID = 1L;

	//CREATE FRAME
	public LoginPage() 
	{
		initcomp();
		this.getContentPane().setBackground(new Color(0, 0, 102));
		setVisible(true);
		setSize(1280,720);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("BANK OF COMPUTER ENGINEERING");
		setResizable(false);
	}    

	//COMPONENT DECLARATION
	JPanel P1, P2;
	
	JLabel LT1, LT2, L1, L2, L3, L4, L5, L6, LE1, LE2, LE3, LabelHead;
	
	JTextField T1, T2, T3, T4;
	
	JPasswordField Pwd;

	JButton B1, B2, B3, BC1, BC2;

	JComboBox<String> CB;


	public void initcomp() 
	{
		//INITIALISING COMPONENTS
		P1 = new JPanel();
		P2 = new JPanel();
		
		LabelHead = new JLabel();
		LT1 = new JLabel();
		LT2 = new JLabel();
		L1 = new JLabel();
		L2 = new JLabel();
		L3 = new JLabel();
		L4 = new JLabel();
		L5 = new JLabel();
		L6 = new JLabel();
		LE1 = new JLabel();
		LE2 = new JLabel();
		LE3 = new JLabel();
		
		T1 = new JTextField(15);
		T2 = new JTextField(15);
		T3 = new JTextField(15);
		T4 = new JTextField(15);
		
		Pwd = new JPasswordField(15);
		
		B1 = new JButton();
		BC1 = new JButton();
		B3 = new JButton();
		B2 = new JButton();
		BC2 = new JButton();
		
		CB = new JComboBox<String>();

		setLayout(null);
		
		//TITLE
		LabelHead.setFont(new Font("Verdana", 0, 34));
		LabelHead.setForeground(Color.WHITE);
		LabelHead.setVerticalAlignment(SwingConstants.CENTER);
		LabelHead.setBounds(40, 10, 1200, 60);
		LabelHead.setText("BANK OF COMPUTER ENGINEERING");

		//PANEL 1
		P1.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		P1.setBounds(40, 90, 720, 500);
		P1.setLayout(null);
		P1.setBackground(new Color(153, 153, 255));
		
		LT1.setFont(new Font("Verdana", 0, 28));
		LT1.setHorizontalAlignment(SwingConstants.CENTER);
		LT1.setBorder(new LineBorder(Color.white, 2));
		LT1.setText("EXISTING USER");
		LT1.setBounds(60, 30, 600, 50);
		
		L1.setFont(new Font("Verdana", Font.BOLD, 16));
		L1.setText("ENTER USERNAME : ");
		L1.setVerticalAlignment(SwingConstants.BOTTOM);
		L1.setBounds(60, 150, 300, 50);
		
		T1.setFont(new Font("Verdana", 0, 15)); 
		T1.setBounds(60, 200, 340, 30);

		L2.setFont(new Font("Verdana", Font.BOLD, 16));
		L2.setText("ENTER PASSWORD :");
		L2.setVerticalAlignment(SwingConstants.BOTTOM);
		L2.setBounds(60, 250, 300, 50);
		
		Pwd.setFont(new Font("Verdana", 0, 15)); 
		Pwd.setBounds(60, 300, 340, 30);

		LE1.setFont(new Font("Verdana", 0, 10)); 
		LE1.setVerticalAlignment(SwingConstants.BOTTOM);
		LE1.setForeground(Color.red);
		LE1.setBounds(60, 340, 340, 30);
		
		LE2.setFont(new Font("Verdana", 0, 10));
		LE2.setForeground(Color.red);
		LE2.setBounds(60, 330, 300, 40);

		B1.setFont(new Font("Verdana", 0, 15));
		B1.setText("LOGIN");
		B1.setForeground(Color.red);
		B1.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		B1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		B1.setBounds(410, 170, 250, 60);
		B1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				int f = 0;
				u = T1.getText();
				p = new String(Pwd.getPassword());
				try
				{
					if(u.equals("")||p.equals(""))
						throw new Exp("EMPTY FIELD FOUND");
					else
					{
						for(int i=0;i < U.length; i++)
						{
							if(u.equals(U[i])&&p.equals(PS[i]))
							{
								f = 1;
								T1.setText("");
								Pwd.setText("");
								LE2.setText("");
								new Accounts();
								break;
							}
						}
						if(f==0)
							throw new Exp("INVALID USERNAME/PASSWORD");
					}
				}
				catch(Exp a)
				{
					LE2.setText(a.toString());
				}	
			}
		}
				);


		BC1.setFont(new Font("Verdana", 0, 15));
		BC1.setText("RESET CREDENTIALS");
		BC1.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		BC1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		BC1.setBounds(410, 270, 250, 60);
		BC1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				T1.setText("");
				Pwd.setText("");
				LE2.setText("");
			}
		});
		
		B3.setFont(new Font("Verdana", 0, 8));
		B3.setText("FORGOT PASSWORD");
		//B3.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		B3.setCursor(new Cursor(Cursor.HAND_CURSOR));
		B3.setBounds(410, 335, 250, 15);
		B3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				new FPass();
			}
		});

		
		//ADD TO PANEL
		P1.add(LT1);
		P1.add(L1);
		P1.add(T1);
		P1.add(L2);
		P1.add(Pwd);
		P1.add(LE1);
		P1.add(LE2);
		P1.add(B1);
		P1.add(BC1);
		P1.add(B3);

		//PANEL 2
		P2.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		P2.setBounds(800, 90, 440, 500);
		P2.setLayout(null);
		P2.setBackground(new Color(153, 153, 255));
		
		LT2.setFont(new Font("Verdana", 0, 28)); 
		LT2.setHorizontalAlignment(SwingConstants.CENTER);
		LT2.setText("NEW USER");
		LT2.setBorder(new LineBorder(Color.white, 2));
		LT2.setBounds(50,30,340,50);

		L3.setFont(new Font("Verdana", 0, 13));
		L3.setText("ENTER FIRST NAME :");
		L3.setVerticalAlignment(SwingConstants.BOTTOM);
		L3.setBounds(50, 100, 140, 30);

		T2.setFont(new Font("Verdana", 0, 13));
		T2.setBounds(210, 100, 180, 30);

		L4.setFont(new Font("Verdana", 0, 13)); 
		L4.setText("ENTER LAST NAME :");
		L4.setBounds(50, 150, 140, 30);

		T3.setFont(new Font("Verdana", 0, 13));
		T3.setBounds(210, 150, 180, 30);

		L5.setFont(new Font("Verdana", 0, 13)); 
		L5.setText("ID CARD :");
		L5.setBounds(50, 200, 140, 30);


		String[] list = new String[] { "NO SELECTION", "AADHAAR CARD", "PAN Card", "VOTER ID", "DRIVING ID" };
		CB.setModel(new DefaultComboBoxModel<>(list));
		CB.setCursor(new Cursor(Cursor.HAND_CURSOR));
		CB.setBounds(210, 200, 180, 30);

		L6.setFont(new Font("Verdana", 0, 13)); 
		L6.setText("ID NUMBER :");
		L6.setBounds(50, 250, 140, 30);

		T4.setFont(new Font("Verdana", 0, 13));
		T4.setBounds(210, 250, 180, 30);

		LE3.setFont(new Font("Verdana", 0, 10));
		LE3.setForeground(Color.red);
		LE3.setBounds(150, 290, 250, 30);


		B2.setFont(new Font("Verdana", 0, 15));
		B2.setText("REGISTER");
		B2.setForeground(Color.red);
		B2.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		B2.setCursor(new Cursor(Cursor.HAND_CURSOR));
		B2.setBounds(80, 350, 280, 50);
		B2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				int i = 0;
				String fn, ln, ID;
				fn = T2.getText();
				ln = T3.getText();
				i=CB.getSelectedIndex();
				ID = T4.getText();

				try
				{
					if(fn.equals("")||ln.equals("")||i==0||ID.equals(""))
					{
						throw new Exp("PLEASE FILL ALL FIELDS");
					}
					else
					{

						if((i == 1) && (ID.length() != 12))
							throw new Exp("INVALID AADHAAR CARD NUMBER");
						else if((i == 2) && (ID.length() != 10))
							throw new Exp("INVALID PAN CARD NUMBER");
						else if((i == 3) && (ID.length() != 10))
							throw new Exp("INVALID VOTER ID NUMBER");
						else if((i == 4) && (ID.length() != 13))
							throw new Exp("INVALID DRIVING ID NUMBER");
						else
						{
							FName[no] = fn.toUpperCase();
							LName[no] = ln.toUpperCase();
							IDType[no] = list[i];
							IDNo[no] = ID;
							new Register();
							T2.setText("");
							T3.setText("");
							T4.setText("");
							CB.setSelectedIndex(0);
							LE3.setText("");
						}
					}
				}
				catch(Exp a)
				{
					LE3.setText(a.toString());
				}
			}
		});

		BC2.setFont(new Font("Verdana", 0, 15));
		BC2.setText("RESET CREDENTIALS");
		BC2.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		BC2.setCursor(new Cursor(Cursor.HAND_CURSOR));
		BC2.setBounds(80, 410, 280, 50);
		BC2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				T2.setText("");
				T3.setText("");
				T4.setText("");
				CB.setSelectedIndex(0);
				LE3.setText("");
			}
		});

	
		//ADD TO PANEL
		P2.add(LT2);
		P2.add(L3);
		P2.add(T2);
		P2.add(L4);
		P2.add(T3);
		P2.add(L5);
		P2.add(CB);
		P2.add(L6);
		P2.add(T4);
		P2.add(LE3);
		P2.add(B2);
		P2.add(BC2);

		//ADD TO FRAME
		add(LabelHead);
		add(P1);
		add(P2);

	}
}