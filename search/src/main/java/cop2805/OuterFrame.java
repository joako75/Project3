package cop2805;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Class containing the frames
class OuterFrame implements ActionListener {
	
	OuterFrame(){
//Constructs the main frame, 2 label objects, 2 text field objects, and 4 button objects
		Frame frame1 = new Frame("Search Engine");
		TextArea displayArea = new TextArea();
		TextField searchBar = new TextField();
		Label titleLabel = new Label("Search Engine");
		titleLabel.setFont(new Font("Serif", Font.BOLD, 24));
		Label termsLabel = new Label("Search Terms:");
		Button searchButton = new Button("Search");
		Button aboutButton = new Button ("About");
		Button indexButton = new Button ("Index");
		Button closeButton = new Button("Close");
		closeButton.addActionListener(e -> System.exit(0));

//Sets positions/sizes of the buttons/labels/boxes and adds them to the frame
		searchButton.setBounds(500, 101, 80, 30);
		frame1.add(searchButton);
		aboutButton.setBounds(330, 380, 80, 30);
		frame1.add(aboutButton);
		indexButton.setBounds(245, 380, 80, 30);
		frame1.add(indexButton);
		closeButton.setBounds(415, 380, 80, 30);
		frame1.add(closeButton);
		indexButton.addActionListener(this);
		titleLabel.setBounds(300, 70, 300, 30);
		frame1.add(titleLabel);
		termsLabel.setBounds(150, 108, 100, 15);
		frame1.add(termsLabel);
		displayArea.setBounds(150, 140, 430, 225);
		frame1.add(displayArea);
		searchBar.setBounds(250, 105, 240, 25);
		frame1.add(searchBar);
		frame1.setSize(700, 430);
		frame1.setLayout(null);
		frame1.setVisible(true);
}
//Event handler used to open the maintenance view when the user clicks "index"
			public void actionPerformed(ActionEvent e) {
				 {
					 Frame frame2 = new Frame("Index");
					 TextArea displayArea2 = new TextArea();
					 Button addButton = new Button("Add...");
					 Button removeButton = new Button("Remove");
					 Label indexLabel = new Label("Index");
					 indexLabel.setFont(new Font("Serif", Font.BOLD, 24));
					 
					 //I can't get this button to work properly for frame 2
					 Button closeButton = new Button("Close");
					 closeButton.setBounds(350, 255, 80, 30);
					 
					 frame2.add(closeButton);
					 addButton.setBounds(70, 255, 80, 30);
					 frame2.add(addButton);
					 removeButton.setBounds(170, 255, 80, 30);
					 frame2.add(removeButton);
					 displayArea2.setBounds(62, 55, 380, 195);
					 indexLabel.setBounds(230, 25, 60, 30);
					 frame2.add(indexLabel);
					 frame2.add(displayArea2);
					 frame2.setSize(500, 300);
					 frame2.setLayout(null);
					 frame2.setVisible(true);
				 }
}
	public static void main( String args[] ){
		OuterFrame frame1 = new OuterFrame();
	}
}