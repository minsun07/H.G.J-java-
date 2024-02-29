package sec06.exam02.mycompany;

import sec06.exam02.hyndai.Engine;
import sec06.exam02.hankok.SnowTire;
import sec06.exam02.kumho.BigWidthTire;
//import sec06.exam02.hankok.Tire;
//import sec06.exam02.kumho.Tire;

public class Car {

	//Field
	Engine engine = new Engine();
	SnowTire tirel1 = new SnowTire();
	BigWidthTire tire2 = new BigWidthTire();
	
	sec06.exam02.hankok.Tire tire3 = new sec06.exam02.hankok.Tire();
	sec06.exam02.kumho.Tire tire4 = new sec06.exam02.kumho.Tire();  //클래스 이름이 같은 경우 전체 패키지 이름으로 객체를 선언한다.
}
