package com.defun.games;

public abstract interface GameEngine
{
  public static final int MAX_PLAYER = 2;
  public static final int MIN_INPUT_VALUE = 1;
  public static final int MAX_INPUT_VALUE = 3;
  public static final int MAX_SUM = 21;
  
  public abstract void computeSum(int paramInt);
  
  public abstract Boolean isGameOver();
  
  public abstract Boolean isValidValue(int paramInt);
  
  public abstract String whoIsPlaying();
}
