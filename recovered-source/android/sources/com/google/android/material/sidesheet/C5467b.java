package com.google.android.material.sidesheet;

import android.view.View;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.auth.FirebaseAuthCredentialsProvider;

/* JADX INFO: renamed from: com.google.android.material.sidesheet.b */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5467b implements AccessibilityViewCommand, Continuation {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f23488s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Object f23489t;

    public /* synthetic */ C5467b(Object obj, int i2) {
        this.f23489t = obj;
        this.f23488s = i2;
    }

    @Override // com.google.android.gms.tasks.Continuation
    /* JADX INFO: renamed from: a */
    public Object mo170a(Task task) {
        return ((FirebaseAuthCredentialsProvider) this.f23489t).lambda$getToken$2(this.f23488s, task);
    }

    @Override // androidx.core.view.accessibility.AccessibilityViewCommand
    public boolean perform(View view, AccessibilityViewCommand.CommandArguments commandArguments) {
        return ((SideSheetBehavior) this.f23489t).lambda$createAccessibilityViewCommandForState$2(this.f23488s, view, commandArguments);
    }
}
