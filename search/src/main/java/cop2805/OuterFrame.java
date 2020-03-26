package cop2805;
import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;
//Class containing the frames
public class OuterFrame {
//Constructs the main frame, 2 label objects, 2 text field objects, and 4 button objects
		JFrame frame1 = new JFrame("Search Engine");
		TextArea displayArea = new TextArea();
		TextField searchBar = new TextField();
		Label titleLabel = new Label("Search Engine");
		Label termsLabel = new Label("Search Terms:");
		Button searchButton = new Button("Search");
		Button aboutButton = new Button("About");
		Button indexButton = new Button("Index");
//		Button closeButton = new Button("Close");
		Button addButton = new Button("Add...");
		Button removeButton = new Button("Remove");
	public OuterFrame() {
//Sets positions/sizes of the buttons/labels/boxes and adds them to the frame
		searchButton.setBounds(500, 101, 80, 30);
		frame1.add(searchButton);
		aboutButton.setBounds(330, 380, 80, 30);
		frame1.add(aboutButton);
		indexButton.setBounds(245, 380, 80, 30);
		frame1.add(indexButton);
		titleLabel.setFont(new Font("Serif", Font.BOLD, 24));
		titleLabel.setBounds(300, 70, 300, 30);
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
	void addSearchButtonListener(ActionListener listenForSearchButton){ //Requires Handler in Controller.java
			searchButton.addActionListener(listenForSearchButton);
		}
	void addAboutButtonListener(ActionListener listenForAboutButton){ //Requires Handler in Controller.java
			aboutButton.addActionListener(listenForAboutButton);
		}
	void addIndexButtonListener(ActionListener listenForIndexButton){
			indexButton.addActionListener(listenForIndexButton);
		}
	void addAddButtonListener(ActionListener listenForAddButton){
			addButton.addActionListener(listenForAddButton);
	}
	void addRemoveButtonListener(ActionListener listenForRemoveButton){
			removeButton.addActionListener(listenForRemoveButton);
	}
	//getter for searchBar
	public String getSearch(){
		return searchBar.getText();
	}
	//Method sent to Event handler used to open the maintenance view when the user clicks "index"
	public static void openIndexWindow() {
		JFrame frame2 = new JFrame("Index");
		frame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		TextArea displayArea2 = new TextArea();
		Button addButton = new Button("Add...");
		Button removeButton = new Button("Remove");
		Label indexLabel = new Label("Index");
		indexLabel.setFont(new Font("Serif", Font.BOLD, 24));
		addButton.setBounds(70, 255, 80, 30);
		frame2.add(addButton);
		removeButton.setBounds(170, 255, 80, 30);
		frame2.add(removeButton);
		displayArea2.setBounds(62, 55, 380, 195);
		indexLabel.setBounds(230, 25, 60, 30);
		frame2.add(indexLabel);
		frame2.add(displayArea2);
		frame2.setSize(500, 350);
		frame2.setLayout(null);
		frame2.setVisible(true);
	}
}

