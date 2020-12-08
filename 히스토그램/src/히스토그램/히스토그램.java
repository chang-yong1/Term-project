package 히스토그램;

import java.util.Scanner;
public class 히스토그램 {
   static long histo(int[] v, int s,int e) {
      if( s==e ) return v[s];
      int c = (s+e)/2, r=2;
      
      long min = (v[c]<v[c+1])?v[c]:v[c+1];
      long max = min*r;
      
      int i=c-1,j=c+2;
      
      while(i>=s&&j<=e) {
         if(v[i]>v[j]) {   if (v[i]<min) min=v[i]; i--;}
         
         else { if (v[j]<min) min = v[j]; j++;}
         
         if(max<min*(++r)) max = min*r;}
      while(i>=s) {
         if(v[i]<min) min=v[i]; i--; if(max<min*(++r)) max=min*r;
         }
      while(j<=e) {
         if(v[j]<min) min=v[j]; j++; if(max<min*(++r)) max=min*r;
         }
      
      long left=histo(v,s,c);
      long right = histo(v,c+1,e);
      
      if(max<left) max=left;
      if(max<right) max = right;
      
      return max;
   }
   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      int[] v = new int[100000];
      while(true) {
         int n = sc.nextInt();
         if(n==0) break;
         for(int i=0;i<n;i++) v[i]=sc.nextInt();
         System.out.println(histo(v,0,n-1));
               

   }
   }
}