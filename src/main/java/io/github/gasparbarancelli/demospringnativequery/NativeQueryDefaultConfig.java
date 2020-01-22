package io.github.gasparbarancelli.demospringnativequery;

import io.github.gasparbarancelli.NativeQueryConfig;

public class NativeQueryDefaultConfig implements NativeQueryConfig {

    @Override
    public String getPackageScan() {
        return "io.github.gasparbarancelli.demospringnativequery";
    }

    @Override
    public String getFileSufix() {
        return "sql";
    }

}
