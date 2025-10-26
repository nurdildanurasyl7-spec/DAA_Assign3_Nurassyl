# MST Fast Submission (Prim + Kruskal)

This package includes:
- Java implementations of Prim and Kruskal (no custom Graph class, minimal & fast).
- JSON reader/writer.
- Input dataset generator (already provided under `data/assign_3_input.json`).
- Output example under `out/assign_3_output.json` (generated with a reference implementation).
- JUnit tests covering correctness and metrics.

## Build & Run

```bash
# From project root
mvn -q -e -DskipTests=false test

# Run with default paths
mvn -q -DskipTests=true package
java -cp "target/mst-fast-1.0.0.jar:~/.m2/repository/org/json/json/20240303/json-20240303.jar" mst.MSTMain

# Or specify paths
java -cp "target/mst-fast-1.0.0.jar:~/.m2/repository/org/json/json/20240303/json-20240303.jar" mst.MSTMain data/assign_3_input.json out/assign_3_output.json
```

## Files
- `src/main/java/mst/Prim.java`
- `src/main/java/mst/Kruskal.java`
- `src/main/java/mst/Edge.java`
- `src/main/java/mst/GraphIO.java`
- `src/main/java/mst/Metrics.java`
- `src/main/java/mst/MSTMain.java`
- `src/test/java/mst/MSTTest.java`
- `data/assign_3_input.json`
- `out/assign_3_output.json`

## Notes
- Operation counters are simple but deterministic.
- For bonus points you can later replace the I/O with your own `Graph.java` and `Edge.java`.
