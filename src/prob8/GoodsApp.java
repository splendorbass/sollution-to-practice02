package prob8;

import java.util.Scanner;

public class GoodsApp {

	public static void main(String[] args) {
		Goods[] goodsArray = new Goods[3];	//Goods 객체를 담을 수 있는 배열을 생성한다.
		Scanner scanner = new Scanner(System.in);
		
				
		
		for( int i = 0 ; i < 3 ; i++){
			goodsArray[i] = new Goods();	//Goods 객체배열 마다 객체를 생성한다.
			
			String line = scanner.nextLine();	//상품의 정보를 입력한다  ex)콜라 1000 10  각각의 정보사이는 스페이스바 한칸으로 구분한다.
			
			//하나의 String 으로 연결된 정보를 빈칸(" ")을 기준으로 나눠 각각 String 배열에 저장해 그배열의 리퍼런스값을 변수 infos에 대입한다.
			String[] infos = line.split(" ");	
			
			goodsArray[i].setName( infos[0] );							//문자열 배열(infos[])의 첫번째 값(이름)을 첫번째 객체의 name에 저장. 
			goodsArray[i].setPrice(Integer.parseInt(infos[1]));			//문자열 배열(infos[])의 두번째 값(가격)을 첫번째 객체의 price에 저장.
																		//이떄 그 값은 문자열 타입(String) 이므로 int형 으로 변환시켜서 저장한다.
			goodsArray[i].setCountStock(Integer.parseInt(infos[2]));	//문자열 배열(infos[])의 세번째 값(재고 수)을 첫번째 객체의 countStock에 저장.
			
		}																//이 과정을 세번 반복한다.
			
		for(int i = 0 ; i < 3 ; i++){
			goodsArray[i].printInfo();		//각 객체의 정보를 출력 한다. (총 3번)
		}

		
		
		scanner.close();
	}
}
