package matlabexporter;

import us.hebi.matlab.mat.format.Mat5;
import us.hebi.matlab.mat.types.MatFile;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // Create MAT file with a scalar in a nested struct
        MatFile matFile = Mat5.newMatFile()
                .addArray("var1", Mat5.newString("Test"))
                .addArray("var2", Mat5.newScalar(7))
                .addArray("var3", Mat5.newStruct().set("x", Mat5.newScalar(42)));
        // Serialize to disk using default configurations
        Mat5.writeToFile(matFile, "data.mat");
    }
}
