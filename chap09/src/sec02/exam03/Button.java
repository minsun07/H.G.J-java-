package sec02.exam03;

public class Button {

	static interface OnClickListener{  //중첩 인터페이스
		void onClick();
	}
	
	OnClickListener listener;
	
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();
	}
	
}
