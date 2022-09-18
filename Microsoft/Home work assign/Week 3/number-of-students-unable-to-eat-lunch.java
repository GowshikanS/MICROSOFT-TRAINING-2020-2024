class Solution {
public int countStudents(int[] students, int[] sandwiches) {
Queue q=new LinkedList<>();
Stack s=new Stack<>();
for(int i=0;i<students.length;i++)
{
q.add(i);
}
for(int i=sandwiches.length-1;i>=0;i--)
{
s.push(i);
}
boolean t=true;
int temp=0;
while(t && !q.isEmpty())
{

        int fst=q.poll();
        int fsa=s.pop();
        if(sandwiches[fsa]==students[fst])
        {
            temp=0;
            continue;
            
        }
        if(sandwiches[fsa]!=students[fst])
        {
            q.add(fst);
            s.push(fsa);
            temp++;
            
        }
        if(temp==q.size())
        {
            t=false;
        }

        
    }
    return q.size();
}
}
