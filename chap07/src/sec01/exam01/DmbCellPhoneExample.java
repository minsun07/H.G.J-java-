package sec01.exam01;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		
		DmbCellPhone dmbcellphone = new DmbCellPhone("삼성폰", " 검정", 10);
		
		System.out.println("모델 : " + dmbcellphone.model);
		System.out.println("색상 : " + dmbcellphone.color);
		System.out.println("채널 : " + dmbcellphone.channel );
		
		dmbcellphone.powerOn();
		dmbcellphone.bell();
		dmbcellphone.sendvoice("여보세요");
		dmbcellphone.receivedVoice("안녕하세요! 저는 안민선인데요");
		dmbcellphone.sendvoice("아~네 반갑습니다.");
		dmbcellphone.hangUp();
		
		dmbcellphone.turnOnDmb();
		dmbcellphone.changeChannelDmb(12);
		dmbcellphone.turnOffDmb();

	}

}
