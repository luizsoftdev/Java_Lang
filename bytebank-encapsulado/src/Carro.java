public class Carro{
    private int ano;
    private String modelo;
    private double preco;

    public Carro(int ano, String modelo, double preco){
        if(ano >= 1891){
            this.ano = ano;
        }else{
            System.out.println("O ano informado está inválido. Por isso usaremos 2017!");
            this.ano = 2017;
        }

        if( modelo != null){
            this.modelo = modelo;
        }else{
            System.out.println("O modelo não foi informado. Por isso usaremos Gol!");
            this.modelo = "Gol";
        }

        if(preco > 0){
            this.preco = preco;
        }else{
            System.out.println("O preço não é válido. Por isso usaremos 40000.0!");
            this.preco = 40000.0;
        }
    }

    //No Java é possível fazer a chamada de um construtor dentro de outro e
    // faz-se isso para evitar duplicações de códigos e regras. Afinal uma regra aplicada em um
    // construtor normalmente será a mesma para o outro caso. Para isso usa-se o this( ) passando os
    // parâmetros correspondentes ao construtor que se queira chamar.
    public Carro(String modelo, double preco){
        this(2017, modelo, preco);
    }

    //getters e setters omitidos

}