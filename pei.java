import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class pei {
    public static void main(String args[] ) throws Exception 
    {
    Book[] books = new Book[4];
        double minPrice = 0;
        double maxPrice = 0;
        
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0;i<books.length;i++)
        {
            int id = sc.nextInt();sc.nextLine();
            String title = sc.nextLine();
            String author = sc.nextLine();
           // sc.nextLine();
            double price = sc.nextDouble();//sc.nextLine();
            
            books[i]= new Book(id,title,author,price);
        }
        minPrice = sc.nextDouble();//sc.nextLine();
        maxPrice = sc.nextDouble();//sc.nextLine();
        
        Book newBooks = booksWithPriceRange(minPrice,maxPrice,books);
        
    for(Book bk:newBooks)
		
             System.out.println(bk.getid());
             
    }

    
    //implement business methods here
    public static Book booksWithPriceRange(double minPrice,double maxPrice,Book books[])
    
    {
	Book[] x=new Book[4];
       for(int i=0;i<books.length;i++) 
       {
           if(books[i].getprice()>minPrice && books[i].getprice()<maxPrice)
           {
               x[i]=books[i];
              
              // System.out.println(res.getid());
                
           }
           
       }
       return x;
    }

}
class Book
{
    //implement class here
    private int id;
    private String title;
    private String author;
    private double price;
    
    public Book(int id,String title,String author,double price)
    {
        super();
        this.id=id;
        this.title=title;
        this.author=author;
        this.price=price;
        
    }   
    public int getid()
    {
        return id;
    } 
	
	public void setid(int id)
	{
		this.id=id;
	}
    public String gettitle()
    {
        return title;
    } 
	
	public void settitle(String title)
	{
		this.title=title;
	}
    public String getauthor()
    {
        return author;
    } 
	
	public void setauthor(String author)
	{
		this.author=author;
	}
    public double getprice()
    {
        return price;
    } 
	
	public void setprice(double price)
	{
		this.price=price;
	}
}