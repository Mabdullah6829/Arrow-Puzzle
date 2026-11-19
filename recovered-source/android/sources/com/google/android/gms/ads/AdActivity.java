package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbzi;

/* JADX INFO: loaded from: classes.dex */
public final class AdActivity extends Activity {

    /* JADX INFO: renamed from: s */
    public zzbzi f2927s;

    @Override // android.app.Activity
    public final void onActivityResult(int i2, int i3, Intent intent) {
        try {
            zzbzi zzbziVar = this.f2927s;
            if (zzbziVar != null) {
                zzbziVar.mo3000x1(i2, i3, intent);
            }
        } catch (Exception e) {
            zzo.m3076i("#007 Could not call remote method.", e);
        }
        super.onActivityResult(i2, i3, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        try {
            zzbzi zzbziVar = this.f2927s;
            if (zzbziVar != null && !zzbziVar.mo2995c()) {
                return;
            }
        } catch (RemoteException e) {
            zzo.m3076i("#007 Could not call remote method.", e);
        }
        super.onBackPressed();
        try {
            zzbzi zzbziVar2 = this.f2927s;
            if (zzbziVar2 != null) {
                zzbziVar2.mo2993a();
            }
        } catch (RemoteException e2) {
            zzo.m3076i("#007 Could not call remote method.", e2);
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            zzbzi zzbziVar = this.f2927s;
            if (zzbziVar != null) {
                zzbziVar.mo2990N(new ObjectWrapper(configuration));
            }
        } catch (RemoteException e) {
            zzo.m3076i("#007 Could not call remote method.", e);
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        zzo.m3068a("AdActivity onCreate");
        zzbzi zzbziVarM2807g = zzay.f3085g.f3087b.m2807g(this);
        this.f2927s = zzbziVarM2807g;
        if (zzbziVarM2807g == null) {
            zzo.m3076i("#007 Could not call remote method.", null);
            finish();
            return;
        }
        try {
            zzbziVarM2807g.mo2992Q3(bundle);
        } catch (RemoteException e) {
            zzo.m3076i("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        zzo.m3068a("AdActivity onDestroy");
        try {
            zzbzi zzbziVar = this.f2927s;
            if (zzbziVar != null) {
                zzbziVar.mo2989F();
            }
        } catch (RemoteException e) {
            zzo.m3076i("#007 Could not call remote method.", e);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final void onPause() {
        zzo.m3068a("AdActivity onPause");
        try {
            zzbzi zzbziVar = this.f2927s;
            if (zzbziVar != null) {
                zzbziVar.zzl();
            }
        } catch (RemoteException e) {
            zzo.m3076i("#007 Could not call remote method.", e);
            finish();
        }
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        try {
            zzbzi zzbziVar = this.f2927s;
            if (zzbziVar != null) {
                zzbziVar.mo2999o1(i2, strArr, iArr);
            }
        } catch (RemoteException e) {
            zzo.m3076i("#007 Could not call remote method.", e);
        }
    }

    @Override // android.app.Activity
    public final void onRestart() {
        super.onRestart();
        zzo.m3068a("AdActivity onRestart");
        try {
            zzbzi zzbziVar = this.f2927s;
            if (zzbziVar != null) {
                zzbziVar.zzi();
            }
        } catch (RemoteException e) {
            zzo.m3076i("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        zzo.m3068a("AdActivity onResume");
        super.onResume();
        try {
            zzbzi zzbziVar = this.f2927s;
            if (zzbziVar != null) {
                zzbziVar.zzk();
            }
        } catch (RemoteException e) {
            zzo.m3076i("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        try {
            zzbzi zzbziVar = this.f2927s;
            if (zzbziVar != null) {
                zzbziVar.zzo(bundle);
            }
        } catch (RemoteException e) {
            zzo.m3076i("#007 Could not call remote method.", e);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public final void onStart() {
        super.onStart();
        zzo.m3068a("AdActivity onStart");
        try {
            zzbzi zzbziVar = this.f2927s;
            if (zzbziVar != null) {
                zzbziVar.zzj();
            }
        } catch (RemoteException e) {
            zzo.m3076i("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onStop() {
        zzo.m3068a("AdActivity onStop");
        try {
            zzbzi zzbziVar = this.f2927s;
            if (zzbziVar != null) {
                zzbziVar.mo2991Q();
            }
        } catch (RemoteException e) {
            zzo.m3076i("#007 Could not call remote method.", e);
            finish();
        }
        super.onStop();
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        try {
            zzbzi zzbziVar = this.f2927s;
            if (zzbziVar != null) {
                zzbziVar.mo2994b();
            }
        } catch (RemoteException e) {
            zzo.m3076i("#007 Could not call remote method.", e);
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i2) {
        super.setContentView(i2);
        zzbzi zzbziVar = this.f2927s;
        if (zzbziVar != null) {
            try {
                zzbziVar.mo2996h();
            } catch (RemoteException e) {
                zzo.m3076i("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // android.app.Activity
    public final void setContentView(View view) {
        super.setContentView(view);
        zzbzi zzbziVar = this.f2927s;
        if (zzbziVar != null) {
            try {
                zzbziVar.mo2996h();
            } catch (RemoteException e) {
                zzo.m3076i("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        zzbzi zzbziVar = this.f2927s;
        if (zzbziVar != null) {
            try {
                zzbziVar.mo2996h();
            } catch (RemoteException e) {
                zzo.m3076i("#007 Could not call remote method.", e);
            }
        }
    }
}
