/*    */ package com.defun.treedraw;
/*    */ 
/*    */ import java.awt.Graphics2D;
/*    */ import java.awt.RenderingHints;
/*    */ 
/*    */ public class UINode extends javax.swing.JPanel
/*    */ {
/*    */   private static final long serialVersionUID = 4560677368957372748L;
/*  9 */   private static int ScalingFactor = 1;
/* 10 */   private static final int NODE_WITH = 20 * ScalingFactor;
/* 11 */   private static final int NODE_HEIGHT = 20 * ScalingFactor;
/* 12 */   private static final int NODE_X_START = 0 * ScalingFactor;
/* 13 */   private static final int NODE_Y_START = 0 * ScalingFactor;
/* 14 */   private static final int NODE_FONT_SIZE = 10 * ScalingFactor;
/* 15 */   private static final int NODE_LINE_WIDTH = 2 * ScalingFactor;
/*    */   
/*    */ 
/* 18 */   private String NodeValue = "";
/*    */   
/*    */ 
/*    */   public UINode(int value, int scalingFactor)
/*    */   {
/* 23 */     this.NodeValue = Integer.toString(value);
/*    */   }
/*    */   
/*    */   public UINode(int value)
/*    */   {
/* 28 */     this(value, ScalingFactor);
/*    */   }
/*    */   
/*    */   public void paintComponent(java.awt.Graphics g) {
/* 32 */     super.paintComponent(g);
/* 33 */     drawNode((Graphics2D)g.create());
/*    */   }
/*    */   
/*    */ 
/*    */   private void drawNode(Graphics2D g)
/*    */   {
/* 39 */     g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
/*    */     
/* 41 */     java.awt.BasicStroke widePen = new java.awt.BasicStroke(NODE_LINE_WIDTH, 1, 1);
/*    */     
/* 43 */     g.setStroke(widePen);
/* 44 */     g.drawOval(NODE_X_START, NODE_Y_START, NODE_WITH, NODE_HEIGHT);
/*    */     
/* 46 */     g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
/*    */     
/* 48 */     java.awt.Font f = new java.awt.Font("Monospaced", 1, NODE_FONT_SIZE);
/* 49 */     g.setFont(f);
/* 50 */     g.drawString(this.NodeValue, (NODE_WITH + NODE_X_START - NODE_FONT_SIZE) / 2 + NODE_LINE_WIDTH, (NODE_HEIGHT + NODE_Y_START + NODE_FONT_SIZE) / 2 - NODE_LINE_WIDTH);
/* 51 */     g.dispose();
/*    */   }
/*    */ }


/* Location:              /home/anwar/workspace/Game21/bin/!/com/defun/treedraw/UINode.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */