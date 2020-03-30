package cop2805;
import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;
//Class containing the frames
public class OuterFrame {
//Constructs the both frames, 2 label objects, 2 text field objects, and 4 button objects
		JFrame frame1 = new JFrame("Search Engine");
		JTextArea displayArea = new JTextArea();
		JTextField searchBar = new JTextField();
		JLabel titleLabel = new JLabel("Search Engine");
		JLabel termsLabel = new JLabel("Search Terms:");
		JButton searchJButton = new JButton("Search");
		JButton aboutJButton = new JButton("About");
		JButton indexJButton = new JButton("Index");
		static JFrame frame2 = new JFrame("Maintenance View");
	static String[] columnNames = {"ID", "Name","Existence","Modified"};// SAMPLE DATA
	static Object[][] data = {{"01", "C:/Java/Test.txt", "True", "12:00"},{"02", "C:/Java/Test.txt", "True", "12:01"}};
		static JTable displayArea2 = new JTable(data,columnNames);
		static JButton addJButton = new JButton("Add...");
		static JButton removeJButton = new JButton("Remove");
		static JButton regenIndexJButton = new JButton("Regen...");
		static JLabel indexLabel = new JLabel("Maintenance View");

	public OuterFrame() {
		searchJButton.setBounds(500, 101, 80, 30);
		frame1.add(searchJButton);
		aboutJButton.setBounds(375, 380, 80, 30);
		frame1.add(aboutJButton);
		indexJButton.setBounds(290, 380, 80, 30);
		frame1.add(indexJButton);
		titleLabel.setFont(new Font("Helvetica", Font.BOLD, 24));
		titleLabel.setBounds(285, 70, 300, 30);
		frame1.add(titleLabel);
		termsLabel.setBounds(150, 108, 100, 15);
		frame1.add(termsLabel);
		displayArea.setBounds(150, 140, 430, 225);
		frame1.add(displayArea);
		searchBar.setBounds(250, 105, 240, 25);
		frame1.add(searchBar);
		frame1.setSize(700, 480);
		frame1.setLayout(null);
		frame1.setVisible(true);
		frame1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	//MVC-Compliant Event handling gets sent to Controller.java
	void addSearchButtonListener(ActionListener listenForSearchJButton){ //Requires Handler in Controller.java
			searchJButton.addActionListener(listenForSearchJButton);
		}
	void addAboutButtonListener(ActionListener listenForAboutJButton){
			aboutJButton.addActionListener(listenForAboutJButton);
		}
	void addIndexButtonListener(ActionListener listenForIndexJButton){
			indexJButton.addActionListener(listenForIndexJButton);
		}
	void addAddButtonListener(ActionListener listenForAddJButton){
			addJButton.addActionListener(listenForAddJButton);
	}
	void addRemoveButtonListener(ActionListener listenForRemoveJButton){
			removeJButton.addActionListener(listenForRemoveJButton);
	}
	void addRegenButtonListener(ActionListener listenForRegenJButton){
		regenIndexJButton.addActionListener(listenForRegenJButton);
	}
	public String getSearch(){ //----
		return searchBar.getText();
	}
	public String getFileName(){
		JFileChooser fc = new JFileChooser();
		if(fc.showOpenDialog(frame2)==JFileChooser.APPROVE_OPTION)
			return fc.getSelectedFile().getAbsolutePath();
		else return "";
	}
	//Method sent to Event handler used to open the maintenance view when the user clicks "index"
	public static void openIndexWindow() {
		addJButton.setBounds(70, 255, 80, 30);
		frame2.add(addJButton);
		removeJButton.setBounds(170, 255, 80, 30);
		frame2.add(removeJButton);
		regenIndexJButton.setBounds(270,255,80,30);
		frame2.add(regenIndexJButton);
		displayArea2.setBounds(62, 55, 380, 195);
		indexLabel.setBounds(140, 25, 300, 30);
		indexLabel.setFont(new Font("Helvetica", Font.BOLD, 24));
		frame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame2.add(indexLabel);
		frame2.add(displayArea2);
		frame2.setSize(500, 350);
		frame2.setLayout(null);
		frame2.setVisible(true);
	}

public static void main(String[] args) {
	OuterFrame frame1 = new OuterFrame();
}
}
