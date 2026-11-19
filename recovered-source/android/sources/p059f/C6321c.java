package p059f;

import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AppCompatActivity;
import com.arrow.puzzle.escape.maze.free.game.activity.MainActivity;
import com.arrow.puzzle.escape.maze.free.game.activity.StartActivity;

/* JADX INFO: renamed from: f.c */
/* JADX INFO: loaded from: classes.dex */
public final class C6321c extends OnBackPressedCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f24344a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AppCompatActivity f24345b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6321c(AppCompatActivity appCompatActivity, int i2) {
        super(true);
        this.f24344a = i2;
        this.f24345b = appCompatActivity;
    }

    @Override // androidx.activity.OnBackPressedCallback
    public final void handleOnBackPressed() {
        switch (this.f24344a) {
            case 0:
                ((MainActivity) this.f24345b).finish();
                break;
            default:
                ((StartActivity) this.f24345b).moveTaskToBack(true);
                break;
        }
    }
}
