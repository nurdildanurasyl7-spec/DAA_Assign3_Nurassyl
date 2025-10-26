package mst;

import org.json.*;
import java.util.*;

public class M {
    static java.util.List<JSONObject> L(java.util.List<E> a){
        var z = new java.util.ArrayList<JSONObject>();
        for(E e: a){
            var o = new JSONObject();
            o.put("from", e.u); o.put("to", e.v); o.put("weight", e.w);
            z.add(o);
        }
        return z;
    }
    static double r3(double x){ return Math.round(x*1000.0)/1000.0; }
    public static JSONObject p(int id, java.util.Set<String> n, java.util.List<E> e, P.R pr, K.R kr){
        var o = new JSONObject();
        o.put("graph_id", id);
        var st = new JSONObject(); st.put("vertices", n.size()); st.put("edges", e.size());
        o.put("input_stats", st);
        var a = new JSONObject();
        a.put("mst_edges", L(pr.e));
        a.put("total_cost", pr.c==null?JSONObject.NULL:pr.c);
        a.put("operations_count", pr.o);
        a.put("execution_time_ms", r3(pr.t));
        o.put("prim", a);
        var b = new JSONObject();
        b.put("mst_edges", L(kr.e));
        b.put("total_cost", kr.c==null?JSONObject.NULL:kr.c);
        b.put("operations_count", kr.o);
        b.put("execution_time_ms", r3(kr.t));
        o.put("kruskal", b);
        return o;
    }
}
