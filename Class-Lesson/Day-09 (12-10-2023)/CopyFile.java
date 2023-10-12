package com.day09;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyFile {
	public InputStream is;
	public OutputStream os;

	public CopyFile() {
		try {
			File f = new File("Unicode.pdf");
			long len = f.length();
			double fivePc = len*0.05;
			long count = 0;

			is = new FileInputStream(f);
			os = new FileOutputStream("Unicode-Copy.pdf");

			int each;
			while( (each=is.read()) != -1 ) {
				os.write(each);
				count++;
				if(count>=fivePc) {
					System.out.print(".");
					count = 0;
				}
			}
			
			os.close();
			is.close();
		} catch(FileNotFoundException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		} catch(IOException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new CopyFile();
	}

}
