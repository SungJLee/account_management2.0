import java.awt.Frame;

public class Frame1 {
	// 메인
	
	public static void main(String[] args) {
		
		Frame f= new Frame();	// f라는 Frame 생성
		f.setTitle("First Frame");	//창 제목 설정
		f.setBounds(100, 100, 300, 300);	//창 크기 설정
		//		   (x, y, width, height)
		f.setVisible(true);	//창보이기 값 설정
	}

}