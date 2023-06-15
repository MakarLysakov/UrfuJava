package lab8.HW5;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Q1 {
    public static void main(String[] args) {
        try (FileInputStream inputStream = new FileInputStream("/src/lab8/HW5/example.xlsx");
             XSSFWorkbook workbook = new XSSFWorkbook(inputStream)) {
            XSSFSheet sheet = workbook.getSheet("Товары");
            // Перебираем строки и ячейки листа
            for (Row row : sheet) {
                for (Cell cell : row) {
                    // Выводим значения ячейки на экран
                    System.out.print(cell.toString() + "\t");
                }
                System.out.println();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: \n" + e.getMessage());
        } catch (IOException e) {
            System.out.println("Не удалось прочитать из файла: \n" + e.getMessage());
        }

        try (XSSFWorkbook workbook = new XSSFWorkbook();
             FileOutputStream outputStream = new FileOutputStream("/src/lab8/HW5/example.xlsx")) {
            XSSFSheet sheet = workbook.createSheet("Товары");

            Row headerRow = sheet.createRow(0);
            headerRow.createCell(0).setCellValue("Товар");
            headerRow.createCell(1).setCellValue("Характеристики");
            headerRow.createCell(2).setCellValue("Стоимость");

            Row dataRow1 = sheet.createRow(1);
            dataRow1.createCell(0).setCellValue("Книга");
            dataRow1.createCell(1).setCellValue("Жанр: Фантастика, Автор: Иванов И.И.");
            dataRow1.createCell(2).setCellValue(500.0);

            Row dataRow2 = sheet.createRow(2);
            dataRow2.createCell(0).setCellValue("Компьютер");
            dataRow2.createCell(1).setCellValue("Процессор: Intel Core i5, Оперативная память: 16 GB");
            dataRow2.createCell(2).setCellValue(25000.0);

            workbook.write(outputStream);

            System.out.println("Данные записаны в файл: \n" + "/src/lab8/HW5/example.xlsx");
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: \n" + e.getMessage());
        } catch (IOException e) {
            System.out.println("Не удалось записать в файл: \n" + e.getMessage());
        }
    }
}
