package concessionaria;

public class carro {

    private String marca;
    private String modelo;
    private int ano;
    private double preco;


    public carro(String marcaCarro, String modeloCarro, int anoCarro, double precoCarro){

        marca = marcaCarro;
        modelo = modeloCarro;
        ano = anoCarro;
        preco = precoCarro;
    }


    public String getMarca(){
        return marca;
    }

    public String getModelo(){
        return modelo;
    }

    public void setModelo(String modeloCarro){
        modelo = modeloCarro;
    }

    public int getAno(){
        return ano;
    }

    public void setAno(int anoCarro){
        ano = anoCarro;
    }


    public double getPreco(){
        return preco;
    }

    public void setPreco(double precoCarro){
        preco = precoCarro;
    }
}
