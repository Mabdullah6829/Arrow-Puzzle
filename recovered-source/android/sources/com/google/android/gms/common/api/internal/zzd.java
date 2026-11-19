package com.google.android.gms.common.api.internal;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class zzd extends Fragment implements LifecycleFragment {

    /* JADX INFO: renamed from: t */
    public static final WeakHashMap f4378t = new WeakHashMap();

    /* JADX INFO: renamed from: s */
    public final zzc f4379s = new zzc();

    @Override // com.google.android.gms.common.api.internal.LifecycleFragment
    /* JADX INFO: renamed from: a */
    public final void mo3476a(String str, LifecycleCallback lifecycleCallback) {
        this.f4379s.m3523a(str, lifecycleCallback);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleFragment
    /* JADX INFO: renamed from: b */
    public final LifecycleCallback mo3477b(Class cls, String str) {
        return (LifecycleCallback) cls.cast(this.f4379s.f4375a.get(str));
    }

    @Override // androidx.fragment.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator it = this.f4379s.f4375a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).mo3467a();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        Iterator it = this.f4379s.f4375a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).mo3469d(i2, i3, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f4379s.m3524b(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        zzc zzcVar = this.f4379s;
        zzcVar.f4376b = 5;
        Iterator it = zzcVar.f4375a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).mo3471f();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        zzc zzcVar = this.f4379s;
        zzcVar.f4376b = 3;
        Iterator it = zzcVar.f4375a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).mo3472g();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f4379s.m3525c(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        zzc zzcVar = this.f4379s;
        zzcVar.f4376b = 2;
        Iterator it = zzcVar.f4375a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).mo3474i();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        zzc zzcVar = this.f4379s;
        zzcVar.f4376b = 4;
        Iterator it = zzcVar.f4375a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).mo3475j();
        }
    }
}
