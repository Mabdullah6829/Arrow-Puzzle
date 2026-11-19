package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.widget.LinearLayout;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzdt;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbvf;

/* JADX INFO: loaded from: classes.dex */
public final class OutOfContextTestingActivity extends Activity {
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        zzdt zzdtVarM2808h = zzay.f3085g.f3087b.m2808h(this, new zzbvf());
        if (zzdtVarM2808h == null) {
            finish();
            return;
        }
        setContentView(com.arrow.puzzle.escape.maze.free.game.R.layout.admob_empty_layout);
        LinearLayout linearLayout = (LinearLayout) findViewById(com.arrow.puzzle.escape.maze.free.game.R.id.layout);
        Intent intent = getIntent();
        if (intent == null) {
            finish();
            return;
        }
        String stringExtra = intent.getStringExtra("adUnit");
        if (stringExtra == null) {
            finish();
            return;
        }
        try {
            zzdtVarM2808h.mo2915N2(stringExtra, new ObjectWrapper(this), new ObjectWrapper(linearLayout));
        } catch (RemoteException unused) {
            finish();
        }
    }
}
