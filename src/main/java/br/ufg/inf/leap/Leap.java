package br.ufg.inf.leap;

/**
 * Hello world!
 *
 */
public class Leap {
	public static void main(String[] args) {
//		Leap leap = new Leap();
//		leap.isLeap(1992);
	}

	public boolean isLeap(int year) {
		return divisibleBy4(year) ? divisibleBy100And400(year) : false;
	}

	private boolean divisibleBy100And400(int year) {
		return divisibleBy100(year) ? (divisibleBy400(year) ? true : false) : true;
	}

	private boolean divisibleBy400(int year) {
		return year % 400 == 0;
	}

	private boolean divisibleBy100(int year) {
		return year % 100 == 0;
	}

	private boolean divisibleBy4(int year) {
		return year % 4 == 0;
	}
}
