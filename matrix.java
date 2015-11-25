
package math.algo;

import java.util.Random;

public class matrix 
{
    private int rows;
    private int columns;
    private int nonzero;
    private int matar[][];
    private int matarx[][];
    private int a[];
    private int ia[];
    private int ja[];
    private int k[][];
   
    
    public matrix(int r, int c, int y)
    {
        this.columns=r;
        this.rows=c;
        this.nonzero=y;
        this.matar= new int[r][c];
        for (int i = 0; i<r; i++)
        {
            for(int j=0; j<c; j++)
            {
                this.matar[i][j]=0;
            }
        }
        Random u = new Random();
        int max= nonzero;
        while(max>0)
        {
        int rnum= u.nextInt(r);
        int cnum = u.nextInt(c);
        int z = rnum+cnum;
        if(z>0)
        {
            if(this.matar[rnum][cnum]==0)
            {
        this.matar[rnum][cnum]=z;
        max--;
            }
        }
        }
        
        
    }
    public void disp()
    {
        for (int i = 0; i<this.columns; i++)
        {
            for(int j=0; j<this.rows; j++)
            {
                System.out.print(matar[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
    public void counttale()
    {
        int n=0;
        a = new int[this.nonzero+1];
        for (int i = 0; i<this.columns; i++)
        {
            for(int j=0; j<this.rows; j++)
            {
                if(matar[i][j]!=0)               
                {
                    int v=matar[i][j];
                    this.a[n]= v;
                    n++; 
                }
            }
        }
    }
    
     public void countia()
    {
        int n=1;
        int f=0;
        ia = new int[this.columns+1];
        ia[0]=0;
        for (int i = 0; i<this.columns; i++)
        {
            for(int j=0; j<this.rows; j++)
            {
                if(matar[i][j]!=0)               
                {
                    
                    f++; 
                }
            }
                    this.ia[n]= f;
                    n++;     
        }
    }
     
     
     public void countja()
    {
        int n=0;
        ja = new int[this.nonzero];
        for (int i = 0; i<this.columns; i++)
        {
            for(int j=0; j<this.rows; j++)
            {
                if(matar[i][j]!=0)               
                {
                    
                    this.ja[n]= j;
                    n++;
                }
            }
                    
        }
    }
    
    public void disptale()
    {
        System.out.print("The nonzero items in the matrix are a : [");
        for(int i=0; i<this.nonzero; i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println("]");
    }
    
    public void dispia()
    {
        System.out.print("ia = [");
        for(int i=0; i<=this.columns; i++)
        {
            System.out.print(ia[i]+" ");
        }
        System.out.println("]");
    }
    
    public void dispja()
    {
        System.out.print("Ja = [");
        for(int i=0; i<this.nonzero; i++)
        {
            System.out.print(ja[i]+" ");
        }
        System.out.println("]");
    }
    
    public void createmx()
    {
        //this.columns=r;
        //this.rows=c;
        //this.nonzero=y;
        
        this.matarx= new int[this.columns][this.rows];
        for (int i = 0; i<this.columns; i++)
        {
            for(int j=0; j<this.rows; j++)
            {
                this.matarx[i][j]=0;
            }
        }
        int i=0;
        while (i<this.columns)
        {
        int k=0;
        int j=0;
        while( j<this.nonzero)
            {
        
            
                int y= ia[k+1]-ia[k];
                
                while(y>0)
                {
                    int x= this.ja[j];
                    this.matarx[i][x]=this.a[j];
                    j++;
                    y--;
                    
                }
                
                    i++;
                    k++;

            
               
            }
        if(j>=this.nonzero && i<this.columns)
        {
            i=this.columns;
        }

        }
    
    }
    
      public void dispmx()
    {
        System.out.println("___________________________________________________________");
        System.out.println("The rebuild matrix from the compressed array a, ia and ja will be like:");
        
        for (int i = 0; i<this.columns; i++)
        {
            for(int j=0; j<this.rows; j++)
            {
                System.out.print(this.matarx[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
    
    
    
    public void vote()
    {
        int n=0;
        k = new int[this.columns][this.rows];
        a = new int[this.nonzero+1];
        for (int i = 0; i<this.columns; i++)
        {
            for(int j=0; j<this.rows; j++)
            {
                if(matar[i][j]!=0)               
                {
                    
                    this.k[i][j]= this.matar[i][j];
                    int v=this.matar[i][j];
                    a[n]= v;
                    n++; 
                }
            }
        }
                    System.out.println("______________________________________________________________________________");

    for (int i = 0; i<this.columns; i++)
        {
            for(int j=0; j<this.rows; j++)
            {
                System.out.print(k[i][j]+" ");
            }
            System.out.println("");
        }    
    }
}
