package com.example.report;

import java.nio.file.Path;

public class ReportBundleFacade {
    private final JsonWriter jw;
    private final Zipper zp;
    private final AuditLog al;

    public ReportBundleFacade(JsonWriter jw, Zipper zp, AuditLog al) {
        this.jw = jw;
        this.zp = zp;
        this.al = al;
    }
    
    public Path export(java.util.Map<String,Object> data, java.nio.file.Path outDir, String baseName){
        Path json = jw.write(data, outDir, baseName);
        Path zip = zp.zip(json, outDir.resolve(baseName + ".zip"));
        al.log("exported " + zip);
        return json;
    }
}