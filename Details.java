
//ACCOUNT DETAILS PAGE

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;

public class Details extends Bank
{
	private static final long serialVersionUID = 1L;

	
	//CREATE FRAME
	public Details() 
	{
		initComponents();
		setVisible(true);
		setSize(560,600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		this.getContentPane().setBackground(new Color(0, 153, 153));
		setTitle("DETAILS");
		setResizable(false);
	}
	
	//COMPONENT DECLARATION
	JPanel P1;
	
	JLabel L1, L2, L3, L4, L5, L6, L11, L21, L31, L41, L51, L61, LabelHead;

	int n=getAccNo(u);//ACC NO TAKEN


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
		
		L11 = new JLabel();
		L21 = new JLabel();
		L31 = new JLabel();
		L41 = new JLabel();
		L51 = new JLabel();
		L61 = new JLabel();
		
		setLayout(null);
		
		//TITLE
		LabelHead.setFont(new Font("Cambria Math", 1, 36)); 
		LabelHead.setHorizontalAlignment(SwingConstants.CENTER);
		LabelHead.setText("ACCOUNT DETAILS");
		LabelHead.setForeground(Color.white);
		LabelHead.setVerticalAlignment(SwingConstants.BOTTOM);
		LabelHead.setBounds(20, 30, 540, 40);

		
		//PANEL 1
		P1.setLayout(null);
		P1.setBackground(new Color(102, 255, 255));
		P1.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		P1.setBounds(50, 80, 450, 430);

		L1.setFont(new Font("Verdana", 0, 14));
		L1.setText("NAME: ");
		L1.setBounds(40, 40, 200, 40);

		L11.setFont(new Font("Verdana", Font.BOLD, 14));
		L11.setText(FName[n]+" "+LName[n]);
		L11.setBounds(260, 40, 200, 40);

		L2.setFont(new Font("Verdana", 0, 14));
		L2.setText("USERNAME: ");
		L2.setBounds(40, 100, 200, 40);

		L21.setFont(new Font("Verdana", Font.BOLD, 14));
		L21.setText(""+U[n]);
		L21.setBounds(260, 100, 200, 40);

		L3.setFont(new Font("Verdana", 0, 14)); 
		L3.setText("ID TYPE:");
		L3.setBounds(40, 160, 200, 40);

		L31.setFont(new Font("Verdana", Font.BOLD, 14)); 
		L31.setText(""+IDType[n]);
		L31.setBounds(260, 160, 200, 40);

		L4.setFont(new Font("Verdana", 0, 14)); 
		L4.setText("ID NUMBER:");
		L4.setBounds(40, 220, 200, 40);

		L41.setFont(new Font("Verdana", Font.BOLD, 14)); 
		L41.setText(""+IDNo[n]);
		L41.setBounds(260, 220, 200, 40);

		L5.setFont(new Font("Verdana", 0, 13)); 
		L5.setText("SAVINGS ACCOUNT BALANCE:");
		L5.setBounds(40, 280, 200, 40);

		L51.setFont(new Font("Verdana", Font.BOLD, 13)); 
		L51.setText(""+Save[n]);
		L51.setBounds(260, 280, 200, 40);

		L6.setFont(new Font("Verdana", 0, 13)); 
		L6.setText("CURRENT ACCOUNT BALANCE:");
		L6.setBounds(40, 340, 200, 40);

		L61.setFont(new Font("Verdana", Font.BOLD, 13)); 
		L61.setText(""+Curr[n]);
		L61.setBounds(260, 340, 200, 40);

		
		//ADD TO PANEL
		P1.add(L1);
		P1.add(L2);
		P1.add(L3);
		P1.add(L4);
		P1.add(L5);
		P1.add(L6);
		P1.add(L11);
		P1.add(L21);
		P1.add(L31);
		P1.add(L51);
		P1.add(L61);
		P1.add(L41);

		//ADD TO FRAME
		add(LabelHead);
		add(P1);
	}
}