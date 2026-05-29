class Solution {
public:
    int kthSmallest(vector<vector<int>>& matrix, int k) {
       priority_queue<int>pq;
       int row = matrix.size();
       int col = matrix[0].size();

       for(int i= 0; i<k; i++){
          int  p = i/row;
          int  q = i%col;
           pq.push(matrix[p][q]);
       }   
       for(int i = k; i<row*col; i++){
           int  p = i/row;
           int  q = i%col;
           if(matrix[p][q]<pq.top()){
              pq.pop();
               pq.push(matrix[p][q]);
           }
         
       }
      return pq.top();
       
    }
};

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna