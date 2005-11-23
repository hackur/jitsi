package net.java.sip.communicator.impl.gui.main;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JPanel;

import net.java.sip.communicator.impl.gui.main.customcontrols.SIPCommButton;

public class CallPanel extends JPanel{
	
	private Image	callButtonPressedIcon	= LookAndFeelConstants.CALL_PRESSED_BUTTON_BG;
	private Image	hangupButtonPressedIcon	= LookAndFeelConstants.HANGUP_PRESSED_BUTTON_BG;
	private Image	callButtonBG			= LookAndFeelConstants.CALL_BUTTON_BG;
	private Image	callButtonRolloverBG	= LookAndFeelConstants.CALL_ROLLOVER_BUTTON_BG;
	private Image	hangupButtonBG			= LookAndFeelConstants.HANGUP_BUTTON_BG;
	private Image	hangupButtonRolloverBG	= LookAndFeelConstants.HANGUP_ROLLOVER_BUTTON_BG;
		
	private JComboBox 		phoneNumberCombo = new JComboBox();	
	private JPanel 			buttonsPanel	= new JPanel(new FlowLayout(FlowLayout.CENTER, 15, 5));
	private SIPCommButton	callButton;
	private SIPCommButton	hangupButton;
		
	public CallPanel(){
		
		super(new BorderLayout());
		/*
		callButton 		= new SIPCommButton(callButtonBG,
											callButtonRolloverBG, 
											callButtonIcon);
		hangupButton 	= new SIPCommButton(hangupButtonBG,
											hangupButtonRolloverBG, 
											hangupButtonIcon);
		*/		
		
		callButton 		= new SIPCommButton(callButtonBG,
											callButtonRolloverBG,
											callButtonPressedIcon,
											null);
		
		hangupButton 	= new SIPCommButton(hangupButtonBG,
											hangupButtonRolloverBG,
											hangupButtonPressedIcon,
											null);

		this.setBorder(BorderFactory.createEmptyBorder(10, 5, 10, 5));
		this.init();
	}

	private void init() {
		this.phoneNumberCombo.setEditable(true);
		
		this.add(phoneNumberCombo, BorderLayout.NORTH);
		
		this.buttonsPanel.add(callButton);
		this.buttonsPanel.add(hangupButton);
		
		this.add(buttonsPanel, BorderLayout.CENTER);
	}
	
}
