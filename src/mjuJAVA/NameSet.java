package mjuJAVA;

public class NameSet{

    public static String last_name; 
    public static int family_count=0;
    // static 변수 last_name, family_count
    // last_name을 static으로 설정한 이유: 생성되는 객체 모두 같은 성을 사용하므로 모든 객체 공용인 static 사용
    // static 사용시 주의점: this. 사용불가, static 함수에서만 사용가능
    private String first_name;
    // 객체 마다 이름이 다르므로 인스턴트 변수로 선언

    public NameSet(){
        family_count++;
        last_name = "Hong";
    }
    public NameSet(String name) {
    	family_count++;
    	last_name = "Hong";
    	first_name = name;
    }
    //생성자의 경우 맨 앞에 생성하는게 정석이다.
    public void setFirstName(String first){
            first_name = first;
            
    }
    public static void setLastName(String last){
            last_name = last;
            // last_name의 경우 static이므로 함수도 static으로 생성
    }
    
    //setter
    public static String getLastName(){
            return last_name;
    }

    public String getFirstName(){
             return first_name;
    }
    // getter
    public String toString(){
        return family_count+" "+last_name+" "+first_name;


    }
    
}
