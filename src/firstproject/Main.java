<<<<<<< HEAD
/**
 * 
 */
package firstproject;

/**
 * @author U6063677
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main m = new Main();
		m.run();
	}

	private void run() {
		Person p = new Person();

		p.setFirstName("Aubrey");
		p.setLastName("Alcera");
		p.setAge(36);

		int i = 234;
		double d = 51.11;
		boolean b = true;
		char c = 'c';
		String s = " Dog";

		System.out.println("for loop:");
		for (int a = 0; a < 10; a++) {
			System.out.println(p.getFullName() + "; Age:" + p.getAge() + " ; a = " + a);
			p.birthday();
		}

		p.setAge(36);
		int a = 0;
		System.out.println((char) 10 + "while loop:");
		AGEw: while (p.getAge() < 76) {
			if (p.getAge() == 40 || p.getAge() == 45) {
				System.out.println(p.getFullName() + "; Significant Age:" + p.getAge() + " ; a = " + a);
			} else if (p.getAge() > 50) {
				break AGEw;
				
			} else {
				System.out.println(p.getFullName() + "; Age:" + p.getAge() + " ; a = " + a);
			}
			p.birthday();
			a++;
		}

		p.setAge(36);
		a = 0;
		System.out.println((char) 10 + "do while loop:");
		AGE: do {
			switch (p.getAge()) {
			case 40:
				System.out.println(p.getFullName() + "; Significant Age:" + p.getAge() + " ; a = " + a);
				break;
			case 50:
				System.out.println(p.getFullName() + "; Significant Age:" + p.getAge() + " ; a = " + a);
				break;
			case 60:
				System.out.println(p.getFullName() + "; Significant Age:" + p.getAge() + " ; a = " + a);
				break;
			case 70:
				System.out.println(p.getFullName() + "; Significant Age:" + p.getAge() + " ; a = " + a);
				break AGE;
			default:
				System.out.println(p.getFullName() + "; Age:" + p.getAge() + " ; a = " + a);
				break;
			}
			// System.out.println(p.getFullName() + "; Age:" + p.getAge() + " ; a = " + a);
			p.birthday();
			a++;
		} while (p.getAge() < 76);

		System.out.println((char) 10);
		i = (int) d; // converts double to integer
		System.out.println(p.getFullName() + "; Age:" + i + (char) (10) + b + '\n' + c + s + '\n');

		p.setAge(36);

		System.out.println(p.getFullName() + "; Age:" + p.getAge());

		Person mum = new Person();
		mum.setFirstName("doris");
		mum.setLastName("alcera");
		mum.setAge(68);
		p.setMother(mum);

		System.out.println(p.getMother().getFullName() + (char) 10 + "age: " + mum.getAge());

	}

}
=======
/**
 * 
 */
package firstproject;

/**
 * @author U6063677
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main m = new Main();
		m.run();
	}

	private void run() {
		Person p = new Person();

		p.setFirstName("Aubrey");
		p.setLastName("Alcera");
		p.setAge(36);

		int i = 234;
		double d = 51.11;
		boolean b = true;
		char c = 'c';
		String s = " Dog";

		System.out.println("for loop:");
		for (int a = 0; a < 10; a++) {
			System.out.println(p.getFullName() + "; Age:" + p.getAge() + " ; a = " + a);
			p.birthday();
		}

		p.setAge(36);
		int a = 0;
		System.out.println((char) 10 + "while loop:");
		AGEw: while (p.getAge() < 76) {
			if (p.getAge() == 40 || p.getAge() == 45) {
				System.out.println(p.getFullName() + "; Significant Age:" + p.getAge() + " ; a = " + a);
			} else if (p.getAge() > 60) {
				break AGEw;
				
			} else {
				System.out.println(p.getFullName() + "; Age:" + p.getAge() + " ; a = " + a);
			}
			p.birthday();
			a++;
		}

		p.setAge(36);
		a = 0;
		System.out.println((char) 10 + "do while loop:");
		AGE: do {
			switch (p.getAge()) {
			case 40:
				System.out.println(p.getFullName() + "; Significant Age:" + p.getAge() + " ; a = " + a);
				break;
			case 50:
				System.out.println(p.getFullName() + "; Significant Age:" + p.getAge() + " ; a = " + a);
				break;
			case 60:
				System.out.println(p.getFullName() + "; Significant Age:" + p.getAge() + " ; a = " + a);
				break;
			case 70:
				System.out.println(p.getFullName() + "; Significant Age:" + p.getAge() + " ; a = " + a);
				break AGE;
			default:
				System.out.println(p.getFullName() + "; Age:" + p.getAge() + " ; a = " + a);
				break;
			}
			// System.out.println(p.getFullName() + "; Age:" + p.getAge() + " ; a = " + a);
			p.birthday();
			a++;
		} while (p.getAge() < 76);

		System.out.println((char) 10);
		i = (int) d; // converts double to integer
		System.out.println(p.getFullName() + "; Age:" + i + (char) (10) + b + '\n' + c + s + '\n');

		p.setAge(36);

		System.out.println(p.getFullName() + "; Age:" + p.getAge());

		Person mum = new Person();
		mum.setFirstName("doris");
		mum.setLastName("alcera");
		mum.setAge(68);
		p.setMother(mum);

		System.out.println(p.getMother().getFullName() + (char) 10 + "age: " + mum.getAge());

	}

}
>>>>>>> 0cd76a7daa44afa23f2f6d5d04ad933ff5aa86e8
