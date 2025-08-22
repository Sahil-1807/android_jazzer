package com.code_intelligence.jazzer.hooks;

import com.code_intelligence.jazzer.api.HookType;
import com.code_intelligence.jazzer.api.MethodHook;

import java.lang.invoke.MethodHandle;

public class ExampleFuzzerHooks {
    @MethodHook(
        type = HookType.REPLACE,
        targetClassName = "java.security.SecureRandom",
        targetMethod = "nextLong",
        targetMethodDescriptor = "()J"
    )
    public static long getRandomNumber(MethodHandle handle, Object thisObject, Object[] args, int hookId) {
        // Return a constant random number for deterministic fuzzing
        return 4;
    }
}
