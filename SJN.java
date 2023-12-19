package sjn;


public class SJN {
	
	public static void main(String[] args) {
		
		String processi []= new String[4];
		
		int tempiArrivo []= new int[4];
		int tempiServizio[] = new int [4];
		int tempiAttesa[] = new int [4];
		int tempiEsecuzione[] = new int [4];
		int media=0;
		int somma=0;
		int appoggio;
		
		tempiEsecuzione[0] = 5;
		tempiEsecuzione[1] = 3;
		tempiEsecuzione[2] = 8;
		tempiEsecuzione[3] = 6;
		
		
		
		for(int i=0; i < 4; i++) {
			   processi[i] = "P"+i;
			   tempiArrivo[i] = i;
		}
		 String appoggioNome="";
		int appoggioArrivo=0;
		for (int s=0; s <= 2; s++) {
			for(int posizione=2;posizione>=s;posizione--){
			    if(tempiEsecuzione[posizione]>tempiEsecuzione[posizione+1]){
			      appoggio=tempiEsecuzione[posizione];
			      tempiEsecuzione[posizione]=tempiEsecuzione[posizione+1];
			      tempiEsecuzione[posizione+1]=appoggio;
			      
			      appoggioNome=processi[posizione];
			      processi[posizione]=processi[posizione+1];
			      processi[posizione+1]=appoggioNome;
			      
			      appoggioArrivo=tempiArrivo[posizione];
			      tempiArrivo[posizione]=tempiArrivo[posizione+1];
			      tempiArrivo[posizione+1]=appoggioArrivo;
			    }
			}
		}
		
		tempiServizio[0]=0;
		tempiServizio[1]=tempiServizio[0]+tempiEsecuzione[0];
		tempiServizio[2]=tempiServizio[1]+tempiEsecuzione[1];
		tempiServizio[3]=tempiServizio[2]+tempiEsecuzione[2];
		
		for(int i=0; i<processi.length;i++) {
			tempiAttesa[i]=tempiServizio[i]-tempiArrivo[i];
		}
		
		for(int k=0; k<4; k++) {
			tempiAttesa[k]=tempiServizio[k]-tempiArrivo[k];
		}
		
		for(int l=0; l<4; l++) {
			somma=somma+tempiAttesa[l];
		}
		
		media=somma/4;
		
		for (int d=0; d<4; d++) {
			System.out.println(processi[d]+ " | "+tempiArrivo[d]+ " | "
			+tempiEsecuzione[d]+" | "+tempiServizio[d]+" | "+tempiAttesa[d]);
		}
		System.out.println("la media dei tempi di attesa è: "+media);
	}
}


