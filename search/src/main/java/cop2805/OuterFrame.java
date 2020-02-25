package cop2805;
import java.awt.*;

//Class containing the outer frame
class OuterFrame{
	
	OuterFrame(){
//Constructs the frame, 2 label objects, and 6 button objects
		Frame frame1 = new Frame("Search Engine");
		TextArea displayArea = new TextArea();
		TextField searchBar = new TextField();
		Label titleLabel = new Label("Search Engine");
		titleLabel.setFont(new Font("Serif", Font.BOLD, 24));
		Label termsLabel = new Label("Search Terms:");
		Button searchButton = new Button("Search");
		Button aboutButton = new Button ("About");
		Button indexButton = new Button ("Index");
		Button addButton = new Button("Add...");
		Button removeButton = new Button("Remove");
		Button closeButton = new Button("Close");
		closeButton.addActionListener(e -> System.exit(0));


//Sets positions/sizes of the buttons/labels/boxes and adds them to the frame
		searchButton.setBounds(500, 101, 80, 30);
		frame1.add(searchButton);
		aboutButton.setBounds(330, 425, 80, 30);
		frame1.add(aboutButton);
		indexButton.setBounds(245, 425, 80, 30);
		frame1.add(indexButton);
		closeButton.setBounds(415, 425, 80, 30);
		frame1.add(closeButton);
		addButton.setBounds(280, 370, 80, 30);
		frame1.add(addButton);
		removeButton.setBounds(380, 370, 80, 30);
		frame1.add(removeButton);
		titleLabel.setBounds(300, 70, 300, 30);
		frame1.add(titleLabel);
		termsLabel.setBounds(150, 108, 100, 15);
		frame1.add(termsLabel);
		displayArea.setBounds(150, 140, 430, 225);
		frame1.add(displayArea);
		searchBar.setBounds(250, 105, 240, 25);
		frame1.add(searchBar);
		frame1.setSize(700, 500);
		frame1.setLayout(null);
		frame1.setVisible(true);
}
	public static void main( String args[] ){
		OuterFrame frame1 = new OuterFrame();

		}}
//Need a class for the inner frame (index window)