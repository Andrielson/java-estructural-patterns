package com.github.andrielson.mediator.swing.after;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import com.github.andrielson.mediator.swing.after.components.AddButton;
import com.github.andrielson.mediator.swing.after.components.Label;
import com.github.andrielson.mediator.swing.after.components.ResetButton;
import com.github.andrielson.mediator.swing.after.components.State;
import com.github.andrielson.mediator.swing.after.mediator.Mediator;

public class Screens {
	private AddButton button;
	private ResetButton reset;
	private Label label;
	private State state;
	private Mediator mediator;
	
	public Screens() {
		mediator = new Mediator();
		button = new AddButton(mediator);
		reset = new ResetButton(mediator);
		state = new State(mediator);
		label = new Label(mediator);
		mediator.setButton(button);
		mediator.setLabel(label);
		mediator.setState(state);
	}
	
	private void initButtonScreen(Mediator mediator) {
		JFrame frame = new JFrame();  
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Button's Screen");
		frame.setLayout(new BorderLayout());
		
		frame.add(reset, BorderLayout.WEST);
		frame.add(button, BorderLayout.CENTER);
		
		frame.setSize(400,200);  
		frame.setVisible(true);
	}
	
	private void initCounterScreen(Mediator mediator) {
		JFrame frame = new JFrame();  
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Counter's Screen");
		
		frame.add(label);
		
		frame.setSize(400,200);  
		frame.setVisible(true);
	}
	
	public void init() {
		initButtonScreen(mediator);
		initCounterScreen(mediator);
	}
}
