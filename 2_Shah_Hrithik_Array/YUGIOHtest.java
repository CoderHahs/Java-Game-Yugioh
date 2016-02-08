import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.applet.Applet;

/*
 This game was made by Hrithik Shah in course ICS208 (2015, Ms.Gorski)
 All rights to this game are owned by the Yugioh Corporation (KONAMI)
 All code is owned by Hrithik Shah
 Pictures used in this game are owned by the Yugioh Corporation too.
 The pictures used in-game were taken from http://www.duelingnetwork.com/
*/

public class YUGIOHtest extends Applet implements ActionListener
{
    // to do: code the 4 phase buttons
    // code card effects
    // finish selecting cards
    // gameplay meaning figuring out player turns.
    // get the descriptions working for the cards
    //
    //
    // LAYOUT HAS TO BE IN ORDER
    // *******KEEP THAT FOR THE END********* very difficult

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
    JButton opponentm1[] = new JButton [5];
    JButton opponents1[] = new JButton [5];
    JButton opponentm2[] = new JButton [5];
    JButton opponents2[] = new JButton [5];
    JLabel largecard, largecard2;
    JLabel cd, cd2;
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

    int deck1[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
    int deckp2[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
    int level[] = {3, 8, 7, 4, 4, 4, 5, 3, 3, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    int level2[] = {3, 8, 7, 4, 4, 4, 5, 3, 3, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    int attack[] = {1200, 3000, 2500, 800, 1500, 1400, 1800, 1300, 1200, 1800, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    int attack2[] = {1200, 3000, 2500, 800, 1500, 1400, 1800, 1300, 1200, 1800, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    int defense[] = {700, 2500, 2100, 2000, 1200, 1200, 1300, 2000, 1200, 1800, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    int defense2[] = {700, 2500, 2100, 2000, 1200, 1200, 1300, 2000, 1200, 1800, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    String activate = "No";
    boolean dead[] = {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false};
    boolean dead2[] = {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false};


    int t = 20;
    int t2 = 20;
    JLabel cardsleft;
    JLabel cardsleft2;

    int i = 0;
    int i2 = 0;

    int d[] = new int [20];
    int d2[] = new int [20];

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
    int atkordef[] = new int [20];
    int atkordef2[] = new int [20];

    int mon[] = new int [20];
    int spe[] = new int [20];
    int mon2[] = new int [20];
    int spe2[] = new int [20];

    JButton phase[] = new JButton [4];
    JButton phase2[] = new JButton [4];
    boolean draw, main, battle, end;
    boolean active = false;
    boolean atkactive = false;
    boolean oatkactive = false;

    int firstturn = 0;
    int firstturn2 = 0;
    boolean player1turn = true;
    boolean player2turn = false;
    String endturn;
    String yesorno[] = {"Yes", "No"};

    int x, x2;

    int lifepointp1 = 4000;
    int lifepointp2 = 4000;
    JLabel LP, LP2, LP3, LP4;

    String tribute = "No";
    int tbcounter = 0;
    int tbcounter2 = 0;
    String xh = "anything";

    JLabel step;
    int n = 1;

    int summon = 0;
    boolean atktrue[] = {false, false, false, false, false};
    boolean atktrue2[] = {false, false, false, false, false};
    int nmonsters = 0;
    int nmonsters2 = 0;

    int monvalue1;
    int monvalue2;
    int sendgravep1;
    int sendgravep2;

    int cardtoactivate = 0;
    boolean notviewable;
    boolean over;




    public void init ()
    {
	p_card = new Panel ();
	p_card.setLayout (cdLayout);
	screen1 ();
	screen2 ();
	screen3 ();
	screen4 ();
	screen5 ();
	resize (1366, 768);
	setLayout (new BorderLayout ());
	add ("Center", p_card);
    }


    public void draw ()
    {
	draw = true;
	main = false;
	battle = false;
	end = false;

	if (player1turn == true)
	{
	    phase [0].setEnabled (false);
	    phase [1].setEnabled (true);
	    phase [2].setEnabled (false);
	    phase [3].setEnabled (false);
	}


	else
	{
	    phase2 [0].setEnabled (false);
	    phase2 [1].setEnabled (true);
	    phase2 [2].setEnabled (false);
	    phase2 [3].setEnabled (false);
	}


	// also: if number of cards in hand = 5, then drawing a card should be disabled.
	// to do: let player know it is the draw phase (textbox). put all the buttons in the for loop and disable the ones not needed in this step. First - have a pop up box that shows on the screen telling the player to draw a card. Then once 1 card is drawn disable the deck button so that player cannot draw for rest of turn.
	if (player1turn == true)
	{
	    if (h1 == 1 && h2 == 1 && h3 == 1 && h4 == 1 && h5 == 1)
	    {
		deck.setEnabled (false);
		JOptionPane.showMessageDialog (null, "Player 1: 5 card limit in hand reached.", "Draw Phase", JOptionPane.ERROR_MESSAGE);
	    }
	    else
		JOptionPane.showMessageDialog (null, "Player 1: Please draw a card.", "Draw Phase", JOptionPane.INFORMATION_MESSAGE);
	}


	else
	{
	    if (h1v2 == 1 && h2v2 == 1 && h3v2 == 1 && h4v2 == 1 && h5v2 == 1)
	    {
		deck2.setEnabled (false);
		JOptionPane.showMessageDialog (null, "Player 2: 5 card limit in hand reached.", "Draw Phase", JOptionPane.ERROR_MESSAGE);
	    }
	    else
		JOptionPane.showMessageDialog (null, "Player 2: Please draw a card.", "Draw Phase", JOptionPane.INFORMATION_MESSAGE);
	}


	for (int i = 0 ; i < 5 ; i++)
	{
	    m [i].setEnabled (false);
	    grave.setEnabled (false);
	    s [i].setEnabled (false);
	    m2 [i].setEnabled (false);
	    grave2.setEnabled (false);
	    s2 [i].setEnabled (false);
	    if (t > 0 && h1 != 1 && h2 != 1 && h3 != 1 && h4 != 1 && h5 != 1)
		deck.setEnabled (true);
	    else if (t2 > 0 && h1v2 != 1 && h2v2 != 1 && h3v2 != 1 && h4v2 != 1 && h5v2 != 1)
		deck2.setEnabled (true);
	}
    }




    // code if statement to see if the person has won or not only if they have no cards.



    public void main ()
    {
	main = true;
	draw = false;
	battle = false;
	end = false;

	deck.setEnabled (false);
	deck2.setEnabled (false);

	if (player1turn == true)
	{
	    phase [0].setEnabled (false);
	    phase [1].setEnabled (false);
	    phase [2].setEnabled (true);
	    phase [3].setEnabled (false);
	    if (firstturn != 2)
		phase [3].setEnabled (true);
	}


	else
	{
	    phase2 [0].setEnabled (false);
	    phase2 [1].setEnabled (false);
	    phase2 [2].setEnabled (true);
	    phase2 [3].setEnabled (false);
	    if (firstturn2 != 2)
		phase2 [3].setEnabled (true);
	}


	if (countersrl < 4 && swordsofrevealinglight == true)
	{
	    for (int i = 0 ; i < 5 ; i++)
	    {
		m [i].setEnabled (true);
		m [sendgravep2].setEnabled (false);
		grave.setEnabled (true);
		s [i].setEnabled (true);
		m2 [i].setEnabled (true);
		m2 [sendgravep1].setEnabled (false);
		grave2.setEnabled (true);
		s2 [i].setEnabled (true);
	    }
	    countersrl++;
	}


	else
	{
	    swordsofrevealinglight = false;
	    for (int i = 0 ; i < 5 ; i++)
	    {
		m [i].setEnabled (true);
		grave.setEnabled (true);
		s [i].setEnabled (true);
		m2 [i].setEnabled (true);
		grave2.setEnabled (true);
		s2 [i].setEnabled (true);
	    }
	}


	// only let player summon or set here.
	// to do: let the player know it is the main phase (textbox). disable the deck button (so players cannot draw a card), add feature where player can activate a card or effect and change the battle position of a card.
    }


    int battleactive = 0;
    public void battle ()
    {
	battleactive++;

	int damage = 0;
	battle = true;
	draw = false;
	main = false;
	end = false;

	if (player1turn == true)
	{
	    phase [0].setEnabled (false);
	    phase [1].setEnabled (false);
	    phase [2].setEnabled (false);
	    phase [3].setEnabled (true);
	}


	else
	{
	    phase2 [0].setEnabled (false);
	    phase2 [1].setEnabled (false);
	    phase2 [2].setEnabled (false);
	    phase2 [3].setEnabled (true);
	}



	// to do: add feature where player, whenever he click on a monster card, battle option is shown. In hand only spell cards should show activate option, whereas all cards in the s/t zone have the activate option. damage has to be calculated.
	if (player1turn == true)
	{
	    if (firstturn == 2)
	    {
		JOptionPane.showMessageDialog (null, "Sorry cannot attack on first turn.", "Cannot attack", JOptionPane.INFORMATION_MESSAGE);
	    }
	    else if (nocardm2 [0] == true && nocardm2 [1] == true && nocardm2 [2] == true && nocardm2 [3] == true && nocardm2 [4] == true)
	    {
		if (active == false)
		    JOptionPane.showMessageDialog (null, "There are no monsters on your opponents side of the field. \nA direct attack will be performed \nPlease select which monsters you would like to attack with.", "Direct attack", JOptionPane.INFORMATION_MESSAGE);
		else
		{
		    System.out.println ("active = true received");
		    damage = 0;
		    if (atktrue [0] == true)
		    {
			System.out.println ("active initiated" + attack [mon [0]]);
			damage += attack [mon [0]];
			m [0].setEnabled (false);
		    }
		    if (atktrue [1] == true)
		    {
			damage += attack [mon [1]];
			m [1].setEnabled (false);
		    }
		    if (atktrue [2] == true)
		    {
			damage += attack [mon [2]];
			m [2].setEnabled (false);
		    }
		    if (atktrue [3] == true)
		    {
			damage += attack [mon [3]];
			m [3].setEnabled (false);
		    }
		    if (atktrue [4] == true)
		    {
			damage += attack [mon [4]];
			m [4].setEnabled (false);
		    }
		    System.out.println ("frotn");
		    lifepointp2 -= damage;
		    System.out.println ("back" + lifepointp2);

		}

	    }
	}
	else
	{
	    if (nmonsters2 >= 1)
	    {
		if (atkactive == false)
		    JOptionPane.showMessageDialog (null, "Please select the monster you would like to attack with.", "Monster Attack", JOptionPane.INFORMATION_MESSAGE);
		else
		{
		    if (oatkactive == false)
			JOptionPane.showMessageDialog (null, "Please select the monster you would like to attack.", "Monster Attack", JOptionPane.INFORMATION_MESSAGE);
		    else
		    {
			atkactive = false;
			oatkactive = false;
			int mon1 = monvalue1;
			int mon2 = monvalue2;
			if (atkordef [sendgravep1] == 1 && atkordef2 [sendgravep2] == 1)
			{
			    int atk1 = attack [mon1];
			    int atk2 = attack2 [mon2];
			    if (atk1 > atk2)
			    {
				damage = atk1 - atk2;
				dead2 [mon2] = true;
				m2 [sendgravep2].setIcon (null);
				opponentm1 [sendgravep2].setIcon (null);
				nocardm2 [sendgravep2] = true;
				m [sendgravep1].setEnabled (false);
			    }
			    lifepointp2 -= damage;
			    else if (atk1 < atk2)
			    {
				damage = atk2 - atk1;
				m [sendgravep1].setIcon (null);
				opponentm2 [sendgravep1].setIcon (null);
				nocardm [sendgravep1] = true;
				m [sendgravep1].setEnabled (false);
			    }
			    lifepointp1 -= damage;
			}
			else if (atkordef [sendgravep1] == 1 && atkordef2 [sendgravep2] == 0)
			{
			    int atk1 = attack [mon1];
			    int def2 = defense2 [mon2];
			    if (atk1 > def2)
			    {
				dead2 [mon2] = true;
				m2 [sendgravep2].setIcon (null);
				opponentm1 [sendgravep2].setIcon (null);
				nocardm2 [sendgravep2] = true;
				m [sendgravep1].setEnabled (false);
			    }
			    else if (atk1 < def2)
			    {
				damage = def2 - atk1;
				m [sendgravep1].setIcon (null);
				opponentm2 [sendgravep1].setIcon (null);
				nocardm [sendgravep1] = true;
				m [sendgravep1].setEnabled (false);
			    }
			    lifepointp1 -= damage;
			}

		    }

		    if (lifepointp2 < 0)
		    {
			LP2.setText ("Life Points left: 0");
			LP3.setText ("Life Points left: 0");
		    }
		    else
		    {
			System.out.println ("got to here");
			LP2.setText ("Life Points left: " + lifepointp2);
			LP3.setText ("Life Points left: " + lifepointp2);

		    }
		    firstturn = 3;
		    active = false;

		}
	    }
	}
    }


    else
    {
	if (firstturn2 == 2)
	    JOptionPane.showMessageDialog (null, "Sorry cannot attack on first turn.", "Cannot attack", JOptionPane.INFORMATION_MESSAGE);
	else if (nocardm [0] == true && nocardm [1] == true && nocardm [2] == true && nocardm [3] == true && nocardm [4] == true)
	{
	    System.out.println ("Direct Attack");
	    if (active == false)
		JOptionPane.showMessageDialog (null, "There are no monsters on your opponents side of the field. \nA direct attack will be performed \nPlease select which monsters you would like to attack with.", "Direct attack", JOptionPane.INFORMATION_MESSAGE);
	    else
	    {
		damage = 0;
		if (atktrue2 [0] == true)
		{
		    damage += attack2 [mon2 [0]];
		    m2 [0].setEnabled (false);
		}
		if (atktrue2 [1] == true)
		{
		    damage += attack2 [mon2 [1]];
		    m2 [1].setEnabled (false);
		}
		if (atktrue2 [2] == true)
		{
		    damage += attack2 [mon2 [2]];
		    m2 [2].setEnabled (false);
		}
		if (atktrue2 [3] == true)
		{
		    damage += attack2 [mon2 [3]];
		    m2 [3].setEnabled (false);
		}
		if (atktrue2 [4] == true)
		{
		    damage += attack2 [mon2 [4]];
		    m2 [4].setEnabled (false);
		}
		lifepointp1 -= damage;
	    }


	}
	else
	{
	    if (nmonsters >= 1)
	    {
		if (atkactive == false)
		    JOptionPane.showMessageDialog (null, "Please select the monster you would like to attack with.", "Monster Attack", JOptionPane.INFORMATION_MESSAGE);
		else
		{
		    if (oatkactive == false)
			JOptionPane.showMessageDialog (null, "Please select the monster you would like to attack.", "Monster Attack", JOptionPane.INFORMATION_MESSAGE);
		    else
		    {
			atkactive = false;
			oatkactive = false;
			int mon1 = monvalue1;
			int mon2 = monvalue2;
			if (atkordef2 [sendgravep2] == 1 && atkordef [sendgravep1] == 1)
			{
			    int atk1 = attack2 [mon1];
			    int atk2 = attack [mon2];
			    if (atk1 > atk2)
			    {
				damage = atk1 - atk2;
				dead [mon2] = true;
				m [sendgravep1].setIcon (null);
				opponentm2 [sendgravep1].setIcon (null);
				nocardm [sendgravep1] = true;
				m2 [sendgravep2].setEnabled (false);
			    }
			    lifepointp1 -= damage;
			    else if (atk1 < atk2)
			    {
				damage = atk2 - atk1;
				m2 [sendgravep1].setIcon (null);
				opponentm1 [sendgravep1].setIcon (null);
				nocardm2 [sendgravep1] = true;
				m2 [sendgravep1].setEnabled (false);
			    }
			    lifepointp2 -= damage;
			}
			else if (atkordef2 [sendgravep2] == 1 && atkordef1 [sendgravep1] == 0)
			{
			    int atk1 = attack2 [mon1];
			    int def2 = defense [mon2];
			    if (atk1 > def2)
			    {
				dead2 [mon2] = true;
				m [sendgravep2].setIcon (null);
				opponentm2 [sendgravep2].setIcon (null);
				nocardm [sendgravep2] = true;
				m2 [sendgravep1].setEnabled (false);
			    }
			    else if (atk1 < def2)
			    {
				damage = def2 - atk1;
				m2 [sendgravep1].setIcon (null);
				opponentm1 [sendgravep1].setIcon (null);
				nocardm2 [sendgravep1] = true;
				m2 [sendgravep1].setEnabled (false);
			    }
			    lifepointp2 -= damage;
			}
		    }

		}
	    }

	}
	if (lifepointp1 < 0)
	{
	    LP4.setText ("Life Points left: 0");
	    LP.setText ("Life Points left: 0");
	}
	else
	{
	    System.out.println ("LP Set");
	    LP4.setText ("Life Points left: " + lifepointp1);
	    LP.setText ("Life Points left: " + lifepointp1);

	}
	firstturn2 = 3;
    }
}




public void graveyard ()
{
    // when clicks should show screen with all cards in the graveyard.
}


public void end ()
{
    end = true;
    draw = false;
    main = false;
    battle = false;

    summon = 0;

    for (int i = 0 ; i < 5 ; i++)
    {
	m [i].setEnabled (false);
	grave.setEnabled (false);
	s [i].setEnabled (false);
	m2 [i].setEnabled (false);
	grave2.setEnabled (false);
	s2 [i].setEnabled (false);
    }


    // to do: change turn to opponent.
    if (player1turn == true)
    {
	endturn = (String) JOptionPane.showInputDialog (null, "Player 1: \nAre you sure you want to end your turn?", "End Turn?", JOptionPane.INFORMATION_MESSAGE, null, yesorno, yesorno [0]);
	if (endturn.equals ("Yes"))
	{
	    if (changeofheart == true)
	    {
		over = true;
		changeofheart ();
	    }
	    else if (braincontrol == true)
	    {
		over = true;
		braincontrol ();
	    }
	    cdLayout.show (p_card, "4");
	    player1turn = false;
	    player2turn = true;
	    phase2 [0].setEnabled (true);
	    phase2 [1].setEnabled (false);
	    phase2 [2].setEnabled (false);
	    phase2 [3].setEnabled (false);
	    if (firstturn2 != 0)
		deck2.setEnabled (false);
	}
    }


    else
    {
	endturn = (String) JOptionPane.showInputDialog (null, "Player 2: \nAre you sure you want to end your turn?", "End Turn?", JOptionPane.INFORMATION_MESSAGE, null, yesorno, yesorno [0]);
	if (endturn.equals ("Yes"))
	{
	    if (changeofheart == true)
	    {
		over = true;
		changeofheart ();
	    }
	    else if (braincontrol == true)
	    {
		over = true;
		braincontrol ();
	    }
	    cdLayout.show (p_card, "3");
	    player2turn = false;
	    player1turn = true;
	    phase [0].setEnabled (true);
	    phase [1].setEnabled (false);
	    phase [2].setEnabled (false);
	    phase [3].setEnabled (false);
	    deck.setEnabled (false);
	}
    }
}
}
}


