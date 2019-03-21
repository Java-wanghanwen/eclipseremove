package com.iotek.study;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;

public class URLDemo {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		try {
			DownLoadUtil.download
			("https://img-blog.csdn.net/20180828160804916?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3N5cGgyNTgw/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70", "my.jpg", "e:\\我的文件");
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}

}
class DownLoadUtil{
	public static void download(String urlString,String filename,String savepath) 
			throws IOException
	{
		 URL url=new URL(urlString);
		 URLConnection conn=url.openConnection();
		 InputStream is=conn.getInputStream();
		 byte[] buff=new byte[1024];
		 int len=0;
		 File file=new File(savepath);
		if(!file.exists()) {
			file.mkdirs();
		}
		OutputStream os=new FileOutputStream(file.getAbsolutePath()+"\\"+filename);
		while((len=is.read(buff))!=-1) {
			os.write(buff, 0, len);
		}
		
		is.close();
		os.close();
	}
}