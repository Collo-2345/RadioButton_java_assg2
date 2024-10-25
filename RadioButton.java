import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class RadioButton extends JFrame implements ActionListener{
  
	JRadioButton Birdbutton,Catbutton,Dogbutton,Rabbitbutton,Pigbutton;
	ImageIcon icon;
	JLabel label;
	JPanel panel1,panel2;
	RadioButton()
	{
        this.setTitle("...Radio Button Application...");//set title for our frame
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//close prgm when we close window
		this.setLayout(new FlowLayout());
		this.setResizable(false);//prevent window zoom in and out
		
		ImageIcon OriginalIcon = new ImageIcon("Pig.png");//set an image icon
        //Resize the image Icon
		Image image = OriginalIcon.getImage();
		Image resizedimage = image.getScaledInstance(250,250,Image.SCALE_SMOOTH);
		ImageIcon icon = new ImageIcon(resizedimage); 
		
		label = new JLabel();
		label.setIcon(icon);
		
		panel1 = new JPanel();//to store animals Button
		panel1.setLayout(new BoxLayout(panel1,BoxLayout.Y_AXIS));
		
		panel2 = new JPanel(); //store the label that contain image Icon
		panel2.setBounds(0,0,250,250);
		panel2.setPreferredSize(new Dimension(250,250));
		panel2.setBackground(Color.white);
		panel2.add(label);
		
		// create Animals buttons 
		Birdbutton = new JRadioButton("Bird");
		Birdbutton.setFocusable(false);
		Birdbutton.addActionListener(this);//perform Action when Button is Click
		
		Catbutton = new JRadioButton("Cat");
		Catbutton.setFocusable(false);
		Catbutton.addActionListener(this);
		
		Dogbutton = new JRadioButton("Dog");
		Dogbutton.setFocusable(false);
		Dogbutton.addActionListener(this);
		
		Rabbitbutton = new JRadioButton("Rabbit");
		Rabbitbutton.setFocusable(false);
		Rabbitbutton.addActionListener(this);
		
		Pigbutton = new JRadioButton("Pig");
		Pigbutton.setFocusable(false);
		Pigbutton.addActionListener(this);
		
		ButtonGroup group = new ButtonGroup();//Enable selection of one animal only at a time
		group.add(Birdbutton);
		group.add(Catbutton);
		group.add(Dogbutton);
		group.add(Rabbitbutton);
		group.add(Pigbutton);
		
		panel1.add(Birdbutton);//add buttons to panel
		panel1.add(Catbutton);
		panel1.add(Dogbutton);
		panel1.add(Rabbitbutton);
		panel1.add(Pigbutton);
		
		this.add(panel1);//add panel to our Frame
		this.add(panel2);
		this.setIconImage(icon.getImage());//set icon to our frame
		
		this.pack();
		this.setVisible(true);
		
		
	}

	@Override
	//It tells on Actions perform by clicking a button
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == Birdbutton)
		{
		//for Display information perform on the screen
			        JOptionPane.showMessageDialog(null, 
			        "You Select Bird", 
					"Information", 
					JOptionPane.INFORMATION_MESSAGE);
		}
		else if(e.getSource() == Catbutton)
		{
			        JOptionPane.showMessageDialog(null, 
			        "You Select Cat", 
					"Information", 
					JOptionPane.INFORMATION_MESSAGE);
		}
		else if(e.getSource() == Dogbutton) 
		{
			         JOptionPane.showMessageDialog(null, 
			        "You Select Dog", 
					"Information", 
					JOptionPane.INFORMATION_MESSAGE);
			        
	    }
		else if(e.getSource() == Rabbitbutton) 
		{
			         JOptionPane.showMessageDialog(null, 
			        "You Select Rabbit", 
					"Information", 
					JOptionPane.INFORMATION_MESSAGE);
			        
	    }
		else if(e.getSource() == Pigbutton) 
		{
			         JOptionPane.showMessageDialog(null, 
			        "You Select Pig ", 
					"Information", 
					JOptionPane.INFORMATION_MESSAGE);
			        
	    }
}
	public static void main(String[] args) {
		
		//Create instance of class 
	RadioButton radiobutton = new RadioButton();
}
}
