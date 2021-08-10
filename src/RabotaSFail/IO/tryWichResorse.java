package RabotaSFail.IO;

import java.io.FileWriter;
import java.io.IOException;

public class tryWichResorse {
    public static void main(String[] args) {
        String s1 = "Опасно! МакТоминай врывается справа в штрафную,\n " +
                "режет угол и бьет в ближний - вратарь ногами отбивает\n";
        String s3 = "ГОООООЛ!!! Фернандо подстерег ошибку соперника, перехватив мяч. \n" +
                "Рванул к воротам, но видно было, что не дадут пробить. \n" +
                "Бразилец покатил в центр на Тете, а тот обработал и пробил в дальний нижний";
        try (FileWriter writer = new FileWriter("test1.txt",true);
             FileWriter writer3 = new FileWriter("test3.txt",true)){
            writer.write(s1);
            writer3.write(s3);



        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
