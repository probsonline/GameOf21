/*    */ package com.defun.treedraw;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ 
/*  5 */ public class GenerateTreeData { private int treeWidth = 3;
/*    */   
/*    */   public void genTreeData(int treeDepth)
/*    */   {
/*  9 */     if (treeDepth <= 0)
/*    */     {
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 15 */       System.out.println("Invalid Tree depth");
/*    */     }
/*    */   }
/*    */   
/*    */ 
/*    */   private void getNodesDataLoopBased(int treeDepth)
/*    */   {
/* 22 */     for (int i = 0; i < treeDepth; i++) {
/* 23 */       genNodeData(i, 1);
/* 24 */       genNodeData(i, 2);
/* 25 */       genNodeData(i, 3);
/*    */     }
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   private void genNodeData(int level, int nodeVal)
/*    */   {
/* 46 */     System.out.print("NodeValue: " + nodeVal);
/*    */   }
/*    */ }


/* Location:              /home/anwar/workspace/Game21/bin/!/com/defun/treedraw/GenerateTreeData.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */