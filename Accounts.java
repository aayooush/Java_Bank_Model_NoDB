
//ACCOUNT PAGE CLASS

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;

public class Accounts extends Bank
{
	private static final long serialVersionUID = 1L;
	
	//CREATE FRAME
	public Accounts() 
	{
		initComponents();
		setVisible(true);
		setSize(1280,720);
		this.getContentPane().setBackground(new Color(0, 0, 102));
		setLocationRelativeTo(null);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setTitle("ACCOUNTS");
		setResizable(false);
	}

	//COMPONENT DECLARATION
	JPanel P2, P1;

	JLabel LH1, LH2, LT1, LT2, LT3, LT4, LT5, LT6, LT7,  L1, L2, L3, L4, L5, L6,  LE1, LE2, LE3, LE4, LabelHead;
	static JLabel LX1, LX2;

	JTextField T1, T2, T3, T4;
	
	JButton B1, B2, B3, B4, BLO, BD, BT;

	int n=getAccNo(u);//GET ACC NO

	void initComponents() 
	{
		LabelHead = new JLabel();
		P2 = new JPanel();
		P1 = new JPanel();
		
		LH1 = new JLabel();
		LH2 = new JLabel();
		LT1 = new JLabel();
		LT2 = new JLabel();
		LT3 = new JLabel();
		LT4 = new JLabel();
		LT5 = new JLabel();
		LT6 = new JLabel();
		LT7 = new JLabel();
		L1 = new JLabel();
		L2 = new JLabel();
		L3 = new JLabel();
		L4 = new JLabel();
		L5 = new JLabel();
		L6 = new JLabel();
		LX1 = new JLabel();
		LX2 = new JLabel();
		LE1 = new JLabel();
		LE2 = new JLabel();
		LE3 = new JLabel();
		LE4 = new JLabel();

		T1 = new JTextField(15);
		T2 = new JTextField(15);
		T3 = new JTextField(15);
		T4 = new JTextField(15);

		B1 = new JButton();
		B2 = new JButton();
		B3 = new JButton();
		B4 = new JButton();
		BLO = new JButton();
		BD = new JButton();
		BT = new JButton();

		setLayout(null);
		
		//TITLE
		LabelHead.setFont(new Font("Cambria Math", 0, 42));
		LabelHead.setForeground(Color.white);
		LabelHead.setHorizontalAlignment(SwingConstants.CENTER);
		LabelHead.setVerticalAlignment(SwingConstants.CENTER);
		LabelHead.setBounds(40, 20, 1200, 60);
		LabelHead.setText("MY ACCOUNT PORTAL");

		
		//PANEL 1
		P1.setBackground(new Color(0, 0, 255));
		P1.setBounds(10, 10, 1180, 100);
		P1.setLayout(null);

		LT1.setFont(new Font("Verdana", 0, 13));
		LT1.setText("ACCOUNT ID :");
		LT1.setForeground(Color.white);
		LT1.setBounds(10, 10, 200, 35);

		LT2.setFont(new Font("Verdana", Font.BOLD, 13));
		LT2.setText("00000"+(getAccNo(u)+1));
		LT2.setForeground(Color.white);
		LT2.setBounds(210, 10, 200, 35);

		LT3.setFont(new Font("Verdana",Font.BOLD, 18));
		LT3.setText(FName[n]+" "+LName[n]);
		LT3.setForeground(Color.white);
		LT3.setBounds(590, 10, 300, 30);

		LT4.setFont(new Font("Verdana", 0, 13));
		LT4.setText("CURRENT INTEREST RATE :");
		LT4.setForeground(Color.white);
		LT4.setBounds(10, 55, 200, 35);

		LT5.setFont(new Font("Verdana", Font.BOLD, 13));
		LT5.setText(""+intr);
		LT5.setForeground(Color.white);
		LT5.setBounds(210, 55, 200, 35);

		LT6.setFont(new Font("Verdana", 0, 13));
		LT6.setText("CURRENT OVERDRAFT LIMIT :");
		LT6.setForeground(Color.white);
		LT6.setBounds(590, 55, 200, 35);

		LT7.setFont(new Font("Verdana", Font.BOLD, 13));
		LT7.setText("2000");
		LT7.setForeground(Color.white);
		LT7.setBounds(850, 55, 200, 35);

		//ADD TO PANEL
		P1.add(LT1);
		P1.add(LT2);
		P1.add(LT3);
		P1.add(LT4);
		P1.add(LT5);
		P1.add(LT6);
		P1.add(LT7);

		//PANEL 2
		P2.setBackground(new Color(153, 153, 255));
		P2.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		P2.setLayout(null);
		P2.setBounds(40, 90, 1200, 540);

		
		//SAVINGS ACCOUNT
		LH1.setFont(new Font("Verdana", 1, 24));
		LH1.setHorizontalAlignment(SwingConstants.CENTER);
		LH1.setBorder(new LineBorder(Color.white, 2));
		LH1.setText("SAVINGS ACCOUNT");
		LH1.setBounds(10, 120, 580, 50);

		L1.setFont(new Font("Verdana", 0, 13));
		L1.setText("AVAILABE BALANCE :");
		L1.setBounds(30, 180, 150, 30);

		LX1.setFont(new Font("Verdana", Font.BOLD, 13));
		LX1.setText(""+Save[n]);
		LX1.setBounds(180, 180, 150, 30);

		L2.setFont(new Font("Verdana", 0, 13));
		L2.setText("ENTER AMOUNT TO DEPOSIT :");
		L2.setBounds(30, 230, 220, 30);

		T1.setFont(new Font("Verdana", 0, 13));
		T1.setBounds(290, 230, 150, 30);
		
		LE1.setFont(new Font("Verdana", 0, 10));
		LE1.setVerticalAlignment(SwingConstants.TOP);
		LE1.setForeground(Color.red);
		LE1.setBounds(290, 260, 250, 30);

		B1.setFont(new Font("Verdana", 0, 13));
		B1.setText("UPDATE");
		B1.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		B1.setBounds(450, 230, 100, 30);
		B1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					if(T1.getText().equals(""))
						throw new Exp("NO AMOUNT FOUND");
					if(!isNumber(T1.getText()))
						throw new Exp("ENTER NUMERIC VALUE ONLY");
					double d;
					d=Double.parseDouble(T1.getText());
					if(d<0)
						throw new Exp("INVALID AMOUNT FORMAT");
					Save[n]+=d;
					JOptionPane.showMessageDialog(null,"TRANSACTION SUCCESSFUL");
					if(Save[n]<2000.0)
						LX1.setForeground(Color.red);
					else	
						LX1.setForeground(Color.black);
					LX1.setText(""+Save[n]);
					LE1.setText("");
					T1.setText("");
				}catch(Exp a)
				{
					LE1.setText(a.toString());
				}
			}
		}
		);

		L3.setFont(new Font("Verdana", 0, 13));
		L3.setText("ENTER AMOUNT TO WITHDRAW :");
		L3.setBounds(30, 300, 220,30);

		T2.setFont(new Font("Verdana", 0, 13));
		T2.setBounds(290, 300, 150, 30);
		
		LE2.setFont(new Font("Verdana", 0, 10));
		LE2.setVerticalAlignment(SwingConstants.TOP);
		LE2.setForeground(Color.red);
		LE2.setBounds(290, 330, 250, 30);

		B2.setFont(new Font("Verdana", 0, 13));
		B2.setText("UPDATE");
		B2.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		B2.setBounds(450, 300, 100, 30);
		B2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					if(T2.getText().equals(""))
						throw new Exp("NO AMOUNT FOUND");
					if(!isNumber(T2.getText()))
						throw new Exp("ENTER NUMERIC VALUE ONLY");
					double d;
					d=Double.parseDouble(T2.getText());

					if(d<0)
						throw new Exp("INVALID AMOUNT FORMAT");
					if((Save[n]-d)<1500.0 && (Save[n]-d)>0.0)
					{
						int c = JOptionPane.showConfirmDialog(null,"AMOUNT IS CROSSING MINIMUM LIMIT \n CONTINUE?","UPDATE",JOptionPane.YES_NO_OPTION);
						if(c==JOptionPane.YES_OPTION)
						{
							JOptionPane.showMessageDialog(null,"CROSSED MINIMUM LIMIT.\n PLEASE DEPOSIT REQUIRED AMOUNT AT EARLIEST");
							Save[n]-=d;
						}
					}
					else if((Save[n]-d)<0)
					{
						JOptionPane.showMessageDialog(null,"INSUFFICIENT FUNDING.\n WITHDRAWAL NOT POSSIBLE");
					}
					else
					{
						JOptionPane.showMessageDialog(null,"TRANSACTION SUCCESSFUL");	
						Save[n]-=d;
					}
					if(Save[n]<2000.0)
						LX1.setForeground(Color.red);
					else	
						LX1.setForeground(Color.black);
					LX1.setText(""+Save[n]);
					LE2.setText("");
					T2.setText("");
				}catch(Exp a)
				{
					LE2.setText(a.toString());
				}
			}
		}
		);

		
		//CURRENT ACCOUNT
		LH2.setFont(new Font("Verdana", 1, 24));
		LH2.setHorizontalAlignment(SwingConstants.CENTER);
		LH2.setBorder(new LineBorder(Color.white, 2));
		LH2.setText("CURRENT ACCOUNT");
		LH2.setBounds(610, 120, 580, 50);

		L4.setFont(new Font("Verdana", 0, 13));
		L4.setText("AVAILABLE BALANCE :");
		L4.setBounds(630, 180, 150, 30);

		LX2.setFont(new Font("Verdana", Font.BOLD, 13));
		LX2.setText(""+Curr[n]);
		LX2.setBounds(800, 180, 150, 30);

		L5.setFont(new Font("Verdana", 0, 13));
		L5.setText("ENTER AMOUNT TO DEPOSIT :");
		L5.setBounds(630, 230, 220, 30);

		T3.setFont(new Font("Verdana", 0, 13));
		T3.setBounds(890, 230, 150, 30);
		
		LE3.setFont(new Font("Verdana", 0, 10));
		LE3.setVerticalAlignment(SwingConstants.TOP);
		LE3.setForeground(Color.red);
		LE3.setBounds(890, 260, 250, 30);


		B3.setFont(new Font("Verdana", 0, 13));
		B3.setText("UPDATE");
		B3.setBounds(1050, 230, 100, 30);
		B3.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		B3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					if(T3.getText().equals(""))
						throw new Exp("NO AMOUNT FOUND");
					if(!isNumber(T3.getText()))
						throw new Exp("ENTER NUMERIC VALUE ONLY");
					double d;
					d=Double.parseDouble(T3.getText());
					if(d<0)
						throw new Exp("INVALID AMOUNT FORMAT");
					Curr[n]+=d;
					JOptionPane.showMessageDialog(null,"TRANSACTION SUCCESSFUL");
					if(Curr[n]<2000.0)
						LX2.setForeground(Color.red);
					else
						LX2.setForeground(Color.black);
					LX2.setText(""+Curr[n]);
					LE3.setText("");
					T3.setText("");
				}catch(Exp a)
				{
					LE3.setText(a.toString());
				}
			}
		}
		);

		L6.setFont(new Font("Verdana", 0, 13));
		L6.setText("ENTER AMOUNT TO WITHDRAW :");
		L6.setBounds(630, 300, 220, 30);

		T4.setFont(new Font("Verdana", 0, 13));
		T4.setBounds(890, 300, 150, 30);
		
		LE4.setFont(new Font("Verdana", 0, 10));
		LE4.setVerticalAlignment(SwingConstants.TOP);
		LE4.setForeground(Color.red);
		LE4.setBounds(890, 330, 250, 30);

		B4.setFont(new Font("Verdana", 0, 13));
		B4.setText("UPDATE");
		B4.setBounds(1050, 300, 100, 30);
		B4.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		B4.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					if(T4.getText().equals(""))
						throw new Exp("NO AMOUNT FOUND");
					if(!isNumber(T4.getText()))
						throw new Exp("ENTER NUMERIC VALUE ONLY");
					double d;
					d=Double.parseDouble(T4.getText());
					if(d<0)
						throw new Exp("INVALID AMOUNT FORMAT");
					if((Curr[n]-d)<0.0 && (Curr[n]-d)>-2000.0)
					{
						int c = JOptionPane.showConfirmDialog(null,"AMOUNT IS BEING OVERDRAFTED \n CONTINUE?","UPDATE",JOptionPane.YES_NO_OPTION);
						if(c==JOptionPane.YES_OPTION)
						{
							double i=Curr[n]-d;
							JOptionPane.showMessageDialog(null,"AMOUNT OVERDRAFTED.\n AMOUNT TO RESTORE: "+(-1*i));
							Curr[n]-=d;
						}
					}
					else if((Curr[n]-d)<-2000.0)
					{
						JOptionPane.showMessageDialog(null,"OVERDRAFT LIMIT CROSSED.\n WITHDRAWAL NOT POSSIBLE");
					}
					else
					{
						JOptionPane.showMessageDialog(null,"TRANSACTION SUCCESSFUL");	
						Curr[n]-=d;
					}
					if(Curr[n]<2000.0)
						LX2.setForeground(Color.red);
					else
						LX2.setForeground(Color.black);
					LX2.setText(""+Curr[n]);
					LE4.setText("");
					T4.setText("");
				}catch(Exp a)
				{
					LE4.setText(a.toString());
				}
			}
		}
		);
		
		
		//FUNCTION BUTTONS
		BD.setFont(new Font("Verdana", 0, 13));
		BD.setText("MY ACCOUNT");
		BD.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		BD.setBounds(30, 400, 300, 50);
		BD.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				new Details();			
			}
		}
		);


		BT.setFont(new Font("Verdana", Font.BOLD, 13));
		BT.setText("TRANSFER");
		BT.setForeground(Color.red);
		BT.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		BT.setBounds(450, 400, 300, 50);
		BT.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				new Transfer();	
			}
		}
		);

		BLO.setFont(new Font("Verdana", Font.BOLD, 13));
		BLO.setText("LOGOUT");
		BLO.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		BLO.setBounds(870, 400, 300, 50);
		BLO.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				int c = JOptionPane.showConfirmDialog(null,"CONFIRM LOGOUT","LOGOUT",JOptionPane.YES_NO_OPTION);
				if(c==JOptionPane.YES_OPTION)
					dispose();
			}
		}
		);

		//ADD TO PANEL
		P2.add(P1);
		P2.add(LH1);
		P2.add(LH2);
		P2.add(L1);
		P2.add(L2);
		P2.add(L3);
		P2.add(L4);
		P2.add(L5);
		P2.add(L6);
		P2.add(LX1);
		P2.add(LX2);
		P2.add(LE1);
		P2.add(LE2);
		P2.add(LE3);
		P2.add(LE4);
		P2.add(T1); 
		P2.add(T2);
		P2.add(T3);
		P2.add(T4);
		P2.add(B1);
		P2.add(B2);
		P2.add(B3);
		P2.add(B4);
		P2.add(BLO);
		P2.add(BT);
		P2.add(BD);

		//ADD TO FRAME
		add(LabelHead);
		add(P2);
	}
}
