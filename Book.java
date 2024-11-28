public class Book 
{
     private String title; 
     private String author; 
     private int numPages; 
     public Book(String t, String a, int np) 
    { 
        title = t; 
        author = a; 
        numPages = np; 
    } 
    public String getTitle() 
    { 
        return title; 
    } 
    public String getAuthor() 
    { 
        return author;
    
    }

     public int getNumPages() 
     { 
        return numPages; 
    } 
}
class student extends Book 
{
    
    
    public String name;
    public int age;
    public String major;
    
    public student(String b,String au,int num,String n, int a, String m)
    {
        super(b,au,num);
        
        

        name = n;
        age= a;
        major= m;

    }
    public String getMajor() {
        return major;
    }
    public void display()
    {
        System.out.println("Title of the book:"+super.getTitle()+"author:"+ super.getAuthor()+ "number of pages:"+super.getNumPages());
    }
    
}
class Main
{
    public static void main(String[] args) {

        student obj1= new student("Physics","JK Rowling",500,"Reeya",13,"Science");
        System.out.println("name:"+obj1.name+"age:"+obj1.age+"major:"+obj1.getMajor());
        obj1.display();

        
    }
}