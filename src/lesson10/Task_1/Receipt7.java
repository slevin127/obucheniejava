package lesson10.Task_1;

import java.io.*;

public class Receipt7 {
    public void soution(String district, int fromYear, int toYear) throws IOException {
        String inputFile = "src/crop_volumes.txt";
        String outputFile = "src/data-region.txt";
        BufferedReader reader = new BufferedReader(new FileReader(inputFile));
        BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile, false));
        String line = reader.readLine(); // Пропускаем заголовок
        String[] headerParts = reader.readLine().trim().split(";");
        int fromYearIndex = -1;
        int toYearIndex = -1;
        for (int i = 0; i < headerParts.length; i++) {
            if (headerParts[i].equals(String.valueOf(fromYear))) {
                fromYearIndex = i;
            }
            if (headerParts[i].equals(String.valueOf(toYear))) {
                toYearIndex = i;
            }
        }
        writer.write("Part;" + fromYear + ";" + toYear);
        writer.newLine();

        boolean found = false;

        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(";");
            if (parts.length <= fromYearIndex) continue;

            String region = parts[0];
            String regionDistrict = parts[1];

            if (!regionDistrict.equalsIgnoreCase(district)) continue;

            double fromValue = Double.parseDouble(parts[fromYearIndex].replace(",", "."));
            double toValue = Double.parseDouble(parts[toYearIndex].replace(",", "."));

            if (toValue > fromValue * 1.04) {
                writer.write(region + ";" + fromValue + ";" + toValue);
                writer.newLine();
                found = true;
            }


        }
        reader.close();
        writer.close();
        if (!found) {
            System.out.println("No receipt found");
        }
    }
}
