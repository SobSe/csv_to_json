import java.util.List;

public class Mian {
    public static void main(String[] args) {
        String[] columnMapping = {"id", "firstName", "lastName", "country", "age"};
        String inputFileName = "data.csv";
        String outputFileName = "data.json";

        ReaderCSV reader = new ReaderCSV();
        WriterJSON writer = new WriterJSON();

        List<Employee> list = reader.parsCSV(columnMapping, inputFileName);
        String json = writer.listToJSON(list);
        writer.writeJSON(outputFileName, json);
    }
}
