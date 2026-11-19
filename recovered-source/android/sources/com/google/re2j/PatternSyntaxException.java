package com.google.re2j;

/* JADX INFO: loaded from: classes.dex */
public class PatternSyntaxException extends RuntimeException {
    public PatternSyntaxException(String str, String str2) {
        super("error parsing regexp: " + str + ": `" + str2 + "`");
    }
}
