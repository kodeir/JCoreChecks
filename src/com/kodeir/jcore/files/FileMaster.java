package com.kodeir.jcore.files;

import java.io.File;
import java.nio.file.FileSystems;

/**
 * Created by Sergei Riabinin on 21.05.2017.
 */
public class FileMaster {

    public FileMaster(){
        System.out.println("File separator is: \"" + File.separator + "\"");
        System.out.println("File pathSeparator is: \"" + File.pathSeparator + "\"");
        System.out.println("FileSystems separator is: \"" + FileSystems.getDefault().getSeparator() + "\"");
    }

}
