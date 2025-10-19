package att2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Att2 {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Escolha uma opção:");
        System.out.println("1 - Calculo de Formas Geometricas");
        System.out.println("2 - Sistema de Notificação");
        System.out.println("3 - Folha de Pagamento");
        System.out.println("4 - Sistema de Transporte");
        System.out.println("5 - Loja Virtual");
        int opcao = sc.nextInt();
        sc.nextLine();

        switch (opcao) {
            case 1:
                calcFormas.executar();
                break;
            case 2:
                notifiSystem.executar();
                break;
            case 3:
                Payroll.executar();
                break;
            case 4:
                transportsystem.executar();
                break;
            case 5:
                onlineStore.executar();
                break;
            default:
                System.out.println("invalido");
        }
    }
}

class Forma {
    public double calcularArea(){
        return 0;
    }
}
class Circulo extends Forma {
    private double raio;

    public Circulo(double raio){
        this.raio = raio;
    }
    @Override
    public double calcularArea() {
        return Math.PI*raio*raio;
    }
}

class Quadrado extends Forma {
    private double lado;

    public Quadrado(double lado){
        this.lado = lado;
    }

    @Override
    public double calcularArea(){
        return lado*lado;
    }
}

class Retangulo extends Forma {
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura){
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public double calcularArea(){
        return largura*altura;
    }
}

class Triangulo extends Forma {
    private double base;
    private double altura;

    public Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea(){
        return (base*altura)/2;
    }
}

class Trapezio extends Forma {
    private double baseMaior;
    private double baseMenor;
    private double altura;

    public Trapezio(double baseMaior, double baseMenor, double altura){
        this.baseMaior = baseMaior;
        this.baseMenor = baseMenor;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return ((baseMaior+baseMenor)*altura)/2;
    }
}

class calcFormas {
    public static void executar(){
        List<Forma> formas = new ArrayList<>();

        formas.add(new Circulo(7.0));
        formas.add(new Quadrado(6.0));
        formas.add(new Retangulo(10.0, 15.0));
        formas.add(new Triangulo(8.0, 7.0));
        formas.add(new Trapezio(6.0, 4.0, 5.0));

        for (Forma forma : formas) {
            System.out.printf("Área: %.2f%n", forma.calcularArea());
        }
    }
}

class Notificacao{
    public void enviar(){
    }
}
class EmailNotificacao extends Notificacao{
    @Override
    public void enviar(){
        System.out.println("Enviando por e-mail...");
    }
}
class SMSNotificacao extends Notificacao{
    @Override
    public void enviar(){
        System.out.println("Enviando SMS");
    }
}
class PushNotificacao extends Notificacao{
    @Override
    public void enviar(){
        System.out.println("Enviando notificação push");
    }
}

class notifiSystem {
    public static void executar(){
        List<Notificacao> noti = new ArrayList<>();

        noti.add(new EmailNotificacao());
        noti.add(new SMSNotificacao());
        noti.add(new PushNotificacao());

        for (Notificacao notificacao : noti){
            notificacao.enviar();
        }
    }
}

class Funcionario{
    protected String nome;
    protected double salario;

    public double calcularSalario(){
        return 0;
    }
}
class FuncionarioHorista extends Funcionario{
    private double horasTrabalhadas;
    private double valorPorHora;

    public FuncionarioHorista(String nome, double salario,double horasTrabalhadas, double valorPorHora){
        this.nome = nome;
        this.salario = salario;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorPorHora = valorPorHora;
    }
    @Override
    public double calcularSalario(){
       return (horasTrabalhadas*valorPorHora)+salario;
    }
}
class FuncionarioComissionado extends Funcionario{
    private double totalVendas;
    private double percentualComissao;

    public FuncionarioComissionado(String nome, double salario,double totalVendas, double percentualComissao){
        this.nome = nome;
        this.salario = salario;
        this.totalVendas = totalVendas;
        this.percentualComissao = percentualComissao;
    }
    @Override
    public double calcularSalario(){
        return (totalVendas*percentualComissao)+salario;
    }
}

