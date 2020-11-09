/*
 성적에 따라 학점 부여하기
 앞에서 입력한 예제 코드를 바탕으로 성적에 따라 학점을 부여하는 프로그램을 만들어 보세요.
 100~90점은 A, 89~80점은 B, 79~70은 C, 69~60점은 D, 나머지는 F입니다.
 int형 변수 score와 char형 변수 grade를 사용하여 score에 따른 grade를 출력해보세요.
 * */

package ifexample;

public class SwitchCase {

	public static void main(String[] args) {
		int ranking = 1;
		char medalColor;
		
		switch(ranking) {
			case 1 : medalColor = 'G';
					 break;
			case 2 : medalColor = 'S';
			 		 break;
			case 3 : medalColor = 'B';
			 		 break;
			default:
					 medalColor = 'A';
		}
		System.out.println(ranking + "등 메달의 색깔은 " + medalColor + "입니다.");
	}
			
}
