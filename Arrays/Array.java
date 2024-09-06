package chap2;

public class Array {
	int[] arr;
	int cnt;
	
	public int ARRAY_SIZE;
	
	public Array(int size) {           //빈 배열 생성
		cnt = 0;
		ARRAY_SIZE = size;
		arr = new int[ARRAY_SIZE];
	}
	public void add(int n) {            //배열 요소 추가
		if(cnt>=ARRAY_SIZE) {
			System.out.println("not empty");
		}
		arr[cnt++] = n;
	}
	public void insert(int index, int n) {  //배열 요소 삽입
		if (index < 0 || index > cnt) {
		        System.out.println("인덱스가 범위를 벗어났습니다.");
		        return;
		}
		if(cnt>=ARRAY_SIZE) {
			System.out.println("not empty");
		}
		 for (int i = cnt; i > index; i--) {
		        arr[i + 1] = arr[i];
		    }
		arr[index] = n;
		cnt++;
	}
	public void remove(int index) {   // 배열 요소 삭제
		if(isEmpty()) {
			System.out.print("empty");
		}
		for(int i = index; i < cnt-1;i++) {
			arr[i] = arr[i+1];
		}
		cnt--;
	}
	public boolean isEmpty() {
		return cnt == 0;
	}
	public void printArray() {
		for(int i = 0; i< cnt;i++)
			System.out.print(arr[i]+" ");
	}
}
