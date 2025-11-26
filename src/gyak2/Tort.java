package gyak2;

public class Tort {
    private int szamlalo;
    private int nevezo;
    public Tort(int szamlalo, int nevezo){
        this.szamlalo = szamlalo;
        this.nevezo = nevezo;

    }

    public Tort(int szamlalo){
        this.szamlalo = szamlalo;
        this.nevezo = 1;
    }

    public Tort(){
        this.szamlalo = 0;
        this.nevezo = 1;
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("Tort [szamlalo = ");
        builder.append(this.szamlalo);
        builder.append(", nevezo = ");
        builder.append(this.nevezo);
        builder.append("]");
        return builder.toString();
    }
}
class Main{
    public static void main(String[] args) {
        Tort t1 = new Tort(2,3);
        Tort t2 = new Tort(3);
        Tort t3 = new Tort();

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
    }
}


