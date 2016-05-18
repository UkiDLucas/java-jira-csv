/**
 * Created by ukilucas on 5/17/16.
 */

import java.io.*;

public class Main {

    public static void main(String[] args) {

        Main obj = new Main();
        obj.run();

    }

    public void run() {

        String csvFile = "src/test/resources/data.csv";
        try {
            System.out.println(new File(csvFile).getCanonicalPath());
            // output /Users/ukilucas/Dropbox/dev/java-jira-csv/src/test/resources/data.csv
        } catch (Exception e) {
        }
        BufferedReader br = null;
        String line = "";
        String separator = ",\"\",";

        try {

            br = new BufferedReader(new FileReader(csvFile));
            int counter = 0;
            while ((line = br.readLine()) != null) {
                counter++;
                System.out.println(counter + ") original row: " + line);
                //line.replace(",,", ",\"\","); // replace empty cells ,, with empty string ,"",
                //line.replace(",,", ",\"\","); // replace empty cells ,, with empty string ,"",
                //System.out.println("replaced row: " + line);
                String[] columns = line.split(separator);
                System.out.println("column count " + columns.length);

                System.out.println("column 0: " + columns[0]  );
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
