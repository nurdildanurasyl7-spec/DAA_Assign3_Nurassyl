# Project: Minimum Spanning Tree (MST)

**Student:** Nurassyl Nurdilda  
**Group:** SE-2428  

## Project Goal: 
Build Minimum Spanning Tree (MST) for multiple weighted graphs using:
- **Prim’s Algorithm**
- **Kruskal’s Algorithm**

## MST ensures:
- **All vertices are connected** ✅
- **Minimum possible total cost** ✅
- **No cycles** ✅

## Input: 
- `data/assign_3_input.json`  

## Output: 
- `out/assign_3_output.json`

## How to run:
1. Clone this repository:
    ```bash
    git clone https://github.com/nurdildanurasyl7-spec/DAA_Assign3_Nurassyl.git
    ```
2. Compile the project:
    ```bash
    cd "Nurassyl Nurdilda"
    mvn -q compile
    ```
3. Run the algorithm:
    ```bash
    java -cp "target/classes:/Users/nurasyl/.m2/repository/org/json/json/20240303/json-20240303.jar" mst.MainX
    ```

## Performance Conclusion:
- **Kruskal** works better on **sparse** graphs (fewer edges).
- **Prim** works better on **dense** graphs (more edges).
- **MST cost** is always the same ✅

## Performance Analysis

| Graph Category  | Algorithm | Avg Runtime (ms) | Faster Algorithm |
|-----------------|-----------|------------------|------------------|
| **Small (4-7 nodes)** | Both | Same | Tie |
| **Medium (10–20 nodes)** | Kruskal | Lower operations | ✅ Kruskal |
| **Large (20+ nodes)** | Prim | Faster on dense edges | ✅ Prim |

### Explanation of Algorithm Performance:
- **Kruskal** is more efficient when the graph is **sparse** (with fewer edges) because it sorts edges first, which is faster when there are fewer edges.
- **Prim** is better for **dense** graphs because it uses a priority queue, avoiding the need to sort all edges, and performs better when there are many edges.

## All assignment requirements completed ✅
