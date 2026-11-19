package com.google.android.datatransport.cct;

import p065i.C6370c;
import p072l.AbstractC6469d;
import p072l.C6467b;
import p072l.InterfaceC6472g;

/* JADX INFO: loaded from: classes.dex */
public class CctBackendFactory {
    public InterfaceC6472g create(AbstractC6469d abstractC6469d) {
        C6467b c6467b = (C6467b) abstractC6469d;
        return new C6370c(c6467b.f24644a, c6467b.f24645b, c6467b.f24646c);
    }
}
