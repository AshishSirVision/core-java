package file_handling;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class FileInformation {

    public static void main(String[] args) throws IOException {
        File obj = new File("demofile14.txt");
        File obj1 = new File("demofile.txt");
        System.out.println(obj.canWrite());
        System.out.println(obj.length());
        System.out.println(obj.getAbsolutePath());
        System.out.println(obj.getName());
        System.out.println(obj.isDirectory());
        System.out.println(obj.isFile());
        System.out.println(obj.compareTo(obj1));
        System.out.println(obj.getCanonicalFile());
        System.out.println(obj.getClass());
        System.out.println(obj.hashCode());
        System.out.println(obj.getUsableSpace());
        System.out.println(obj.lastModified());
        SimpleDateFormat ft = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
        System.out.println("last modified Date: " + ft.format(obj1.lastModified()));

        System.out.println(obj.getFreeSpace());
        System.out.println(obj.getTotalSpace());
        System.out.println(obj.listFiles());
        System.out.println(obj.setExecutable(true, true));
        System.out.println(obj.isHidden());
        System.out.println(obj.toString());
        System.out.println(obj.createNewFile());
        System.out.println(obj.toURI());
      // System.out.println(obj.notify());

    }

}
