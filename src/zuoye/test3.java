package zuoye;

import java.io.File;

public class test3{
	
 public static void deleteAll(File file){
	 
  if(file.isFile() || file.list().length == 0)
	  
  {
   file.delete();
  }
  else
  {
   File[] files = file.listFiles();
   for(File f : files)
   {
    deleteAll(f);
    f.delete();
   }
   }
 }

 public static void main(String[] args)
 {
  File file = new File("d:/abc/a.txt");//��d�����½�abc�ļ���a.t�ļ�
  deleteAll(file);
 }
}