import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class PokemonSOSReal extends JFrame implements ActionListener{

	JButton btnTurn,btnChain,btnPP,btnTurnChainPP,btnTurnPP,btnLock,btnResetPP;
	JButton resetAll,resetPP;
	JLabel turnL,chainL,totalPPL,PPL,addL,pokemon,sos;
	JTextField turnTxt,chainTxt,totalPPTxt,PPTxt,LockedTxt;
	
	public PokemonSOSReal(){
		setTitle("Pokémon SOS");
		setSize(200,200);
		setLocation(300,300);
		
		turnL= new JLabel("Turn:");
		chainL= new JLabel("Chain");
		totalPPL= new JLabel("PP Max");
		PPL= new JLabel("Current PP:");
		addL= new JLabel("Add/Decrease:");
		pokemon= new JLabel("Pokémon");
		sos= new JLabel("SOS");
		
		turnTxt= new JTextField(10);
		chainTxt= new JTextField(10);
		totalPPTxt= new JTextField(10);
		PPTxt= new JTextField(10);
		LockedTxt = new JTextField(10);
		LockedTxt.setEditable(false);
		
		btnTurn = new JButton("Turn");
		btnTurn.addActionListener(this);
		btnChain = new JButton("Chain");
		btnChain.addActionListener(this);
		btnPP = new JButton("PP");
		btnPP.addActionListener(this);
		btnTurnChainPP = new JButton("Turn+Chain+PP");
		btnTurnChainPP.addActionListener(this);
		btnTurnPP = new JButton("Turn+PP");
		btnTurnPP.addActionListener(this);
		btnLock = new JButton("Lock input fields");
		btnLock.addActionListener(this);
		btnResetPP = new JButton("Reset PP");
		btnResetPP.addActionListener(this);
		
		getContentPane().setLayout(new GridLayout(6,3));

		getContentPane().add(pokemon);
		getContentPane().add(sos);
		getContentPane().add(addL);
		getContentPane().add(turnL);
		getContentPane().add(turnTxt);
		getContentPane().add(btnTurn);
		getContentPane().add(chainL);
		getContentPane().add(chainTxt);
		getContentPane().add(btnChain);
		getContentPane().add(totalPPL);
		getContentPane().add(totalPPTxt);
		getContentPane().add(btnResetPP);
		getContentPane().add(PPL);
		getContentPane().add(PPTxt);
		getContentPane().add(btnPP);
		getContentPane().add(btnTurnChainPP);
		getContentPane().add(btnTurnPP);
		getContentPane().add(btnLock);
		
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource()==btnTurn) {
			int turn=Integer.parseInt(turnTxt.getText());
			turn=turn+1;
			turnTxt.setText(String.valueOf(turn));
		}
		
		if (e.getSource()==btnChain) {
			int chain=Integer.parseInt(chainTxt.getText());
			chain = chain+1;
			chainTxt.setText(String.valueOf(chain));
		}
		
		if (e.getSource()==btnResetPP) {
			int resetpp=Integer.parseInt(totalPPTxt.getText());
			PPTxt.setText(String.valueOf(resetpp));
		}
		
		if (e.getSource()==btnPP) {
			int pp=Integer.parseInt(PPTxt.getText());
			pp = pp-1;
			PPTxt.setText(String.valueOf(pp));
		}
		
		if (e.getSource()==btnTurnChainPP) {
			int turn=Integer.parseInt(turnTxt.getText());
			turn=turn+1;
			turnTxt.setText(String.valueOf(turn));

			int chain=Integer.parseInt(chainTxt.getText());
			chain = chain+1;
			chainTxt.setText(String.valueOf(chain));
			
			int pp=Integer.parseInt(PPTxt.getText());
			pp = pp-1;
			PPTxt.setText(String.valueOf(pp));
		}
		
		if (e.getSource()==btnTurnPP) {
			int turn=Integer.parseInt(turnTxt.getText());
			turn=turn+1;
			turnTxt.setText(String.valueOf(turn));
			
			int pp=Integer.parseInt(PPTxt.getText());
			pp = pp-1;
			PPTxt.setText(String.valueOf(pp));
		}
		
		if (e.getSource()==btnLock) {
			turnTxt.setEditable(false);
			chainTxt.setEditable(false);
			totalPPTxt.setEditable(false);
			PPTxt.setEditable(false);
		}
		
	}
	
}