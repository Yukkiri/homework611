package ru.puchkova.homework611;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private String methodName;
    private TextView log;
    //Переопределите методы жизненного цикла onCreate, onStart, onResume, onPause, onStop, onDestroy, onRestart, onPostCreate, onPostResume

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        log = findViewById(R.id.log);
        methodName = "onCreate()";
        log.append("\n" + methodName);
        Log.d("Lifecycle", methodName);
    }

    @Override
    protected void onStart() {
        super.onStart();
        methodName = "onStart()";
        log.append("\n" + methodName);
        Log.d("Lifecycle", methodName);
    }

    @Override
    protected void onResume() {
        super.onResume();
        methodName = "onResume()";
        log.append("\n" + methodName);
        Log.d("Lifecycle", methodName);
    }

    @Override
    protected void onPause() {
        super.onPause();
        methodName = "onPause()";
        log.append("\n" + methodName);
        Log.d("Lifecycle", methodName);
    }

    @Override
    protected void onStop() {
        super.onStop();
        methodName = "onStop()";
        log.append("\n" + methodName);
        Log.d("Lifecycle", methodName);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        methodName = "onRestart()";
        log.append("\n" + methodName);
        Log.d("Lifecycle", methodName);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        methodName = "onDestroy()";
        log.append("\n" + methodName);
        Log.d("Lifecycle", methodName);
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        methodName = "onPostCreate()";
        log.append("\n" + methodName);
        Log.d("Lifecycle", methodName);
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        methodName = "onPostResume()";
        log.append("\n" + methodName);
        Log.d("Lifecycle", methodName);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        methodName = "onKeyDown()";
        log.append("\n" + methodName);
        Log.d("Lifecycle", methodName);
        return super.onKeyDown(keyCode, event);
    }

    @Override
    public boolean onKeyLongPress(int keyCode, KeyEvent event) {
        methodName = "onKeyLongPress()";
        log.append("\n" + methodName);
        Log.d("Lifecycle", methodName);
        return super.onKeyLongPress(keyCode, event);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        methodName = "onBackPressed()";
        log.append("\n" + methodName);
        Log.d("Lifecycle", methodName);
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState, @NonNull PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        methodName = "onSaveInstanceState()";
        log.append("\n" + methodName);
        String saved = log.getText().toString();
        outState.putString("key", saved);
        Log.d("Lifecycle", methodName);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        String saved = savedInstanceState.getString("key");
        log.setText(saved);
        methodName = "onRestoreInstanceState()";
        log.append("\n" + methodName);
        Log.d("Lifecycle", methodName);
    }
}
