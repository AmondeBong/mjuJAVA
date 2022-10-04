public class champion{

	private String name;
	private int power,defense;
	
	public champion(){
		name = "Park";
		power = 100;
		defense = 50;
	
	}
	
	public void printout(){
	 System.out.println("cham1의 이름: "+this.name+" power: "+this.power+" defense: "+this.defense);
	
	}


	public champion(String name,int power,int defense){
	this.name = name;
	this.power = power;
	this.defense = defense;
	
	
	}
	public int add_power(){
	power += 5;
	return power;
	}
	public int sub_power(){
	power -= 5;
	return power;
	}
	public int add_defense(){
	defense += 2;
	return defense;
	}
	public int sub_defense(){
	defense -= 2;
	return defense;
	}




	public int add_power(int add){
	power += add;
	return power;
	}
	public int sub_power(int sub){
	power -= sub;
	return power;
	}
	public int add_defense(int add){
	
	defense += add;
	
	return defense;
	}

	public int sub_defense(int sub){
	
	defense -= sub;
	return defense;
	}

}

