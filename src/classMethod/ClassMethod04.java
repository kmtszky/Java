package classMethod;

import classMethod.human.Human04;

public class ClassMethod04 {
	public static void main(String[] args) {
		classMethod.human.Human04 yamada = new Human04("山田");
		
		classMethod.human.Human04.staticMethodPrint();
		
		System.out.println(Human04.GREETING);
		
		yamada.instanceMethodPrint();
	}
}
