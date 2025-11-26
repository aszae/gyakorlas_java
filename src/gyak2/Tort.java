package gyak2;

public class TortBuilder {
    private int szamlalo;
    private int nevezo;
    public TortBuilder(int szamlalo, int nevezo){
        this.szamlalo = szamlalo;
        this.nevezo = nevezo;

    }

    public TortBuilder(int szamlalo){
        this.szamlalo = szamlalo;
        this.nevezo = 1;
    }

    public TortBuilder(){
        this.szamlalo = 0;
        this.nevezo = 1;
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("TortBuilder [szamlalo = ");
        builder.append(this.szamlalo);
        builder.append(", nevezo = ");
        builder.append(this.nevezo);
        builder.append("]");
        return builder.toString();
    }
}
class Main{
    public static void main(String[] args) {

    }
}


