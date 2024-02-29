package sec00.exam05;

public class ShopService {

	//정적 필드-2 선언
	//자신의 객체 생성 및 초기화
	private static ShopService singleton = new ShopService();
	
	//생성자-1
	private ShopService() {
		
	}
	
	//정적 메소드-3
	static ShopService getInstance() {
		return singleton;
	}
}
