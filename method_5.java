public class method_5{
	public static void main(String args[]){
		System.out.println(max(5,8,2));
	}
	public static int max(int x, int y, int z){
		int max = 0;
		if(x > y && x > z){
			max = x;
		}
		else if(y > z && y > x){
			max = y;
		}
		else{
			max = z;
		}
		return max;
	}
}