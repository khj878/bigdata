
public class Example04 {
	public static void main(String[] args) {
		int math_score[] = {11, 22, 33};
		int eng_score[] = {44, 55, 66};
		int kor_score[] = {77, 88, 99};
		
		int score[][] = 
		{
				{11, 22, 33},	//�������� s[0]
				{44, 55, 66},	//��������s[1]
				{77, 88, 99}	//��������s[2]
		};
		int totalRow = score.length;
		System.out.println("���� ����:" + totalRow);
		
		for(int i = 0 ; i < totalRow; i++) {
			for(int j = 0 ; j < score[i].length; j++) {
				System.out.print(score[i][j] + " ");
			}
			System.out.println("");
		}
	}
}
