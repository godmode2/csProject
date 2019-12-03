package com.example.cs125finalProject;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button types = findViewById(R.id.types);
        Button cond = findViewById(R.id.conditional);
        Button array = findViewById(R.id.Arrays);
        Button func = findViewById(R.id.functions);
        Button comp = findViewById(R.id.compilation);
        Button intro = findViewById(R.id.objects);
        Button constr = findViewById(R.id.constructors);
        Button get = findViewById(R.id.getters);
        Button inher = findViewById(R.id.inheritance);
        Button poly = findViewById(R.id.polymorphism);
        Button inter = findViewById(R.id.interfaces);
        Button introalg = findViewById(R.id.introalgorithm);
        Button algrn = findViewById(R.id.runtime);
        Button lists = findViewById(R.id.lists);
        Button linked = findViewById(R.id.linked);
        Button trees = findViewById(R.id.trees);
        Button insertion = findViewById(R.id.insertion);
        Button merge = findViewById(R.id.merge);
        Button quick = findViewById(R.id.quick);
        Button internet = findViewById(R.id.internet);
        Button web = findViewById(R.id.web);
        Button exceptions = findViewById(R.id.exceptions);
        Button hash = findViewById(R.id.hash);

        types.setOnClickListener(this);
        cond.setOnClickListener(this);
        array.setOnClickListener(this);
        func.setOnClickListener(this);
        comp.setOnClickListener(this);
        intro.setOnClickListener(this);
        constr.setOnClickListener(this);
        get.setOnClickListener(this);
        inher.setOnClickListener(this);
        poly.setOnClickListener(this);
        introalg.setOnClickListener(this);
        inter.setOnClickListener(this);
        algrn.setOnClickListener(this);
        lists.setOnClickListener(this);
        linked.setOnClickListener(this);
        trees.setOnClickListener(this);
        insertion.setOnClickListener(this);
        merge.setOnClickListener(this);
        quick.setOnClickListener(this);
        internet.setOnClickListener(this);
        web.setOnClickListener(this);
        exceptions.setOnClickListener(this);
        hash.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.types:
                Toast.makeText(this, "Types clicked", Toast.LENGTH_LONG).show();
                break;
            case R.id.conditional:
                Toast.makeText(this, "Conditionals clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.Arrays:
                Toast.makeText(this, "Arrays clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.functions:
                Toast.makeText(this, "Functions clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.compilation:
                Toast.makeText(this, "Compilation clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.objects:
                Toast.makeText(this, "Objects clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.constructors:
                Toast.makeText(this, "Constructors clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.getters:
                Toast.makeText(this, "Getters and Setters clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.inheritance:
                Toast.makeText(this, "Inheritance clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.polymorphism:
                Toast.makeText(this, "Polymorphism clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.interfaces:
                Toast.makeText(this, "Interfaces clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.introalgorithm:
                Toast.makeText(this, "Intro Algorithms clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.runtime:
                Toast.makeText(this, "Algorithm Runtime clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.lists:
                Toast.makeText(this, "Lists clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.linked:
                Toast.makeText(this, "Linked Lists clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.trees:
                Toast.makeText(this, "Trees clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.insertion:
                Toast.makeText(this, "Insertion clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.merge:
                Toast.makeText(this, "Mergesort clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.quick:
                Toast.makeText(this, "Quicksort clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.internet:
                Toast.makeText(this, "Internet clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.web:
                Toast.makeText(this, "Web APIs clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.exceptions:
                Toast.makeText(this, "Exceptions clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.hash:
                Toast.makeText(this, "Hashing clicked", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
