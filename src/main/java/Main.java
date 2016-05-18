/**
 * Created by ukilucas on 5/17/16.
 */

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Main obj = new Main();
        obj.run();

    }

    public void run() {
        int headerCount = 0;
        List<String> headers = new ArrayList<String>();

        String csvFile = "src/test/resources/data.csv"; // TODO pass file input via command line argument
        try {
            System.out.println("Attempting to read file: " + new File(csvFile).getCanonicalPath());
        } catch (Exception e) {
        }
        BufferedReader br = null;
        String line = "";
        String separator = ",(?=([^\"]*\"[^\"]*\")*[^\"]*$)"; // TODO this could be improved to include empty cells

        try {

            br = new BufferedReader(new FileReader(csvFile));
            int rowCounter = 0;
            while ((line = br.readLine()) != null) {
                rowCounter++;
                System.out.println(rowCounter + ") original row: \n" + line);
                line = line.replaceAll(",,", ", ,"); // replace empty cells ,, with single space - TODO this is a cludge
                //System.out.println("replaced row: \n" + line);
                String[] columns = line.split(separator, -1);

                int i = 0;
                for (String s : columns) {
                    if (rowCounter == 1) { // header row only
                        headers.add(s);
                    }
                    System.out.println(headers.get(i) + " : " + s);
                    i++;
                }

                if (headerCount < 1) headerCount = columns.length; // treat first row as headers
                if (columns.length != headerCount)
                    throw new RuntimeException("Number of items in the row (" + columns.length + ") do not match header count of " + headerCount);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        System.out.println("Done");
    }

}
