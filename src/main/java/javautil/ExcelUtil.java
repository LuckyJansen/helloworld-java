package javautil;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by GAOJIANXIN637 on 2019-6-14.
 */
public class ExcelUtil {

    public static ArrayList<ArrayList<String>> readFile(File file){
        if(file.getName().endsWith("xlsx")){
            return readExcel2007(file);
        }
        return null;
    }

    public static ArrayList<ArrayList<String>> readExcel2007(File file){
        try {
            ArrayList<ArrayList<String>> rowList = new ArrayList<ArrayList<String>>();
            ArrayList<String> colList;
            XSSFWorkbook wb = new XSSFWorkbook(new FileInputStream(file));
            XSSFSheet sheet = wb.getSheetAt(0);
            XSSFRow row;
            XSSFCell cell;
            String value;

            for(int i = sheet.getFirstRowNum(), rowCount = 0;rowCount < sheet.getPhysicalNumberOfRows();i++){
                row = sheet.getRow(i);
                colList = new ArrayList<>();
                if(row == null){
                    if(i != sheet.getPhysicalNumberOfRows()){
                        rowList.add(colList); //一个空对象添加
                    }
                    continue;
                }else {
                    rowCount++;
                }

                for(int j = row.getFirstCellNum();j<row.getLastCellNum(); j++){

                    cell = row.getCell(j);
                    if(cell == null){//当该单元格为空
                        if(j != row.getLastCellNum()){//判断是否是该行中最后一个单元格
                            colList.add("");
                        }
                        continue;
                    }

                    value = cell.getStringCellValue();
//                    value = cell.toString();
                    colList.add(value);
                }
                rowList.add(colList);

            }
            return rowList;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void writeExcel(ArrayList<ArrayList<String>> result,String path) {
        if (result == null) {
            return;
        }
        XSSFWorkbook wb = new XSSFWorkbook();
        XSSFSheet sheet = wb.createSheet("sheet1");
        for (int i = 0; i < result.size(); i++) {
            XSSFRow row = sheet.createRow(i);
            if (result.get(i) != null) {
                for (int j = 0; j < result.get(i).size(); j++) {
                    XSSFCell cell = row.createCell(j);
                    cell.setCellValue(result.get(i).get(j).toString());
                }
            }
        }
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        try {
            wb.write(os);
        } catch (IOException e) {
            e.printStackTrace();
        }
        byte[] content = os.toByteArray();
        File file = new File(path);//Excel文件生成后存储的位置。
        OutputStream fos = null;
        try {
            fos = new FileOutputStream(file);
            fos.write(content);
            os.close();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
