package atletas;

public interface Ciclista {
    public default String haceBici(){
            return "es un atleta que compite en ciclismo";
    }
    
}
