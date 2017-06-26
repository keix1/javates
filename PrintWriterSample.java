//import宣言
import java.io.*;
class PrintWriterSample{
    public static void main(String args[]){

   try{
     //FileWriterオブジェクトの生成
       FileWriter fw = new FileWriter(args[0]);

     //BufferedWriterオブジェクトの生成
      BufferedWriter bw = new BufferedWriter(fw);

     //PrintWriterオブジェクトの生成
     PrintWriter pw = new PrintWriter(bw);
  //ファイルに書き出し
    int i;
   for(i = 0; i < 10; i++){
     pw.print(i);
 }

 System.out.println("書き込み終了");

  //PrintWriterオブジェクトを閉じます
   pw.close();
 }catch(IOException e){

    System.out.println("IOException : " + e);
         } 
    }

}

