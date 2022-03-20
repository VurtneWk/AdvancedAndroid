package com.vurtnewk.architecture;

import androidx.annotation.Nullable;

public class Test {

    void te(){
        ThreadLocal<String> t = new ThreadLocal<String>(){
            @Nullable
            @Override
            protected String initialValue() {
                return super.initialValue();
            }
        };


    }
}
