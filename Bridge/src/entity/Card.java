package entity;

import entity.cardcontent.CardColor;
import entity.cardcontent.CardNumber;

/**
 * 定义扑克牌卡片的实体类
 * @author Time
 *
 */
public class Card {

	private CardNumber number;	// 扑克牌的点数
	private CardColor color;	// 扑克牌的花色
	private int code;			// 扑克牌的编码

	/**
	 * Card的缺省构造方法
	 */
	public Card() {
		number = null; color = null; code = -1;
	}

	public Card(int code) {
		setCode(code);
	}

	/**
	 * Card的含参构造方法
	 * @param number 扑克牌的点数
	 * @param color 扑克牌的花色
	 */
	public Card(CardNumber number, CardColor color) {
		this.number = number; this.color = color;
	}

	/**
	 * 获取Card的成员变量 number
	 * @return Card的成员变量 number(CardNumber)
	 */
	public CardNumber getNumber() {
		return number;
	}

	/**
	 * 设置Card的成员变量 number
	 * @param number 扑克牌的点数
	 */
	public void setNumber(CardNumber number) {
		this.number = number;
	}

	/**
	 * 获取Card的成员变量 color
	 * @return Card的成员变量 color(CardColor)
	 */
	public CardColor getColor() {
		return color;
	}

	/**
	 * 设置Card的成员变量 color
	 * @param color 扑克牌的花色
	 */
	public void setColor(CardColor color) {
		this.color = color;
	}

	/**
	 * 获取Card的成员变量 code
	 * @return Card的成员变量 code(int)
	 */
	public int getCode() {
		return code;
	}

	/**
	 * 设置Card的成员变量 code
	 * @param code 扑克牌的编码
	 */
	public void setCode(int code) {
		this.code = code;

		int number = code % 13, color = code % 4;	// 根据扑克牌的编码计算扑克牌的点数和花色

		/* 匹配扑克牌的点数*/
		switch (number) {
		case 0: setNumber(CardNumber.II); break;	// 点数2的代号为0
		case 1: setNumber(CardNumber.III); break;	// 点数3的代号为1
		case 2: setNumber(CardNumber.IV); break;	// 点数4的代号为2
		case 3: setNumber(CardNumber.V); break;		// 点数5的代号为3
		case 4: setNumber(CardNumber.VI); break;	// 点数6的代号为4
		case 5: setNumber(CardNumber.VII); break;	// 点数7的代号为5
		case 6: setNumber(CardNumber.VIII); break;	// 点数8的代号为6
		case 7: setNumber(CardNumber.IX); break;	// 点数9的代号为7
		case 8: setNumber(CardNumber.X); break;		// 点数10的代号为8
		case 9: setNumber(CardNumber.J); break;		// 点数J的代号为9
		case 10: setNumber(CardNumber.Q); break;	// 点数Q的代号为10
		case 11: setNumber(CardNumber.K); break;	// 点数K的代号为11
		case 12: setNumber(CardNumber.A); break;	// 点数A的代号为12
		default: break;
		}

		/* 匹配扑克牌的花色*/
		switch (color) {
		case 0: setColor(CardColor.Clubs); break;		// 梅花代号为0
		case 1: setColor(CardColor.Diamonds); break;	// 方片代号为1
		case 2: setColor(CardColor.Hearts); break;		// 红心代号为2
		case 3: setColor(CardColor.Spades); break;		// 黑桃代号为3
		default: break;
		}
	}

	@Override
	public String toString() {
		String result = "";
		
		int code = getCode(), number = code % 13, color = code % 4;
		
		/* 匹配扑克牌的花色*/
		switch (color) {
		case 0: result += "梅花"; break;		// 梅花代号为0
		case 1: result += "方片"; break;		// 方片代号为1
		case 2: result += "红心"; break;		// 红心代号为2
		case 3: result += "黑桃"; break;		// 黑桃代号为3
		default: break;
		}
		
		/* 匹配扑克牌的点数*/
		switch (number) {
		case 0: result += "2"; break;	// 点数2的代号为0
		case 1: result += "3"; break;	// 点数3的代号为1
		case 2: result += "4"; break;	// 点数4的代号为2
		case 3: result += "5"; break;	// 点数5的代号为3
		case 4: result += "6"; break;	// 点数6的代号为4
		case 5: result += "7"; break;	// 点数7的代号为5
		case 6: result += "8"; break;	// 点数8的代号为6
		case 7: result += "9"; break;	// 点数9的代号为7
		case 8: result += "10"; break;	// 点数10的代号为8
		case 9: result += "J"; break;	// 点数J的代号为9
		case 10: result += "Q"; break;	// 点数Q的代号为10
		case 11: result += "K"; break;	// 点数K的代号为11
		case 12: result += "A"; break;	// 点数A的代号为12
		default: break;
		}
		
		return result;
	}

	/**
	 * 
	 * @return
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
