

Student: Nurassyl Nurdilda  
Group: SE-2428  

Project goal: Build Minimum Spanning Tree (MST) for multiple weighted graphs using:
- Prim’s Algorithm
- Kruskal’s Algorithm

MST ensures:
- All vertices are connected ✅
- Minimum possible total cost ✅
- No cycles ✅

Input: data/assign_3_input.json  
Output: out/assign_3_output.json  

How to run:
cd "Nurassyl Nurdilda"
mvn -q compile
java -cp "target/classes:/Users/nurasyl/.m2/repository/org/json/json/20240303/json-20240303.jar" mst.MainX

Performance Conclusion:
- Kruskal works better on sparse graphs
- Prim works better on dense graphs
- MST cost is always the same ✅

All assignment requirements completed ✅

