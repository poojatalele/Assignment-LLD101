package com.example.imports;
import java.nio.file.Path;
import java.util.List;
import java.util.Objects;

public class CsvProfileImporter implements ProfileImporter {
    private final NaiveCsvReader reader;
    private final ProfileService service;

    public CsvProfileImporter(NaiveCsvReader reader, ProfileService service) {
        this.reader = Objects.requireNonNull(reader, "reader");
        this.service = Objects.requireNonNull(service, "service");
    }

    @Override
    public int importFrom(Path csvFile) {
        Objects.requireNonNull(csvFile, "csvFile");

        List<String[]> rows = reader.read(csvFile);
        int imported = 0;
        int lineNo = 0;
        boolean headerSkipped = false;

        for (String[] row : rows) {
            lineNo++;

            String id = safeGet(row, 0);
            String email = safeGet(row, 1);
            String displayName = safeGet(row, 2);

            if (isBlank(id)) {
                System.out.println("Skip line " + lineNo + ": missing id");
                continue;
            }
            if (isBlank(email)) {
                System.out.println("Skip line " + lineNo + ": missing email");
                continue;
            }
            if (!email.contains("@")) {
                System.out.println("Skip line " + lineNo + ": bad email '" + email + "'");
                continue;
            }

            try {
                service.createProfile(id.trim(), email.trim(), displayName == null ? null : displayName.trim());
                imported++;
            } catch (RuntimeException e) {
                System.out.println("Skip line " + lineNo + ": " + e.getMessage());
            }
        }

        return imported;
    }

    private static boolean isHeader(String[] row) {
        if (row == null || row.length < 2) return false;
        String c0 = safeGet(row, 0);
        String c1 = safeGet(row, 1);
        String c2 = safeGet(row, 2);
        return "id".equalsIgnoreCase(c0)
            && "email".equalsIgnoreCase(c1)
            && (c2 == null || "displayName".equalsIgnoreCase(c2));
    }

    private static String safeGet(String[] row, int idx) {
        if (row == null || idx >= row.length) return null;
        String v = row[idx];
        if (v == null) return null;
        v = v.trim();
        if ((v.startsWith("\"") && v.endsWith("\"")) || (v.startsWith("'") && v.endsWith("'"))) {
            v = v.substring(1, v.length() - 1);
        }
        return v;
    }

    private static boolean isBlank(String s) {
        return s == null || s.trim().isEmpty();
    }
}

