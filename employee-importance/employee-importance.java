/*
// Definition for Employee.
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};
*/

class Solution {
    int sum = 0;
    HashMap<Integer,Employee> map = new HashMap<>();
    public int getImportance(List<Employee> employees, int id) {  
    for(Employee curr : employees){
        map.put(curr.id,curr);
    }        
   sum =  dfs(id);
        return sum;
    }
    public int dfs(int id){
        Employee emp = map.get(id);
        int ans = emp.importance;
        sum+=ans;
        for(Integer subId : emp.subordinates){
            ans += dfs(subId);
        }
        return ans;
    }
}