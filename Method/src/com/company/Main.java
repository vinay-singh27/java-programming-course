package com.company;

public class Main {

    public static void main(String[] args) {

    	String player_1 = "Ram";
    	int player_1_position = calculateHighScorePosition(1500);
    	diplayHighScorePosition(player_1, player_1_position);

		String player_2 = "Shyam";
		int player_2_position = calculateHighScorePosition(900);
		diplayHighScorePosition(player_2, player_2_position);

		String player_3 = "Arjun";
		int player_3_position = calculateHighScorePosition(400);
		diplayHighScorePosition(player_3, player_3_position);

		String player_4 = "Karan";
		int player_4_position = calculateHighScorePosition(50);
		diplayHighScorePosition(player_4, player_4_position);

	}

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

    	if (gameOver) {
			int finalScore = score + (levelCompleted * bonus);
			return finalScore;
		}
    	else return -1;
	}

	public static void diplayHighScorePosition(String name, int position) {
		System.out.println(name + " managed to get position " + position + " in the High Score Table");
	}

	public static int calculateHighScorePosition(int score) {
    	if (score >= 1000)
    		return 1;
    	else if (score >= 500)
    		return 2 ;
    	else if (score >= 100)
    		return 3;
    	else
    		return 4;

	}
}
