package Controller;

public class ThreadPremioBilheteria extends Thread {
	private int qtComp;
	private int id;
	private static int qtIngresso = 100;
	private int pg = 0;
	
	public ThreadPremioBilheteria(int qtComp, int id){
		this.qtComp = qtComp;
		this.id = id;
	}
	
	public void run(){
		login();
		if(pg==0){
			comprar();
		}
		if(pg==0){
			validar();
		}
		
	}


	private void login() {
		// TODO Auto-generated method stub
		int qtlogin = (int)((Math.random()*1951)+ 50);
		try{
			sleep(qtlogin);
			
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
		if(qtlogin > 1000){
			System.out.println(id + "Recebeu um Timeout ao tentar fazer o login, depois de "+  + qtlogin + "ms");
			pg = -1;
		}
	}
	private void comprar(){
		int qtComp = (int)((Math.random()* 2000)+1000);
		try{
			sleep(qtComp);
			
		}
		catch (InterruptedException e){
			e.printStackTrace();
		}
		if(qtComp >2000){
			System.out.println(id + " Recebeu um timeout ao tentar comprar, depois de " + qtComp +"ms");
			pg= -1;
		}
	}
	private void validar(){
		if(qtIngresso >= qtComp){
			qtIngresso -=qtComp;
			System.out.println(id +" Você Conseguiu Comprar " + qtComp +" Os Ingressos");
			System.out.println(" Agora só restam: ;" + qtIngresso + " Ingresso");
		} 
		else{
			System.out.println(id + "Você não consegui Comprar os Ingressos o Suficiente Volte Mia Tarde");
		}
	}
	

}
