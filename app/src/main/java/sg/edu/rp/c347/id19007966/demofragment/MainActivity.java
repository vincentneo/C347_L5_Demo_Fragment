package sg.edu.rp.c347.id19007966.demofragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();

        Fragment fragmentFirst = new FragmentFirst();
        transaction.replace(R.id.frame1, fragmentFirst);

        Fragment fragmentSecond = new FragmentSecond();
        transaction.replace(R.id.frame2, fragmentSecond);

        transaction.commit();
    }
}