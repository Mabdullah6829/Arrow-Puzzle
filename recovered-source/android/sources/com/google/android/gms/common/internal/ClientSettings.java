package com.google.android.gms.common.internal;

import android.accounts.Account;
import androidx.collection.ArraySet;
import com.google.android.gms.signin.SignInOptions;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class ClientSettings {

    /* JADX INFO: renamed from: a */
    public final Account f4407a;

    /* JADX INFO: renamed from: b */
    public final Set f4408b;

    /* JADX INFO: renamed from: c */
    public final Set f4409c;

    /* JADX INFO: renamed from: d */
    public final String f4410d;

    /* JADX INFO: renamed from: e */
    public final String f4411e;

    /* JADX INFO: renamed from: f */
    public final SignInOptions f4412f;

    /* JADX INFO: renamed from: g */
    public Integer f4413g;

    public static final class Builder {

        /* JADX INFO: renamed from: a */
        public Account f4414a;

        /* JADX INFO: renamed from: b */
        public ArraySet f4415b;

        /* JADX INFO: renamed from: c */
        public String f4416c;

        /* JADX INFO: renamed from: d */
        public String f4417d;
    }

    public ClientSettings(Account account, Set set, String str, String str2) {
        this.f4407a = account;
        Set setUnmodifiableSet = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.f4408b = setUnmodifiableSet;
        Map map = Collections.EMPTY_MAP;
        this.f4410d = str;
        this.f4411e = str2;
        this.f4412f = SignInOptions.f23179s;
        HashSet hashSet = new HashSet(setUnmodifiableSet);
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((zae) it.next()).getClass();
            hashSet.addAll(null);
        }
        this.f4409c = Collections.unmodifiableSet(hashSet);
    }
}
