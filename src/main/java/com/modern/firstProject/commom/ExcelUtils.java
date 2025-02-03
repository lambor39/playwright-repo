package com.modern.firstProject.commom;

import java.util.Map;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;

public class ExcelUtils {
    public static void main() {
        String fileName = "src/test/java/com/modern/firstProject/resources/data-files/motor/datafile_motorcar.xlsx";

        // อ่านข้อมูลแบบ Dynamic
        EasyExcel.read(fileName, new AnalysisEventListener<Map<Integer, String>>() {
            @Override
            public void invokeHeadMap(Map<Integer, String> headMap, AnalysisContext context) {
                // อ่านหัวข้อ (Header)
                System.out.println("หัวข้อ: " + headMap);
            }
            @Override
            public void invoke(Map<Integer, String> data, AnalysisContext context) {
                // แสดงข้อมูลแต่ละแถว
                System.out.println("พบข้อมูล: " + data);
            }
            @Override
            public void doAfterAllAnalysed(AnalysisContext context) {
                System.out.println("อ่านข้อมูลเสร็จสิ้น");
            }
        }).sheet().doRead();
    }
}