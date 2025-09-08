package com.example.report;
import java.nio.file.*; import java.util.*;

public class App {
    public static void main(String[] args) {
        Map<String,Object> data = Map.of("name", "Quarterly");
        ReportBundleFacade facade = new ReportBundleFacade(new JsonWriter(), new Zipper(), new AuditLog());
        Path outDir = Path.of("out");
        Path json = facade.export(data, outDir, "report");
        System.out.println("DONE " + json);
    }
}
