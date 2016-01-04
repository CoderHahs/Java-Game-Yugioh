import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.applet.Applet;

public class YUGIOH extends Applet implements ActionListener
{
    Panel p_card;  //to hold all of the screens
    Panel card1, card2, card3, card4, card5; //the two screens
    CardLayout cdLayout = new CardLayout ();
    int row = 4;
    JButton m[] = new JButton [5];
    JButton grave;
    JButton s[] = new JButton [5];
    JButton deck;
    JButton h[] = new JButton [5];
    JButton m2[] = new JButton [5];
    JButton grave2;
    JButton s2[] = new JButton [5];
    JButton deck2;
    JButton hand2[] = new JButton [5];
    JLabel largecard;
    JLabel cd;
    int h1 = 0;
    int h2 = 0;
    int h3 = 0;
    int h4 = 0;
    int h5 = 0;
    int h1v2 = 0;
    int h2v2 = 0;
    int h3v2 = 0;
    int h4v2 = 0;
    int h5v2 = 0;

    int deck1[] = {0, 1, 2, 3, 4};
    int deckp2[] = {0, 1, 2, 3, 4};

    int t = 5;
    int t2 = 5;
    JLabel cardsleft;
    JLabel cardsleft2;

    int i = 0;
    int i2 = 0;

    int d[] = new int [40];
    int d2[] = new int [40];

    int cardtochange;
    int spottoerase;
    boolean nocard;
    boolean nocardm[] = {true, true, true, true, true};
    boolean nocardf[] = {true, true, true, true, true};
    boolean nocard2;
    boolean nocardm2[] = {true, true, true, true, true};
    boolean nocardf2[] = {true, true, true, true, true};
    String sors[] = {"Summon", "Set"};
    String ws;
    int atkordef[] = new int [5];
    int atkordef2[] = new int [5];

    int mon[] = new int [5];
    int spe[] = new int [5];
    int mon2[] = new int [5];
    int spe2[] = new int [5];



    public void init ()
    {

	p_card = new Panel ();
	p_card.setLayout (cdLayout);
	screen1 ();
	screen2 ();
	screen3 ();
	screen4 ();
	screen5 ();
	resize (1200, 500);
	setLayout (new BorderLayout ());
	add ("Center", p_card);
    }


    public void screen1 ()
    { //screen 1 is set up.

	card1 = new Panel ();
	card1.setBackground (Color.white);
	JLabel title = new JLabel ("Welcome to the YU-GI-OH Card Game");
	JButton next = new JButton ("Next");
	next.setActionCommand ("card2");
	next.addActionListener (this);
	card1.add (title);
	card1.add (next);
	p_card.add ("1", card1);
    }


    public void screen2 ()
    { //screen 2 is set up.

	card2 = new Panel ();
	card2.setBackground (Color.white);
	JLabel title = new JLabel ("Instructions");
	JButton next = new JButton ("Next");
	next.setActionCommand ("card3");
	next.addActionListener (this);
	card2.add (title);
	card2.add (next);
	p_card.add ("2", card2);
    }



    public void screen3 ()
    { //screen 3 is set up.

	Panel desc = new Panel (new GridLayout (2, 1));

	largecard = new JLabel (" ");
	largecard.setBackground (Color.white);
	largecard.setPreferredSize (new Dimension (215, 300));
	cd = new JLabel ("Click on a card to see its description here. ");
	desc.add (largecard);
	desc.add (cd);
	Panel g = new Panel (new GridLayout (3, 5));
	Panel g2 = new Panel (new GridLayout (3, 5));
	card3 = new Panel (new GridLayout (1, 1));
	card3.setBackground (Color.white);

	for (int i = 0 ; i < 5 ; i++)
	{
	    m [i] = new JButton (" ");
	    m [i].setPreferredSize (new Dimension (100, 154));
	    m [i].setBackground (Color.orange);
	    m [i].addActionListener (this);
	    m [i].setActionCommand ("m" + i);
	    g.add (m [i]);
	}
	grave = new JButton (" ");
	grave.setPreferredSize (new Dimension (100, 154));
	grave.setBackground (Color.gray);
	grave.addActionListener (this);
	grave.setActionCommand ("g");
	g.add (grave);
	for (int i = 0 ; i < 5 ; i++)
	{
	    s [i] = new JButton (" ");
	    s [i].setPreferredSize (new Dimension (100, 154));
	    s [i].setBackground (Color.cyan);
	    s [i].addActionListener (this);
	    s [i].setActionCommand ("s" + i);
	    g.add (s [i]);
	}
	deck = new JButton (" ");
	deck.setPreferredSize (new Dimension (100, 154));
	deck.setIcon (createImageIcon ("Back.jpg"));
	deck.addActionListener (this);
	deck.setActionCommand ("d");
	g.add (deck);
	for (int i = 0 ; i < 5 ; i++)
	{
	    h [i] = new JButton (" ");
	    h [i].setPreferredSize (new Dimension (100, 154));
	    h [i].setBackground (Color.white);
	    h [i].addActionListener (this);
	    h [i].setActionCommand ("h" + i);
	    g.add (h [i]);
	}
	cardsleft2 = new JLabel ("Number of cards left: " + t2);



	JButton next = new JButton ("Next");
	next.setActionCommand ("card4");
	next.addActionListener (this);

	for (int i = 0 ; i < 5 ; i++)
	{
	    m2 [i] = new JButton (" ");
	    m2 [i].setPreferredSize (new Dimension (100, 154));
	    m2 [i].setBackground (Color.orange);
	    m2 [i].addActionListener (this);
	    m2 [i].setActionCommand ("m2" + i);
	    g2.add (m2 [i]);
	}
	grave2 = new JButton (" ");
	grave2.setPreferredSize (new Dimension (100, 154));
	grave2.setBackground (Color.gray);
	grave2.addActionListener (this);
	grave2.setActionCommand ("g2");
	g2.add (grave2);
	for (int i = 0 ; i < 5 ; i++)
	{
	    s2 [i] = new JButton (" ");
	    s2 [i].setPreferredSize (new Dimension (100, 154));
	    s2 [i].setBackground (Color.cyan);
	    s2 [i].addActionListener (this);
	    s2 [i].setActionCommand ("s2" + i);
	    g2.add (s2 [i]);
	}
	deck2 = new JButton (" ");
	deck2.setPreferredSize (new Dimension (100, 154));
	deck2.setIcon (createImageIcon ("Back.jpg"));
	deck2.addActionListener (this);
	deck2.setActionCommand ("d2");
	g2.add (deck2);



	card3.add (g2);
	card3.add (cardsleft2);
	card3.add (desc);

	card3.add (g);
	for (int i = 0 ; i < 5 ; i++)
	{
	    hand2 [i] = new JButton (" ");
	    hand2 [i].setPreferredSize (new Dimension (100, 135));
	    hand2 [i].setBackground (Color.white);
	    hand2 [i].addActionListener (this);
	    hand2 [i].setActionCommand ("h2" + i);
	    g2.add (hand2 [i]);
	}
	for (int i = 0 ; i < deck1.length ; i++)
	{
	    d [i] = 0;
	    d2 [i] = 0;
	}
	cardsleft = new JLabel ("Number of cards left: " + t);
	card3.add (cardsleft);
	//card3.add (next);
	shuffle ();
	p_card.add ("3", card3);
    }


    public void screen4 ()
    { //screen 4 is set up.
	card4 = new Panel ();
	card4.setBackground (Color.yellow);
	JLabel title = new JLabel ("Icon who?");
	JButton next = new JButton ("Next");
	next.setActionCommand ("card5");
	next.addActionListener (this);
	card4.add (title);
	card4.add (next);
	p_card.add ("4", card4);
    }


    public void screen5 ()
    { //screen 5 is set up.
	card5 = new Panel ();
	card5.setBackground (Color.cyan);
	JLabel title = new JLabel ("Icon tell you another");
	JLabel title2 = new JLabel ("knock knock joke.");
	JLabel title3 = new JLabel ("Do you want me to?");
	JButton next = new JButton ("Yes");
	next.setActionCommand ("card1");
	next.addActionListener (this);
	card5.add (title);
	card5.add (title2);
	card5.add (title3);
	card5.add (next);
	p_card.add ("5", card5);
    }


