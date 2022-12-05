package com.kh.hsw;

import java.util.Scanner;

public class CharacterFunction {
	Character[] characters;

	public CharacterFunction() {
		characters = new Character[1];
	}

	public int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("====== ĳ���� ���� ���α׷� =====");
		System.out.println("1. ĳ���� ���� �Է�");
		System.out.println("2. ĳ���� ���� ���");
		System.out.println("3. ��� �߰��ϱ�");
		System.out.println("4. ���α׷� ����");
		System.out.print("�޴� �Է� : ");
		int menu = sc.nextInt();
		return menu;
	}

	public void inputCharacter() {
		for (int i = 0; i < characters.length; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("===== " + (i + 1) + "��° ĳ���� ���� �Է� =====");
			System.out.print("ĳ���� �̸� �Է� : ");
			String name = sc.next();
			System.out.print("ĳ���� ���� �Է� : ");
			String job = sc.next();
			System.out.println("ĳ���� �ɷ�ġ �Է� ");
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
		System.out.println("===== ĳ���� ���� ��� =====");
		for (int i = 0; i < characters.length; i++) {
			System.out.println("��" + characters[i].getName() + "�� �� ���� ");
			System.out.println("���� : " + characters[i].getJob());
			System.out.println("------�ɷ�ġ------");
			System.out.print("[STR] : ");
			for (int j = 0; j < characters[i].getStrength(); j++) {
				System.out.print("��");
			}
			System.out.println();
			System.out.print("[DEX] : ");
			for (int j = 0; j < characters[i].getDexterity(); j++) {
				System.out.print("��");
			}
			System.out.println();
			System.out.print("[INT] : ");
			for (int j = 0; j < characters[i].getIntelligence(); j++) {
				System.out.print("��");
			}
			System.out.println();
			System.out.print("[LUK] : ");
			for (int j = 0; j < characters[i].getLucky(); j++) {
				System.out.print("��");
			}
			System.out.println();
			System.out.println("------------------");
			System.out.println();

//			System.out.println("[STR] : " + characters[i].getStrength()); //���ڸ� ����ϱ�
//			System.out.println("[DEX] : " + characters[i].getDexterity());
//			System.out.println("[INT] : " + characters[i].getIntelligence());
//			System.out.println("[LUK] : " + characters[i].getLucky());

		}
	}

	public void plusGear() {
		Scanner sc = new Scanner(System.in);
		System.out.println("ĳ���� ��ȣ�� �߰��� ��� �Է��ϼ���");
		System.out.print("ĳ���� ��ȣ : ");
		int num = sc.nextInt();
		System.out.println("===== ��� ��� =====");
		System.out.println("1. ����� ���� (STR 5 ����)");
		System.out.println("2. ���� ���� (DEX 2 ����)");
		System.out.println("3. �ݹ��� (INT 5 ����)");
		System.out.println("4. ��� ����Ŀ�� (LUK 3 ����)");
		System.out.print("������ ��� ��ȣ : ");
		int gearNum = sc.nextInt();

		switch (gearNum) {
		case 1:
			characters[num-1].setStrength(characters[num-1].getStrength()+5);
			System.out.println();
			System.out.println("��"+characters[num-1].getName()+"�� STR�� 5��ŭ �����Ͽ����ϴ�!��");
			break;
		case 2:
			characters[num-1].setDexterity(characters[num-1].getDexterity()+2);
			System.out.println();
			System.out.println("��"+characters[num-1].getName()+"�� DEX�� 2��ŭ �����Ͽ����ϴ�!��");
			break;
		case 3:
			characters[num-1].setIntelligence(characters[num-1].getIntelligence()+5);
			System.out.println();
			System.out.println("��"+characters[num-1].getName()+"�� INT�� 5��ŭ �����Ͽ����ϴ�!��");
			break;
		case 4:
			characters[num-1].setLucky(characters[num-1].getLucky()+3);
			System.out.println();
			System.out.println("��"+characters[num-1].getName()+"�� LUK�� 2��ŭ �����Ͽ����ϴ�!��");
			break;

		}

	}

	public void printGoodBye() {
		System.out.println("Good Bye");
	}

	public void printException() {
		System.out.println("1~3 ������ ���ڸ� �Է����ּ���");
	}

}
