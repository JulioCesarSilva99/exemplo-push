package exercicios10;

public class Computador implements Dispositivo {
	
	private String modelo;
	private boolean conectado;
	
	public Computador(String modelo, boolean conectado) {
		super();
		this.modelo = modelo;
		this.conectado = conectado;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public boolean isConectado() {
		return conectado;
	}

	public void setConectado(boolean conectado) {
		this.conectado = conectado;
	}

	@Override
	public  boolean ligar() {
		return conectado;
	}

	@Override
	public boolean desligar() {
		// TODO Auto-generated method stub
		return ligar();
	}

	@Override
	public String obterStatus() {
		// TODO Auto-generated method stub
		return modelo + conectado;
		
	}
	
	
	
	
}
