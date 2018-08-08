package Merging;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class merge_song 
{
	private static Scanner sc;
	public static void main(String[] args) 
	{
		sc = new Scanner(System.in);
		System.out.println("Enter the location of Mp3 file 1 with its name: ");	
		String basic = sc.nextLine();
		File f1 = new File(basic);
		System.out.println("Enter the location of Mp3 file 2 with its name: ");	
		String base2 = sc.nextLine();
		File f2 = new File(base2);
		System.out.println("Enter the name of merge file to create: ");	
		String second = sc.nextLine();
		File f3 = new File("D://"+second);
		try
		{
			FileInputStream fis = new FileInputStream(f1);
			FileInputStream fs = new FileInputStream(f2);
			FileOutputStream fos = new FileOutputStream(f3);
			int k=0;
			int len =(int) f1.length() + (int) f2.length();;
			while(k<=(len/2)-1)
			{
				fos.write(fis.read());
				k++;
			}
			while(k<=len-1)
			{
				fos.write(fs.read());
				k++;
			}
			fos.close();
			fis.close();
			fs.close();
			System.out.println("Mp3 Merged Successfully in Drive D: ");
		}
		catch(Exception e) {System.out.println(e);}
	}
}
