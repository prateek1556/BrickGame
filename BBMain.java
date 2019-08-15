import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class BBMain
{
	public static void main(String args[])
	{
		JFrame obj=new JFrame();
		Gameplay gamePlay=new Gameplay();
		obj.setBounds(10,10,700,600);
		obj.setTitle("Break Ball");
		obj.setResizable(false);
		obj.setVisible(true);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.add(gamePlay);
	}
}