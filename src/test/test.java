package test;

public class test {
	public static void main(String[] args) {
		
		
		
		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j <= 4-i; j++) {
				System.out.print(" ");
			}
			int count = 0;
			for (int k = 0; k <= i; k++) {
				
				System.out.print(count++ + " ");
			}
			System.out.println();
		}
	}

}

//00   01   02   03   04
//
//10   11   12   13   14
//
//20   21   22   23   24
//
//30   31   32   33   34
//
//40   41   42   43   44

