package com.defun.games;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GameInputReader
{
  static BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
  
  public static int getValue()
  {
    int value = 0;
    try
    {
      value = Integer.parseInt(stdin.readLine());
    }
    catch (IOException e)
    {
      e.printStackTrace();
    }
    return value;
  }
  
  public static void closeInput()
  {
    try
    {
      stdin.close();
    }
    catch (IOException e)
    {
      e.printStackTrace();
    }
  }
}
