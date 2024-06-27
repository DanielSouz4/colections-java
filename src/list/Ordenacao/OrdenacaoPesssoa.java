package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPesssoa {
    private List<Pessoa> pessoaList;

    public OrdenacaoPesssoa() {
        this.pessoaList = new ArrayList<>();
    }
    public void adicionarPessoa(String nome,int idade,float altura){
        pessoaList.add(new Pessoa(nome,idade,altura));
    }
    public List<Pessoa>ordenarPorIdade(){
        List<Pessoa>pessoaPorIdade=new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorIdade);
        return pessoaPorIdade;
    }
    public List<Pessoa>ordenacaoPorAltura(){
        List<Pessoa>pessoaPorAltura=new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorAltura,new ComparatoPorAltura());
        return pessoaPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPesssoa ordenacaoPesssoa = new OrdenacaoPesssoa();
        ordenacaoPesssoa.adicionarPessoa("jose",24, 1.80f);
        ordenacaoPesssoa.adicionarPessoa("Daniel",28,1.68f);
        ordenacaoPesssoa.adicionarPessoa("Patricia",17,1.65f);

        ordenacaoPesssoa.ordenarPorIdade();






    }

}
