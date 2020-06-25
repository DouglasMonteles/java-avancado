package br.com.digital.innovation.one.async_sync;

public class Threads {
	
	/*
	 * Síncrono:   é preciso que um processo termine para que outro começe
	 * Assíncrono: os processos são realizados simuntaneamente
	 * */
	
	public static void main(String[] args) {
		
		BarraCarregando2 carregando2 = new BarraCarregando2();
		BarraCarregando2 carregando22 = new BarraCarregando2();
		
		carregando2.start();
		carregando22.start();
		
	}

}

class GerarPDF implements Runnable {
	@Override
	public void run() {
		System.out.println("Gerar PDF");
	}
}

class BarraCarregando implements Runnable {
	@Override
	public void run() {
		System.out.println("Loading...");
	}
}

class BarraCarregando2 extends Thread {
	@Override
	public void run() {
		super.run();
		System.out.println("Name: " + this.getName());
	}
}
