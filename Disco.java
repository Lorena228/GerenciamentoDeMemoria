import java.util.ArrayList;
import java.util.List;

public class Disco {
    private List<String> processosArmazenados;

    public Disco(List<String> processosArmazenados) {
        this.processosArmazenados = processosArmazenados;
    }

    public synchronized String processoJaArmazenado(String processo) {
        for(int i = 0; i < processosArmazenados.size();i++){
            if(processosArmazenados.get(i).equals(processo)){
                System.out.println("Processo "+ processo +" regastado do disco");
                return processo;
            }
        }
        System.out.println("Processo não está no disco");
        return "false";

    }

    public synchronized void preencheDisco(String processo) { //synchronized pra evitar o acesso das duas threads ao mesmo tempo ao array e dar erro de concorrência
        processosArmazenados.add(processo);

        System.out.println("Processo " + processo + " adicionado no disco");
    }
}
