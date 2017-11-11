public class Refrigerante 
{
	private int quantidade = 0;
	private int valorRefri = 1;
	public Refrigerante(int quantidade) 
	{
		this.quantidade = quantidade;
	}

	public int getEstoque() 
	{
		return this.quantidade;
	}
    
	public int getValor() 
	{
		return this.valorRefri;
	}
	
	public boolean Venda() {
		if (this.quantidade > 0 && this.valorRefri >=1) 
		{
			quantidade--;
			return true;
		} 
		else 
		{
			return false;
		}
	}
}