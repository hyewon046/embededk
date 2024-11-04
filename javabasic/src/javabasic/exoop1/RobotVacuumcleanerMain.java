package javabasic.exoop1;

public class RobotVacuumcleanerMain {

	public static void main(String[] args) {
		
		Vaccumcleaner vc = new Vaccumcleaner();
		vc.color = "white";
		vc.wheelcount = 2;
		vc.price = 200000;
		
		Entity entity = new Entity();
		entity.size = "medium";
		entity.watercleaning = true;
		entity.basketcount = 3;
		
		RobotVaccumcleaner rvc = new RobotVaccumcleaner("Roboroc", "S8 ultra", 8, vc, entity);
		
		//vaccumcleaner에 로봇청소기가 포함되어있으므로 위임관계보다는 상속관계인 것 같다. 나머지는 ㄱㅊ
		//클래스이름을 바꾸면 의도한대로 될것같기도함(내생각)
		

	}

}
