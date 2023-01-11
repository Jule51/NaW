package poker;

import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;

public class View {
	// View uses Swing framework to display UI to user
	private JFrame frmPlanningpoker;
	private JLabel firstnameLabel;
	private JLabel lastnameLabel;
	private JTextField firstnameTextfield;
	private JTextField lastnameTextfield;
	private JButton lastnameSaveButton;
	private JButton hello;
	private JButton bye;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	public View(String title) {
		frmPlanningpoker = new JFrame(title);
		frmPlanningpoker.setTitle("Planningpoker");
		frmPlanningpoker.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPlanningpoker.setSize(500, 229);
		frmPlanningpoker.setLocationRelativeTo(null);
		frmPlanningpoker.setVisible(true);
		// Create UI elements
		firstnameLabel = new JLabel("Vorname:");
		lastnameLabel = new JLabel("Nachname:");
		firstnameTextfield = new JTextField();
		lastnameTextfield = new JTextField();
		lastnameSaveButton = new JButton("Teilnehmer speichern");
		hello = new JButton("Starten");
		bye = new JButton("Schließen");
		
		lblNewLabel = new JLabel("Willkommen zum Schätzpoker");
		lblNewLabel.setFont(new Font("Heiti SC", Font.BOLD, 23));
		
		lblNewLabel_1 = new JLabel("Bitte geben Sie nacheinander alle Teilnehmer Namen an:");
		lblNewLabel_1.setFont(new Font("Heiti SC", Font.PLAIN, 13));
		// Add UI element to frame
		GroupLayout layout = new GroupLayout(frmPlanningpoker.getContentPane());
		layout.setHorizontalGroup(
			layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
				.addContainerGap()
				.addGroup(layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
				.addGroup(layout.createParallelGroup(Alignment.LEADING)
				.addComponent(firstnameLabel)
				.addComponent(lastnameLabel))
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(layout.createParallelGroup(Alignment.TRAILING, false)
				.addComponent(lastnameTextfield)
				.addComponent(firstnameTextfield, GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE))
				.addPreferredGap(ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
				.addGroup(layout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
				.addComponent(lastnameSaveButton)
				.addPreferredGap(ComponentPlacement.RELATED))
				.addComponent(hello, Alignment.TRAILING))
				.addGap(503))
				.addGroup(layout.createSequentialGroup()
				.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 352, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(bye, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)))
				.addContainerGap())
				.addGroup(layout.createSequentialGroup()
				.addContainerGap()
				.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, 932, Short.MAX_VALUE)
				.addGap(15))
		);
		layout.setVerticalGroup(
			layout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
				.addContainerGap()
				.addGroup(layout.createParallelGroup(Alignment.LEADING)
				.addComponent(bye)
				.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE))
				.addGap(18)
				.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(layout.createParallelGroup(Alignment.BASELINE)
				.addComponent(firstnameLabel)
				.addComponent(firstnameTextfield, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
				.addComponent(lastnameSaveButton))
				.addGroup(layout.createParallelGroup(Alignment.BASELINE)
				.addComponent(lastnameLabel)
				.addComponent(lastnameTextfield, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
				.addComponent(hello))
				.addGap(23))
		);
		layout.setAutoCreateGaps(true);
		layout.setAutoCreateContainerGaps(true);
		frmPlanningpoker.getContentPane().setLayout(new BorderLayout(0, 0));
		frmPlanningpoker.getContentPane().setLayout(layout);
	}
	public JFrame getFrame() {
		return frmPlanningpoker;
	}
	public void setFrame(JFrame frame) {
		this.frmPlanningpoker = frame;
	}
	public JLabel getFirstnameLabel() {
		return firstnameLabel;
	}
	public void setFirstnameLabel(JLabel firstnameLabel) {
		this.firstnameLabel = firstnameLabel;
	}
	public JLabel getLastnameLabel() {
		return lastnameLabel;
	}
	public void setLastnameLabel(JLabel lastnameLabel) {
		this.lastnameLabel = lastnameLabel;
	}
	public JTextField getFirstnameTextfield() {
		return firstnameTextfield;
	}
	public void setFirstnameTextfield(JTextField firstnameTextfield) {
		this.firstnameTextfield = firstnameTextfield;
	}
	public JTextField getLastnameTextfield() {
		return lastnameTextfield;
	}
	public void setLastnameTextfield(JTextField lastnameTextfield) {
		this.lastnameTextfield = lastnameTextfield;
	}
	public JButton getLastnameSaveButton() {
		return lastnameSaveButton;
	}
	public void setLastnameSaveButton(JButton lastnameSaveButton) {
		this.lastnameSaveButton = lastnameSaveButton;
	}
	public JButton getHello() {
		return hello;
	}
	public void setHello(JButton hello) {
		this.hello = hello;
	}
	public JButton getBye() {
		return bye;
	}
	public void setBye(JButton bye) {
		this.bye = bye;
	}
}
