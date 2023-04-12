import java.util.*;
public class L07_Job_Sequencing {
     static class Job{
        int deadLine;
        int profit;
        int id;     // eg:- 0(A),1(B),2(C) 0,1,2 denotes id and A,B,C denotes their job 

        public Job(int i,int d,int p){      //Constructor of Job is created having id,deadline,and profit.
            id=i;
            deadLine=d;
            profit=p;

        }
    }
    public static void main(String[] args) {
        int jobsInfo[][]={{4,20},{1,10},{1,40},{1,30}};         // Note:- 4,1,1,1 are job(deadline) while 20,10,40,30 are profit .
        ArrayList<Job>jobs=new ArrayList<>();   // arrayList of job type is created of length jobInfo.
        for(int i=0;i<jobsInfo.length;i++){
            jobs.add(new Job(i,jobsInfo[i][0],jobsInfo[i][1]));   // jobsInfo[i][0]:-job at 0th coloumn deadline is present and jobsInfo[i][1]:- at 1st coloumn profit is present
        }

        // Descending order Sorting of two objects
        Collections.sort(jobs,(obj1,obj2)->obj2.profit-obj1.profit);        // lamda function to write any comp0arator in sort form

        // // Ascending order Sorting of two objects:-  jiska profit kam h vo pahle ayega aur jiska profit jyada h of bad me ayega.
        // Collections.sort(jobs,(obj1,obj2)->obj1.profit-obj2.profit);

        ArrayList<Integer>seq=new ArrayList<>();
        int time=0;
        for(int i=0;i<jobs.size();i++){
            Job curr=jobs.get(i);
            if(curr.deadLine>time){
                seq.add(curr.id);
                time++;
            }
        }

        // print seq
        System.out.println("Max jobs = "+seq.size());
        for(int i=0;i<seq.size();i++){
            System.out.print(seq.get(i)+" ");   // job A{4,20} and job B{1,40} index will be printed.

        }
        System.out.println();

    }
    
}
