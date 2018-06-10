
//TRANSFER PANELS(TABS)

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
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;

public class Transfer extends Bank
{
	private static final long serialVersionUID = 1L;

	//CREATE FRAME
	public Transfer() 
	{
		initComponents();
		setVisible(true);
		setSize(540,500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		this.getContentPane().setBackground(new Color(32, 32, 32));
		setTitle("Transfer Money");
		setResizable(false);
	}
	
	//COMPONENT DECLARATION
	JTabbedPane JT1;
	
	JPanel P1, P2;
	
	JLabel L1, L2, L3, L4, L5, L6, LE1, LE2, LabelHead;
	
	JTextField T1, T2, T3;
	
	JPasswordField Pwd1, Pwd2;	
	
	JButton B1, B2, BC1, BC2;
	
	int n=getAccNo(u);//ACC O TAKEN


	void initComponents() 
	{
		JT1 = new JTabbedPane();
		
		P1 = new JPanel();
		P2 = new JPanel();
		
		LabelHead = new JLabel();
		L1 = new JLabel();
		L2 = new JLabel();
		L3 = new JLabel();
		L4 = new JLabel();
		L5 = new JLabel();
		L6 = new JLabel();
		LE1 = new JLabel();
		LE2 = new JLabel();
		
		T1 = new JTextField(15);
		T2 = new JTextField(15);
		T3 = new JTextField(15);
		
		Pwd1 = new JPasswordField(15);
		Pwd2 = new JPasswordField(15);
		
		B1 = new JButton();
		B2 = new JButton();
		BC1 = new JButton();
		BC2 = new JButton();

		setLayout(null);
		
		//TITLE
		LabelHead.setFont(new Font("Cambria Math", 1, 36)); 
		LabelHead.setHorizontalAlignment(SwingConstants.CENTER);
		LabelHead.setText("TRANSFER");
		LabelHead.setForeground(Color.white);
		LabelHead.setVerticalAlignment(SwingConstants.BOTTOM);
		LabelHead.setBounds(10, 30, 500, 40);

		
		//PANEL 1
		P1.setLayout(null);
		P1.setBackground(new Color(192, 192, 192));
		P1.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		P1.setBounds(50, 80, 470, 300);

		L1.setFont(new Font("Verdana", 0, 14));
		L1.setText("TO ACCOUNT NO:");
		L1.setBounds(40, 40, 200, 40);

		T1.setFont(new Font("Verdana", 0, 14));
		T1.setBounds(260, 40, 200, 40);

		L2.setFont(new Font("Verdana", 0, 14));
		L2.setText("YOUR PASSWORD :");
		L2.setBounds(40, 100, 200, 40);

		Pwd1.setFont(new Font("Verdana", 0, 14));
		Pwd1.setBounds(260, 100, 200, 40);

		L3.setFont(new Font("Verdana", 0, 14)); 
		L3.setText("ENTER AMOUNT:");
		L3.setToolTipText("");
		L3.setBounds(40, 170, 200, 40);

		T2.setFont(new Font("Verdana", 0, 14)); 
		T2.setBounds(260, 170, 200, 40);

		LE1.setFont(new Font("Verdana", 0, 10));
		LE1.setForeground(Color.red);
		LE1.setBounds(230, 210, 300, 40);

		BC1.setText("CLEAR");
		BC1.setBounds(60, 250, 160, 40);
		BC1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				T1.setText("");
				T2.setText("");
				Pwd1.setText("");
				LE1.setText("");
			}
		});

		B1.setText("TRANSFER");
		B1.setBounds(280, 250, 160, 40);
		B1.setForeground(Color.red);
		B1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String p;
				String tmp1 = T1.getText();
				String tmp2 = T2.getText();
				p=new String(Pwd1.getPassword());
				int k=0;

				try
				{
					if(p.equals("")||tmp1.equals("")||tmp2.equals(""))
					{
						throw new Exp("PLEASE FILL ALL FIELDS");
					}
					else
					{
						if(!isNumber(tmp2))
							throw new Exp("ENTER NUMERIC VALUE ONLY");
						
						int num = Integer.parseInt(tmp1);
						double val=Double.parseDouble(tmp2);
						if(val<0)
							throw new Exp("INVALID AMOUNT");
						if(num-1>no)
							throw new Exp("RECIEVER ACCOUNT DOES NOT EXIST");
						if(p.compareTo(PS[n])!=0)
							throw new Exp("INVALID PASSWORD INPUT");
						if((Save[n]-val)<0.0)
						{
							throw new Exp("INSUFFICIENT FUNDING");
						}
						else
						{
							if((Save[n]-val)<1500.0 && (Save[n]-val)>0.0)
							{
								int c = JOptionPane.showConfirmDialog(null,"AMOUNT IS CROSSING MINIMUM LIMIT \n CONTINUE?","UPDATE",JOptionPane.YES_NO_OPTION);
								if(c==JOptionPane.YES_OPTION)
								{
									Save[n]-=val;
									Save[num-1]+=val;
									JOptionPane.showMessageDialog(null,"CROSSED MINIMUM LIMIT.\n PLEASE DEPOSIT REQUIRED AMOUNT AT EARLIEST");
									k=0;
								}
								else if(c==JOptionPane.NO_OPTION)
									k=1;
							}
							else 
							{
								Save[n]-=val;
								Save[num-1]+=val;
								JOptionPane.showMessageDialog(null,"TRANSACTION SUCCESSFUL");
								k=0;
							}
							if(Save[n]<2000.0)
								Accounts.LX1.setForeground(Color.red);
							else	
								Accounts.LX1.setForeground(Color.black);
							Accounts.LX1.setText(""+Save[n]);
							if(k==0)
								dispose();
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
		P1.add(T2);
		P1.add(LE1);
		P1.add(BC1);
		P1.add(B1);

		//PANEL 2
		P2.setLayout(null);
		P2.setBackground(new Color(192, 192, 192));
		P2.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		P2.setBounds(50, 80, 470, 300);

		L4.setFont(new Font("Verdana", 1, 16));
		L4.setHorizontalAlignment(SwingConstants.CENTER);
		L4.setVerticalAlignment(SwingConstants.CENTER);
		L4.setText("TRANSFER FROM SAVINGS TO CURRENT");
		L4.setBounds(40, 40, 420, 40);

		L5.setFont(new Font("Verdana", 0, 14));
		L5.setText("ENTER PASSWORD :");
		L5.setBounds(40, 100, 200, 40);

		Pwd2.setFont(new Font("Verdana", 0, 14));
		Pwd2.setBounds(260, 100, 200, 40);

		L6.setFont(new Font("Verdana", 0, 14)); 
		L6.setText("ENTER AMOUNT:");
		L6.setBounds(40, 170, 200, 40);

		T3.setFont(new Font("Verdana", 0, 14)); 
		T3.setBounds(260, 170, 200, 40);

		LE2.setFont(new Font("Verdana", 0, 10));
		LE2.setForeground(Color.red);
		LE2.setBounds(260, 210, 300, 40);

		BC2.setText("CLEAR");
		BC2.setBounds(60, 250, 160, 40);
		BC2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				T3.setText("");
				Pwd2.setText("");
				LE2.setText("");
			}
		});

		B2.setText("TRANSFER");
		B2.setBounds(280, 250, 160, 40);
		B2.setForeground(Color.red);
		B2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String p;
				String tmp22 = T3.getText();
				p = new String(Pwd2.getPassword());
				int k=0;

				try
				{
					if(p.equals("")||tmp22.equals(""))
					{
						throw new Exp("PLEASE FILL ALL FIELDS");
					}
					else
					{
						if(!isNumber(tmp22))
							throw new Exp("ENTER NUMERIC VALUE ONLY");
						
						double val=Double.parseDouble(tmp22);
						if(val<0)
							throw new Exp("INVALID AMOUNT");
						if(p.compareTo(PS[n])!=0)
							throw new Exp("INVALID PASSWORD");
						if((Save[n]-val)<0.0)
						{
							throw new Exp("INSUFFICIENT FUNDING");
						}
						else
						{
							if((Save[n]-val)<1500.0 && (Save[n]-val)>0.0)
							{
								int c = JOptionPane.showConfirmDialog(null,"AMOUNT IS CROSSING MINIMUM LIMIT \n CONTINUE?","UPDATE",JOptionPane.YES_NO_OPTION);
								if(c==JOptionPane.YES_OPTION)
								{
									Save[n]-=val;
									Curr[n]+=val;
									JOptionPane.showMessageDialog(null,"CROSSED MINIMUM LIMIT.\n PLEASE DEPOSIT REQUIRED AMOUNT AT EARLIEST");
									k=0;
								}
								else if(c==JOptionPane.NO_OPTION)
									k=1;
							}
							else 
							{
								Save[n]-=val;
								Curr[n]+=val;
								JOptionPane.showMessageDialog(null,"TRANSACTION SUCCESSFUL");
								k=0;
							}
							if(Save[n]<2000.0)
								Accounts.LX1.setForeground(Color.red);
							else	
								Accounts.LX1.setForeground(Color.black);
							Accounts.LX1.setText(""+Save[n]);
							if(Curr[n]<2000.0)
								Accounts.LX2.setForeground(Color.red);
							else
								Accounts.LX2.setForeground(Color.black);
							Accounts.LX2.setText(""+Curr[n]);
							if(k==0)
								dispose();
						}
					}
				}catch(Exp a)
				{
					LE2.setText(a.toString());
				}	
			}
		});

		//ADD TO PANEL
		P2.add(L4);
		P2.add(L5);
		P2.add(Pwd2);
		P2.add(L6);
		P2.add(T3);
		P2.add(LE2);
		P2.add(BC2);
		P2.add(B2);
		
		//ADD TO TABS
		JT1.setBounds(10, 80, 500, 350);
		JT1.add("TRANSFER TO OTHER", P1);
		JT1.addTab("TRANSFER TO SELF", P2);
		
		//ADD TO FRAME
		add(LabelHead);
		add(JT1);
		
	}
}