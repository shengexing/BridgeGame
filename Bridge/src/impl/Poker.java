package impl;

import java.util.Random;
import entity.Card;

/**
 * 叫牌回合信息的类
 * @author Time
 *
 */
public class Poker {
	
	static Card[] pokerN = new Card[13];	// 北家的手牌
	static Card[] pokerE = new Card[13];	// 东家的手牌
	static Card[] pokerS = new Card[13];	// 南家的手牌
	static Card[] pokerW = new Card[13];	// 西家的手牌
	static Card[] pokerALL = new Card[52];	// 52张扑克牌
	
	
	/**
	 * Poker 的 GET&SET 方法
	 * @return
	 */
	public static Card[] getPokerN() {
		return pokerN;
	}

	public static void setPokerN(Card[] pokerN) {
		Poker.pokerN = pokerN;
	}

	public static Card[] getPokerE() {
		return pokerE;
	}

	public static void setPokerE(Card[] pokerE) {
		Poker.pokerE = pokerE;
	}

	public static Card[] getPokerS() {
		return pokerS;
	}

	public static void setPokerS(Card[] pokerS) {
		Poker.pokerS = pokerS;
	}

	public static Card[] getPokerW() {
		return pokerW;
	}

	public static void setPokerW(Card[] pokerW) {
		Poker.pokerW = pokerW;
	}

	public static Card[] getPokerALL() {
		return pokerALL;
	}

	public static void setPokerALL(Card[] pokerALL) {
		Poker.pokerALL = pokerALL;
	}

	/**
	 * 初始化52张扑克牌
	 */
	static {
		for(int i = 0; i < 52; i++) {
			pokerALL[i] = new Card(i);
		}
	}
	
	/**
	 * 打印所有的扑克牌
	 */
	public static void printALLCards() {
		for(int i = 0; i < 52; i++) {
			System.out.print(pokerALL[i].toString() + "  ");
			if(i % 13 == 12) System.out.println();
		}
	}
	
	/**
	 * 打印玩家的手牌
	 * @param position 玩家的位置
	 */
	public static void printPlayerCards(int position) {
		/* 打印北家的手牌*/
		if(position == 0) {
			System.out.print("北家的手牌：");
			for(int i = 0; i < 13; i++) System.out.print(pokerN[i].toString() + "  ");
			System.out.println();
		}
			
		/* 打印东家的手牌*/
		if(position == 1) {
			System.out.print("东家的手牌：");
			for(int i = 0; i < 13; i++) System.out.print(pokerE[i].toString() + "  ");
			System.out.println();
		}
		
		/* 打印南家的手牌*/
		if(position == 2) {
			System.out.print("南家的手牌：");
			for(int i = 0; i < 13; i++) System.out.print(pokerS[i].toString() + "  ");
			System.out.println();
		}
		
		/* 打印西家的手牌*/
		if(position == 3) {
			System.out.print("西家的手牌：");
			for(int i = 0; i < 13; i++) System.out.print(pokerW[i].toString() + "  ");
			System.out.println();
		}
	}
	
	/**
	 * 洗牌的函数
	 * @param args
	 */
	public static void shuffle() {
        Random random = new Random();
        
        /* 洗牌的循环*/
        for(int i = 0;i < 52;i++) {
            int index = random.nextInt(52);	// index 产生0~51之间的随机数
            int code_i = pokerALL[i].getCode(), code_index = pokerALL[index].getCode();
            pokerALL[i].setCode(code_index);
            pokerALL[index].setCode(code_i);
        }
	}
	
	/**
	 * 发牌的方法
	 * @param position 先发牌玩家的位置
	 */
	public static void licensing(int position) {
		shuffle();	// 发牌之前先洗牌
		
		/* 先给北家发牌*/
		if(position == 0)
			for(int i = 0; i < 13; i++) {
				pokerN[i] = pokerALL[i * 4];
				pokerE[i] = pokerALL[i * 4 + 1];
				pokerS[i] = pokerALL[i * 4 + 2];
				pokerW[i] = pokerALL[i * 4 + 3];
			}
		
		/* 先给东家发牌*/
		if(position == 1)
			for(int i = 0; i < 13; i++) {
				pokerE[i] = pokerALL[i * 4];
				pokerS[i] = pokerALL[i * 4 + 1];
				pokerW[i] = pokerALL[i * 4 + 2];
				pokerN[i] = pokerALL[i * 4 + 3];
			}
		
		/* 先给南家发牌*/
		if(position == 2)
			for(int i = 0; i < 13; i++) {
				pokerS[i] = pokerALL[i * 4];
				pokerW[i] = pokerALL[i * 4 + 1];
				pokerN[i] = pokerALL[i * 4 + 2];
				pokerE[i] = pokerALL[i * 4 + 3];
			}
		
		/* 先给西家发牌*/
		if(position == 3)
			for(int i = 0; i < 13; i++) {
				pokerW[i] = pokerALL[i * 4];
				pokerN[i] = pokerALL[i * 4 + 1];
				pokerE[i] = pokerALL[i * 4 + 2];
				pokerS[i] = pokerALL[i * 4 + 3];
			}
		
	}
	
	/**
	 * 整理玩家的手牌
	 * @param position 玩家的位置
	 */
	public static void sortPlayerCards(int position) {
		/* 整理北家的手牌*/
		if(position == 0) sortCards(pokerN);
		
		/* 整理东家的手牌*/
		if(position == 1) sortCards(pokerE);
		
		/* 整理南家的手牌*/
		if(position == 2) sortCards(pokerS);
		
		/* 整理西家的手牌*/
		if(position == 3) sortCards(pokerW);
	}
	
	/**
	 * 整理扑克牌的方法
	 * @param cards 需要整理的扑克牌
	 */
	public static void sortCards(Card[] cards) {
		int len = cards.length;
		
		/* 使用冒泡排序*/
		Card temp = null;
		for(int i = len - 1; i > 0; i--) {
			for(int j = 0; j < i; ++j) {
				int code_j = cards[j].getCode(), color_j = code_j % 4, number_j = code_j % 13;
				int code_j1 = cards[j + 1].getCode(), color_j1 = code_j1 % 4, number_j1 = code_j1 % 13;
				if(color_j1 < color_j) {temp = cards[j]; cards[j] = cards[j + 1]; cards[j + 1] = temp;}
				if(color_j1 == color_j && number_j1 > number_j) {temp = cards[j]; cards[j] = cards[j + 1]; cards[j + 1] = temp;}
			}
		}
	}

	/**
	 * 用于测试的主方法
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("52张起始扑克牌：");
		Poker.printALLCards();
		Poker.licensing(0);	// 先给北家发牌
		System.out.println("洗牌后的52张扑克牌：");
		Poker.printALLCards();
		System.out.println("四位玩家的起始手牌：");
		for(int i = 0; i < 4; i++) Poker.printPlayerCards(i);
		System.out.println("整理后四位玩家的手牌：");
		for(int i = 0; i < 4; i++) { Poker.sortPlayerCards(i); Poker.printPlayerCards(i);}
	}

}
