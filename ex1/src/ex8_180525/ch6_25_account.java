package ex8_180525;

public class ch6_25_account {
private String ano;//계좌번호
private String owner;//예금주
private int balance;//잔액
//생성자 선언(언급이없으면 기본생산자)
public ch6_25_account(String ano,String owner,int balance) {
	this.ano=ano;
	this.owner=owner;
	this.balance=balance;
}
public String getAno() {
	return ano;
}
public void setAno(String ano) {
	this.ano = ano;
}
public String getOwner() {
	return owner;
}
public void setOwner(String owner) {
	this.owner = owner;
}
public int getBalance() {
	return balance;
}
public void setBalance(int balance) {
	this.balance = balance;
}

}
