package com.kh.hsw;

import java.util.Scanner;

public class CharacterFunction {
	Character[] characters;

	public CharacterFunction() {
		characters = new Character[1];
	}

	public int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("====== 캐릭터 관리 프로그램 =====");
		System.out.println("1. 캐릭터 정보 입력");
		System.out.println("2. 캐릭터 정보 출력");
		System.out.println("3. 장비 추가하기");
		System.out.println("4. 프로그램 종료");
		System.out.print("메뉴 입력 : ");
		int menu = sc.nextInt();
		return menu;
	}

	public void inputCharacter() {
		for (int i = 0; i < characters.length; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("===== " + (i + 1) + "번째 캐릭터 정보 입력 =====");
			System.out.print("캐릭터 이름 입력 : ");
			String name = sc.next();
			System.out.print("캐릭터 직업 입력 : ");
			String job = sc.next();
			System.out.println("캐릭터 능력치 입력 ");
			System.out.print("STR : ");
			int strength = sc.nextInt();
			System.out.print("DEX : ");
			int dexterity = sc.nextInt();
			System.out.print("INT : ");
			int intelligence = sc.nextInt();
			System.out.print("LUK : ");
			int lucky = sc.nextInt();
			characters[i] = new Character();
			characters[i].setName(name);
			characters[i].setJob(job);
			characters[i].setStrength(strength);
			characters[i].setDexterity(dexterity);
			characters[i].setIntelligence(intelligence);
			characters[i].setLucky(lucky);
		}
	}

	public void printCharacter() {
		System.out.println();
		System.out.println("===== 캐릭터 정보 출력 =====");
		for (int i = 0; i < characters.length; i++) {
			System.out.println("♡" + characters[i].getName() + "♡ 의 정보 ");
			System.out.println("직업 : " + characters[i].getJob());
			System.out.println("------능력치------");
			System.out.print("[STR] : ");
			for (int j = 0; j < characters[i].getStrength(); j++) {
				System.out.print("●");
			}
			System.out.println();
			System.out.print("[DEX] : ");
			for (int j = 0; j < characters[i].getDexterity(); j++) {
				System.out.print("●");
			}
			System.out.println();
			System.out.print("[INT] : ");
			for (int j = 0; j < characters[i].getIntelligence(); j++) {
				System.out.print("●");
			}
			System.out.println();
			System.out.print("[LUK] : ");
			for (int j = 0; j < characters[i].getLucky(); j++) {
				System.out.print("●");
			}
			System.out.println();
			System.out.println("------------------");
			System.out.println();

//			System.out.println("[STR] : " + characters[i].getStrength()); //숫자만 출력하기
//			System.out.println("[DEX] : " + characters[i].getDexterity());
//			System.out.println("[INT] : " + characters[i].getIntelligence());
//			System.out.println("[LUK] : " + characters[i].getLucky());

		}
	}

	public void plusGear() {
		Scanner sc = new Scanner(System.in);
		System.out.println("캐릭터 번호와 추가할 장비를 입력하세요");
		System.out.print("캐릭터 번호 : ");
		int num = sc.nextInt();
		System.out.println("===== 장비 목록 =====");
		System.out.println("1. 행운의 모자 (STR 5 증가)");
		System.out.println("2. 투명 망토 (DEX 2 증가)");
		System.out.println("3. 금반지 (INT 5 증가)");
		System.out.println("4. 흰색 스니커즈 (LUK 3 증가)");
		System.out.print("장착할 장비 번호 : ");
		int gearNum = sc.nextInt();

		switch (gearNum) {
		case 1:
			characters[num-1].setStrength(characters[num-1].getStrength()+5);
			System.out.println();
			System.out.println("♥"+characters[num-1].getName()+"의 STR가 5만큼 증가하였습니다!♥");
			break;
		case 2:
			characters[num-1].setDexterity(characters[num-1].getDexterity()+2);
			System.out.println();
			System.out.println("♥"+characters[num-1].getName()+"의 DEX가 2만큼 증가하였습니다!♥");
			break;
		case 3:
			characters[num-1].setIntelligence(characters[num-1].getIntelligence()+5);
			System.out.println();
			System.out.println("♥"+characters[num-1].getName()+"의 INT가 5만큼 증가하였습니다!♥");
			break;
		case 4:
			characters[num-1].setLucky(characters[num-1].getLucky()+3);
			System.out.println();
			System.out.println("♥"+characters[num-1].getName()+"의 LUK가 2만큼 증가하였습니다!♥");
			break;

		}

	}

	public void printGoodBye() {
		System.out.println("Good Bye");
	}

	public void printException() {
		System.out.println("1~3 사이의 숫자를 입력해주세요");
	}

}
