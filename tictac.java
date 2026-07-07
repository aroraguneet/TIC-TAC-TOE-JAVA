package first;
import java.awt.Font;
import java.awt.Color;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class tictac implements ActionListener
{
	JFrame f;
	JPanel p;
	JLabel l;
	JButton b[]=new JButton[9];
	int flag=0,c=0;
	public tictac()
	{
		f=new JFrame("tictactoa");
		f.setSize(500,500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(null);
		f.getContentPane().setBackground(Color.black);
		l=new JLabel("TIC TAC TOE");
		l.setFont(new Font("Calibri",Font.BOLD,30));
		l.setBounds(150,50,200,50);
	    l.setForeground(Color.pink);
	    l.setBackground(Color.cyan);
	    p=new JPanel();
	    p.setLayout(new GridLayout(3,3));
	    p.setBounds(100,100,300,300);
	    for(int i=0;i<9;i++)
	    {
	    	b[i]=new JButton();
	    	b[i].addActionListener(this);
	    	p.add(b[i]);
	    }
		f.add(l); f.add(p);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		JButton bb=(JButton)e.getSource();
		if(bb.getText()=="")
		if(flag==0) 
		{
		bb.setText("X"); flag=1;c++;
		}
		else
		{
			bb.setText("O"); flag=0;c++;
		}
		if(b[0].getText()!="" && b[0].getText()==b[1].getText() && b[0].getText()==b[2].getText())
				JOptionPane.showMessageDialog(null,b[0].getText()+" WINS");
		else if(b[3].getText()!="" && b[3].getText()==b[4].getText() && b[3].getText()==b[5].getText())
			JOptionPane.showMessageDialog(null,b[0].getText()+" WINS");
		else if(b[6].getText()!="" && b[6].getText()==b[7].getText() && b[6].getText()==b[8].getText())
			JOptionPane.showMessageDialog(null,b[0].getText()+" WINS");
		else if(b[6].getText()!="" && b[6].getText()==b[7].getText() && b[6].getText()==b[8].getText())
			JOptionPane.showMessageDialog(null,b[0].getText()+" WINS");
		else if(b[0].getText()!="" && b[0].getText()==b[3].getText() && b[0].getText()==b[6].getText())
			JOptionPane.showMessageDialog(null,b[0].getText()+" WINS");
		else if(b[1].getText()!="" && b[1].getText()==b[4].getText() && b[1].getText()==b[7].getText())
			JOptionPane.showMessageDialog(null,b[0].getText()+" WINS");
		else if(b[2].getText()!="" && b[2].getText()==b[5].getText() && b[2].getText()==b[8].getText())
			JOptionPane.showMessageDialog(null,b[0].getText()+" WINS");
		else if(b[0].getText()!="" && b[0].getText()==b[4].getText() && b[0].getText()==b[8].getText())
			JOptionPane.showMessageDialog(null,b[0].getText()+" WINS");
		else if(b[2].getText()!="" && b[2].getText()==b[4].getText() && b[2].getText()==b[6].getText())
				JOptionPane.showMessageDialog(null,b[0].getText()+" WINS");
			if(c==9)
			{
				JOptionPane.showMessageDialog(null,"DRAW");
				for(int i=0;i<9;i++)
					b[i].setText("");
				flag=0;
				c=0;
			}
	}
	public static void main(String args[])
	{
		tictac ob=new tictac();
	}
}
