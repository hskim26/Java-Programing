package KHS;

import java.io.*;


public class FileOutputStreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b[] = {7, 51, 3, 4, -1,24};
		
		try {
			FileOutputStream fout = new FileOutputStream("test.out");
			for(int i = 0; i<b.length; i++) {
				fout.write(b[i]);
			fout.close();
			
			byte b2[] = new byte[6];
			FileInputStream fin = new FileInputStream("test.out");
			int n =0, c;
			while((c = fin.read()) != -1)
				b2[n++] = (byte)c;
			fin.close();
			
			for(int i1 = 0; i1 <b2.length; i1++)
				System.out.print(b2[i1] + " ");
			System.out.println();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	
		
	}

}
