package com.detech;

import java.io.PrintStream;

public class Game2Ver1
  implements GameEngine
{
  int GameSum = 0;
  Boolean GameOver = Boolean.valueOf(false);
  private String ComputerPlayerName = "Computer";
  private String HumanPlayerName = "you";
  private PlayerType currentPlayer = PlayerType.COMPUTER;
  
  public Game2Ver1(String computerName, String playerName)
  {
    this.ComputerPlayerName = computerName;
    this.ComputerPlayerName = playerName;
    this.GameOver = Boolean.valueOf(false);
  }
  
  public Game2Ver1(String playerName)
  {
    this.HumanPlayerName = playerName;
    this.GameOver = Boolean.valueOf(false);
  }
  
  public void play(PlayerType startingPlayer)
  {
    this.currentPlayer = startingPlayer;
    do
    {
      takeTurn();
    } while (!this.GameOver.booleanValue());
  }
  
  public void takeTurn()
  {
    displayMessage(whoIsPlaying() + "'s turn: ");
    int enteredValue = GameInputReader.getValue();
    if (isValidValue(enteredValue).booleanValue())
    {
      this.GameSum += enteredValue;
      if (this.GameSum <= 21) {
        this.currentPlayer = (this.currentPlayer == PlayerType.COMPUTER ? PlayerType.HUMAN : PlayerType.COMPUTER);
      } else {
        finishGame();
      }
    }
  }
  
  public void computeSum(int enteredValue)
  {
    if ((enteredValue <= 3) || (enteredValue >= 1)) {
      this.GameSum += enteredValue;
    }
  }
  
  public PlayerType toss()
  {
    PlayerType winnerPlayerId = (int)Math.random() == 1 ? PlayerType.HUMAN : PlayerType.COMPUTER;
    
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
    System.out.println(message);
  }
}
