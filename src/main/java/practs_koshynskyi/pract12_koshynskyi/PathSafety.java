package practs_koshynskyi.pract12_koshynskyi;

import java.nio.file.Path;

public class PathSafety {
    public static Path safeResolve(Path base, Path inputUser){
        if (inputUser.startsWith(base)){
            return inputUser.resolve(base).normalize();
        }
        else{
            throw new IllegalArgumentException("not in base");
        }
    }
}