class Payroll {
    public static void executar(){
        List<Funcionario> func = new ArrayList<>();

        func.add(new FuncionarioHorista("Carlos", 1440.0, 10.0, 6.0));
        func.add(new FuncionarioComissionado("Pedro", 1440.0, 10, 0.10));

        for (Funcionario funcionario : func){
            System.out.println("Nome: "+funcionario.nome +
                    " - Salário: R$ "+funcionario.calcularSalario());
        }
    }
}

class Transporte {
    protected String nome;

    public String getNome(){
        return nome;
    }

    public double calcularViagem(){
        return 0;
    }
}
class Carro extends Transporte{
    private double taxaDeCorrida;
    private double distanciakm;
    private double porkm;

    public Carro(String nome, double taxaDeCorrida, double distanciakm, double porkm){
        this.nome = nome;
        this.taxaDeCorrida = taxaDeCorrida;
        this.distanciakm = distanciakm;
        this.porkm = porkm;
    }
    @Override
    public double calcularViagem(){
        return (distanciakm*porkm)+taxaDeCorrida;
    }
}
class Onibus extends Transporte{
    private double passagem;

    public Onibus(String nome, double passagem){
        this.nome = nome;
        this.passagem = passagem;
    }
    @Override
    public double calcularViagem(){
        return passagem;
    }
}
class Bicicleta extends Transporte{
    private double aluguel;
    private double seguro;
    private double porHora;

    public Bicicleta(String nome, double aluguel, double seguro, double porHora){
        this.nome = nome;
        this.aluguel = aluguel;
        this.seguro = seguro;
        this.porHora = porHora;
    }
    @Override
    public double calcularViagem(){
        return (aluguel*porHora)+seguro;
    }
}

class transportsystem{
    public static void executar(){
        List<Transporte> trans = new ArrayList<>();

        trans.add(new Carro("Carro",20.0, 20, 2.0));
        trans.add(new Onibus("Onibus",4.60));
        trans.add(new Bicicleta("Bicicleta",10, 60.0, 5.0));
        System.out.println("Transportes Disponiveis:");

        for (Transporte trasporte : trans){
            System.out.println("Veiculos: "+trasporte.getNome()+" - Custo: R$ "+ trasporte.calcularViagem());
        }
    }
}

class Produtos {
    protected String nome;
    protected double desconto;
    protected double preco;

    public String getNome(){
        return nome;
    }
    public double calcularPreco(){
        return 0;
    }
}
class Eletronico extends Produtos{
    public Eletronico(String nome, double desconto, double preco){
        this.nome = nome;
        this.desconto = desconto;
        this.preco = preco;
    }
    @Override
    public double calcularPreco(){
        return preco-(preco*(desconto/100));
    }
}
class Vestuario extends Produtos{
    public Vestuario(String nome, double desconto, double preco){
        this.nome = nome;
        this.desconto = desconto;
        this.preco = preco;
    }
    @Override
    public double calcularPreco(){
        return preco-(preco*(desconto/100));
    }
}
class Alimenticio extends Produtos{
    public Alimenticio(String nome, double desconto, double preco){
        this.nome = nome;
        this.desconto = desconto;
        this.preco = preco;
    }
    @Override
    public double calcularPreco(){
        return preco-(preco*(desconto/100));
    }
}

class onlineStore{
    public static void executar(){
        List<Produtos> prod = new ArrayList<>();

        prod.add(new Eletronico("Geladeira",10.0, 1500.0));
        prod.add(new Vestuario("Vestido Florido", 20.0, 200.0));
        prod.add(new Alimenticio("Cartela de Ovo", 5.0, 30.0));

        for (Produtos produtos : prod){
            System.out.println("Produtos: "+produtos.getNome()+" Preço: R$ "+ produtos.calcularPreco());
        }
    }
}