  // ���o�̓X�g���[�����g���̂ŁCjava.io.* �� import
import java.io.*;
  // �\�P�b�g���g���̂� java.net.* �� import 
import java.net.*;

// ���[�U�̃L�[�{�[�h���͂��󂯎����, �T�[�o�ɑ���X���b�h�� 
// �T�[�o�Ɛڑ������\�P�b�g���烁�b�Z�[�W���󂯎���ĕ\������X���b�h
// �����p�����N���X
class Sender implements Runnable{
  // ���̓X�g���[��
  BufferedReader in;
  // �o�̓X�g���[��
  PrintWriter out;
  // �R���X�g���N�^
  public Sender(BufferedReader in,PrintWriter out){
    // ���ӂ� this.in�̓C���X�^���X�ϐ��� in, �E�ӂ� in�͈����� in
    this.in=in;
    this.out=out;
  }
  // �X���b�h�� start �����,���ꂪ�Ă΂��,����������D
  public void run(){
    try{
      String s;
      // ���̓X�g���[�������s����
      while((s=in.readLine())!=null){
        // �o�̓X�g���[���Ɉ�s�o��
	out.println(s);
      }
    }
    catch(Exception e){
      System.err.println(e);
    }
  }
}
// java ChatClient �z�X�g�� �|�[�g�ԍ�
// �ƌĂяo��
class ChatClient{
  public static void main(String args[]){
    // �z�X�g��
    String hostName=args[0];
    // �|�[�g�ԍ��𕶎��񂩂琮���ɕϊ�
    int port=Integer.parseInt(args[1]);
    try{
      // �T�[�o�Ɛڑ����邽�߂̃\�P�b�g�����
      Socket sock=new Socket(hostName,port);
      // ���[�U����̓��͂̃X�g���[���̍쐬
      BufferedReader ui=new BufferedReader(new InputStreamReader(System.in));
      // �T�[�o����̓��͂̃X�g���[���̍쐬
      BufferedReader si=new BufferedReader(new InputStreamReader(sock.getInputStream()));
      // �T�[�o�ւ̏o�͂̃X�g���[���̍쐬
      PrintWriter so=new PrintWriter(sock.getOutputStream(),true);
      // ���[�U�ւ̏o�͂̃X�g���[���̍쐬
      PrintWriter uo=new PrintWriter(System.out,true);
      // ���[�U���͂��T�[�o�ɓ]������X���b�h���쐬��, start
      new Thread(new Sender(ui,so)).start();
      // �T�[�o����̓��͂����[�U�ɓ]������X���b�h���쐬��, start
      new Thread(new Sender(si,uo)).start();
    }
    catch(IOException e){
      System.err.println(e);
    }
  }
}
