public class Venda 
{
   
    private Refrigerante coca = new Refrigerante(5);
    private Refrigerante guarana = new Refrigerante(5);
    private Refrigerante pepsi = new Refrigerante(5);
    private Salgado cheetos = new Salgado(9);
    private Salgado skini = new Salgado(9);
    private Salgado baconzitos = new Salgado(9);
    



    
    public String TemosCoca() 
    {
        if (this.coca.getEstoque() > 0) 
        {
            return "Temos Coca-Cola";
        } 
        else 
        {
            return "Desculpe sem Coca-Cola no Estoque!";
        }
    }
    
    public String TemosGuarana() 
    {
        if (this.guarana.getEstoque() > 0) 
        {
            return "Temos Guaraná";
        } 
        else 
        {
            return "Desculpe sem Guaraná no Estoque!";
        }
    }
    
    public String TemosPepsi() 
    {
        if (this.pepsi.getEstoque() > 0) 
        {
            return "Temos Pepsi";
        } 
        else 
        {
            return "Desculpe sem Pepsi no Estoque!";
        }
    }
    


    public String TemosCheetos() 
    {
        if (this.cheetos.getEstoque() > 0) 
        {
            return "Temos Cheetos";
        } 
        else 
        {
            return "Desculpe sem Cheetos no Estoque!";
        }
    }
    
    public String TemosSkini() 
    {
        if (this.skini.getEstoque() > 0) 
        {
            return "Temos Skini";
        } 
        else 
        {
            return "Desculpe sem Skini no Estoque!";
        }
    }
    
    public String TemosBaconzitos() 
    {
        if (this.baconzitos.getEstoque() > 0) 
        {
            return "Temos Baconzitos";
        } 
        else 
        {
            return "Desculpe sem Baconzitos no Estoque!";
        }
    }


}