package Lesson2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Dz4 {
    private static final Logger LOGGER = Logger.getLogger(Dz4.class.getName());

    public static void main(String[] args) {
        setupLogger();

        String json = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}, " +
                "{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}, " +
                "{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
        String filePath = "src/output.txt";
        String result = parseJsonString(json);
        writeToFile(result, filePath);

    }

    public static String parseJsonString(String json) {
        StringBuilder result = new StringBuilder();

        try {
            json = json.substring(1, json.length() - 1);
            String[] objects = json.split("\\},\\s*\\{");
            for (String object : objects) {
                object = object.replaceAll("\\{", "").replaceAll("}", "");
                String[] keyValuePairs = object.split(",\\s*");
                String фамилия = null;
                String оценка = null;
                String предмет = null;

                for (String keyValuePair : keyValuePairs) {
                    String[] keyValue = keyValuePair.split(":\\s*");

                    String key = keyValue[0].replaceAll("\"", "").trim();
                    String value = keyValue[1].replaceAll("\"", "").trim();

                    if (key.equals("фамилия")) {
                        фамилия = value;
                    } else if (key.equals("оценка")) {
                        оценка = value;
                    } else if (key.equals("предмет")) {
                        предмет = value;
                    }
                }

                if (фамилия != null && оценка != null && предмет != null) {
                    result.append("Студент ");
                    result.append(фамилия);
                    result.append(" получил ");
                    result.append(оценка);
                    result.append(" по предмету ");
                    result.append(предмет);
                    result.append(".\n");
                }
            }
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Ошибка при парсинге JSON-строки", e);
        }

        return result.toString();
    }

    public static void writeToFile(String data, String fileName) {
        try (FileWriter fileWriter = new FileWriter(fileName)) {
            fileWriter.write(data);
        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, "Ошибка при записи файла", e);
        }
    }

    public static void setupLogger() {
        try {
            FileHandler fileHandler = new FileHandler("src/error.log");
            fileHandler.setFormatter(new SimpleFormatter());
            LOGGER.addHandler(fileHandler);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}