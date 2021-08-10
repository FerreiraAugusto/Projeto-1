import java.util.Random;

public class random {
	private int alternativa1,
	alternativa2,
	alternativa3,
	alternativa4,// essa cria os randon q eu uso
	fator1,
	fator2,
	CorrectAlter,
	loop=1;
	

	public random() {
		Random rand = new Random();
		fator1= rand.nextInt(8)+1;
		fator2= rand.nextInt(8)+1;
		CorrectAlter = fator1*fator2;
		do {
        	alternativa1 = rand.nextInt(80)+1;
        	alternativa2 = rand.nextInt(80)+1;
        	alternativa3 = rand.nextInt(80)+1;
        	alternativa4 = rand.nextInt(80)+1; 
        	if(alternativa1!= alternativa2 && alternativa2!=alternativa3 && alternativa3!=alternativa4 && alternativa4 != CorrectAlter) {
        		loop=0;
        	}
        }while(loop==1);
		
		int t = rand.nextInt(3);
		
		if(t==0) {
			alternativa1= CorrectAlter;
		}
		else if(t==1) {
			alternativa2= CorrectAlter;
		}

		else if(t==2) {
			alternativa3= CorrectAlter;
		}

		else if(t==3) {
			alternativa4= CorrectAlter;
		}



	}
	public String  getCorrectAlter() {
		return Integer.toString(CorrectAlter);
	}
	public String getAlternativa1() {
		return Integer.toString(alternativa1);
	}

	public String getAlternativa2() {
		return Integer.toString(alternativa2);
	}
	public String getAlternativa3() {
		
		return Integer.toString(alternativa3);
	}
	public String getAlternativa4() {
		
		return Integer.toString(alternativa4);
	}
	public String getFator1() {
		return Integer.toString(fator1);
	}
	public String getFator2() {
		return Integer.toString(fator2);
	}
	//aqui eu só uso os getters pq eu so preciso pegar os valores
	
	}


