package mst;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;
import org.json.*;

public class IO {
    public static class G {
        public int id;
        public java.util.Set<String> n = new java.util.LinkedHashSet<>();
        public java.util.List<E> e = new java.util.ArrayList<>();
    }
    public static java.util.List<G> r(String p) throws IOException {
        String s = Files.readString(Path.of(p), StandardCharsets.UTF_8);
        JSONObject root = new JSONObject(s);
        JSONArray gs = root.getJSONArray("graphs");
        java.util.List<G> out = new java.util.ArrayList<>();
        for(int i=0;i<gs.length();i++){
            JSONObject g = gs.getJSONObject(i);
            G GG = new G();
            GG.id = g.getInt("id");
            JSONArray ns = g.getJSONArray("nodes");
            for(int j=0;j<ns.length();j++) GG.n.add(ns.getString(j));
            JSONArray es = g.getJSONArray("edges");
            for(int j=0;j<es.length();j++){
                JSONObject x = es.getJSONObject(j);
                GG.e.add(new E(x.getString("from"), x.getString("to"), x.getInt("weight")));
            }
            out.add(GG);
        }
        return out;
    }
    public static void w(String p, java.util.List<org.json.JSONObject> rs) throws IOException {
        JSONObject root = new JSONObject();
        root.put("results", rs);
        Files.writeString(Path.of(p), root.toString(2), StandardCharsets.UTF_8);
    }
}
