
import java.util.ArrayList;

public class PriorityQ {

    public static class PriorityQueue {
        ArrayList<Integer> data;
        public PriorityQueue() {
            data = new ArrayList<>();
        }

        public void add(int val) {
            data.add(val);
            upHeapify(data.size() - 1);
        }

        private void upHeapify(int i) {
            if (i == 0) {
                return;
            }
            int pi = (i - 1) / 2;
            if (data.get(pi) > data.get(i)) {
                swap(i, pi);
                upHeapify(i);
            }
        }

        private void swap(int i, int j) {
            int ith = data.get(i);
            int jth = data.get(j);
            data.set(i, jth);
            data.set(j, ith);
        }

        public int remove() {
			if(this.size()==0){
				return -1;
			}
			swap(0, data.size()-1);
			int removed=data.size()-1;
			downHeapify(0);
			return removed;
        }

		public void downHeapify(int pi){
			int min=pi;
			int lci=(2*pi)+1;
			int rci=(2*pi)+2;
			if(lci<data.size() && data.get(lci)<data.get(min)){
				min=lci;
			}
			if(rci<data.size() && data.get(rci)<data.get(min)){
				min=rci;
			}
			if(min!=pi){
				swap(pi,min);
				downHeapify(min);
			}
			
		}

        public int peek() {
            if (this.size() == 0) {
                return -1;
            }
            return data.get(0);
        }

        public int size() {
            return data.size();
        }
    }

    public static void main(String[] args) {
		PriorityQueue pq=new PriorityQueue();
		pq.add(10);
		pq.add(20);
		pq.add(30);
		pq.add(40);
		pq.add(50);
		pq.add(60);
		pq.add(70);
		System.out.println(pq.peek());
		pq.remove();
		System.out.println(pq.peek());
		System.out.println(pq.data);
		System.out.println(pq.size());
    }
}
