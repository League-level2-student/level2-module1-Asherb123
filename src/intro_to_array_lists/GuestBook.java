package intro_to_array_lists;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements MouseListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names".
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton add = new JButton("Add name");
	JButton view = new JButton("View names");
	
	ArrayList<String> names = new ArrayList<String>();
	

	void Gui() {
		frame.add(panel);
		panel.add(add);
		panel.add(view);
		
		add.addMouseListener(this);
		view.addMouseListener(this);
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.pack();
	}
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==add) {
		String a = JOptionPane.showInputDialog("What name would you like to add to the list?");
		
		names.add(a);
		
		
		}
		if (e.getSource()== view) {
			String z= "";
			
			for (int i = 0; i < names.size(); i++) {
				z+= "Guest #" + (i+1) + ": " +names.get(i) + "\n";
			}
			JOptionPane.showMessageDialog(null, z);
		}
	
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		GuestBook c = new GuestBook();
		c.Gui();
	}

}
