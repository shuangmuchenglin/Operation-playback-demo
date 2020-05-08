package record_tool;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class write_file {

    public static String readTxt(String txtPath) {
        File file = new File(txtPath);
        if(file.isFile() && file.exists()){
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                StringBuffer sb = new StringBuffer();
                String text = "";
                String content="";
                while((text = bufferedReader.readLine()) != null){
                    content=content+text+"\n";
                    //System.out.println(content);
                }
                bufferedReader.close();
                return content;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }
    

    public static void writeTxt(String txtPath,String content){    
    	FileWriter fw = null;
    	try {
    	//如果文件存在，则追加内容；如果文件不存在，则创建文件
    	File f=new File(txtPath);
    	fw = new FileWriter(f, true);
    	} catch (IOException e) {
    	e.printStackTrace();
    	}
    	PrintWriter pw = new PrintWriter(fw);
    	pw.print(content);
    	pw.flush();
    	try {
    	fw.flush();
    	pw.close();
    	fw.close();
    	} catch (IOException e) {
    	e.printStackTrace();
    	}
    }
}


