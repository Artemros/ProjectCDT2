import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Graph {
    LinkedList<Vertex> vertices = new LinkedList<>();
    private Set<Character> a = Set.of('a');
    private Set<Character> b = Set.of('b');
    private Set<Character> c = Set.of('c');

    public Graph() {
        //vertices.add(new Vertex(1, List.of(new Edge(1, 2, plus), new Edge(1, 5, intSymbols), new Edge(1, 4, left), new Edge(1, 3, dot))));
        vertices.add(new Vertex(1, List.of(new Edge(1, 2, a))));
        vertices.add(new Vertex(1, List.of(new Edge(1, 8, b))));
        vertices.add(new Vertex(1, List.of(new Edge(2, 3, a))));
        vertices.add(new Vertex(1, List.of(new Edge(3, 4, c))));
        vertices.add(new Vertex(1, List.of(new Edge(3, 5, b))));
        vertices.add(new Vertex(1, List.of(new Edge(5, 3, a))));
        vertices.add(new Vertex(1, List.of(new Edge(4, 6, c))));
        vertices.add(new Vertex(1, List.of(new Edge(6, 7, b))));
        vertices.add(new Vertex(1, List.of(new Edge(7, 6, c))));
    }

    public Integer getSize() {
        return vertices.size();
    }
}