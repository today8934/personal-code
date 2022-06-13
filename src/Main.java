import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Main {

    public static void main(String[] args) {
        KotlinMain kotlinMain = new KotlinMain();
        kotlinMain.joinToStringTest();
        kotlinMain.defaultArgumentsTest();
    }

    private void createMemNoQueryForGoodMemberGrd() {
        try {
            File file = new File("D:\\interpark\\wooksang\\Sample.txt");

            FileReader fileReader = new FileReader(file);

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = "";
            int idx = 1;

            System.out.println("and (mem_no in (");

            while ((line = bufferedReader.readLine()) != null) {
                if ((idx%1000) == 0) {
                    System.out.println("," + line + ")");
                    System.out.println("or mem_no in (");
                } else {
                    if ((idx%1000) == 1) {
                        System.out.println(line);
                    } else {
                        System.out.println("," + line);
                    }

                }

                idx++;
            }

            System.out.println("));");

            bufferedReader.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
