package miniProje3MukemmelSayi;

public class Main {

	public static void main(String[] args) {
		int sayi = 26;
		int toplam = 0;
		//boolean isMukemmelsayi = true;
		for (int i = 1; i < sayi; i++) {
			if (sayi % i == 0) {
				toplam = toplam + i;

			}

		}
		if (sayi==toplam) {
			System.out.println(sayi + " sayısı MÜKEMMEL bir sayıdır.");
		} else {
			System.out.println(sayi + " sayısı MÜKEMMEL bir sayı değildir!");
		}

	}

}
