import java.util.Scanner;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Scanner s = new Scanner(System.in);
    String nm, cnm, et;
		File f = new File("test.txt");
	 Scanner sfile = new Scanner(f);//Scanner collegato al file

		if(!f.exists()){
			f.createNewFile();
		}else{
			System.out.print("Inserire quanti nomi si vogliono inserire: ");
			int n = s.nextInt();
			PrintWriter fw = new PrintWriter(f);
			s.nextLine();
			for(int i = 0; i < n; i++){				
				System.out.print("Inserire Nome: ");
				nm = s.nextLine();
				fw.write( nm );
        cnm = s.nextLine();
				fw.write( cnm );
        System.out.print("Inserire Eta': ");
				 et = s.nextLine();
				fw.write( et );
        fw.write( "\n" );
				}
			fw.close();
		}
     while (sfile.hasNextLine()) { // Lettura del file
        var str = sfile.nextLine();
        var res = str.split(" ");
        nm = res[0];
        cnm = res[1];
        et = res[2];
        int num = Integer.parseInt(et);
        if(num<18){
          System.out.println(nm);
          System.out.println(cnm);
        }
      }
	}

}   