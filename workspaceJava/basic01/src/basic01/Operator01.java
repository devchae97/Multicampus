package basic01;

public class Operator01 {

	public static void main(String[] args) {
		// ������ : +, =, *, /(������), %(������)
		
		int num1 = 10;
		int num2 = 3;
		
		// ���� + ���� = ����
		// ���� + �Ǽ� = �Ǽ�
		// �Ǽ� + �Ǽ� = �Ǽ�
		
		int result = num1 / num2; // 3
		double result2 = num1 / (double)num2; // 3.33333
		int result3 = (int)(num1 / (double)num2); // 3
		
		System.out.println(result + ", " + result2 + ", " + result3);
		
		//--------------------------------------------------
		
		// ���������� : ++, --
		
		int a = 10;
		
		// 1 ����
		// a++; �� ++a; �� �ܵ� ��� �� ���������ڰ� �� �� ��� ��ġ�ϵ� ����� ����
		// a = a + 1;	a = 1 + a;
		a += 1;
		System.out.println(a); // 11
		
		// 1 ����
		// a--;	--a;	a = a - 1;
		a -= 1;
		System.out.println(a); // 10
		
		// ������ ++�� ���Թ� �� �������� ����, ��ġ�� ���� ���� �߻�
		// b++ : ���� �����ʿ� ��ġ �� ��� ��� �� ++���� ����
		// ++b : ���� ���ʿ� ��ġ �� ++���� �� ��� ���
		// ��ȣ�� ������ ��ȣ�켱
		
		int b = 5;
		int r1 = b++ + 100;
		System.out.println("b = " + b + ", r1 = " + r1); // b = 6, r1 = 105
		
		int r2 = ++b + 100;
		System.out.println("b = " + b + ", r2 = " + r2); // b = 7, r1 = 107
		
		int t = 3;
		int r3 = 5 / 7 + 10 % 2 - 3 + t++ *2; // 0 + 0 - 3 + (3 * 2);
		System.out.println("t = " + t + ", r3 = " + r3); // t = 4, r3 = 3
		
		//--------------------------------------------------
		
		// ��(���迬����) : ==, !=, >, <, >=, <=
		// �� ������ : &&(and), ||(or) *and�� or���� �켱
		
		boolean r4 = b >= t; // true or false b=7, t=4
		System.out.println("r4 = " + r4); // r4 = true
		
		boolean r5 = a > b + t * 2; // a= 10, b=7, t=4 false
		System.out.println("r5 = " + r5); // r5 = false
				
		// 1~100 ���̸� true, �ƴϸ� false�� ���� ��������
		// 1 <= data <= 100
		
		int data = 50;
		
		boolean r6 = data >= 1 && data <= 100;
		System.out.println("r6 = " + r6); // r6 = true
		
		//--------------------------------------------------
		
		// ���׿����� : ���� = (���ǽ�)? �� : ���� ;
		// (���ǽ�)?A:B ���ǿ� ���� A�� B�� ����
		
		int x = 5;
		String r7 = (x%2==1)?"odd":"Even"; // Ȧ ¦ �Ǻ�
		// String r7 = (x/2==x/2.0)?"Even":"odd";
		System.out.println("r7 = " + r7); // odd
		
		int r8 = (x%2==1)? x-100 : x*100; // Ȧ���� -100, ¦���� *100
		System.out.println("r8 = " + r8); // -95
		
		// ���׿����� ���� ���׿����� ��� ����
		
		String r9 = (x>0)?"Positive":(x<0)?"Negative":"Zero"; // ����� Positive, ������ Negative, 0�̸� Zero
		System.out.println("r9 = " + r9); // Positive
		
	}
}
