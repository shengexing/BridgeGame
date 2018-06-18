package entity;

/**
 * 扑克牌卡牌的类
 * @author Time
 *
 */
public class Card {
	
	private int code;			// 卡牌编号（0~51）

	public Card() {
		super();
	}

	public Card(int code) {
		super();
		this.code = code;
	}
	

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}
	

	@Override
	public String toString() {
		int c = code % 4, n = code % 13;
		String color = "", number = "";
		
		// 匹配扑克牌的花色
		switch (c) {
			case 0: color = "梅花"; break;
			case 1: color = "方片"; break;
			case 2: color = "红桃"; break;
			case 3: color = "黑桃"; break;
			default: break;
		}
		
		// 匹配扑克牌的点数
		switch (n) {
		case 0: number = "2"; break;
		case 1: number = "3"; break;
		case 2: number = "4"; break;
		case 3: number = "5"; break;
		case 4: number = "6"; break;
		case 5: number = "7"; break;
		case 6: number = "8"; break;
		case 7: number = "9"; break;
		case 8: number = "10"; break;
		case 9: number = "J"; break;
		case 10: number = "Q"; break;
		case 11: number = "K"; break;
		case 12: number = "A"; break;
		default: break;
	}
		
		return "Card[" + color + number + "]";
	}

	/**
	 * 
	 * @return
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
