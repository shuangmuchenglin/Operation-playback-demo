package record_tool;

import java.io.*;

public class test {

	public static void test_record() throws InterruptedException {

		        /*
		            创建一个文件读取流，和指定名称的文件相关联。
		            要保证该文件是已经存在的，如果不存在，会发生异常：FileNotFoundException
		            创建对象引用：
		        */
		        FileReader fr = null;
		        calculator_test cal = new calculator_test();
		        try 
		        {
		            //实例化对象
		            fr = new FileReader("C:\\Users\\yuanlin\\Desktop\\record.log");
		            int ch = 0;
		            loop:while((ch=fr.read()) != -1)
		            {
		            	if((char)ch=='0')
		            	{
		            		Thread.sleep(500);
		            		//System.out.print((char)ch);
		            		cal.b0.doClick();
		            		continue loop;
		            	}
		            	else if((char)ch=='1')
		            	{
		            		Thread.sleep(500);
		            		//System.out.print((char)ch);
		            		cal.b1.doClick();
		            		continue loop;
		            	}
		            	else if((char)ch=='2')
		            	{
		            		Thread.sleep(500);
		            		//System.out.print((char)ch);
		            		cal.b2.doClick();
		            		continue loop;
		            	}
		            	else if((char)ch=='3')
		            	{
		            		Thread.sleep(500);
		            		//System.out.print((char)ch);
		            		cal.b3.doClick();
		            		continue loop;
		            	}
		            	else if((char)ch=='4')
		            	{
		            		Thread.sleep(500);
		            		//System.out.print((char)ch);
		            		cal.b4.doClick();
		            		continue loop;
		            	}
		            	else if((char)ch=='5') 
		            	{
		            		Thread.sleep(500);
		            		//System.out.print((char)ch);
		            		cal.b5.doClick();
		            		continue loop;
		            	}
		            	else if((char)ch=='6')
		            	{
		            		Thread.sleep(500);
		            		//System.out.print((char)ch);
		            		cal.b6.doClick();
		            		continue loop;
		            	}
		            	else if((char)ch=='7')
		            	{
		            		Thread.sleep(500);
		            		//System.out.print((char)ch);
		            		cal.b7.doClick();
		            		continue loop;
		            	}
		            	else if((char)ch=='8')
		            	{
		            		Thread.sleep(500);
		            		//System.out.print((char)ch);
		            		cal.b8.doClick();
		            		continue loop;
		            	}
		            	else if((char)ch=='9')
		            	{
		            		Thread.sleep(500);
		            		//System.out.print((char)ch);
		            		cal.b9.doClick();
		            		continue loop;
		            	}
		            	else if((char)ch=='+')
		            	{
		            		Thread.sleep(500);
		            		//System.out.print((char)ch);
		            		cal.b10.doClick();
		            		continue loop;
		            	}
		            	else if((char)ch=='-')
		            	{
		            		Thread.sleep(500);
		            		//System.out.print((char)ch);
		            		cal.b11.doClick();
		            		continue loop;
		            	}
		            	else if((char)ch=='×')
		            	{
		            		Thread.sleep(500);
		            		//System.out.print((char)ch);
		            		cal.b12.doClick();
		            		continue loop;
		            	}
		            	else if((char)ch=='÷')
		            	{
		            		Thread.sleep(500);
		            		//System.out.print((char)ch);
		            		cal.b13.doClick();
		            		continue loop;
		            	}
		            	else if((char)ch=='^')
		            	{
		            		Thread.sleep(500);
		            		//System.out.print((char)ch);
		            		cal.b14.doClick();
		            		continue loop;
		            	}
		            	else if((char)ch=='=')
		            	{
		            		Thread.sleep(500);
		            		//System.out.print((char)ch);
		            		cal.b15.doClick();
		            		continue loop;
		            	}
		            	else if((char)ch=='C')
		            	{
		            		Thread.sleep(500);
		            		//System.out.print((char)ch);
		            		cal.b16.doClick();
		            		continue loop;
		            	}
		            	else if((char)ch=='S')
		            	{
		            		Thread.sleep(500);
		            		//System.out.print((char)ch);
		            		cal.item.doClick();
		            		continue loop;
		            	}
		            	else if((char)ch=='T')
		            	{
		            		Thread.sleep(500);
		            		//System.out.print((char)ch);
		            		cal.item1.doClick();
		            		continue loop;
		            	}
		            	else if((char)ch=='M')
		            	{
		            		Thread.sleep(500);
		            		//System.out.print((char)ch);
		            		cal.m.doClick();
		            		continue loop;
		            	}
		            	else if((char)ch=='R')
		            	{
		            		Thread.sleep(500);
		            		 String s=cal.t.getText();
							    int j=s.length();
							    if(j>=1)
							    {
							    	String s1=s.substring(0,j-1);
							    	cal.t.setText(s1);
							    	}					   
		            		continue loop;
		            	}
		            	else if((char)ch=='.')
		            	{
		            		Thread.sleep(500);
		            		//System.out.print((char)ch);
		            		cal.b17.doClick();
		            		continue loop;
		            	}
		            	else if((char)ch=='l')
		            	{
		            		continue loop;
		            	}
		            	else if((char)ch=='o')
		            	{
		            		continue loop;
		            	}
		            	else if((char)ch=='g')
		            	{
		            		Thread.sleep(500);
		            		//System.out.print((char)ch);
		            		cal.b18.doClick();
		            		continue loop;
		            	}
		            	else if((char)ch=='π')
		            	{
		            		Thread.sleep(500);
		            		//System.out.print((char)ch);
		            		cal.b19.doClick();
		            		continue loop;
		            	}
		            	else if((char)ch=='\n')
		            		continue loop;
		            }            
		        }
		        catch(IOException e)
		        {
		            sop("Error:"+e.getMessage());
		        }
		        finally
		        {
		            try            
		            {
		                if(null!=fr) fr.close();
		            }
		            catch(IOException e)
		            {
		                sop("Error:"+e.getMessage());
		            }
		        }
		    }
		    
		    public static void sop(Object obj)
		    {
		        System.out.println(obj);
		    }

}

