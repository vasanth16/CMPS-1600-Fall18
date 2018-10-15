import javax.swing.*;
import java.awt.*;
import java.awt.Insets;




public class IDCardFrame extends JFrame{
	private String title;
	private String path = "/Users/vasanthrajasekaran/Desktop/Screen Shot 2018-10-08 at 3.14.36 PM.png";
	JLabel picture = new JLabel();
	JLabel name = new JLabel("Vasanth Rajasekaran");
	JLabel type = new JLabel("Java Programmer");
	JLabel height = new JLabel("Height: 6 Feet");
	JLabel weight = new JLabel("Weight: 145 Pounds");
	JLabel eyeColor = new JLabel("Eye Color: Brown");
	JLabel address = new JLabel("Address: Tulane University");

	public IDCardFrame (String t){
		this.title = t;
		setUpUI();
	}

	public void setUpUI(){

		GridBagConstraints gbc = new GridBagConstraints();

		this.setLayout(new GridBagLayout());
		this.setTitle(this.title);
		this.setSize(1000, 600);
		//this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

		// Picture work

		ImageIcon pic = new ImageIcon(path);
		picture.setIcon(pic);

		gbc.gridx = 1;
		gbc.gridy = 1;
		//gbc.anchor = GridBagConstraints.CENTER;
		this.add(picture,gbc);

		// setting the place of Name

		gbc.gridx = 1;
		gbc.gridy = 2;
		//gbc.anchor = GridBagConstraints.NORTH;
		this.add(name, gbc);

		
		// What I do 
		gbc.gridx = 1;
		gbc.gridy = 3;
		//gbc.anchor = GridBagConstraints.SOUTH;
		this.add(type, gbc);

		//height
		gbc.gridx = 1;
		gbc.gridy = 4;
		//gbc.anchor = GridBagConstraints.BELOW_BASELINE;
		this.add(height, gbc);

		//weight
		gbc.gridx = 1;
		gbc.gridy = 5;
		//gbc.anchor = GridBagConstraints.BASELINE;
		this.add(weight, gbc);
		
		// eyes
		gbc.gridx = 1;
		gbc.gridy = 6;
		//gbc.anchor = GridBagConstraints.EAST;
		this.add(eyeColor, gbc);

		//Address

		gbc.gridx = 1;
		gbc.gridy = 7;
		//gbc.anchor = GridBagConstraints.WEST;
		this.add(address, gbc);


this.setVisible(true);

	}

	public static void main(String[] args) {
		
		IDCardFrame id = new IDCardFrame("ID Card");
		id.setUpUI();
		//return;
	}



}