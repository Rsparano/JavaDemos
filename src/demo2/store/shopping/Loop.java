package demo2.store.shopping;

public class Loop {
	public static void main(String[] args) {
		int sum =0;
		for (int i = 0; i < 10; sum += i++) {
			System.out.println(i);
		}
		System.out.println(sum);
	//	for (int j = 9); j>0; j--) {
	//		for (int i = 0; i < 9; i++) {
	//			if ( i % 2 !=0) {
	//				continue;
	//			}
	//		}	if (i == j) {
	//			break;
	//		}
	//	}	System.out.println("| "+i+" "+j+" | ");
	}

}