    public void actionPerformed (ActionEvent e)
    { //moves between the screens

	if (e.getActionCommand ().equals ("card1"))
	    cdLayout.show (p_card, "1");
	else if (e.getActionCommand ().equals ("card2"))
	    cdLayout.show (p_card, "2");
	else if (e.getActionCommand ().equals ("card3"))
	    cdLayout.show (p_card, "3");
	else if (e.getActionCommand ().equals ("card4"))
	    cdLayout.show (p_card, "4");
	else if (e.getActionCommand ().equals ("card5"))
	    cdLayout.show (p_card, "5");
	else // the games code
	{

	    //int n = Integer.parseInt (e.getActionCommand ());
	    //int x = n / row;
	    //int y = n % row;


	    if (e.getActionCommand ().equals ("hand0") || e.getActionCommand ().equals ("hand02"))
	    {
		if (e.getActionCommand ().equals ("hand0"))
		{
		    largecard.setIcon (createImageIcon (d [0] + "d.jpg"));
		    cd.setText ("Working");
		    h [0].setActionCommand ("hand0v2");
		    nocard = false;
		}
		else
		{
		    largecard.setIcon (createImageIcon (d2 [0] + "d.jpg"));
		    cd.setText ("Working");
		    hand2 [0].setActionCommand ("hand02v2");
		    nocard2 = false;
		}

	    }
	    else if (e.getActionCommand ().equals ("hand0v2") || e.getActionCommand ().equals ("hand02v2"))
	    {
		if (e.getActionCommand ().equals ("hand0v2"))
		{
		    cardtochange = d [0];
		    if (cardtochange < 3)
			ws = (String) JOptionPane.showInputDialog (null, "Would you like to summon or set?", "Summon or Set?", JOptionPane.INFORMATION_MESSAGE, null, sors, sors [0]);
		    JOptionPane.showMessageDialog (null, "Click where you would like to place the card.", "Where to Place?", JOptionPane.INFORMATION_MESSAGE);
		    spottoerase = 0;
		    h [0].setActionCommand ("hand0");
		    m [0].setActionCommand ("m0v2");
		    m [1].setActionCommand ("m1v2");
		    m [2].setActionCommand ("m2v2");
		    m [3].setActionCommand ("m3v2");
		    m [4].setActionCommand ("m4v2");
		    s [0].setActionCommand ("s0v2");
		    s [1].setActionCommand ("s1v2");
		    s [2].setActionCommand ("s2v2");
		    s [3].setActionCommand ("s3v2");
		    s [4].setActionCommand ("s4v2");
		    nocard = true;
		}
		else
		{
		    cardtochange = d2 [0];
		    if (cardtochange < 3)
			ws = (String) JOptionPane.showInputDialog (null, "Would you like to summon or set?", "Summon or Set?", JOptionPane.INFORMATION_MESSAGE, null, sors, sors [0]);
		    JOptionPane.showMessageDialog (null, "Click where you would like to place the card.", "Where to Place?", JOptionPane.INFORMATION_MESSAGE);
		    spottoerase = 0;
		    hand2 [0].setActionCommand ("hand02");
		    m2 [0].setActionCommand ("m0v2");
		    m2 [0].setActionCommand ("m02v2");
		    m2 [1].setActionCommand ("m12v2");
		    m2 [2].setActionCommand ("m22v2");
		    m2 [3].setActionCommand ("m32v2");
		    m2 [4].setActionCommand ("m42v2");
		    s2 [0].setActionCommand ("s02v2");
		    s2 [1].setActionCommand ("s12v2");
		    s2 [2].setActionCommand ("s22v2");
		    s2 [3].setActionCommand ("s32v2");
		    s2 [4].setActionCommand ("s42v2");
		    nocard = true;
		}

	    }
	    else if (e.getActionCommand ().equals ("hand1") || e.getActionCommand ().equals ("hand12"))
	    {
		if (e.getActionCommand ().equals ("hand1"))
		{
		    largecard.setIcon (createImageIcon (d [1] + "d.jpg"));
		    cd.setText ("Working");
		    h [1].setActionCommand ("hand1v2");
		    nocard = false;
		}
		else
		{
		    largecard.setIcon (createImageIcon (d2 [1] + "d.jpg"));
		    cd.setText ("Working");
		    hand2 [1].setActionCommand ("hand12v2");
		    nocard2 = false;
		}

	    }
	    else if (e.getActionCommand ().equals ("hand1v2") || e.getActionCommand ().equals ("hand12v2"))
	    {
		if (e.getActionCommand ().equals ("hand1v2"))
		{
		    cardtochange = d [1];
		    if (cardtochange < 3)
			ws = (String) JOptionPane.showInputDialog (null, "Would you like to summon or set?", "Summon or Set?", JOptionPane.INFORMATION_MESSAGE, null, sors, sors [0]);
		    JOptionPane.showMessageDialog (null, "Click where you would like to place the card.", "Where to Place?", JOptionPane.INFORMATION_MESSAGE);
		    spottoerase = 1;
		    h [1].setActionCommand ("hand1");
		    m [0].setActionCommand ("m0v2");
		    m [1].setActionCommand ("m1v2");
		    m [2].setActionCommand ("m2v2");
		    m [3].setActionCommand ("m3v2");
		    m [4].setActionCommand ("m4v2");
		    s [0].setActionCommand ("s0v2");
		    s [1].setActionCommand ("s1v2");
		    s [2].setActionCommand ("s2v2");
		    s [3].setActionCommand ("s3v2");
		    s [4].setActionCommand ("s4v2");
		    nocard = true;
		}
		else
		{

		    cardtochange = d2 [1];
		    if (cardtochange < 3)
			ws = (String) JOptionPane.showInputDialog (null, "Would you like to summon or set?", "Summon or Set?", JOptionPane.INFORMATION_MESSAGE, null, sors, sors [0]);
		    JOptionPane.showMessageDialog (null, "Click where you would like to place the card.", "Where to Place?", JOptionPane.INFORMATION_MESSAGE);
		    spottoerase = 1;
		    hand2 [1].setActionCommand ("hand12");
		    m2 [0].setActionCommand ("m02v2");
		    m2 [1].setActionCommand ("m12v2");
		    m2 [2].setActionCommand ("m22v2");
		    m2 [3].setActionCommand ("m32v2");
		    m2 [4].setActionCommand ("m42v2");
		    s2 [0].setActionCommand ("s02v2");
		    s2 [1].setActionCommand ("s12v2");
		    s2 [2].setActionCommand ("s22v2");
		    s2 [3].setActionCommand ("s32v2");
		    s2 [4].setActionCommand ("s42v2");
		    nocard2 = true;


		}

	    }
	    else if (e.getActionCommand ().equals ("hand2") || e.getActionCommand ().equals ("hand22"))
	    {
		if (e.getActionCommand ().equals ("hand2"))
		{
		    largecard.setIcon (createImageIcon (d [2] + "d.jpg"));
		    cd.setText ("Working");
		    h [2].setActionCommand ("hand2v2");
		    nocard = false;
		}
		else
		{
		    largecard.setIcon (createImageIcon (d2 [2] + "d.jpg"));
		    cd.setText ("Working");
		    hand2 [2].setActionCommand ("hand22v2");
		    nocard2 = false;
		}
	    }
	    else if (e.getActionCommand ().equals ("hand2v2") || e.getActionCommand ().equals ("hand22v2"))
	    {
		if (e.getActionCommand ().equals ("hand2v2"))
		{
		    cardtochange = d [2];
		    if (cardtochange < 3)
			ws = (String) JOptionPane.showInputDialog (null, "Would you like to summon or set?", "Summon or Set?", JOptionPane.INFORMATION_MESSAGE, null, sors, sors [0]);
		    JOptionPane.showMessageDialog (null, "Click where you would like to place the card.", "Where to Place?", JOptionPane.INFORMATION_MESSAGE);
		    spottoerase = 2;
		    h [2].setActionCommand ("hand2");
		    m2 [0].setActionCommand ("m02v2");
		    m2 [1].setActionCommand ("m12v2");
		    m2 [2].setActionCommand ("m22v2");
		    m2 [3].setActionCommand ("m32v2");
		    m2 [4].setActionCommand ("m42v2");
		    s2 [0].setActionCommand ("s02v2");
		    s2 [1].setActionCommand ("s12v2");
		    s2 [2].setActionCommand ("s22v2");
		    s2 [3].setActionCommand ("s32v2");
		    s2 [4].setActionCommand ("s42v2");
		    nocard = true;
		}
		else
		{
		    cardtochange = d2 [2];
		    if (cardtochange < 3)
			ws = (String) JOptionPane.showInputDialog (null, "Would you like to summon or set?", "Summon or Set?", JOptionPane.INFORMATION_MESSAGE, null, sors, sors [0]);
		    JOptionPane.showMessageDialog (null, "Click where you would like to place the card.", "Where to Place?", JOptionPane.INFORMATION_MESSAGE);
		    spottoerase = 2;
		    hand2 [2].setActionCommand ("hand22");
		    m2 [0].setActionCommand ("m02v2");
		    m2 [1].setActionCommand ("m12v2");
		    m2 [2].setActionCommand ("m22v2");
		    m2 [3].setActionCommand ("m32v2");
		    m2 [4].setActionCommand ("m42v2");
		    s2 [0].setActionCommand ("s02v2");
		    s2 [1].setActionCommand ("s12v2");
		    s2 [2].setActionCommand ("s22v2");
		    s2 [3].setActionCommand ("s32v2");
		    s2 [4].setActionCommand ("s42v2");
		    nocard2 = true;
		}

	    }
	    else if (e.getActionCommand ().equals ("hand3") || e.getActionCommand ().equals ("hand32"))
	    {
		if (e.getActionCommand ().equals ("hand3"))
		{
		    largecard.setIcon (createImageIcon (d [3] + "d.jpg"));
		    cd.setText ("Working");
		    h [3].setActionCommand ("hand3v2");
		    nocard = false;
		}
		else
		{
		    largecard.setIcon (createImageIcon (d2 [3] + "d.jpg"));
		    cd.setText ("Working");
		    hand2 [3].setActionCommand ("hand32v2");
		    nocard2 = false;
		}
	    }
	    else if (e.getActionCommand ().equals ("hand3v2") || e.getActionCommand ().equals ("hand32v2"))
	    {
		if (e.getActionCommand ().equals ("hand3v2"))
		{
		    cardtochange = d [3];
		    if (cardtochange < 3)
			ws = (String) JOptionPane.showInputDialog (null, "Would you like to summon or set?", "Summon or Set?", JOptionPane.INFORMATION_MESSAGE, null, sors, sors [0]);
		    JOptionPane.showMessageDialog (null, "Click where you would like to place the card.", "Where to Place?", JOptionPane.INFORMATION_MESSAGE);
		    spottoerase = 3;
		    h [3].setActionCommand ("hand3");
		    m [0].setActionCommand ("m0v2");
		    m [1].setActionCommand ("m1v2");
		    m [2].setActionCommand ("m2v2");
		    m [3].setActionCommand ("m3v2");
		    m [4].setActionCommand ("m4v2");
		    s [0].setActionCommand ("s0v2");
		    s [1].setActionCommand ("s1v2");
		    s [2].setActionCommand ("s2v2");
		    s [3].setActionCommand ("s3v2");
		    s [4].setActionCommand ("s4v2");
		    nocard = true;
		}
		else
		{
		    cardtochange = d2 [3];
		    if (cardtochange < 3)
			ws = (String) JOptionPane.showInputDialog (null, "Would you like to summon or set?", "Summon or Set?", JOptionPane.INFORMATION_MESSAGE, null, sors, sors [0]);
		    JOptionPane.showMessageDialog (null, "Click where you would like to place the card.", "Where to Place?", JOptionPane.INFORMATION_MESSAGE);
		    spottoerase = 3;
		    hand2 [3].setActionCommand ("hand32");
		    m2 [0].setActionCommand ("m02v2");
		    m2 [1].setActionCommand ("m12v2");
		    m2 [2].setActionCommand ("m22v2");
		    m2 [3].setActionCommand ("m32v2");
		    m2 [4].setActionCommand ("m42v2");
		    s2 [0].setActionCommand ("s02v2");
		    s2 [1].setActionCommand ("s12v2");
		    s2 [2].setActionCommand ("s22v2");
		    s2 [3].setActionCommand ("s32v2");
		    s2 [4].setActionCommand ("s42v2");
		    nocard = true;
		}

	    }
	    else if (e.getActionCommand ().equals ("hand4") || e.getActionCommand ().equals ("hand42"))
	    {
		if (e.getActionCommand ().equals ("hand4"))
		{

		    largecard.setIcon (createImageIcon (d [4] + "d.jpg"));
		    cd.setText ("Working");
		    h [4].setActionCommand ("hand4v2");
		    nocard = false;
		}
		else
		{
		    largecard.setIcon (createImageIcon (d2 [4] + "d.jpg"));
		    cd.setText ("Working");
		    hand2 [4].setActionCommand ("hand42v2");
		    nocard2 = false;
		}
	    }
	    else if (e.getActionCommand ().equals ("hand4v2") || e.getActionCommand ().equals ("hand42v2"))
	    {
		if (e.getActionCommand ().equals ("hand4v2"))
		{
		    cardtochange = d [4];
		    if (cardtochange < 3)
			ws = (String) JOptionPane.showInputDialog (null, "Would you like to summon or set?", "Summon or Set?", JOptionPane.INFORMATION_MESSAGE, null, sors, sors [0]);
		    JOptionPane.showMessageDialog (null, "Click where you would like to place the card.", "Where to Place?", JOptionPane.INFORMATION_MESSAGE);
		    spottoerase = 4;
		    h [4].setActionCommand ("hand4");
		    m [0].setActionCommand ("m0v2");
		    m [1].setActionCommand ("m1v2");
		    m [2].setActionCommand ("m2v2");
		    m [3].setActionCommand ("m3v2");
		    m [4].setActionCommand ("m4v2");
		    s [0].setActionCommand ("s0v2");
		    s [1].setActionCommand ("s1v2");
		    s [2].setActionCommand ("s2v2");
		    s [3].setActionCommand ("s3v2");
		    s [4].setActionCommand ("s4v2");
		    nocard = true;
		}
		else
		{
		    cardtochange = d2 [4];
		    if (cardtochange < 3)
			ws = (String) JOptionPane.showInputDialog (null, "Would you like to summon or set?", "Summon or Set?", JOptionPane.INFORMATION_MESSAGE, null, sors, sors [0]);
		    JOptionPane.showMessageDialog (null, "Click where you would like to place the card.", "Where to Place?", JOptionPane.INFORMATION_MESSAGE);
		    spottoerase = 4;
		    hand2 [4].setActionCommand ("hand42");
		    m2 [0].setActionCommand ("m02v2");
		    m2 [1].setActionCommand ("m12v2");
		    m2 [2].setActionCommand ("m22v2");
		    m2 [3].setActionCommand ("m32v2");
		    m2 [4].setActionCommand ("m42v2");
		    s2 [0].setActionCommand ("s02v2");
		    s2 [1].setActionCommand ("s12v2");
		    s2 [2].setActionCommand ("s22v2");
		    s2 [3].setActionCommand ("s32v2");
		    s2 [4].setActionCommand ("s42v2");
		    nocard2 = true;
		}

	    }
	    if (e.getActionCommand ().equals ("m0") || e.getActionCommand ().equals ("m02"))
	    {
		if (nocardm [0] = true)
		{
		    largecard.setForeground (Color.white);
		    cd.setText ("Click on a card to see its description here. ");
		}
		else if (nocardm2 [0] = true)
		{
		    largecard.setForeground (Color.white);
		    cd.setText ("Click on a card to see its description here. ");
		}
		else if (e.getActionCommand ().equals ("m0"))
		{
		    largecard.setIcon (createImageIcon (mon [0] + "d.jpg"));
		    cd.setText ("Working");
		}
		else
		{
		    largecard.setIcon (createImageIcon (mon2 [0] + "d.jpg"));
		    cd.setText ("Working");
		}
	    }
	    // putting monster card in monster zone
	    else if (e.getActionCommand ().equals ("m0v2") || e.getActionCommand ().equals ("m02v2"))
	    {
		if (e.getActionCommand ().equals ("m0v2"))
		{
		    if (cardtochange >= 3)
			JOptionPane.showMessageDialog (null, "The card you have selected is a spell/trap card. It can only be played in the spell/trap card zone (cyan tiles). Please try again.", "Card cannot be placed at desired location", JOptionPane.INFORMATION_MESSAGE);
		    else
		    {
			if (nocardm [0] == true)
			{
			    mon [0] = cardtochange;
			    h1 = 0;
			    if (ws.equals ("Summon"))
			    {
				m [0].setIcon (createImageIcon (cardtochange + ".jpg"));
				atkordef [0] = 1;
			    }
			    else
			    {
				m [0].setIcon (createImageIcon ("Back.jpg"));
				atkordef [0] = 0;
			    }
			    h [spottoerase].setIcon (null);
			    nocardm [0] = false;
			    m [0].setActionCommand ("m0");
			    m [1].setActionCommand ("m1");
			    m [2].setActionCommand ("m2");
			    m [3].setActionCommand ("m3");
			    m [4].setActionCommand ("m4");
			    s [0].setActionCommand ("s0");
			    s [1].setActionCommand ("s1");
			    s [2].setActionCommand ("s2");
			    s [3].setActionCommand ("s3");
			    s [4].setActionCommand ("s4");
			    h [spottoerase].setActionCommand (null);
			}
			else
			{
			    JOptionPane.showMessageDialog (null, "There is already a card in that location. Please try again.", "Card cannot be placed at desired location", JOptionPane.INFORMATION_MESSAGE);
			    nocardm [0] = true;
			}
		    }
		}
		else
		{
		    if (cardtochange >= 3)
			JOptionPane.showMessageDialog (null, "The card you have selected is a spell/trap card. It can only be played in the spell/trap card zone (cyan tiles). Please try again.", "Card cannot be placed at desired location", JOptionPane.INFORMATION_MESSAGE);
		    else
		    {
			if (nocardm2 [0] == true)
			{
			    mon2 [0] = cardtochange;
			    h1v2 = 0;
			    if (ws.equals ("Summon"))
			    {
				m2 [0].setIcon (createImageIcon (cardtochange + ".jpg"));
				atkordef2 [0] = 1;
			    }
			    else
			    {
				m2 [0].setIcon (createImageIcon ("Back.jpg"));
				atkordef2 [0] = 0;
			    }
			    hand2 [spottoerase].setIcon (null);
			    nocardm [0] = false;
			    m2 [0].setActionCommand ("m0");
			    m2 [1].setActionCommand ("m1");
			    m2 [2].setActionCommand ("m2");
			    m2 [3].setActionCommand ("m3");
			    m2 [4].setActionCommand ("m4");
			    s2 [0].setActionCommand ("s0");
			    s2 [1].setActionCommand ("s1");
			    s2 [2].setActionCommand ("s2");
			    s2 [3].setActionCommand ("s3");
			    s2 [4].setActionCommand ("s4");
			    hand2 [spottoerase].setActionCommand (null);
			}
			else
			{
			    JOptionPane.showMessageDialog (null, "There is already a card in that location. Please try again.", "Card cannot be placed at desired location", JOptionPane.INFORMATION_MESSAGE);
			    nocardm2 [0] = true;
			}
		    }
		}
	    }
	    else if (e.getActionCommand ().equals ("m1") || e.getActionCommand ().equals ("m12"))
	    {
		if (nocardm [1] = true)
		{
		    largecard.setForeground (Color.white);
		    cd.setText ("Click on a card to see its description here. ");
		}
		else if (nocardm2 [1] = true)
		{
		    largecard.setForeground (Color.white);
		    cd.setText ("Click on a card to see its description here. ");
		}
		else if (e.getActionCommand ().equals ("m1"))
		{
		    largecard.setIcon (createImageIcon (mon [1] + "d.jpg"));
		    cd.setText ("Working");
		}
		else
		{
		    largecard.setIcon (createImageIcon (mon2 [1] + "d.jpg"));
		    cd.setText ("Working");
		}
	    }
	    else if (e.getActionCommand ().equals ("m1v2") || e.getActionCommand ().equals ("m12v2"))
	    {
		if (e.getActionCommand ().equals ("m1v2"))
		{
		    if (cardtochange >= 3)
			JOptionPane.showMessageDialog (null, "The card you have selected is a spell/trap card. It can only be played in the spell/trap card zone (cyan tiles). Please try again.", "Card cannot be placed at desired location", JOptionPane.INFORMATION_MESSAGE);
		    else
		    {
			if (nocardm [1] == true)
			{
			    mon [1] = cardtochange;
			    h2 = 0;
			    if (ws.equals ("Summon"))
			    {
				m [1].setIcon (createImageIcon (cardtochange + ".jpg"));
				atkordef [1] = 1;
			    }
			    else
			    {
				m [1].setIcon (createImageIcon ("Back.jpg"));
				atkordef [1] = 0;
			    }
			    hand2 [spottoerase].setIcon (null);
			    nocardm [1] = false;
			    m [0].setActionCommand ("m0");
			    m [1].setActionCommand ("m1");
			    m [2].setActionCommand ("m2");
			    m [3].setActionCommand ("m3");
			    m [4].setActionCommand ("m4");
			    s [0].setActionCommand ("s0");
			    s [1].setActionCommand ("s1");
			    s [2].setActionCommand ("s2");
			    s [3].setActionCommand ("s3");
			    s [4].setActionCommand ("s4");
			    h [spottoerase].setActionCommand (null);
			}
			else
			{
			    JOptionPane.showMessageDialog (null, "There is already a card in that location. Please try again.", "Card cannot be placed at desired location", JOptionPane.INFORMATION_MESSAGE);
			    nocardm [1] = true;
			}

		    }
		}
		else
		{
		    if (cardtochange >= 3)
			JOptionPane.showMessageDialog (null, "The card you have selected is a spell/trap card. It can only be played in the spell/trap card zone (cyan tiles). Please try again.", "Card cannot be placed at desired location", JOptionPane.INFORMATION_MESSAGE);
		    else
		    {
			if (nocardm2 [1] == true)
			{
			    mon2 [1] = cardtochange;
			    h2v2 = 0;
			    if (ws.equals ("Summon"))
			    {
				m2 [1].setIcon (createImageIcon (cardtochange + ".jpg"));
				atkordef2 [1] = 1;
			    }
			    else
			    {
				m2 [1].setIcon (createImageIcon ("Back.jpg"));
				atkordef2 [1] = 0;
			    }
			    hand2 [spottoerase].setIcon (null);
			    nocardm2 [1] = false;
			    m2 [0].setActionCommand ("m0");
			    m2 [1].setActionCommand ("m1");
			    m2 [2].setActionCommand ("m2");
			    m2 [3].setActionCommand ("m3");
			    m2 [4].setActionCommand ("m4");
			    s2 [0].setActionCommand ("s0");
			    s2 [1].setActionCommand ("s1");
			    s2 [2].setActionCommand ("s2");
			    s2 [3].setActionCommand ("s3");
			    s2 [4].setActionCommand ("s4");
			    hand2 [spottoerase].setActionCommand (null);
			}
			else
			{
			    JOptionPane.showMessageDialog (null, "There is already a card in that location. Please try again.", "Card cannot be placed at desired location", JOptionPane.INFORMATION_MESSAGE);
			    nocardm2 [1] = true;
			}

		    }
		}
	    }
	    else if (e.getActionCommand ().equals ("m2") || e.getActionCommand ().equals ("m22"))
	    {
		if (nocardm [2] = true)
		{
		    largecard.setForeground (Color.white);
		    cd.setText ("Click on a card to see its description here. ");
		}
		else if (nocardm2 [2] = true)
		{
		    largecard.setForeground (Color.white);
		    cd.setText ("Click on a card to see its description here. ");
		}
		else if (e.getActionCommand ().equals ("m2"))
		{
		    largecard.setIcon (createImageIcon (mon [2] + "d.jpg"));
		    cd.setText ("Working");
		}
		else
		{
		    largecard.setIcon (createImageIcon (mon2 [2] + "d.jpg"));
		    cd.setText ("Working");
		}
	    }
	    else if (e.getActionCommand ().equals ("m2v2") || e.getActionCommand ().equals ("m22v2"))
	    {
		if (e.getActionCommand ().equals ("m2v2"))
		{
		    if (cardtochange >= 3)
			JOptionPane.showMessageDialog (null, "The card you have selected is a spell/trap card. It can only be played in the spell/trap card zone (cyan tiles). Please try again.", "Card cannot be placed at desired location", JOptionPane.INFORMATION_MESSAGE);
		    else
		    {
			if (nocardm [2] == true)
			{
			    mon [2] = cardtochange;
			    h3 = 0;
			    if (ws.equals ("Summon"))
			    {
				m [2].setIcon (createImageIcon (cardtochange + ".jpg"));
				atkordef [2] = 1;
			    }
			    else
			    {
				m [2].setIcon (createImageIcon ("Back.jpg"));
				atkordef [2] = 0;
			    }
			    h [spottoerase].setIcon (null);
			    nocardm [2] = false;
			    m [0].setActionCommand ("m0");
			    m [1].setActionCommand ("m1");
			    m [2].setActionCommand ("m2");
			    m [3].setActionCommand ("m3");
			    m [4].setActionCommand ("m4");
			    s [0].setActionCommand ("s0");
			    s [1].setActionCommand ("s1");
			    s [2].setActionCommand ("s2");
			    s [3].setActionCommand ("s3");
			    s [4].setActionCommand ("s4");
			    h [spottoerase].setActionCommand (null);
			}
			else
			{
			    JOptionPane.showMessageDialog (null, "There is already a card in that location. Please try again.", "Card cannot be placed at desired location", JOptionPane.INFORMATION_MESSAGE);
			    nocardm [2] = true;
			}

		    }
		}
		else
		{
		    if (cardtochange >= 3)
			JOptionPane.showMessageDialog (null, "The card you have selected is a spell/trap card. It can only be played in the spell/trap card zone (cyan tiles). Please try again.", "Card cannot be placed at desired location", JOptionPane.INFORMATION_MESSAGE);
		    else
		    {
			if (nocardm2 [2] == true)
			{
			    mon2 [2] = cardtochange;
			    h3v2 = 0;
			    if (ws.equals ("Summon"))
			    {
				m2 [2].setIcon (createImageIcon (cardtochange + ".jpg"));
				atkordef2 [2] = 1;
			    }
			    else
			    {
				m2 [2].setIcon (createImageIcon ("Back.jpg"));
				atkordef2 [2] = 0;
			    }
			    hand2 [spottoerase].setIcon (null);
			    nocardm2 [2] = false;
			    m2 [0].setActionCommand ("m0");
			    m2 [1].setActionCommand ("m1");
			    m2 [2].setActionCommand ("m2");
			    m2 [3].setActionCommand ("m3");
			    m2 [4].setActionCommand ("m4");
			    s2 [0].setActionCommand ("s0");
			    s2 [1].setActionCommand ("s1");
			    s2 [2].setActionCommand ("s2");
			    s2 [3].setActionCommand ("s3");
			    s2 [4].setActionCommand ("s4");
			    hand2 [spottoerase].setActionCommand (null);
			}
			else
			{
			    JOptionPane.showMessageDialog (null, "There is already a card in that location. Please try again.", "Card cannot be placed at desired location", JOptionPane.INFORMATION_MESSAGE);
			    nocardm2 [2] = true;
			}

		    }
		}
	    }
	    else if (e.getActionCommand ().equals ("m3") || e.getActionCommand ().equals ("m32"))
	    {
		if (nocardm [3] = true)
		{
		    largecard.setForeground (Color.white);
		    cd.setText ("Click on a card to see its description here. ");
		}
		else if (nocardm2 [3] = true)
		{
		    largecard.setForeground (Color.white);
		    cd.setText ("Click on a card to see its description here. ");
		}
		else if (e.getActionCommand ().equals ("m3"))
		{
		    largecard.setIcon (createImageIcon (mon [3] + "d.jpg"));
		    cd.setText ("Working");
		}
		else
		{
		    largecard.setIcon (createImageIcon (mon2 [3] + "d.jpg"));
		    cd.setText ("Working");
		}
	    }
	    else if (e.getActionCommand ().equals ("m3v2") || e.getActionCommand ().equals ("m32v2"))
	    {
		if (e.getActionCommand ().equals ("m3v2"))
		{
		    if (cardtochange >= 3)
			JOptionPane.showMessageDialog (null, "The card you have selected is a spell/trap card. It can only be played in the spell/trap card zone (cyan tiles). Please try again.", "Card cannot be placed at desired location", JOptionPane.INFORMATION_MESSAGE);
		    else
		    {
			if (nocardm [3] == true)
			{
			    mon [3] = cardtochange;
			    h4 = 0;
			    if (ws.equals ("Summon"))
			    {
				m [3].setIcon (createImageIcon (cardtochange + ".jpg"));
				atkordef [3] = 1;
			    }
			    else
			    {
				m [3].setIcon (createImageIcon ("Back.jpg"));
				atkordef [3] = 0;
			    }
			    h [spottoerase].setIcon (null);
			    nocardm [3] = false;
			    m [0].setActionCommand ("m0");
			    m [1].setActionCommand ("m1");
			    m [2].setActionCommand ("m2");
			    m [3].setActionCommand ("m3");
			    m [4].setActionCommand ("m4");
			    s [0].setActionCommand ("s0");
			    s [1].setActionCommand ("s1");
			    s [2].setActionCommand ("s2");
			    s [3].setActionCommand ("s3");
			    s [4].setActionCommand ("s4");
			    h [spottoerase].setActionCommand (null);
			}
			else
			{
			    JOptionPane.showMessageDialog (null, "There is already a card in that location. Please try again.", "Card cannot be placed at desired location", JOptionPane.INFORMATION_MESSAGE);
			    nocardm [3] = true;
			}


		    }
		}
		else
		{
		    if (cardtochange >= 3)
			JOptionPane.showMessageDialog (null, "The card you have selected is a spell/trap card. It can only be played in the spell/trap card zone (cyan tiles). Please try again.", "Card cannot be placed at desired location", JOptionPane.INFORMATION_MESSAGE);
		    else
		    {
			if (nocardm2 [3] == true)
			{
			    mon2 [3] = cardtochange;
			    h4v2 = 0;
			    if (ws.equals ("Summon"))
			    {
				m2 [3].setIcon (createImageIcon (cardtochange + ".jpg"));
				atkordef2 [3] = 1;
			    }
			    else
			    {
				m2 [3].setIcon (createImageIcon ("Back.jpg"));
				atkordef2 [3] = 0;
			    }
			    hand2 [spottoerase].setIcon (null);
			    nocardm2 [3] = false;
			    m2 [0].setActionCommand ("m0");
			    m2 [1].setActionCommand ("m1");
			    m2 [2].setActionCommand ("m2");
			    m2 [3].setActionCommand ("m3");
			    m2 [4].setActionCommand ("m4");
			    s2 [0].setActionCommand ("s0");
			    s2 [1].setActionCommand ("s1");
			    s2 [2].setActionCommand ("s2");
			    s2 [3].setActionCommand ("s3");
			    s2 [4].setActionCommand ("s4");
			    hand2 [spottoerase].setActionCommand (null);
			}
			else
			{
			    JOptionPane.showMessageDialog (null, "There is already a card in that location. Please try again.", "Card cannot be placed at desired location", JOptionPane.INFORMATION_MESSAGE);
			    nocardm2 [3] = true;
			}


		    }
		}
	    }
	    else if (e.getActionCommand ().equals ("m4") || e.getActionCommand ().equals ("m42"))
	    {
		if (nocardm [4] = true)
		{
		    largecard.setForeground (Color.white);
		    cd.setText ("Click on a card to see its description here. ");
		}
		else if (nocardm2 [4] = true)
		{
		    largecard.setForeground (Color.white);
		    cd.setText ("Click on a card to see its description here. ");
		}
		else if (e.getActionCommand ().equals ("m4"))
		{
		    largecard.setIcon (createImageIcon (mon [4] + "d.jpg"));
		    cd.setText ("Working");
		}
		else
		{
		    largecard.setIcon (createImageIcon (mon2 [4] + "d.jpg"));
		    cd.setText ("Working");
		}
	    }
	    else if (e.getActionCommand ().equals ("m4v2") || e.getActionCommand ().equals ("m42v2"))
	    {
		if (e.getActionCommand ().equals ("m4v2"))
		{
		    if (cardtochange >= 3)
			JOptionPane.showMessageDialog (null, "The card you have selected is a spell/trap card. It can only be played in the spell/trap card zone (cyan tiles). Please try again.", "Card cannot be placed at desired location", JOptionPane.INFORMATION_MESSAGE);
		    else
		    {
			if (nocardm [4] == true)
			{
			    mon [4] = cardtochange;
			    h5 = 0;
			    if (ws.equals ("Summon"))
			    {
				m [4].setIcon (createImageIcon (cardtochange + ".jpg"));
				atkordef [4] = 1;
			    }
			    else
			    {
				m [4].setIcon (createImageIcon ("Back.jpg"));
				atkordef [4] = 0;
			    }
			    h [spottoerase].setIcon (null);
			    nocardm [4] = false;
			    m [0].setActionCommand ("m0");
			    m [1].setActionCommand ("m1");
			    m [2].setActionCommand ("m2");
			    m [3].setActionCommand ("m3");
			    m [4].setActionCommand ("m4");
			    s [0].setActionCommand ("s0");
			    s [1].setActionCommand ("s1");
			    s [2].setActionCommand ("s2");
			    s [3].setActionCommand ("s3");
			    s [4].setActionCommand ("s4");
			    h [spottoerase].setActionCommand (null);
			}
			else
			{
			    JOptionPane.showMessageDialog (null, "There is already a card in that location. Please try again.", "Card cannot be placed at desired location", JOptionPane.INFORMATION_MESSAGE);
			    nocardm [4] = true;
			}

		    }
		}
		else
		{
		    if (cardtochange >= 3)
			JOptionPane.showMessageDialog (null, "The card you have selected is a spell/trap card. It can only be played in the spell/trap card zone (cyan tiles). Please try again.", "Card cannot be placed at desired location", JOptionPane.INFORMATION_MESSAGE);
		    else
		    {
			if (nocardm2 [4] == true)
			{
			    mon2 [4] = cardtochange;
			    h5v2 = 0;
			    if (ws.equals ("Summon"))
			    {
				m2 [4].setIcon (createImageIcon (cardtochange + ".jpg"));
				atkordef2 [4] = 1;
			    }
			    else
			    {
				m2 [4].setIcon (createImageIcon ("Back.jpg"));
				atkordef2 [4] = 0;
			    }
			    hand2 [spottoerase].setIcon (null);
			    nocardm2 [4] = false;
			    m2 [0].setActionCommand ("m0");
			    m2 [1].setActionCommand ("m1");
			    m2 [2].setActionCommand ("m2");
			    m2 [3].setActionCommand ("m3");
			    m2 [4].setActionCommand ("m4");
			    s2 [0].setActionCommand ("s0");
			    s2 [1].setActionCommand ("s1");
			    s2 [2].setActionCommand ("s2");
			    s2 [3].setActionCommand ("s3");
			    s2 [4].setActionCommand ("s4");
			    hand2 [spottoerase].setActionCommand (null);
			}
			else
			{
			    JOptionPane.showMessageDialog (null, "There is already a card in that location. Please try again.", "Card cannot be placed at desired location", JOptionPane.INFORMATION_MESSAGE);
			    nocardm2 [4] = true;
			}

		    }
		}
	    }

	    // putting spell/trap card in spel/trap zone
	    if (e.getActionCommand ().equals ("s0") || e.getActionCommand ().equals ("s02"))
	    {
		if (nocardf [0] = true)
		{
		    largecard.setForeground (Color.white);
		    cd.setText ("Click on a card to see its description here. ");
		}
		else if (nocardf2 [0] = true)
		{
		    largecard.setForeground (Color.white);
		    cd.setText ("Click on a card to see its description here. ");
		}
		else if (e.getActionCommand ().equals ("s0"))
		{
		    largecard.setIcon (createImageIcon (spe [0] + "d.jpg"));
		    cd.setText ("Working");
		}
		else
		{
		    largecard.setIcon (createImageIcon (spe2 [0] + "d.jpg"));
		    cd.setText ("Working");
		}
	    }
	    else if (e.getActionCommand ().equals ("s0v2") || e.getActionCommand ().equals ("s02v2"))
	    {
		if (e.getActionCommand ().equals ("s0v2"))
		{
		    if (cardtochange < 3)
			JOptionPane.showMessageDialog (null, "The card you have selected is a monster card. It can only be played in the monster card zone (orange tiles). Please try again.", "Card cannot be placed at desired location", JOptionPane.INFORMATION_MESSAGE);
		    else
		    {
			if (nocardf [0] == true)
			{
			    spe [0] = cardtochange;
			    h1 = 0;
			    s [0].setIcon (createImageIcon (cardtochange + ".jpg"));
			    h [spottoerase].setIcon (null);
			    nocardf [0] = false;
			    s [0].setActionCommand ("s0");
			    s [1].setActionCommand ("s1");
			    s [2].setActionCommand ("s2");
			    s [3].setActionCommand ("s3");
			    s [4].setActionCommand ("s4");

			    m [0].setActionCommand ("m0");
			    m [1].setActionCommand ("m1");
			    m [2].setActionCommand ("m2");
			    m [3].setActionCommand ("m3");
			    m [4].setActionCommand ("m4");
			    h [spottoerase].setActionCommand (null);
			}
			else
			{
			    JOptionPane.showMessageDialog (null, "There is already a card in that location. Please try again.", "Card cannot be placed at desired location", JOptionPane.INFORMATION_MESSAGE);
			    nocardf [0] = true;
			}
		    }
		}
		else
		{
		    if (cardtochange < 3)
			JOptionPane.showMessageDialog (null, "The card you have selected is a monster card. It can only be played in the monster card zone (orange tiles). Please try again.", "Card cannot be placed at desired location", JOptionPane.INFORMATION_MESSAGE);
		    else
		    {
			if (nocardf2 [0] == true)
			{
			    spe2 [0] = cardtochange;
			    h1v2 = 0;
			    s2 [0].setIcon (createImageIcon (cardtochange + ".jpg"));
			    hand2 [spottoerase].setIcon (null);
			    nocardf2 [0] = false;
			    s2 [0].setActionCommand ("s0");
			    s2 [1].setActionCommand ("s1");
			    s2 [2].setActionCommand ("s2");
			    s2 [3].setActionCommand ("s3");
			    s2 [4].setActionCommand ("s4");
			    m2 [0].setActionCommand ("m0");
			    m2 [1].setActionCommand ("m1");
			    m2 [2].setActionCommand ("m2");
			    m2 [3].setActionCommand ("m3");
			    m2 [4].setActionCommand ("m4");
			    hand2 [spottoerase].setActionCommand (null);
			}
			else
			{
			    JOptionPane.showMessageDialog (null, "There is already a card in that location. Please try again.", "Card cannot be placed at desired location", JOptionPane.INFORMATION_MESSAGE);
			    nocardf2 [0] = true;
			}
		    }
		}
	    }
	    else if (e.getActionCommand ().equals ("s1") || e.getActionCommand ().equals ("s12"))
	    {
		if (nocardf [1] = true)
		{
		    largecard.setForeground (Color.white);
		    cd.setText ("Click on a card to see its description here. ");
		}
		else if (nocardf2 [1] = true)
		{
		    largecard.setForeground (Color.white);
		    cd.setText ("Click on a card to see its description here. ");
		}
		else if (e.getActionCommand ().equals ("s12"))
		{
		    largecard.setIcon (createImageIcon (spe [1] + "d.jpg"));
		    cd.setText ("Working");
		}
		else
		{
		    largecard.setIcon (createImageIcon (spe2 [1] + "d.jpg"));
		    cd.setText ("Working");
		}
	    }
	    else if (e.getActionCommand ().equals ("s1v2") || e.getActionCommand ().equals ("s12v2"))
	    {
		if (e.getActionCommand ().equals ("s1v2"))
		{
		    if (cardtochange < 3)
			JOptionPane.showMessageDialog (null, "The card you have selected is a monster card. It can only be played in the monster card zone (orange tiles). Please try again.", "Card cannot be placed at desired location", JOptionPane.INFORMATION_MESSAGE);
		    else
		    {
			if (nocardf [1] == true)
			{
			    spe [1] = cardtochange;
			    h2 = 0;
			    s [1].setIcon (createImageIcon (cardtochange + ".jpg"));
			    h [spottoerase].setIcon (null);
			    nocardf [1] = false;
			    s [0].setActionCommand ("s0");
			    s [1].setActionCommand ("s1");
			    s [2].setActionCommand ("s2");
			    s [3].setActionCommand ("s3");
			    s [4].setActionCommand ("s4");

			    m [0].setActionCommand ("m0");
			    m [1].setActionCommand ("m1");
			    m [2].setActionCommand ("m2");
			    m [3].setActionCommand ("m3");
			    m [4].setActionCommand ("m4");
			    h [spottoerase].setActionCommand (null);
			}
			else
			{
			    JOptionPane.showMessageDialog (null, "There is already a card in that location. Please try again.", "Card cannot be placed at desired location", JOptionPane.INFORMATION_MESSAGE);
			    nocardf [1] = true;
			}
		    }
		}
		else
		{
		    if (cardtochange < 3)
			JOptionPane.showMessageDialog (null, "The card you have selected is a monster card. It can only be played in the monster card zone (orange tiles). Please try again.", "Card cannot be placed at desired location", JOptionPane.INFORMATION_MESSAGE);
		    else
		    {
			if (nocardf2 [1] == true)
			{
			    spe2 [1] = cardtochange;
			    h2v2 = 0;
			    s2 [1].setIcon (createImageIcon (cardtochange + ".jpg"));
			    hand2 [spottoerase].setIcon (null);
			    nocardf2 [1] = false;
			    s2 [0].setActionCommand ("s0");
			    s2 [1].setActionCommand ("s1");
			    s2 [2].setActionCommand ("s2");
			    s2 [3].setActionCommand ("s3");
			    s2 [4].setActionCommand ("s4");
			    m2 [0].setActionCommand ("m0");
			    m2 [1].setActionCommand ("m1");
			    m2 [2].setActionCommand ("m2");
			    m2 [3].setActionCommand ("m3");
			    m2 [4].setActionCommand ("m4");
			    hand2 [spottoerase].setActionCommand (null);
			}
			else
			{
			    JOptionPane.showMessageDialog (null, "There is already a card in that location. Please try again.", "Card cannot be placed at desired location", JOptionPane.INFORMATION_MESSAGE);
			    nocardf2 [1] = true;
			}
		    }
		}
	    }
	    else if (e.getActionCommand ().equals ("s2") || e.getActionCommand ().equals ("s22"))
	    {
		if (nocardf [2] = true)
		{
		    largecard.setForeground (Color.white);
		    cd.setText ("Click on a card to see its description here. ");
		}
		else if (nocardf2 [2] = true)
		{
		    largecard.setForeground (Color.white);
		    cd.setText ("Click on a card to see its description here. ");
		}
		else if (e.getActionCommand ().equals ("s2"))
		{
		    largecard.setIcon (createImageIcon (spe [2] + "d.jpg"));
		    cd.setText ("Working");
		}
		else
		{
		    largecard.setIcon (createImageIcon (spe2 [2] + "d.jpg"));
		    cd.setText ("Working");
		}
	    }
	    else if (e.getActionCommand ().equals ("s2v2") || e.getActionCommand ().equals ("s22v2"))
	    {
		if (e.getActionCommand ().equals ("s2v2"))
		{
		    if (cardtochange < 3)
			JOptionPane.showMessageDialog (null, "The card you have selected is a monster card. It can only be played in the monster card zone (orange tiles). Please try again.", "Card cannot be placed at desired location", JOptionPane.INFORMATION_MESSAGE);
		    else
		    {
			if (nocardf [2] == true)
			{
			    spe [2] = cardtochange;
			    h3 = 0;
			    s [2].setIcon (createImageIcon (cardtochange + ".jpg"));
			    h [spottoerase].setIcon (null);
			    nocardf [2] = false;
			    s [0].setActionCommand ("s0");
			    s [1].setActionCommand ("s1");
			    s [2].setActionCommand ("s2");
			    s [3].setActionCommand ("s3");
			    s [4].setActionCommand ("s4");

			    m [0].setActionCommand ("m0");
			    m [1].setActionCommand ("m1");
			    m [2].setActionCommand ("m2");
			    m [3].setActionCommand ("m3");
			    m [4].setActionCommand ("m4");
			    h [spottoerase].setActionCommand (null);
			}
			else
			{
			    JOptionPane.showMessageDialog (null, "There is already a card in that location. Please try again.", "Card cannot be placed at desired location", JOptionPane.INFORMATION_MESSAGE);
			    nocardf [2] = true;
			}
		    }
		}
		else
		{
		    if (cardtochange < 3)
			JOptionPane.showMessageDialog (null, "The card you have selected is a monster card. It can only be played in the monster card zone (orange tiles). Please try again.", "Card cannot be placed at desired location", JOptionPane.INFORMATION_MESSAGE);
		    else
		    {
			if (nocardf2 [2] == true)
			{
			    spe2 [2] = cardtochange;
			    h3v2 = 0;
			    s2 [2].setIcon (createImageIcon (cardtochange + ".jpg"));
			    hand2 [spottoerase].setIcon (null);
			    nocardf2 [2] = false;
			    s2 [0].setActionCommand ("s0");
			    s2 [1].setActionCommand ("s1");
			    s2 [2].setActionCommand ("s2");
			    s2 [3].setActionCommand ("s3");
			    s2 [4].setActionCommand ("s4");
			    m2 [0].setActionCommand ("m0");
			    m2 [1].setActionCommand ("m1");
			    m2 [2].setActionCommand ("m2");
			    m2 [3].setActionCommand ("m3");
			    m2 [4].setActionCommand ("m4");
			    hand2 [spottoerase].setActionCommand (null);
			}
			else
			{
			    JOptionPane.showMessageDialog (null, "There is already a card in that location. Please try again.", "Card cannot be placed at desired location", JOptionPane.INFORMATION_MESSAGE);
			    nocardf2 [2] = true;
			}
		    }
		}
	    }
	    else if (e.getActionCommand ().equals ("s3") || e.getActionCommand ().equals ("s32"))
	    {
		if (nocardf [3] = true)
		{
		    largecard.setForeground (Color.white);
		    cd.setText ("Click on a card to see its description here. ");
		}
		else if (nocardf2 [3] = true)
		{
		    largecard.setForeground (Color.white);
		    cd.setText ("Click on a card to see its description here. ");
		}
		else if (e.getActionCommand ().equals ("s3"))
		{
		    largecard.setIcon (createImageIcon (spe [3] + "d.jpg"));
		    cd.setText ("Working");
		}
		else
		{
		    largecard.setIcon (createImageIcon (spe2 [3] + "d.jpg"));
		    cd.setText ("Working");
		}
	    }
	    else if (e.getActionCommand ().equals ("s3v2") || e.getActionCommand ().equals ("s32v2"))
	    {
		if (e.getActionCommand ().equals ("s3v2"))
		{
		    if (cardtochange < 3)
			JOptionPane.showMessageDialog (null, "The card you have selected is a monster card. It can only be played in the monster card zone (orange tiles). Please try again.", "Card cannot be placed at desired location", JOptionPane.INFORMATION_MESSAGE);
		    else
		    {
			if (nocardf [3] == true)
			{
			    spe [3] = cardtochange;
			    h4 = 0;
			    s [3].setIcon (createImageIcon (cardtochange + ".jpg"));
			    h [spottoerase].setIcon (null);
			    nocardf [3] = false;
			    s [0].setActionCommand ("s0");
			    s [1].setActionCommand ("s1");
			    s [2].setActionCommand ("s2");
			    s [3].setActionCommand ("s3");
			    s [4].setActionCommand ("s4");
			    m [0].setActionCommand ("m0");
			    m [1].setActionCommand ("m1");
			    m [2].setActionCommand ("m2");
			    m [3].setActionCommand ("m3");
			    m [4].setActionCommand ("m4");
			    h [spottoerase].setActionCommand (null);
			}
			else
			{
			    JOptionPane.showMessageDialog (null, "There is already a card in that location. Please try again.", "Card cannot be placed at desired location", JOptionPane.INFORMATION_MESSAGE);
			    nocardf [3] = true;
			}
		    }
		}
		else
		{
		    if (cardtochange < 3)
			JOptionPane.showMessageDialog (null, "The card you have selected is a monster card. It can only be played in the monster card zone (orange tiles). Please try again.", "Card cannot be placed at desired location", JOptionPane.INFORMATION_MESSAGE);
		    else
		    {
			if (nocardf2 [3] == true)
			{
			    spe2 [3] = cardtochange;
			    h4v2 = 0;
			    s2 [3].setIcon (createImageIcon (cardtochange + ".jpg"));
			    hand2 [spottoerase].setIcon (null);
			    nocardf2 [3] = false;
			    s2 [0].setActionCommand ("s0");
			    s2 [1].setActionCommand ("s1");
			    s2 [2].setActionCommand ("s2");
			    s2 [3].setActionCommand ("s3");
			    s2 [4].setActionCommand ("s4");
			    m2 [0].setActionCommand ("m0");
			    m2 [1].setActionCommand ("m1");
			    m2 [2].setActionCommand ("m2");
			    m2 [3].setActionCommand ("m3");
			    m2 [4].setActionCommand ("m4");
			    hand2 [spottoerase].setActionCommand (null);
			}
			else
			{
			    JOptionPane.showMessageDialog (null, "There is already a card in that location. Please try again.", "Card cannot be placed at desired location", JOptionPane.INFORMATION_MESSAGE);
			    nocardf2 [3] = true;
			}
		    }
		}
	    }
	    else if (e.getActionCommand ().equals ("s4") || e.getActionCommand ().equals ("s42"))
	    {
		if (nocardf [4] = true)
		{
		    largecard.setForeground (Color.white);
		    cd.setText ("Click on a card to see its description here. ");
		}
		else if (nocardf2 [4] = true)
		{
		    largecard.setForeground (Color.white);
		    cd.setText ("Click on a card to see its description here. ");
		}
		else if (e.getActionCommand ().equals ("s4"))
		{
		    largecard.setIcon (createImageIcon (spe [4] + "d.jpg"));
		    cd.setText ("Working");
		}
		else
		{
		    largecard.setIcon (createImageIcon (spe2 [4] + "d.jpg"));
		    cd.setText ("Working");
		}
	    }
	    else if (e.getActionCommand ().equals ("s4v2") || e.getActionCommand ().equals ("s42v2"))
	    {
		if (e.getActionCommand ().equals ("s4v2"))
		{
		    if (cardtochange < 3)
			JOptionPane.showMessageDialog (null, "The card you have selected is a monster card. It can only be played in the monster card zone (orange tiles). Please try again.", "Card cannot be placed at desired location", JOptionPane.INFORMATION_MESSAGE);
		    else
		    {
			if (nocardf [4] == true)
			{
			    spe [4] = cardtochange;
			    h5 = 0;
			    s [4].setIcon (createImageIcon (cardtochange + ".jpg"));
			    h [spottoerase].setIcon (null);
			    nocardf [4] = false;
			    s [0].setActionCommand ("s0");
			    s [1].setActionCommand ("s1");
			    s [2].setActionCommand ("s2");
			    s [3].setActionCommand ("s3");
			    s [4].setActionCommand ("s4");
			    m [0].setActionCommand ("m0");
			    m [1].setActionCommand ("m1");
			    m [2].setActionCommand ("m2");
			    m [3].setActionCommand ("m3");
			    m [4].setActionCommand ("m4");
			    h [spottoerase].setActionCommand (null);
			}
			else
			{
			    JOptionPane.showMessageDialog (null, "There is already a card in that location. Please try again.", "Card cannot be placed at desired location", JOptionPane.INFORMATION_MESSAGE);
			    nocardf [4] = true;
			}
		    }
		}
		else
		{
		    if (cardtochange < 3)
			JOptionPane.showMessageDialog (null, "The card you have selected is a monster card. It can only be played in the monster card zone (orange tiles). Please try again.", "Card cannot be placed at desired location", JOptionPane.INFORMATION_MESSAGE);
		    else
		    {
			if (nocardf2 [4] == true)
			{
			    spe2 [4] = cardtochange;
			    h5v2 = 0;
			    s2 [4].setIcon (createImageIcon (cardtochange + ".jpg"));
			    hand2 [spottoerase].setIcon (null);
			    nocardf2 [4] = false;
			    s2 [0].setActionCommand ("s0");
			    s2 [1].setActionCommand ("s1");
			    s2 [2].setActionCommand ("s2");
			    s2 [3].setActionCommand ("s3");
			    s2 [4].setActionCommand ("s4");
			    m2 [0].setActionCommand ("m0");
			    m2 [1].setActionCommand ("m1");
			    m2 [2].setActionCommand ("m2");
			    m2 [3].setActionCommand ("m3");
			    m2 [4].setActionCommand ("m4");
			    hand2 [spottoerase].setActionCommand (null);
			}
			else
			{
			    JOptionPane.showMessageDialog (null, "There is already a card in that location. Please try again.", "Card cannot be placed at desired location", JOptionPane.INFORMATION_MESSAGE);
			    nocardf2 [4] = true;
			}
		    }
		}
	    }


	    // when player clicks on the deck to pick up card
	    if (e.getActionCommand ().equals ("d"))
	    {
		if (h1 == 0)
		{
		    d [0] = deck1 [i];
		    h1 = 1;
		    h [0].setIcon (createImageIcon (deck1 [i] + ".jpg"));
		    h [0].setActionCommand ("hand0");
		    t--;
		    cardsleft.setText ("Number of cards left " + t);
		    nocard = false;
		}
		else if (h2 == 0)
		{
		    d [1] = deck1 [i];
		    h2 = 1;
		    h [1].setIcon (createImageIcon (deck1 [i] + ".jpg"));
		    h [1].setActionCommand ("hand1");
		    t--;
		    cardsleft.setText ("Number of cards left " + t);
		    nocard = false;
		}
		else if (h3 == 0)
		{
		    d [2] = deck1 [i];
		    h3 = 1;
		    h [2].setIcon (createImageIcon (deck1 [i] + ".jpg"));
		    h [2].setActionCommand ("hand2");
		    t--;
		    cardsleft.setText ("Number of cards left " + t);
		    nocard = false;
		}
		else if (h4 == 0)
		{
		    d [3] = deck1 [i];
		    h4 = 1;
		    h [3].setIcon (createImageIcon (deck1 [i] + ".jpg"));
		    h [3].setActionCommand ("hand3");
		    t--;
		    cardsleft.setText ("Number of cards left " + t);
		    nocard = false;
		}
		else if (h5 == 0)
		{
		    d [4] = deck1 [i];
		    h5 = 1;
		    h [4].setIcon (createImageIcon (deck1 [i] + ".jpg"));
		    h [4].setActionCommand ("hand4");
		    t--;
		    cardsleft.setText ("Number of cards left " + t);
		    nocard = false;
		}

		if (t == 0)
		    deck.setEnabled (false);

		// if (i < (deck1.length - 1))
		i++;

	    }
	    else if (e.getActionCommand ().equals ("d2"))
	    {
		if (h1v2 == 0)
		{
		    d2 [0] = deckp2 [i2];
		    h1v2 = 1;
		    hand2 [0].setIcon (createImageIcon (deckp2 [i2] + ".jpg"));
		    hand2 [0].setActionCommand ("hand02");
		    t2--;
		    cardsleft2.setText ("Number of cards left " + t2);
		    nocard2 = false;
		}
		else if (h2v2 == 0)
		{
		    d2 [1] = deckp2 [i2];
		    h2v2 = 1;
		    hand2 [1].setIcon (createImageIcon (deckp2 [i2] + ".jpg"));
		    hand2 [1].setActionCommand ("hand12");
		    t2--;
		    cardsleft2.setText ("Number of cards left " + t2);
		    nocard2 = false;
		}
		else if (h3v2 == 0)
		{
		    d2 [2] = deckp2 [i2];
		    h3v2 = 1;
		    hand2 [2].setIcon (createImageIcon (deckp2 [i2] + ".jpg"));
		    hand2 [2].setActionCommand ("hand22");
		    t2--;
		    cardsleft2.setText ("Number of cards left " + t2);
		    nocard2 = false;
		}
		else if (h4v2 == 0)
		{
		    d2 [3] = deckp2 [i2];
		    h4v2 = 1;
		    hand2 [3].setIcon (createImageIcon (deckp2 [i2] + ".jpg"));
		    hand2 [3].setActionCommand ("hand32");
		    t2--;
		    cardsleft2.setText ("Number of cards left " + t2);
		    nocard2 = false;
		}
		else if (h5v2 == 0)
		{
		    d2 [4] = deckp2 [i2];
		    h5v2 = 1;
		    hand2 [4].setIcon (createImageIcon (deckp2 [i2] + ".jpg"));
		    hand2 [4].setActionCommand ("hand42");
		    t2--;
		    cardsleft2.setText ("Number of cards left " + t2);
		    nocard2 = false;
		}

		if (t == 0)
		    deck.setEnabled (false);
		else if (t2 == 0)
		    deck2.setEnabled (false);

		// if (i < (deck1.length - 1))
		i2++;
	    }
	}
    }


    public void shuffle ()
    {
	//randomize deck
	for (int i = 0 ; i < deck1.length ; i++)
	{
	    int x = (int) (Math.random () * 5);
	    int y = (int) (Math.random () * 5);
	    int temp = deck1 [x];
	    deck1 [x] = deck1 [y];
	    deck1 [y] = temp;
	}


	for (int i = 0 ; i < deck1.length ; i++)
	{
	    int x = (int) (Math.random () * 5);
	    int y = (int) (Math.random () * 5);
	    int temp = deckp2 [x];
	    deckp2 [x] = deckp2 [y];
	    deckp2 [y] = temp;
	}
    }


    protected static ImageIcon createImageIcon (String path)
    {
	java.net.URL imgURL = YUGIOH.class.getResource (path);
	if (imgURL != null)
	{
	    return new ImageIcon (imgURL);
	}


	else
	{
	    System.err.println ("Couldn't find file: " + path);
	    return null;
	}
    }
}


