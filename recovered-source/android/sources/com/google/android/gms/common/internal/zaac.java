package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.view.View;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;

/* JADX INFO: loaded from: classes.dex */
public final class zaac extends RemoteCreator {

    /* JADX INFO: renamed from: c */
    public static final zaac f4482c = new zaac();

    private zaac() {
        super("com.google.android.gms.common.ui.SignInButtonCreatorImpl");
    }

    /* JADX INFO: renamed from: c */
    public static View m3593c(Context context, int i2, int i3) throws RemoteCreator.RemoteCreatorException {
        zaac zaacVar = f4482c;
        try {
            zaaa zaaaVar = new zaaa(1, i2, i3, null);
            return (View) ObjectWrapper.m3697u0(((zap) zaacVar.m3698b(context)).m3604u0(new ObjectWrapper(context), zaaaVar));
        } catch (Exception e) {
            throw new RemoteCreator.RemoteCreatorException(AbstractC1456a.m2449p(new StringBuilder(String.valueOf(i2).length() + 42 + String.valueOf(i3).length()), "Could not get button with size ", i2, " and color ", i3), e);
        }
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    /* JADX INFO: renamed from: a */
    public final Object mo2949a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
        return iInterfaceQueryLocalInterface instanceof zap ? (zap) iInterfaceQueryLocalInterface : new zap(iBinder, "com.google.android.gms.common.internal.ISignInButtonCreator");
    }
}
