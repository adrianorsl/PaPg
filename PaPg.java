import java.util.Arrays;

public class PaPg {

	private double a1, resultado;
	private double razao;
	private int quantidade;
	private Menu tipo;
	double[] x;
	

	public double resultado() {
	    x = new double[quantidade];
		switch (tipo) {
	 	  case Pa:
	 		 resultado = a1;
	 		 for (int i = 0; i < quantidade; i++) {
	 			resultado += razao; 
	            x[i] = resultado;
	 		}break;
	 	  case Pg:
	 		 resultado = a1;
	 		 for (int i = 0; i < quantidade; i++) {
	 			 resultado *= razao;
	 			 x[i] = resultado;
	 			 
	 		}break;
		}
		return resultado;
		
	}
	
	public double media() {
		double media = 0;
		for (int i = 0; i < quantidade; i++) {
			media += x[i];
		}
		return media / quantidade;
	}
	
	public double somatoria() {
		double somatoria = 0;
		for (int i = 0; i < quantidade; i++) {
			somatoria  += x[i];
		}
		return somatoria;
	}
	
	public double mediana() {
		if (quantidade % 2 == 0) {
			int y = quantidade / 2;
			return (x[y-1] + x[y]) / 2;
		}else {
			int y = (quantidade / 2) + 1;
			return x[y];
		}
	}
	
    public String progressão() {
    	double a, b, c, d = 0;
    	String resposta = null ;
		for(int i = 0; i < quantidade; i++) {
    		a = x[i+1];
    		b = x[i];
    		c = a - b;
    		d = x[i+2] - a;
    		if (d == c) {
    			return resposta = "Pa";
    		}else {
    			return resposta = "Pg";
    		}
    		
    	}
		return resposta;
    	 
    	
    	
    }
	
	public double[] getX() {
		return x;
	}

	public void setX(double[] x) {
		this.x = x;
	}

	public double getA1() {
		return a1;
	}


	public void setA1(double a1) {
		this.a1 = a1;
	}

	public double getRazao() {
		return razao;
	}

	public void setRazao(double razao) {
		this.razao = razao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public double getResultado() {
		return resultado;
	}

	public void setResultado(double resultado) {
		this.resultado = resultado;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	
	public Menu getTipo() {
		return tipo;
	}

	public void setTipo(Menu tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "PaPg [a1=" + a1 + ", resultado=" + resultado() + ", razao=" + razao + ", quantidade=" + quantidade
				+ ", tipo=" + tipo + ", x=" + Arrays.toString(x) + ", Somatoria=" + somatoria() + ", Media=" + media() + ", Mediana=" 
				+ mediana() + ", Qual e a Progessão? " + progressão() + "]";
	}
	
}