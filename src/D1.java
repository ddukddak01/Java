class Hero
{
	String name;//상태:멤버변수
	int power;
	int speed;
	
	public Hero()
	{
		this("미정",0,0);
	}
	
	public Hero(String name, int power)
	{
		this();//생성자에서 다른 생성자를 호출하는 것 
		this.name=name;
		this.power=power;
	}
	public Hero(String name, int power,int speed)
	{
		this.name=name;
		this.power=power;
		this.speed=speed;
	}

	@Override
	public String toString() {
		return "Hero [name=" + name + ", power=" + power + ", speed=" + speed + "]";
	}
	
}
public class D1 {

	public static void main(String[] args) {
		//Hero h1=new Hero();이거 사용하려면 디폴트 생성자가있어야하는데 만들수엄떠욤
		Hero h1=new Hero("아이언맨",200,300);
		System.out.println(h1);//toString 은 h1.toString()이거 말고 h1 으로 대체 가능
		
		Hero h2=new Hero("헐크",100,200);
		System.out.println(h2);
		
		Hero h3=new Hero("스파이더맨",300);
		System.out.println(h3);
		
		Hero h4= new Hero();
		System.out.println();
	}

}