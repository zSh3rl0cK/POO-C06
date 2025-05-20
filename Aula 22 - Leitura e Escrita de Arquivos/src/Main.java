import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {
            List<String> conteudo_arquivo = Files.readAllLines(Paths.get("professores_disciplina.txt"));

            Map<String, String> professores_disciplinas = new HashMap<>();

            conteudo_arquivo.forEach((linha) -> {
                String[] linhaQuebrada = linha.split("=");
                professores_disciplinas.put(linhaQuebrada[0],linhaQuebrada[1].strip());
            });

            professores_disciplinas.forEach((professor, disciplina) -> {
                System.out.println("Professor: " + professor);
                System.out.println("Disciplina: " + disciplina + "\n");
            });
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}