import java.util.Set;

public class Recognizer {
    Set<Character> allSymbols = Set.of('a', 'b', 'c');
    Integer count_ab = 0;
    Integer count_cb = 0;

    int nextState(int length, int numOfCurrState, String symbolsLane, int current) {
        Graph graph = new Graph();
        int answer = 0;
        if (numOfCurrState == length) {
            if (current == 4 || current == 7 || current == 8) {
                answer = 1;
            }
        } else {
            char i1 = symbolsLane.charAt(numOfCurrState);
            for (int i = 0; i < graph.getSize(); i++) {
                int begin = graph.vertices.get(i).edges.get(0).getBegin();
                if (begin == current) {
                    for (int j = 0; j < graph.vertices.get(i).getSize(); j++) {
                        int end = graph.vertices.get(i).edges.get(j).getEnd();
                        Character character = symbolsLane.charAt(numOfCurrState);
                        Set<Character> st = graph.vertices.get(i).edges.get(j).getState();
                        boolean contains = graph.vertices.get(i).edges.get(j).getState().contains(i1);
                        if (allSymbols.contains(i1)) {
                            if (contains) {
                                if (graph.vertices.get(i).edges.get(j).getBegin()==3 && graph.vertices.get(i).edges.get(j).getEnd()==5) {
                                    count_ab += 1;
                                }
                                if (graph.vertices.get(i).edges.get(j).getBegin()==6 && graph.vertices.get(i).edges.get(j).getEnd()==7) {
                                    count_cb += 1;
                                }
                                answer = nextState(length, numOfCurrState + 1, symbolsLane, graph.vertices.get(i).edges.get(j).getEnd());
                            }
                        } else {
                            answer = -1;
                            return answer;
                        }
                    }
                }
            }
        }
        if (count_ab-count_cb < 0 && answer == 1) {
            answer = 0;
        }
        return answer;
    }

}