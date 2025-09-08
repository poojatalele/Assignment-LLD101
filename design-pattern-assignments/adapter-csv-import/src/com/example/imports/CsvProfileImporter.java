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
        // return reader.read(csvFile).size() - 1;
        // Objects.requireNonNull(csvFile, "csvFile");

        List<String[]> rows = reader.read(csvFile);
        int imported = 0;
        int lineNo = 0;
        // boolean headerSkipped = false;

        for (int i = 1 ; i < rows.size() ; i++) {
            String[] row = rows.get(i);

            
            lineNo++;

            String id = row[0];
            String email = row[1];
            String displayName = row[2];

            if (id == null) {
                System.out.println("Skip line " + lineNo + ": missing id");
                continue;
            }
            if (email == null) {
                System.out.println("Skip line " + lineNo + ": missing email");
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

}

