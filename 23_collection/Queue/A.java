import java.util.PriorityQueue;

class A{
	public static void main(String[] args){
		PriorityQueue queue = new PriorityQueue();

		queue.offer(78);
		queue.offer(23);
		queue.offer(2);
		queue.offer(78);
		//queue.offer(null);

		System.out.println(queue);

		/*int size = queue.size();
		for(int i=0;i<size;i++){
			System.out.println(queue.poll());
		}*/
	}
}









