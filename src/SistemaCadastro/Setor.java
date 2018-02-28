package SistemaCadastro;

import java.util.ArrayList;


public class Setor {
    private int Codigo;
    private String Nome;
    ArrayList<Colaborador> ListaSet;

    public Setor() {
        ListaSet = new ArrayList();
    }

    public Setor(int Codigo, String Nome) {
        this.Codigo = Codigo;
        this.Nome = Nome;
        ListaSet = new ArrayList();
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public ArrayList<Colaborador> getListaColabr() {
        return ListaSet;
    }

    public void setListaSet(ArrayList<Colaborador> ListaColabr) {
        this.ListaSet = ListaColabr;
    }
    
    public void addSet(Colaborador F){
        F.setSet(this);
        ListaSet.add(F);
    }
}
