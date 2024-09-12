package Graph;

public interface Graph {
	int size();                       //vertex의 수
	void  addEdge(int v, int w);      //v와 w를 연결하는 edge 추가
	Iterable<Integer> adj(int v);     //v에 연결된 정점들을 순회
	String toString();
}
