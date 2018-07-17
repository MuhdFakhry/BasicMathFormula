package sg.edu.rp.c346.basicmathformula;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvFormula;

    ArrayList<BasicFormula> alFormulaList;

    CustomAdapter caFormula;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvFormula = findViewById(R.id.ListViewFormula);

        alFormulaList = new ArrayList<>();

        BasicFormula formula1 = new BasicFormula("Area of rectangle", "Length x Length", "Formula type is: Area");
        BasicFormula formula2 = new BasicFormula("Area of triangle", "(Length of base x Length)/2", "Formula type is: Area");
        BasicFormula formula3 = new BasicFormula("Volume of cube", "Length x Length x Length", "Formula type is: Volume");
        alFormulaList.add(formula1);
        alFormulaList.add(formula2);
        alFormulaList.add(formula3);

        caFormula = new CustomAdapter(this, R.layout.basic_formula, alFormulaList);

        lvFormula.setAdapter((ListAdapter) caFormula);
    }
}
