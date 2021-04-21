package ie.tudublin;

import java.io.*;
import java.util.*;
import java.util.ArrayList;

import processing.core.PApplet;

public class ScoreDisplay extends PApplet {
	ArrayList<Note> notes = new ArrayList<Note>();

	String score = "DEFGABcd";
	// String score = "D2E2F2G2A2B2c2d2";
	// String score = "DEF2F2F2EFA2A2B2AFD2E2D2D2D2";
	float border = height * 0.4f;
	private float leftBorder;

	public void settings() {
		size(1000, 500);
		

		// How to convert a character to a number
		char c = '7'; // c holds the character 7 (55)
		int i = c - '0'; // i holds the number 7 (55 - 48)
		println(i);
	}

	public void setup() {
		loadScore();
		printScores();
	}

	public void loadScore() 
	{
		Note note = null;
		

		for (int i = 0; i < score.length(); i++) // Print the string
		{
			if(score.contains("2"))
			{
			Note n = notes.get(i);
			note = new Note(n.getNote(), n.getDuration());
            notes.add(note);
			//note.setDuration(Integer.parseInt(score.substring(2)));
			//System.out.println(score.substring(i, i + 1));
			}
		}
	}

	// to print the notes
	public void printScores() {
		for (Note n : notes) {
			println(n);
		}
	}

	// Drawing the 5 lines using loops
	public void staveline() {

		float range = 120;
		for (float f = 0; f <= range; f += 30) {
			float y = map(f, 0, range, height - border, border);
			line(border, y, width - border, y);
		}
	}

	public void draw() {
		background(255);
		staveline();
		drawNotes();

	}

	void drawNotes() 
	{
		for(int i = 0 ; i < notes.size(); i ++)
        {
            float y1 = map(i, 0, notes.size(), border, height - border);
            Note n = notes.get(i);
            float x1 = map(border, 1, 0, leftBorder, width - border);
            float x2 = map(border, 1, 0, leftBorder, width - border);
            int c = (int) map(i, 0, notes.size(), 0, 255);
            noStroke();
            fill(c, 255, 255);
            ellipse(x1, x2, x1, x2);
			line(i, x1, x1, x2);
            fill(255);
            textAlign(CENTER, CENTER);
            text(n.getNote(), 20, y1);
        }
	}
}
