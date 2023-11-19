package windows.com;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InsertMember extends JFrame {

	public InsertMember ( ) {
		
		// Defining the sports
		String[] sports = {
				"Football", "Basketball",
				"Volleyball", "Swimming",
				"Hockey", "Handball",
				"Ping-Pong", "Skying",
				"Tennis"
		};
		
		// Creating new window
		setTitle( "Insert Member" );
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize( 300, 300 );
		setResizable( false );
		setLocationRelativeTo( null );
		
		// Creating new containers
		JPanel mainContainer = new JPanel();
		JPanel upperContainer = new JPanel();
		JPanel upperTopContainer = new JPanel();
		JPanel topRightContainer = new JPanel();
		JPanel southContainer = new JPanel();
		JPanel mainSouthContainer = new JPanel();
		
		// Creating new layouts
		BorderLayout mainBl = new BorderLayout();
		BorderLayout upperBl = new BorderLayout();
		GridLayout upperGl = new GridLayout(5, 1);
		GridLayout rightGl = new GridLayout(sports.length, 1);
		FlowLayout southFl = new FlowLayout();
		FlowLayout mainSouthFl = new FlowLayout();
		
		// Setting layouts
		mainContainer.setLayout( mainBl );
		upperContainer.setLayout( upperBl );
		upperTopContainer.setLayout( upperGl );
		topRightContainer.setLayout( rightGl );
		southContainer.setLayout( southFl );
		mainSouthContainer.setLayout( mainSouthFl );
		
		// Setting Borders
		Border titled, lined, empty, etched ,beveled;
		
		lined = BorderFactory.createLineBorder( Color.getColor("purple") );
		titled = BorderFactory.createTitledBorder( lined, "Sports" );
		empty = BorderFactory.createEmptyBorder();
		etched = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
		beveled = BorderFactory.createLoweredBevelBorder();
		
		mainContainer.setBorder( BorderFactory.createCompoundBorder( empty, etched ) );
		upperContainer.setBorder( beveled );
		topRightContainer.setBorder( titled );
		
		// Adding Containers
		mainContainer.add(upperContainer, mainBl.CENTER);
		mainContainer.add(topRightContainer, mainBl.EAST);
		mainContainer.add(mainSouthContainer, mainBl.SOUTH);
		upperContainer.add(upperTopContainer, upperBl.NORTH);
		upperContainer.add(southContainer, upperBl.SOUTH);
		
		// Adding Check-Boxes
		for( int i = 0; i < sports.length; i++ ) {
			checkBoxTable[i] = new Checkbox( sports[i] );
			topRightContainer.add( checkBoxTable[i] );
		}
		
		// Adding Labels
		JLabel fnameLabel = new JLabel("First Name");
		JLabel lnameLabel = new JLabel("Last Name");
		JLabel addressLabel = new JLabel("Address");
		JLabel sexLabel = new JLabel("Sex");
		
		// Adding Text-Fields
		final JTextField fname = new JTextField();
		final JTextField lname = new JTextField();
		
		// Adding Text-Area
		final JTextArea address = new JTextArea(3, 9);
		
		// Adding Buttons
		JButton ok = new JButton("OK");
		JButton cancel = new JButton("Cancel");
	
		// Adding Radio-Buttons 
		final JRadioButton male = new JRadioButton("Male");
		final JRadioButton female = new JRadioButton("Female");
		
		male.setSelected( true );
		
		// Adding Button Group
		ButtonGroup sexButtons = new ButtonGroup();
		sexButtons.add( male );
		sexButtons.add( female );
		
		// Adding Button's Listeners
		ok.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.out.println("Inserted Member is:");
				System.out.println("   First Name: " + fname.getText());
				System.out.println("   Last Name: " + lname.getText());
				System.out.println("   Address: " + address.getText());
				
				if ( male.isSelected() ) 
					System.out.println("   Sex: " +  male.getText());
				else { System.out.println("   Sex: " +  female.getText() ); }
				
				System.out.println("Sports: ");
				for( int i = 0,j = 1; i < checkBoxTable.length; i++ ) {
					if ( checkBoxTable[i].getState() ) {
						System.out.println("    " + j + "." + checkBoxTable[i].getLabel());
						j++;
					}
				}
				
			}
		}); 
		
		cancel.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				fname.setText("");
				lname.setText("");
				address.setText("");
				
				if ( female.isSelected() )
					male.setSelected( true );
				
				for( int i = 0; i < checkBoxTable.length; i++ ) {
					if ( checkBoxTable[i].getState() ) {
						checkBoxTable[i].setState( false );
					}
				}
				
			}
		}); 
		
		// Adding Items To Containers
			// Upper Top Container
			upperTopContainer.add( fnameLabel );
			upperTopContainer.add( fname );
			upperTopContainer.add( lnameLabel );
			upperTopContainer.add( lname );
			upperTopContainer.add( addressLabel );
		
			// South Flow Container
			southContainer.add( sexLabel );
			southContainer.add( male );
			southContainer.add( female );

			// Upper Container
			upperContainer.add( address , upperBl.CENTER );
			
			// Main South Container
			mainSouthContainer.add( ok );
			mainSouthContainer.add( cancel );
			
		// Set content pane
		setContentPane( mainContainer );
		
		// Pack everything
		//pack();
	}
	private Checkbox[] checkBoxTable = new Checkbox[9];
	private String checkBoxValues;
}
