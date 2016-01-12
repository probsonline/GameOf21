package com.defun.games;

import java.io.PrintStream;

public class Game21
  implements GameEngine
{
  int GameSum = 0;
  Boolean GameOver = Boolean.valueOf(false);
  Boolean isRobotWinner = Boolean.valueOf(false);
  private String ComputerPlayerName = "Computer";
  private String HumanPlayerName = "you";
  private PlayerType currentPlayer = PlayerType.COMPUTER;
  
  public Game21(String computerName, String playerName)
  {
    this.ComputerPlayerName = computerName;
    this.ComputerPlayerName = playerName;
    this.GameOver = Boolean.valueOf(false);
  }
  
  public Game21(String playerName)
  {
    this.HumanPlayerName = playerName;
    this.GameOver = Boolean.valueOf(false);
  }
  
  public void play()
  {
    play(PlayerType.HUMAN, Boolean.valueOf(false));
  }
  
  public void play(PlayerType startingPlayer)
  {
    play(startingPlayer, Boolean.valueOf(false));
  }
  
  public void play(PlayerType startingPlayer, Boolean willRobotWin)
  {
    this.currentPlayer = startingPlayer;
    this.isRobotWinner = willRobotWin;
    
    System.out.println("Current Total: " + this.GameSum + "\t");
    if (this.currentPlayer == PlayerType.COMPUTER) {
      robotTurn();
    } else {
      takeTurn();
    }
  }
  
  public void takeTurn()
  {
    this.currentPlayer = PlayerType.HUMAN;
    displayMessage(whoIsPlaying() + "'s turn: ");
    
    int enteredValue = GameInputReader.getValue();
    if (isValidValue(enteredValue).booleanValue())
    {
      this.GameSum += enteredValue;
      if (this.GameSum <= 21) {
        robotTurn();
      } else {
        finishGame();
      }
    }
    else
    {
      takeTurn();
    }
  }
  
  public void robotTurn()
  {
    this.currentPlayer = PlayerType.COMPUTER;
    
    int enteredValue = (int)(Math.random() * 3.0D) + 1;
    if (this.isRobotWinner.booleanValue()) {
      enteredValue = 3 - this.GameSum % 3;
    }
    displayMessage(whoIsPlaying() + "'s turn: " + enteredValue + "\n");
    
    this.GameSum += enteredValue;
    if (this.GameSum <= 21) {
      takeTurn();
    } else {
      finishGame();
    }
  }
  
  private int makeRobotWin(int autoValue)
  {
    int winnerValue = autoValue;
    switch (this.GameSum)
    {
    case 16: 
    case 18: 
      winnerValue = 3;
      break;
    case 15: 
      winnerValue = 2;
      break;
    case 17: 
    case 19: 
      winnerValue = 2;
      break;
    case 20: 
      winnerValue = 1;
      break;
    }
    return winnerValue;
  }
  
  public void computeSum(int enteredValue)
  {
    if ((enteredValue <= 3) || (enteredValue >= 1)) {
      this.GameSum += enteredValue;
    }
  }
  
  public PlayerType toss()
  {
    PlayerType winnerPlayerId = Math.random() < 0.5D ? PlayerType.HUMAN : PlayerType.COMPUTER;
    this.currentPlayer = winnerPlayerId;
    
    displayMessage("******** " + whoIsPlaying() + " has won the toss ******** \n");
    return winnerPlayerId;
  }
  
  public Boolean isGameOver()
  {
    return this.GameOver;
  }
  
  public Boolean isValidValue(int value)
  {
    Boolean valid = Boolean.valueOf(false);
    if ((value >= 1) && (value <= 3)) {
      valid = Boolean.valueOf(true);
    }
    return valid;
  }
  
  public String whoIsPlaying()
  {
    String name = "";
    if (this.currentPlayer == PlayerType.HUMAN) {
      name = this.HumanPlayerName;
    } else if (this.currentPlayer == PlayerType.COMPUTER) {
      name = this.ComputerPlayerName;
    } else {
      System.err.println("invalid player name. Program logic fault");
    }
    return name;
  }
  
  public void finishGame()
  {
    this.GameOver = Boolean.valueOf(true);
    GameInputReader.closeInput();
    displayMessage(whoIsPlaying() + " has lost");
    
    this.currentPlayer = PlayerType.COMPUTER;
  }
  
  private void displayMessage(String message)
  {
    System.out.print(message);
  }
}
