import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TarefaStreamLambda {
    public static void main(String[] args) {

        List<String> pessoas = Stream.of(
                "João, m",
                "Pedro, m",
                "Lucas, m",
                "Miguel, m",
                "Gabriel, m",
                "Ana, f",
                "Mariana, f",
                "Julia, f",
                "Maria, f",
                "Camila, f"
        ).collect(Collectors.toList());

        List<String> mulheres = pessoas.stream()
                .filter(pessoa -> pessoa.split(", ")[1].equalsIgnoreCase("f"))
                .collect(Collectors.toList());

        System.out.println("Lista de mulheres:");
        mulheres.forEach(System.out::println);
    }
}
