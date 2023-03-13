//package common;
//
//import java.io.BufferedWriter;
//import java.io.FileWriter;
//import java.io.IOException;
//
//public class WriteFile {
//    public static void write(String path, List<String> strings) {
//        try {
//            FileWriter fileWriter = new FileWriter(path, true);
//            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//            for (String line : strings) {
//                bufferedWriter.write(line);
//                bufferedWriter.newLine();
//            }
//        } catch (IOException e) {
//            throw new RuntimeException();
//        }
//    }
//}
