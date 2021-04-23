package salil;
import java.util.Scanner;
class Institute{
	
int	instituteid,noofstudentplaced,noofstudentpassed;
String institutename,loaction,grade;

public Institute(int id,String name,int noofstudentplaced,int noofstudentpassed,String location)
{
	this.instituteid=id;
	this.noofstudentplaced=noofstudentplaced;
	this.noofstudentpassed=noofstudentpassed;
	this.loaction=location;
	this.institutename=name;
}

int getid()
{
	return instituteid;
}
int getplaced()
{
	return noofstudentplaced;
}
int getpass()
{
	return noofstudentpassed;
}
String getname()
{
	return institutename;
}

String getloaction()
{
	return loaction;
}
String getgrade()
{
	return grade;
}

}


public class solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Institute[] k=new Institute[4];
		for(int i=0;i<k.length;i++)
		{
			int id=sc.nextInt();
			sc.nextLine();
			String name=sc.nextLine();
		    int placed=sc.nextInt();
		    int passed=sc.nextInt();
		    sc.nextLine();
		    String location=sc.nextLine();
		    k[i]=new Institute(id,name,placed,passed,location);
		}
		String location=sc.nextLine();
		String name=sc.nextLine();
		int sum=findnum(k,location);
		System.out.println(sum);
		try
		{
			Institute[] p=updategrade(name,k);
			for(int i=0;i<p.length;i++)
			{
				System.out.println(p[i].getname()+"::"+p[i].getgrade());
			}
		}
		catch(Exception e)
		{
			
		}
		
		
		
            
	}

	
	static int findnum(Institute[] k,String location)
	{
		int sum=0;
		for(int i=0;i<k.length;i++)
		{
			if(k[i].getloaction().equalsIgnoreCase(location))
			{
				sum+=k[i].getpass();
			}
			
		}
return sum;
	}
	
	
	
	static Institute[] updategrade(String name,Institute[] k)
	{
		Institute[] temp=new Institute[4];
		int grade,j=0;
		for(int i=0;i<k.length;i++)
		{
			if(k[i].getname().equalsIgnoreCase(name))
			{
			grade=(k[i].getplaced()*100)/k[i].getpass();
			if(grade>=80)
			{
			 k[i].grade="A";	
			}
			else
				k[i].grade="B";

			temp[j]=k[i];
			j++;
			}
		}
		return temp;
	}

}
