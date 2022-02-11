
public class Library {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Item i =new Book();
			Video v =new Video();
			i.setidNum(40);
			int id=i.getidNum();
			i.setTitle("Harry Porter");
			String title=i.getTitle();
			i.setNumCopies(4);
			int numCopies =i.getCopies();
			WrittenItem w=new Book();
			w.setAuthor("J. K. Rowling");
			String author=w.getAuthor();
			JournalPaper j=new JournalPaper();
			j.setYear(1997);
			int Year= j.getYear();
			v.setRunTime(3);
			int runtime=v.getRunTime();
			
			v.setDirector("Chris Columbus");
			String Director=v.getDirector();
			v.setGenre("Fantasy Fiction");
			String genre=v.getGenre();
			v.setYearR(2010);
			int YearR=v.getYearR();
			
			CD c=new CD();
			c.setartists("Daniel Radcliffe");
			String artist=c.getartists();
			c.setGenre(genre);
			String genre1=c.getGenre();
			i.print(id, title, numCopies);
			Book b=new Book();
			b.AuthorName(author);
			j.PublishedYear(Year);
			
			
			v.runtime(runtime);
			v.DetailsVideo(Director,genre,YearR);
			
			c.artistName(artist,genre);
	}
}

abstract class Item{     //Abstract  Super  Class Item
private int idNum;
private String title;
private int numCopies;
	
	public int getCopies(){
         return numCopies;
        }
         public void setidNum(int id){
          idNum = id;
        }

	public int getidNum(){
            return idNum;
        }

	
	public void setTitle(String str){
           title = str;
         }

	public String getTitle() {
		// TODO Auto-generated method stub
		return title;
	}
            public void setNumCopies(int n){
            numCopies = n;

        }
            public void checkIn(){
             numCopies = numCopies + 1;
        }
             public void checkOut(){
              numCopies = numCopies - 1;
        }
	
	public abstract void print(int idNum,String title,int NumCopies);
	
	
}
abstract class WrittenItem extends Item{
	private  String author="";
	public void setAuthor(String s)
	{
		author=s;
	}
	public String getAuthor()
	{
		return author;
	}
	public abstract void AuthorName(String author);
	public abstract void PublishedYear(int Year);
}
class Book extends WrittenItem{
	public void AuthorName(String author)
	{
		System.out.println("Author Name:"+author);
	}
	public  void print(int idNum,String title,int numCopies)
	{
			System.out.println("Details about Book:");
			System.out.println("Book id:"+idNum);
			System.out.println("Book Title:"+title);
			System.out.println("Number of copies:"+numCopies);
	}
	public void PublishedYear(int Year) {
		
	}
}
	

class JournalPaper extends WrittenItem{
	public void AuthorName(String author)
	{
		
	}
	private int Year;
	public void setYear(int i) {
		// TODO Auto-generated method stub
		Year=i;
	}
	public int getYear()
	{
		return Year;
	}
	public void PublishedYear(int Year)
	{
		System.out.println("Book Published Year"+Year);
	}
	
	public  void print(int idNum,String title,int numCopies)
	{
	
	}
}

abstract class MediaItem extends Item{
	private int runtime;
	public void setRunTime(int i) {
		// TODO Auto-generated method stub
		runtime=i;
	}
	public int getRunTime()
	{
		return runtime;
	}
	public void runtime(int runtime)
	{
		System.out.println("Runtime of Video:"+runtime);
	}
	public abstract void artistName(String artist2, String genre2) ;
	public abstract void DetailsVideo(String director2, String genre2, int yearR2);
}
 class Video extends MediaItem {
	private String Director="";
	private String genre="" ;
	private int YearR;
	public void artistName(String artist2, String genre2) {
		
	}
	public String getDirector() {
		// TODO Auto-generated method stub
		return Director;
	}

	public void setDirector(String s) {
		// TODO Auto-generated method stub
		Director=s;
	}

	public String getGenre() {
		// TODO Auto-generated method stub
		return genre;
	}

	public void setGenre(String s) {
		// TODO Auto-generated method stub
		genre=s;
	}

	public int getYearR() {
		// TODO Auto-generated method stub
		return YearR;
	}

	public void setYearR(int i) {
		// TODO Auto-generated method stub
		YearR=i;
	}
	
	public  void print(int id,String title,int numOfCopy)
	{
	
	} 

	public void DetailsVideo(String director2, String genre2, int yearR2) {
		// TODO Auto-generated method stub
		System.out.println("Director NAme:"+director2);
		System.out.println("genre:"+genre2);
		System.out.println("Video published Year:"+yearR2);
	}
}
 class CD extends MediaItem{
	private String artist;
	private String genre="";
	
	public String getartists() {
		// TODO Auto-generated method stub
		return artist;
	}

	public void setartists(String s) {
		// TODO Auto-generated method stub
		artist=s;
	}
	public String getGenre() {
		// TODO Auto-generated method stub
		return genre;
	}

	public void setGenre(String s) {
		// TODO Auto-generated method stub
		genre=s;
	}
	public  void print(int id,String title,int numOfCopy)
	{
	
	}
	public void DetailsVideo(String director2, String genre2, int yearR2)
	{
		
	}

	public void artistName(String artist2, String genre2) {
		// TODO Auto-generated method stub
		System.out.println("Artist NAme:" +artist2);
		System.out.print("genre"+genre2);
	}
}
