package src;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.UIManager;

public class SymptomsDisplay implements ActionListener {

	JFrame frame;
	private JTextField ageTextField;
	private JTextField residenceTextField;
	private JTextField weightTextField;
	private JTextField heightTextField;
	private JTextField countryTextField;
	
	private JCheckBox chckbxFever;
	private JCheckBox chckbxShortnessOfBreath;
	private JCheckBox chckbxLossOfSmelltaste;
	private JCheckBox chckbxMusclePain;
	private JCheckBox chckbxCough;
	private JCheckBox chckbxChills;
	private JCheckBox chckbxSoreThroat;
	private JCheckBox chckbxHeadache;
	
	private JCheckBox chckbxKidneyDisease;
	private JCheckBox chckbxLiverDisease;
	private JCheckBox chckbxLungDisease;
	private JCheckBox chckbxAsthma;
	private JCheckBox chckbxNursingHome;
	private JCheckBox chkbxHeart;
	private JCheckBox chckbxImmunocompromised;
	private JCheckBox chckbxObesity;
	private JCheckBox chckbxDiabetes;
	private JTextArea textArea;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SymptomsDisplay sympWindow = new SymptomsDisplay();
					sympWindow.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Launch the panel
	 */
	public SymptomsDisplay() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 666, 579);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblPersonalInformation = new JLabel("Risk of Exposure");
		lblPersonalInformation.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
		lblPersonalInformation.setBounds(192, 1, 200, 26);
		frame.getContentPane().add(lblPersonalInformation);
		
		JLabel lblCountry = new JLabel("What city are you currently residing in: ");
		lblCountry.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		lblCountry.setBounds(24, 66, 190, 16);
		frame.getContentPane().add(lblCountry);
		
		JLabel lblAge = new JLabel("Age:");
		lblAge.setBounds(24, 156, 33, 16);
		frame.getContentPane().add(lblAge);
		
		ageTextField = new JTextField();
		ageTextField.setBounds(58, 151, 54, 26);
		frame.getContentPane().add(ageTextField);
		ageTextField.setColumns(10);
		
		JLabel lblSymptomsifAny = new JLabel("Symptoms");
		lblSymptomsifAny.setBounds(46, 200, 71, 16);
		frame.getContentPane().add(lblSymptomsifAny);
		
		chckbxFever = new JCheckBox("Fever");
		chckbxFever.setBounds(6, 238, 71, 23);
		frame.getContentPane().add(chckbxFever);
		
		chckbxShortnessOfBreath = new JCheckBox("Shortness of Breath");
		chckbxShortnessOfBreath.setBounds(6, 363, 155, 23);
		frame.getContentPane().add(chckbxShortnessOfBreath);
		
		chckbxLossOfSmelltaste = new JCheckBox("Loss of Smell/Taste");
		chckbxLossOfSmelltaste.setBounds(6, 258, 161, 23);
		frame.getContentPane().add(chckbxLossOfSmelltaste);
		
		chckbxMusclePain = new JCheckBox("Muscle Pain");
		chckbxMusclePain.setBounds(6, 344, 128, 23);
		frame.getContentPane().add(chckbxMusclePain);
		
		JLabel lblCheckAllThat = new JLabel("Check all that apply");
		lblCheckAllThat.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		lblCheckAllThat.setBounds(35, 213, 99, 16);
		frame.getContentPane().add(lblCheckAllThat);
		
		JLabel lblCountryVisitedIn = new JLabel("If you have visited another country in 2020, please enter the most recent one");
		lblCountryVisitedIn.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		lblCountryVisitedIn.setBounds(24, 110, 381, 16);
		frame.getContentPane().add(lblCountryVisitedIn);
		
		residenceTextField = new JTextField();
		residenceTextField.setBounds(226, 60, 130, 26);
		frame.getContentPane().add(residenceTextField);
		residenceTextField.setColumns(10);
		
		JLabel lblWeight = new JLabel("Weight(kg):");
		lblWeight.setBounds(192, 156, 88, 16);
		frame.getContentPane().add(lblWeight);
		
		weightTextField = new JTextField();
		weightTextField.setBounds(275, 151, 54, 26);
		frame.getContentPane().add(weightTextField);
		weightTextField.setColumns(10);
		
		JLabel lblHeightm = new JLabel("Height(m):");
		lblHeightm.setBounds(388, 156, 71, 16);
		frame.getContentPane().add(lblHeightm);
		
		heightTextField = new JTextField();
		heightTextField.setBounds(464, 151, 62, 26);
		frame.getContentPane().add(heightTextField);
		heightTextField.setColumns(10);
		
		
		chckbxCough = new JCheckBox("Cough");
		chckbxCough.setBounds(6, 273, 128, 23);
		frame.getContentPane().add(chckbxCough);
		
		chckbxChills = new JCheckBox("Chills");
		chckbxChills.setBounds(6, 328, 128, 23);
		frame.getContentPane().add(chckbxChills);
		
		chckbxSoreThroat = new JCheckBox("Sore Throat");
		chckbxSoreThroat.setBounds(6, 293, 128, 23);
		frame.getContentPane().add(chckbxSoreThroat);
		
		chckbxHeadache = new JCheckBox("Headache");
		chckbxHeadache.setBounds(6, 308, 128, 23);
		frame.getContentPane().add(chckbxHeadache);
		
		JButton submitButton = new JButton("Submit");
		submitButton.setBounds(174, 427, 200, 50);
		frame.getContentPane().add(submitButton);
		
		JButton backButton = new JButton("Home");
		backButton.setBounds(6, 6, 140, 26);
		frame.getContentPane().add(backButton);
		
		JLabel lblConditions = new JLabel("Prexisting Conditions");
		lblConditions.setBounds(210, 200, 140, 16);
		frame.getContentPane().add(lblConditions);
		
		JLabel lblConditionsCaption = new JLabel("Check all that apply");
		lblConditionsCaption.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		lblConditionsCaption.setBounds(226, 213, 99, 16);
		frame.getContentPane().add(lblConditionsCaption);
		
		countryTextField = new JTextField();
		countryTextField.setBounds(417, 104, 130, 26);
		countryTextField.setColumns(10);
		frame.getContentPane().add(countryTextField);
		
		chckbxKidneyDisease = new JCheckBox("Kidney Disease");
		chckbxKidneyDisease.setBounds(192, 238, 155, 23);
		frame.getContentPane().add(chckbxKidneyDisease);
		
		chckbxLiverDisease = new JCheckBox("Liver Disease");
		chckbxLiverDisease.setBounds(192, 258, 155, 23);
		frame.getContentPane().add(chckbxLiverDisease);
		
		chckbxLungDisease = new JCheckBox("Chronic Lung Disease");
		chckbxLungDisease.setBounds(192, 273, 182, 23);
		frame.getContentPane().add(chckbxLungDisease);
		
		chckbxAsthma = new JCheckBox("Asthma");
		chckbxAsthma.setBounds(192, 293, 155, 23);
		frame.getContentPane().add(chckbxAsthma);
		
		chckbxNursingHome = new JCheckBox("Living in a nursing home");
		chckbxNursingHome.setBounds(191, 308, 201, 23);
		frame.getContentPane().add(chckbxNursingHome);
		
		chkbxHeart = new JCheckBox("Heart disease");
		chkbxHeart.setBounds(192, 328, 155, 23);
		frame.getContentPane().add(chkbxHeart);
		
		chckbxImmunocompromised = new JCheckBox("Immunocompromised");
		chckbxImmunocompromised.setBounds(191, 344, 182, 23);
		frame.getContentPane().add(chckbxImmunocompromised);
		
		chckbxObesity = new JCheckBox("Severe obesity");
		chckbxObesity.setBounds(191, 363, 155, 23);
		frame.getContentPane().add(chckbxObesity);
		
		chckbxDiabetes = new JCheckBox("Diabetes");
		chckbxDiabetes.setBounds(192, 381, 155, 23);
		frame.getContentPane().add(chckbxDiabetes);
		
		textArea = new JTextArea();
		textArea.setBackground(UIManager.getColor("Button.background"));
		textArea.setBounds(448, 242, 200, 146);
		frame.getContentPane().add(textArea);
		
		submitButton.addActionListener(this);
		backButton.addActionListener(this);
	
	}
	
	public Vector<Double> riskScore(int age, String city, String country, Vector<Boolean> symptoms, String[] infectedCities, String[] infectedCountries, Vector<Boolean> conditions) {

		Vector<Double> returnV = new Vector<Double>();
		double count = 0;
		double chanceContracted = 0;
		double chanceDeath = 0;
		
		// Calculate chance of having virus
		for (Boolean b : symptoms) {
			if (b) {
				count++;
			}
		}
		chanceContracted = Math.pow(1.5, count);
		for (int i = 0; i < infectedCities.length; i++) {
			if (infectedCities[i].equals(city)) {
				chanceContracted += ((10 - i) / 2.0);
			}
		}
		for (int i = 0; i < infectedCountries.length; i++) {
			if (infectedCountries[i].equals(country)) {
				chanceContracted += ((5 - i));
			}
		}
		chanceContracted = (chanceContracted / 37.0) * 100.0;
		
		// Calculate chance of death
		if (age >= 65) {
			chanceDeath += 10;
		}
		count = 0;
		for (Boolean b : conditions) {
			if (b) {
				count++;
			}
		}
		chanceDeath = chanceContracted * Math.pow(1.5, count - 1.0); 
		chanceDeath = chanceDeath/50.0;
		
		textArea.append("Risk of contraction is: " + (Math.round(chanceContracted*100.0)/100.0) +"%\n");
		textArea.append("Risk of death: " + (Math.round(chanceDeath*100.0)/100.0) +"%\n");
		
		returnV.add((Math.round(chanceContracted*100.0)/100.0));
		returnV.add((Math.round(chanceDeath*100.0)/100.0));
		
		return returnV;
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		textArea.setText("");
		String action = e.getActionCommand();
		if (action.equals("Home")) {
			frame.dispose();
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						
						Display window = new Display();
						window.frame.setVisible(true);
						
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		} else if (action.equals("Submit")) {
			if(residenceTextField.getText().isEmpty() || ageTextField.getText().isEmpty() || weightTextField.getText().isEmpty() || heightTextField.getText().isEmpty() || countryTextField.getText().isEmpty()) {
				textArea.append("PLEASE FILL OUT ALL FIELDS ");
			}
			try {
				textArea.setText("");
				String city = residenceTextField.getText().strip().toLowerCase();
				int age = Integer.parseInt(ageTextField.getText().trim());
				String country = countryTextField.getText().strip().toLowerCase(); 

				Vector<Boolean> symptoms = new Vector<Boolean>(8);
				Vector<Boolean> conditions = new Vector<Boolean>(9); 
				String[] infectedCities = {"new york city", "cook", "nassau", "suffolk", "westchester", "los angeles", "wayne", "bergen", "hudson", "philadelphia"};
				String[] infectedCountries = {"usa", "italy", "spain", "germany", "china"};
				
				symptoms.add(chckbxSoreThroat.isSelected());
				symptoms.add(chckbxFever.isSelected());
				symptoms.add(chckbxShortnessOfBreath.isSelected());
				symptoms.add(chckbxMusclePain.isSelected());
				symptoms.add(chckbxCough.isSelected());
				symptoms.add(chckbxChills.isSelected());
				symptoms.add(chckbxHeadache.isSelected());
				symptoms.add(chckbxLossOfSmelltaste.isSelected());
			
				conditions.add(chckbxKidneyDisease.isSelected());
				conditions.add(chckbxLiverDisease.isSelected());
				conditions.add(chckbxLungDisease.isSelected());
				conditions.add(chckbxAsthma.isSelected());
				conditions.add(chckbxNursingHome.isSelected());
				conditions.add(chkbxHeart.isSelected());
				conditions.add(chckbxImmunocompromised.isSelected());
				conditions.add(chckbxObesity.isSelected());
				conditions.add(chckbxDiabetes.isSelected());
				
				
				riskScore(age, city, country, symptoms, infectedCities, infectedCountries, conditions);
			}
			catch (NumberFormatException event) {
				textArea.setText("Please input a number");
			}
			

			
		}
		
	}
}
