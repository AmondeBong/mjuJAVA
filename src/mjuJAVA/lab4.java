package mjuJAVA;

/**
 * A short description of the program.
 * @author Ominsu
 * @ SID : 60205210
 * @assignment JAVA programming-4
 * @data 22.10.04
 *
 **/



public class lab4{
	public static void main(String[] args){
	
	champion cham1 = new champion("Hong",10,20);
	champion cham2 = new champion("Kim",20,10);

	for(int i=0;i<2;i++){
	cham2.add_power();
	
	}
	for(int j=0;j<5;j++){
	cham1.sub_defense();
	
	}
	
	
	
	System.out.println(cham1);
	System.out.println(cham2);
	
	
	}








}



