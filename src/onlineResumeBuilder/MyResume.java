package onlineResumeBuilder;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class MyResume extends JFrame{
	
	private JTextField nameField, emailField;
	private JTextArea educationArea, experienceArea, skillsArea;
	private JButton generateButton;
	
	public MyResume() {
		setTitle("Resume Builder");
		setSize(800,800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
		
		// Create convonents
		JLabel nameLabel =  new JLabel("Name");
		JLabel emailLabel = new  JLabel ("Email :");
		JLabel educationalLabel =  new JLabel ("Education:");
		JLabel experienceLabel = new JLabel("Experience:") ;
		JLabel skillsLabel=  new JLabel("Skills:");
		nameField = new  JTextField(20);
		emailField = new JTextField(20);
		educationArea = new JTextArea(20,100);
		experienceArea = new JTextArea(20,100);
		skillsArea = new JTextArea(20,100);
		generateButton = new JButton("Generate Resume");
		
		// Create panels
		JPanel inputPanel = new JPanel(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.insets = new Insets (20,20,20,20);
		inputPanel.add(nameLabel, gbc);
		gbc.gridx++;
		inputPanel.add(nameField, gbc);
		gbc.gridx++;
		inputPanel.add(emailLabel, gbc);
		gbc.gridx++;
		inputPanel.add(emailField, gbc);
		gbc.gridx = 0;
		gbc.gridx++;
		gbc.gridwidth = 2;
		inputPanel.add(educationalLabel, gbc);
		gbc.gridx++;
		inputPanel.add(educationArea, gbc);
		gbc.gridx++;
		inputPanel.add(experienceLabel, gbc);
		gbc.gridx++;
		inputPanel.add(experienceArea, gbc);
		gbc.gridx++;
		inputPanel.add(skillsLabel, gbc);
		gbc.gridx++;
		inputPanel.add(skillsArea, gbc);
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.add(generateButton);
		
		//Add panel to the frame
		setLayout(new BorderLayout());
		add(inputPanel,BorderLayout.CENTER);
		add(buttonPanel,BorderLayout.SOUTH);
		
		//set the genrate button action
		generateButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				generateResume();
			}
		});	
	}
	private void generateResume() {
		// TODO Auto-generated method stub
		String name = nameField.getText();
		String email = emailField.getText();
		String education = educationArea.getText();
		String experience = experienceArea.getText();
		String skills = skillsArea.getText();
		
		StringBuilder resume = new StringBuilder();
		resume.append("Resume\n\n");
		resume.append("Name: ").append(name).append("\n");
		resume.append("Email: ").append(email).append("\n\n");
		resume.append("Education\n").append(education).append("\n\n");
		resume.append("Experience\n").append(experience).append("\n\n");
		resume.append("Skills\n").append(skills).append("\n");
		
		//display the resume in a dialog box
		JOptionPane.showMessageDialog(this, resume.toString(),"Generated Resume", JOptionPane.INFORMATION_MESSAGE);
		
		
	}
	
	

	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyResume builder = new MyResume();
		builder.setVisible(true);

	}

}
