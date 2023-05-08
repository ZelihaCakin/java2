package miniProjeSayiBulma;

public class sayiBulma {

	public static void main(String[] args) {
		int[] sayilar= new int[] {1,2,5,7,9,0};
		int aranacak=5;
		boolean varMi=false;
		 /*switch (aranacak) {
		case 1:
		case 5:
		case 2:
		case 7:
		case 9:
		case 0:	
			System.out.println("Sayı bulundu.");
			break;
			default:
			System.out.println("Sayı bulunamadı.");
			
		}*/
		//veya;
		for (int sayi:sayilar) {
			if (sayi==aranacak) {
				varMi=true;
				break;
			}
		}
			if (varMi) {
				
				System.out.println("Sayı bulundu.");
			}
			else {
				System.out.println("Sayı bulunamadı.");
			}
			
			
		}
		
		
	}


