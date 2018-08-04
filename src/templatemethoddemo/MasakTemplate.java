package templatemethoddemo;

public abstract class MasakTemplate {
	
	public final void masak(){
		siapkanPeralatan();
		siapkanBahan();
		olahBahan();
		sajikan();
	}
	
	public abstract void siapkanPeralatan();
	public abstract void siapkanBahan();
	public abstract void olahBahan();
	public abstract void sajikan();
	
}
