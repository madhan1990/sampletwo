package org.lang;

public class StateDetails {
public void southIndia() {
	System.out.println("India: South");
}
public void northIndia() {
	System.out.println("India:  North");
}

public static void main(String[] args) {
	LanguageInfo L = new LanguageInfo();
	StateDetails S = new StateDetails();
	L.englishLanguage();
	L.hindiLanguage();
	L.tamilLanguage();
	S.northIndia();
	S.southIndia();
	}
}
