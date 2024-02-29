package sec01.exam06;

public class Button {

	OnClickListener listener;
	
	void setListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	void click() {
		listener.onClick();
	}
	
	static interface OnClickListener{  //중첩 인터페이스
		void onClick();
	}
}
