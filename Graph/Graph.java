package Graph;

public interface Graph {
	int size();                       //vertex�� ��
	void  addEdge(int v, int w);      //v�� w�� �����ϴ� edge �߰�
	Iterable<Integer> adj(int v);     //v�� ����� �������� ��ȸ
	String toString();
}
