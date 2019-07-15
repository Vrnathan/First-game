package snakegame1;

import javax.swing.JFrame;



public class Main {

	public Main() {
		JFrame frame = new JFrame();
		Gamepanel1 gamepanel = new Gamepanel1();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("SNAKETING");
		frame.add(gamepanel);
		frame.pack();
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		

	}
	

	public static void main(String[] args) {	
		
		new Main();
	}
	
}
