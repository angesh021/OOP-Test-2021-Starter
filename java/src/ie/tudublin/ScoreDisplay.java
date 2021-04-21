package ie.tudublin;

import java.util.ArrayList;


import processing.core.PApplet;

public class ScoreDisplay extends PApplet
{
	ArrayList<Note> notes = new ArrayList<Note>();

	String score = "DEFGABcd";
	//String score = "D2E2F2G2A2B2c2d2";
	//String score = "DEF2F2F2EFA2A2B2AFD2E2D2D2D2";
	
	public void settings()
	{
		size(1000, 500);

		// How to convert a character to a number
		char c = '7'; // c holds the character 7 (55)
		int i = c - '0'; // i holds the number 7 (55 - 48) 
		println(i);
	}

	public void setup() 
	{
		//loadScore();
		printScores();
	}


	//to print the notes
	public void printScores() 
	{
		for (Note n : notes) 
		{
			println(n);
		}
	}

	//Drawing the 5 lines using loops
	public void staveline()
	{
		float border = height * 0.4f;
		float range = 120;
		for(float f = 0; f <= range ; f += 30)
        {
		float y = map(f, 0, range, height - border, border);
        line(border, y, width - border, y);
		}
	}

	public void draw()
	{
		background(255);
		staveline();
		
	}

	void drawNotes() 
	{
	}
}
