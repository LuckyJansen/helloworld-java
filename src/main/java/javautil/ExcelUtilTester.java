package javautil;

import java.io.File;
import java.util.ArrayList;

/**
 * Created by GAOJIANXIN637 on 2019-6-14.
 */
public class ExcelUtilTester {
    public static void main(String[] args) {
        File file = new File("D:\\1 公司资料\\房地产项目智能管理一体化平台\\Dass数据平台\\4-代码开发\\product.xlsx");
        ArrayList<ArrayList<String>> results = ExcelUtil.readFile(file);

        ArrayList<ArrayList<String>> newresults = new ArrayList<ArrayList<String>>();
        ArrayList<String> newrow = new ArrayList<String>();

        for (int i = 0; i < results.size(); i++) {
            ArrayList<String> col = results.get(i);
            int j = i + 1;
            int jj = 1;


            String splitTarget = col.get(1);
            String[] seconds = splitTarget.split("，");
            for (String second : seconds) {
                newrow = new ArrayList<String>();
                newrow.add("" + j);
                newrow.add("12-" + j);
                newrow.add(col.get(0));
                newrow.add("" + jj);
                newrow.add("12-" + j + "-" + jj);
                newrow.add(second);
                newresults.add(newrow);
                jj++;
            }

        }

        ExcelUtil.writeExcel(newresults, "D:\\1 公司资料\\房地产项目智能管理一体化平台\\Dass数据平台\\4-代码开发\\newProduct.xlsx");


    }


}
