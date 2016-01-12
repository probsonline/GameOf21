/*    */ package com.defun.treedraw;
/*    */ 
/*    */ import javax.swing.JFrame;
/*    */ 
/*    */ public class DrawTree
/*    */ {
/*  7 */   private static int ScalingFactor = 1;
/*  8 */   private static final int PANEL_WITH = 800 * ScalingFactor;
/*  9 */   private static final int PANEL_HEIGHT = 600 * ScalingFactor;
/*    */   
/* 11 */   int NodeElementsCount = 3;
/*    */   UINode rootNode;
/*    */   
/*    */   public void draw(int levelCount)
/*    */   {
/* 16 */     JFrame treePanel = new JFrame();
/* 17 */     this.rootNode = new UINode(0);
/* 18 */     treePanel.add(this.rootNode);
/*    */     
/* 20 */     treePanel.setSize(PANEL_WITH, PANEL_HEIGHT);
/* 21 */     treePanel.setVisible(true);
/*    */   }
/*    */   
/*    */   private void insertNode(JFrame frame) {
/* 25 */     frame.add(new UINode(1));
/* 26 */     frame.add(new UINode(2));
/* 27 */     frame.add(new UINode(3));
/*    */   }
/*    */ }


/* Location:              /home/anwar/workspace/Game21/bin/!/com/defun/treedraw/DrawTree.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */