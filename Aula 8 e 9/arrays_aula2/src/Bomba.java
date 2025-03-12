public class Bomba {
    int ativa;
    int visitada = 0;

    boolean explosao(Bomba tentativa){
        if(tentativa.ativa == 1){
            return true;
        }

        return false;
    }
}
