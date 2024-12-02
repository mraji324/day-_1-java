import java.io.PrintWriter;
public class PrintWriter2
{
    public static void main(String[] args)
    {
        PrintWriter pw=new PrintWriter(System.out);
        pw.println("hi friends");
        pw.print("this is");
        pw.print("print statement");
        pw.close();
    }
}