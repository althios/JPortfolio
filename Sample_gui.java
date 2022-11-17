/**
 * 
 */
/**
 * @author althios jdk 17.0.5
 *
 */
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
public class Sample_gui {

public void app() {
 JFrame board = new JFrame(); 
 final int Size = 500;
 int[] DataSize = new int[]{250,100,50,25};
 String[] DataLegends = new String[]{"Organizations","Product","Price"};
	board.setPreferredSize(new Dimension((int)(Size*1.6),Size));
	board.setLocationRelativeTo(null);
	board.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	board.setLocation(board.getLocation().x-(int)(Size*0.8),board.getLocation().y-(int)(Size*0.5));

	board.setVisible(true);
	JPanel Panel = new JPanel();
	Panel.setLayout(null);
	JLabel[] headers = new JLabel[DataSize.length];
	
	
	JLabel[] label = new JLabel[10];
	int Cumsum_DataSize = 0;
	for(int j=0;j<DataSize.length;j++) {
		headers[j] = new JLabel();
		headers[j].setText(" " + ((j>(DataLegends.length-1))?("+"):(DataLegends[j])));
		headers[j].setBackground(new Color(255,255,150));
		headers[j].setBorder(BorderFactory.createLineBorder(Color.black, 2));
		headers[j].setVisible(true);

		headers[j].setOpaque(true);

		headers[j].setBounds(25+Cumsum_DataSize, 25, ((j>(DataLegends.length-1))?(25):(DataSize[j]))+2, 25);
		Panel.add(headers[j]);

	for (int i=0;i<10;i++) {

	label[i]= new JLabel();
	label[i].setText(" ");	
	label[i].setBounds(25+Cumsum_DataSize, 49+(24*i), ((j>(DataLegends.length-1))?(25):(DataSize[j]))+2,25);
	
	label[i].setBorder(BorderFactory.createLineBorder(Color.black, 2));
	label[i].setVisible(true);
	Panel.add(label[i]);

	}
	Cumsum_DataSize=Cumsum_DataSize+DataSize[j];
	}
	
	board.add(Panel);
	board.pack();

	
}


public static void main(String[] args) {
	Sample_gui Current_App = new Sample_gui();
	Current_App.app();
}

}
