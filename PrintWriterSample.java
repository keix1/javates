//import�錾
import java.io.*;
class PrintWriterSample{
    public static void main(String args[]){

   try{
     //FileWriter�I�u�W�F�N�g�̐���
       FileWriter fw = new FileWriter(args[0]);

     //BufferedWriter�I�u�W�F�N�g�̐���
      BufferedWriter bw = new BufferedWriter(fw);

     //PrintWriter�I�u�W�F�N�g�̐���
     PrintWriter pw = new PrintWriter(bw);
  //�t�@�C���ɏ����o��
    int i;
   for(i = 0; i < 10; i++){
     pw.print(i);
 }

 System.out.println("�������ݏI��");

  //PrintWriter�I�u�W�F�N�g����܂�
   pw.close();
 }catch(IOException e){

    System.out.println("IOException : " + e);
         } 
    }

}

