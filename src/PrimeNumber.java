import javax.swing.JOptionPane;

public class PrimeNumber {

	public static void main(String[] args) {
		String s = JOptionPane.showInputDialog(null, "請輸入一個數字，判斷是否為質數");
		if (s == null){
			return;}//對話窗點選取消時不跳出"這不是數字無法判斷"
		try {  
			 int a = Integer.parseInt(s);
			} catch (NumberFormatException e) {
	 		System.out.println("這不是數字無法判斷");
			return;}//處理輸入的｢不是數字」執行的例外
		
		int a = Integer.parseInt(s);
			System.out.println("您輸入的是"+a);
		if(a<=1){System.out.println("請輸入大於1的數字");
			return;}
		//if(a>2147483647){System.out.println("超出可判斷範圍");
		//return;}//但輸入大於2147483648會是個例外'冏'，顯示"這不是數字無法判斷"
				//輸入2147483647會跑無限多"這是質數"出來，不會停止...??
		
		boolean isPrime;
		isPrime = true;
			for(int i=a;i<=a;i++){
				for(int j=2;j<i;j++){
				if(i%j==0){
				isPrime = false;}
				}
				if(isPrime){
					System.out.println("這是質數");
				}else{
					System.out.println("這不是質數");
			}
		}
	}
}
