package model;

public class Usuario {
	private int cod;
	private String login;
	private String nome;
	private char sex;
	
	public Usuario() {
		this.cod = -1;
		this.login = "";
		this.nome = "";
		this.sex = '*';
	}
	
	public Usuario(int cod, String login, String nome, char sex) {
		this.cod = cod;
		this.login = login;
		this.nome = nome;
		this.sex = sex;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "Usuario [codigo=" + cod + ", login=" + login + ", nome=" + nome + ", sex=" + sex + "]";
	}	
}
