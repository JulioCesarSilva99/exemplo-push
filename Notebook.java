package exercicios10;

public class Notebook implements Dispositivo {
	
	private String modelo;
	private int bateria;
	private boolean conectado;
	public Notebook(String modelo, int bateria, boolean conectado) {
		super();
		this.modelo = modelo;
		this.bateria = bateria;
		this.conectado = conectado;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getBateria() {
		return bateria;
	}
	public void setBateria(int bateria) {
		this.bateria = bateria;
	}
	public boolean isConectado() {
		return conectado;
	}
	public void setConectado(boolean conectado) {
		this.conectado = conectado;
	}
	@Override
	public boolean ligar() {
		// TODO Auto-generated method stub
		if(conectado || bateria >10) {
			return true;
		}
		return false;
	}
	@Override
	public boolean desligar() {
		// TODO Auto-generated method stub
		return ligar();
	}
	@Override
	public String obterStatus() {
		// TODO Auto-generated method stub
		return modelo + ", esta com "+ bateria+"% de bateria " + conectado;
	}
	

}
