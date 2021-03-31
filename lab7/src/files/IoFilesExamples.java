package files;

import java.io.*;
import java.util.Scanner;

public class IoFilesExamples {
    public static void main(String[] args) {
        String filePath = "myFirstFile.txt";
        //m1(filePath);
        String line = "Here is my new line added";
//        m2Write(filePath, line);
//        m2Read(filePath);

//        m3Write(filePath, line);
//        m3Read(filePath);

//        m4Write(filePath, line);
//        m4Read(filePath);

        m5Write(filePath, line);
        m5Read(filePath);
    }

    private static void m1(String filePath)    {
        try (Scanner scanner = new Scanner(new File(filePath))) {
            while(scanner.hasNext())    {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    //fluxuri primitive
    //prelucrare la nivel caracter
    private static void m2Read(String filePath) {
        int i;
        try (FileReader reader = new FileReader(filePath))  {
            while((i = reader.read()) != -1)    {
                System.out.print((char) i);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void m2Write(String filePath, String line) {
        int i;
        try (FileWriter writer = new FileWriter(filePath, true)){
            writer.write("\n\n");
            writer.write(line);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //prelucrare la nivel de octet (fis binare)
    private static void m3Read(String filePath) {
        int i;
        try(FileInputStream inputStream = new FileInputStream(filePath)) {
            while ((i = inputStream.read()) != -1)  {
                System.out.print((char) i);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void m3Write(String filePath, String line) {
        try(FileOutputStream outputStream = new FileOutputStream(filePath, true)) {
          outputStream.write("\n".getBytes());
          outputStream.write(line.getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //fluxuri de procesare -> buffers
    private static void m4Read(String filePath) {
        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void m4Write(String filePath, String line) {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(line);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //fluxuri de procesare cu acces aleatoriu
    private static void m5Read(String filePath) {
        System.out.println(4);
        int i;
        try (RandomAccessFile randomAccessFile = new RandomAccessFile(filePath, "rw")) {
            while ((i = randomAccessFile.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void m5Write(String filePath, String line) {
        try(RandomAccessFile randomAccessFile = new RandomAccessFile(filePath,"rw")){
            File file = new File(filePath);
            randomAccessFile.seek(file.length());
            randomAccessFile.write("\n".getBytes());
            randomAccessFile.write(line.getBytes());
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
