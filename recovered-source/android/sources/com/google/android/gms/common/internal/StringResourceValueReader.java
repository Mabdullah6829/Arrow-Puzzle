package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.arrow.puzzle.escape.maze.free.game.R;

/* JADX INFO: loaded from: classes.dex */
public class StringResourceValueReader {

    /* JADX INFO: renamed from: a */
    public final Resources f4465a;

    /* JADX INFO: renamed from: b */
    public final String f4466b;

    public StringResourceValueReader(Context context) {
        Preconditions.m3544h(context);
        Resources resources = context.getResources();
        this.f4465a = resources;
        this.f4466b = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
    }

    /* JADX INFO: renamed from: a */
    public final String m3549a(String str) {
        Resources resources = this.f4465a;
        int identifier = resources.getIdentifier(str, TypedValues.Custom.S_STRING, this.f4466b);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }
}
