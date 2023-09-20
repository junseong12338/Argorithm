package Stack_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;



//Main
public class Stack_Queue_07 {
	
	class Person{
	    int id; // 순서
	    int priority; // 위험도
	    public Person(int id, int priority){
	        this.id=id;
	        this.priority=priority;
	    }
	}

	  public int solution(int n, int m, int[] arr){
		     int answer=0;
		     Queue<Person> Q=new LinkedList<>();
		     for(int i=0; i<n; i++){
		         Q.offer(new Person(i, arr[i])); // 큐에 번호와 위험도를 쌍으로 추가
		     }
		     while(!Q.isEmpty()){
		         Person tmp=Q.poll(); // 큐에 맨 앞에 있는 것을 꺼냄
		         for(Person x:Q){
		             if(x.priority>tmp.priority){ // 맨 앞의 환자보다 위험도가 크면
		                 Q.offer(tmp); // 큐의 끝에 맨 앞 환자를 추가
		                 tmp=null;
		                 break;
		             }
		         }
		         if(tmp!=null){ // 맨 앞 환자보다 우선순위 높은 환자가 없다면
		            answer++;
		            if(tmp.id==m) return answer;
		         }
		     }
		     return answer;
		    }
		    public static void main(String[] args) {
		    	Stack_Queue_07 T = new Stack_Queue_07();
		        Scanner sc = new Scanner(System.in);
		        int n=sc.nextInt();
		        int m=sc.nextInt();
		        int[] arr=new int[n];
		        for(int i=0; i<n; i++){
		            arr[i]=sc.nextInt();
		        }
		        System.out.println(T.solution(n,m,arr));
		    }
		}