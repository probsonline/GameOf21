/*    */ package com.defun.treedraw;
/*    */ 
/*    */ public class TertiaryTree implements Tree
/*    */ {
/*    */   private Node Root;
/*    */   
/*    */   TertiaryTree() {
/*  8 */     this.Root = null;
/*    */   }
/*    */   
/*    */   public Node insertNode(int data) {
/* 12 */     this.Root = insert(this.Root, data);
/* 13 */     return this.Root;
/*    */   }
/*    */   
/*    */   private Node insert(Node node, int data)
/*    */   {
/* 18 */     if (node == null) {
/* 19 */       node = new Node(data);
/*    */     }
/*    */     else {
/* 22 */       node.LeftNode = insert(node.LeftNode, 1);
/* 23 */       node.MiddleNode = insert(node.MiddleNode, 2);
/* 24 */       node.RightNode = insert(node.RightNode, 3);
/*    */     }
/* 26 */     return node;
/*    */   }
/*    */ }


/* Location:              /home/anwar/workspace/Game21/bin/!/com/defun/treedraw/TertiaryTree.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */