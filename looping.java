class looping{
	public static void main(String args[]){
		//for (int i=1;i<=10;i++){
			//if(i%2!=0){
				//System.out.println(i+" is odd");
			//}
		//}
		int total = 0;
		for(int i = 1; i <= 10; i++){
		//i =1;i=2;i=3;i=4;5;6;7;8;9;10;11
		if(i % 2 != 0){
			//total = 0,i = 1; 1,3; 4,5; 9,7; 16,9;
			total = total + i;
			//total = 1;4;9;16;25
		}
		}
		
		System.out.println(total);
	}
}