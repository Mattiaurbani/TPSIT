package fcfs;

public class FcFs {

public static void main(String[] args) {
		
	String processi []= new String[4];
	
	int tempiArrivo []= new int[4];
	int tempiServizio[] = new int [4];
	int tempiAttesa[] = new int [4];
	int tempiEsecuzione[] = new int [4];
	int media=0;
	int somma=0;
	
	tempiEsecuzione[0] = 5;
	tempiEsecuzione[1] = 3;
	tempiEsecuzione[2] = 8;
	tempiEsecuzione[3] = 6;
	
	
	
	for(int i=0; i < 4; i++) {
		   processi[i] = "P"+i;
		   tempiArrivo[i] = i;
	}
	
	tempiServizio[0] = 0;
	
	for(int j=1; j<4; j++) {
		tempiServizio[j]= tempiServizio[j-1]+tempiEsecuzione[j-1];
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
