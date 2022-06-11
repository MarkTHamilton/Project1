import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Color;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.text.AttributeSet.ColorAttribute;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class BetterFrame {

	private JFrame frame;
	private JRadioButton steakButton;
	private JRadioButton chickenButton;
	private JRadioButton salmonButton;
	private JRadioButton vegetarianButton;
	private JCheckBox friesCheckBox;
	private JCheckBox riceCheckBox;
	private JCheckBox mashedPotatoesCheckBox;
	private JCheckBox broccoliCheckBox;
	private JCheckBox beansCheckBox;
	private JRadioButton waterButton;
	private JRadioButton greenTeaButton;
	private JRadioButton lemonadeButton;
	private JRadioButton coffeeButton;
     /**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BetterFrame window = new BetterFrame();
					window.frame.setVisible(true);
					window.frame.setTitle("Menu Order");
					window.frame.pack();
					window.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BetterFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout());
		
		JLabel menuLabel = new JLabel("Menu", SwingConstants.CENTER);
		menuLabel.setFont(new Font("Serif", Font.BOLD, 24));
		menuLabel.setForeground(Color.WHITE);
		
		JPanel topPanel = new JPanel();
		topPanel.setBackground(Color.BLUE);
		topPanel.add(menuLabel);
		panel.add(topPanel, BorderLayout.NORTH);
		
		JPanel menuPanel = new JPanel();
        menuPanel.setLayout(new GridLayout(3, 1));
        
        JPanel entreePanel = new JPanel();
        entreePanel.setBackground(Color.CYAN);
        menuPanel.add(entreePanel);
        
		JLabel entreeLabel = new JLabel("Choose an entree: ");
		entreeLabel.setForeground(Color.BLUE);
		entreePanel.add(entreeLabel);
		
		steakButton = new JRadioButton("Steak");
		chickenButton = new JRadioButton("Chicken");
		salmonButton = new JRadioButton("Salmon");
		vegetarianButton = new JRadioButton("Vegetarian");
		steakButton.setBackground(Color.CYAN);
		chickenButton.setBackground(Color.CYAN);
		salmonButton.setBackground(Color.CYAN);
		vegetarianButton.setBackground(Color.CYAN);
		entreePanel.add(steakButton);
		entreePanel.add(chickenButton);
		entreePanel.add(salmonButton);
		entreePanel.add(vegetarianButton);
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(steakButton);
		buttonGroup.add(chickenButton);
		buttonGroup.add(salmonButton);
		buttonGroup.add(vegetarianButton);
		
		JPanel sidesPanel = new JPanel();
		sidesPanel.setBackground(Color.CYAN);
        menuPanel.add(sidesPanel);
		
		JLabel sidesLabel = new JLabel("Choose sides: ");
		sidesLabel.setForeground(Color.BLUE);
		sidesPanel.add(sidesLabel);
		
		friesCheckBox = new JCheckBox("Fries");
		riceCheckBox = new JCheckBox("Rice");
		mashedPotatoesCheckBox = new JCheckBox("Mashed Potatoes");
		broccoliCheckBox = new JCheckBox("Broccoli");
		beansCheckBox = new JCheckBox("Beans");
		friesCheckBox.setBackground(Color.CYAN);
		riceCheckBox.setBackground(Color.CYAN);
		mashedPotatoesCheckBox.setBackground(Color.CYAN);
		broccoliCheckBox.setBackground(Color.CYAN);
		beansCheckBox.setBackground(Color.CYAN);
		sidesPanel.add(friesCheckBox);
		sidesPanel.add(riceCheckBox);
		sidesPanel.add(mashedPotatoesCheckBox);
		sidesPanel.add(broccoliCheckBox);
		sidesPanel.add(beansCheckBox);
		
		JPanel beveragePanel = new JPanel();
		beveragePanel.setBackground(Color.CYAN);
        menuPanel.add(beveragePanel);
		
		JLabel beverageLabel = new JLabel("Choose beverage: ");
		beverageLabel.setForeground(Color.BLUE);
		beveragePanel.add(beverageLabel);
		
		waterButton = new JRadioButton("Water");
		greenTeaButton = new JRadioButton("Green Tea");
		lemonadeButton = new JRadioButton("Lemonade");
		coffeeButton = new JRadioButton("Coffee");
		
		waterButton.setBackground(Color.CYAN);
		greenTeaButton.setBackground(Color.CYAN);
		lemonadeButton.setBackground(Color.CYAN);
		coffeeButton.setBackground(Color.CYAN);
		beveragePanel.add(waterButton);
		beveragePanel.add(greenTeaButton);
		beveragePanel.add(lemonadeButton);
		beveragePanel.add(coffeeButton);
		ButtonGroup buttonGroup2 = new ButtonGroup();
		buttonGroup2.add(waterButton);
		buttonGroup2.add(greenTeaButton);
		buttonGroup2.add(lemonadeButton);
		buttonGroup2.add(coffeeButton);
		
		panel.add(menuPanel, BorderLayout.CENTER);
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.setBackground(Color.BLUE);
		
		JButton orderButton = new JButton("Place Order");
		orderButton.setFont(new Font("Serif", Font.BOLD, 18));
		orderButton.setBackground(Color.WHITE);
		buttonPanel.add(orderButton);
		panel.add(buttonPanel, BorderLayout.SOUTH);
		
		orderButton.addActionListener(new OrderListener());
		
	}
	
	private class OrderListener implements ActionListener   {
		public void actionPerformed(ActionEvent e)  {
			double price = 0;
			if(steakButton.isSelected()) {
				price+=15;
			}
			if(chickenButton.isSelected()) {
				price+=12;
			}
			if(salmonButton.isSelected()) {
				price+=18;
			}
			if(vegetarianButton.isSelected()) {
				price+=10;
			}
			if(friesCheckBox.isSelected()) {
				price+=5;
			}
			if(riceCheckBox.isSelected()) {
				price+=3;
			}
			if(mashedPotatoesCheckBox.isSelected()) {
				price+=4;
			}
			if(broccoliCheckBox.isSelected()) {
				price+=3;
			}
			if(beansCheckBox.isSelected()) {
				price+=4;
			}
			if(greenTeaButton.isSelected()) {
				price+=5;
			}
			if(lemonadeButton.isSelected()) {
				price+=4;
			}
			if(coffeeButton.isSelected()) {
				price+=3;
			}
			JOptionPane.showMessageDialog(null, "Ponderosa\nYour total is $" + String.format("%.2f", price)+"\nThank you for your order!");
					
		}
	}

}
/* We will build this project in multiple deliverables in an agile fashion.
   For the first deliverable, you are expected to write a brief project proposal. 
   Your proposal should contain the following (in brief)
1- project name
2- project description
3- possible features (around 10- the features may change later).
4- milestones (divide the project into phases).
5- phase 1 deliverable. (phase 1 should have at least 3 working features).
6- You project will utilize Some of the topics we covered in the course like Graphical user interface, 
   and file reading and writing.
 * I can extend a previous application such as the application called BookShopManager.
 */

/* The videos go through the basic features of window builder.
as you follow along, build an application that incorporates at least 10 features from Java Swing-window-builder.
Alternatively here is a different (newer) course which is also divided by feature.view both options and choose the one you prefer. 
Java Swing - 3 hour code along tutorial (Links to an external site.) 
If you are not able to view the videos due to no caption, you can review the video lectures and book examples. Choose 10 features covered in either or both and implement a Swing application including these features.
Submit your running project + list of features you are using.
*/
