public class Salgado 
{
	private int quantidade = 0;
	private float valorSalgado = (float) 2.50;
	public Salgado(int quantidade) 
	{
		this.quantidade = quantidade;
	}
	// ---------------------------------------------------------------
	public int getEstoque() 
	{
		return this.quantidade;
	}
       //------------------------------------------------------------------
	public float getValor() 
	{
		return this.valorSalgado;
	}
	// ---------------------------------------------------------------
	public boolean Venda() {
		if (this.quantidade > 0 && this.valorSalgado >=2.50) 
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