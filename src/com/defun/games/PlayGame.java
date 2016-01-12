package com.defun.games;

public class PlayGame
{
  public static void start()
  {
    Game21 myGame = new Game21("Great Player");
    
    PlayerType starter = myGame.toss();
    
    myGame.play(starter, Boolean.valueOf(true));
  }
}
