package com.company;

public abstract class Algorithm {
   private int n;
   private int k;
   private int q;

   public Algorithm(int n,int k,int q){
       this.n=n;
       this.k=k;
       this.q=q;

   }
   public abstract int [] Movement();
}
