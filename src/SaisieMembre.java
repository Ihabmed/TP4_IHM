import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;


public class SaisieMembre extends JFrame{

	public static void main(String[] args) {
	JFrame fenetre = new JFrame();
	fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	fenetre.setTitle("Boîte de saisie");
	fenetre.setSize(400, 400);
	fenetre.setResizable(true);
	fenetre.setLocationRelativeTo(null);
	JPanel mainPanel = new JPanel();
	BorderLayout mainLyout = new BorderLayout();
	mainPanel.setLayout(mainLyout);
	fenetre.setContentPane(mainPanel);
	JPanel centrePanel = new JPanel();
	BorderLayout formuleLayout = new BorderLayout();
	centrePanel.setLayout(formuleLayout);
	mainPanel.add(centrePanel, BorderLayout.CENTER);
	JPanel centrePanelFormuleur = new JPanel();
	GridLayout FormuleurLayout = new GridLayout(5, 0);
	centrePanelFormuleur.setLayout(FormuleurLayout);
	JLabel labelNom = new JLabel("Nom");
	JTextField textFieldNom = new JTextField();
	JLabel labelPrenom = new JLabel("Prenom");
	JTextField textFieldPrenom = new JTextField();
	JLabel labelAdresse = new JLabel("Adresse");
	centrePanelFormuleur.add(labelNom);
	centrePanelFormuleur.add(textFieldNom);
	centrePanelFormuleur.add(labelPrenom);
	centrePanelFormuleur.add(textFieldPrenom);
	centrePanelFormuleur.add(labelAdresse);
	centrePanel.add(centrePanelFormuleur, BorderLayout.NORTH);
	JTextArea textAreaAdresse = new JTextArea();
	centrePanel.add(textAreaAdresse, BorderLayout.CENTER);
	JLabel labelSexe = new JLabel("Sexe : ");
	JRadioButton radioBoxHomme = new JRadioButton("Homme");
	JRadioButton radioBoxFemme = new JRadioButton("Femme");
	ButtonGroup sexeRadio = new ButtonGroup();
	sexeRadio.add(radioBoxHomme);
	sexeRadio.add(radioBoxFemme);
	JPanel panelSexe = new JPanel();
	FlowLayout layoutSexe = new FlowLayout();
	panelSexe.setLayout(layoutSexe);
	panelSexe.add(labelSexe);
	panelSexe.add(radioBoxHomme);
	panelSexe.add(radioBoxFemme);
	centrePanel.add(panelSexe, BorderLayout.SOUTH);
	JPanel panelSports = new JPanel();
	GridLayout layoutSports = new GridLayout(9, 0);
	panelSports.setLayout(layoutSports);
	JCheckBox Tennis = new JCheckBox("Tennis"); 
	JCheckBox Squash = new JCheckBox("Squash");
	JCheckBox Natation = new JCheckBox("Natation");
	JCheckBox Athlétisme = new JCheckBox("Athlétisme");
	JCheckBox Randonnée = new JCheckBox("Randonnée");
	JCheckBox Foot = new JCheckBox("Foot");
	JCheckBox Basket = new JCheckBox("Basket");
	JCheckBox Volley = new JCheckBox("Volley");
	JCheckBox Petanque = new JCheckBox("Petanque");
	panelSports.add(Tennis);
	panelSports.add(Squash);
	panelSports.add(Natation);
	panelSports.add(Athlétisme);
	panelSports.add(Randonnée);
	panelSports.add(Foot);
	panelSports.add(Basket);
	panelSports.add(Volley);
	panelSports.add(Petanque);
	mainPanel.add(panelSports, BorderLayout.EAST);
	JButton buttonOk = new JButton("OK");
	JButton buttonAnnuler = new JButton("Annuler");
	JPanel panelCommande = new JPanel();
	FlowLayout layoutCommande = new FlowLayout();
	panelCommande.setLayout(layoutCommande);
	buttonOk.setPreferredSize(new Dimension(100, 30));
	buttonAnnuler.setPreferredSize(new Dimension(100, 30));
	panelCommande.add(buttonOk);
	panelCommande.add(buttonAnnuler);
	mainPanel.add(panelCommande, BorderLayout.SOUTH);
	fenetre.setVisible(true);
	}

}
