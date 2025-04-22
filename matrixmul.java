import java.io.*;
import java.util.*;
class matrix
{
    int m,n,a[][],b[][],i,j,k;
    Scanner s;
    public void read()throws Exception
    {
        s=new Scanner(System.in);
        System.out.println("Enter the order of matrix 1");
        m=s.nextInt();
        n=s.nextInt();
        a=new int[m][n];
        System.out.println("Enter "+(m*n)+" elements of matrix");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
               a[i][j]=s.nextInt();
        }


    }
    public void add(matrix obj)
    {
        if(n!=obj.m)
        {
            System.out.println("Cannot multiply");
            return;
        }
        b=new int[m][obj.n];
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                b[i][j]=0;
                for(k=0;k<obj.m;k++)
                   b[i][j]+=a[i][k]*obj.a[k][j];
                System.out.print(b[i][j]+"\t");
            }
            System.out.println("");
        }
           
    }
}
class matrixmul
{
    public static void main(String args[])throws Exception
    {
       matrix m1=new matrix();
       matrix m2=new matrix();
       m1.read();
       m2.read();
       m1.add(m2);
    }
}
